import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cars here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cars extends Actor
{
    /**
     * Act - do whatever the Cars wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //for the cars varrying speed
    int speed; 
    public Cars(int direction)
    {
        // random speed 
        speed = Greenfoot.getRandomNumber(4);
        if(direction == 0)
        {
            // so the cars like move left yk
            speed = - speed;
        }
    }
    public void act()
    {
        // Add your action code here.
        setLocation(getX() + speed, getY());
        //so this is if the car runs of the screen we dont want it to keep running 
        if(getX() < -50 || getX() > 650)
        {
            getWorld().removeObject(this);
        }
    }
}
