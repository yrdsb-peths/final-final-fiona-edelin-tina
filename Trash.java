import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Trash here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Trash extends Actor
{
    /**
     * Act - do whatever the Trash wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage[] trashImages = new GreenfootImage[5];

    public Trash()
    {
        for(int i = 0; i < trashImages.length; i++)
        {
            trashImages[i] = new GreenfootImage("trash" + i + ".png");
            trashImages[i].scale(35, 40);
        }

        int randomImage = Greenfoot.getRandomNumber(trashImages.length);

        setImage(trashImages[randomImage]);
    }

    public void act()
    {
        // Add your action code here.
        
    }
}
