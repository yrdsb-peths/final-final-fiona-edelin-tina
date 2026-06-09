import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Obstacles for our hero.
 * 
 * @author Fiona, Edelin, Tina 
 * @version May 2026
 */
public class Cars extends Actor
{
    GreenfootSound crashSound = new GreenfootSound("crash.mp3");
    /**
     * Act - do whatever the Cars wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //for the cars varrying speed
    int speed; 
    private GreenfootImage[] carImage = new GreenfootImage[14];
    public Cars(int direction)
    {
        // random speed 
        speed = Greenfoot.getRandomNumber(3) + 2;
        if(direction == 0)
        {
            // so the cars like move left yk
            speed = - speed;
        }
        for(int i = 0; i < carImage.length; i++)
        {
            carImage[i] = new GreenfootImage("car/car" + i + ".png");
            carImage[i].scale(70,30);
        }
        int randomImage = Greenfoot.getRandomNumber(carImage.length);
        setImage(carImage[randomImage]);
        if(direction == 1)
        {
            getImage().mirrorHorizontally();
        }
    }
    public void act()
    {
        if(getWorld() == null)return;
        MyWorld world = (MyWorld)getWorld();
        if(world.gameOver)return;
        // Add your action code here.
        setLocation(getX() + speed, getY());
        //gameover
        if(isTouching(Eco.class))
        {
            world.gameOver();
            crashSound.play();
        }
        
        //so this is if the car runs of the screen we dont want it to keep running 
        if(getX() < -50 || getX() > getWorld().getWidth() + 50)
        {
            getWorld().removeObject(this);
        }
    }
}
