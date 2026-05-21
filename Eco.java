import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Eco here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Eco extends Actor
{
    /**
     * Act - do whatever the Eco wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setImage("person.png");
        GreenfootImage image = getImage();
        image.scale(50, 65);
        setImage(image);
        collect();
        if(Greenfoot.isKeyDown("left"))
        {
            move(-2);
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(2);
        }
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY() - 2);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY() + 2);
        }
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
        }
    }
}
