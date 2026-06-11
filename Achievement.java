import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Achievement here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Achievement extends Actor
{
    private int timer = 300;

    public Achievement(String text)
    {
        setImage(new GreenfootImage(text, 40, Color.YELLOW, new Color(0,0,0,0)));
    }

    public void act()
    {
        timer--;

        if(timer <= 0)
        {
            getWorld().removeObject(this);
        }
    }
}
