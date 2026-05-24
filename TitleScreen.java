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
        Label label = new Label("The road is a mess!", 30);
        addObject(label,73,168);
        label.setLocation(250,167);
        label.setLocation(161,159);
        label.setLocation(175,156);
        Label label2 = new Label("Help clean it up!", 30);
        addObject(label2,99,209);
        label2.setLocation(161,210);
        label2.setLocation(154,198);
        label2.setLocation(156,198);
        Label label3 = new Label("Press <space> to start", 25);
        addObject(label3,70,295);
        label3.setLocation(192,265);
        label3.setLocation(177,265);
        Label label4 = new Label("Use arrow keys to", 25);
        addObject(label4,134,311);
        label4.setLocation(154,292);
        label4.setLocation(149,294);
        Label label5 = new Label("move", 25);
        addObject(label5,81,339);
        label5.setLocation(91,321);
        label5.setLocation(80,322);
        label2.setLocation(418,168);
        label2.setLocation(412,156);
        label2.setLocation(412,156);
        label.setLocation(174,178);
        label2.setLocation(381,171);
        label2.setLocation(410,178);
        label3.setLocation(103,249);
        label3.setLocation(176,248);
        label4.setLocation(147,281);
        label4.setLocation(147,281);
        label5.setLocation(96,314);
        label5.setLocation(281,281);
        label5.setLocation(277,281);
        label5.setLocation(279,280);
        label5.setLocation(281,281);
        label5.setLocation(86,308);
        label5.setLocation(78,308);
    }
}
