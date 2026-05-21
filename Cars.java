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
    public Cars()
    {
        // random speed 
        speed = Greenfoot.getRandomNumber(4);
    }
    public void act()
    {
        // Add your action code here.
        
    }
}
