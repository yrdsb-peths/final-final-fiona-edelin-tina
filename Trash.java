import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Trash to be collected by our hero.
 * 
 * @author Fiona, Edelin, Tina 
 * @version May 2026
 */
public class Trash extends Actor
{
    /**
     * Act - do whatever the Trash wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Trash()
    {
        GreenfootImage image = new GreenfootImage("trash.png");
        image.scale(35, 40);
        setImage(image);
    }
    public void act()
    {
        // Add your action code here.
        
    }
}
