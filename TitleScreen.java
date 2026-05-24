import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen.
 * 
 * @author Fiona, Edelin, Tina 
 * @version May 2026
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("Operation Cleanup", 50);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(titleLabel, 250, 80);
        prepare();
    }

    /**
     * The main world act loop
     */
    public void act()
    {
        // Start the game if user presses the space bar
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Eco eco = new Eco();
        addObject(eco,504,204);
        eco.setLocation(530,104);
        eco.setLocation(520,95);
        eco.setLocation(513,75);
        eco.setLocation(513,76);
    }
}
