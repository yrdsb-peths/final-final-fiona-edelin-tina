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
        GreenfootImage image = getImage();
        image.scale(50, 50);
        setImage(image);
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
}
