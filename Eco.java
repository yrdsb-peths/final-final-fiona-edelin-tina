import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Eco, our hero.
 * 
 * @author Fiona, Edelin, Tina 
 * @version May 2026
 */
public class Eco extends Actor
{
    /**
     * Act - do whatever the Eco wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage[] front = new GreenfootImage[3];
    GreenfootImage[] back = new GreenfootImage[3];
    GreenfootImage[] right = new GreenfootImage[3];
    GreenfootImage[] left = new GreenfootImage[3];
    GreenfootImage[] clean = new GreenfootImage[2];
    String facing = "front";
    SimpleTimer animationTimer = new SimpleTimer();
    int frame = 0;
    
    boolean cleaning = false;
    boolean moving = false;
    int cleanCount = 0;
    public Eco()
    {
        for(int i = 0; i < front.length; i++)
        {
            front[i] = new GreenfootImage("images/person/front" + i + ".png");
            front[i].scale(50,80);
        }
        for(int i = 0; i < back.length; i++)
        {
            back[i] = new GreenfootImage("images/person/back" + i + ".png");
            back[i].scale(50,80);
        }
        for(int i = 0; i < left.length; i++)
        {
            left[i] = new GreenfootImage("images/person/left" + i + ".png");
            left[i].scale(80,80);
        }
        for(int i = 0; i < right.length; i++)
        {
            right[i] = new GreenfootImage("images/person/right" + i + ".png");
            right[i].scale(80,80);
        }
        for(int i = 0; i < clean.length; i++)
        {
            clean[i] = new GreenfootImage("images/person/clean" + i + ".png");
            clean[i].scale(50,80);
        }
        setImage(front[0]);
        animationTimer.mark();
    }
    GreenfootSound ecoSound = new GreenfootSound("garbage.mp3");
    public void act()
    {
        if(getWorld() instanceof MyWorld)
        {
            if(getWorld() == null)return;
            MyWorld world = (MyWorld)getWorld();
            if(world.gameOver)return;
        }
        // Add your action code here.
        moving = false;
        collect();
        if(Greenfoot.isKeyDown("left") && !cleaning)
        {
            move(-2);
            facing = "left";
            moving = true;
        }
        else if(Greenfoot.isKeyDown("right") && !cleaning)
        {
            move(2);
            facing = "right";
            moving = true;
        }
        if(Greenfoot.isKeyDown("up") && !cleaning)
        {
            setLocation(getX(), getY() - 2);
            facing = "back";
            moving = true;
        }
        if(Greenfoot.isKeyDown("down") && !cleaning)
        {
            setLocation(getX(), getY() + 2);
            facing = "front";
            moving = true;
        }
        animation();
    }
    //remove the trash
    public void collect()
    {
        if(isTouching(Trash.class))
        {
            removeTouching(Trash.class);
            MyWorld world = (MyWorld)getWorld();
            world.createTrash();
            world.increaseScore();
            ecoSound.play();
            
            facing = "clean";
            cleaning = true;
            
            imageIndex = 0;
        }
    }
    int imageIndex = 0;
    public void animation()
    {
        imageIndex++;
        if(!moving && !cleaning)
        {
            setImage(front[0]);
            return;
        }
        if(animationTimer.millisElapsed() < 50)
        {
            return;
        }
        animationTimer.mark();
        
        if(facing.equals("front"))
        {
            setImage(front[imageIndex % front.length]);
        }
        else if(facing.equals("back"))
        {
            setImage(back[imageIndex % back.length]);
        }
        if(facing.equals("right"))
        {
            setImage(right[imageIndex % right.length]);
        }
        if(facing.equals("left"))
        {
            setImage(left[imageIndex % left.length]);
        }
        if(facing.equals("clean"))
        {
            setImage(clean[imageIndex % clean.length]);
            cleanCount++;
            if(cleanCount % 10 == 0)
            {
                imageIndex++;
            }
            if(cleanCount >= 4)
            {
                cleaning = false;
                facing = "front";
                
                imageIndex = 0;
                cleanCount = 0;
            }
            return;
        }
    }
}

