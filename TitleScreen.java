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
        setBackground("background.jpg");
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
        label4.setLocation(150,281);
        label4.setLocation(155,281);
        label5.setLocation(190,314);
        label5.setLocation(281,281);
        label5.setLocation(277,281);
        label5.setLocation(279,280);
        label5.setLocation(281,281);
        label5.setLocation(86,308);
        label5.setLocation(97,308);
        Trash trash = new Trash();
        addObject(trash,384,297);
        Trash trash2 = new Trash();
        addObject(trash2,440,278);
        Trash trash3 = new Trash();
        addObject(trash3,401,362);
        Trash trash4 = new Trash();
        addObject(trash4,403,232);
        trash4.setLocation(260,356);
        trash.setLocation(357,275);
        trash2.setLocation(470,349);
        trash3.setLocation(317,305);
        trash.setLocation(348,364);
        trash3.setLocation(367,272);
        Trash trash5 = new Trash();
        addObject(trash5,446,280);
        trash5.setLocation(470,274);
        label5.setLocation(89,308);
        label4.setLocation(92,285);
        label4.setLocation(149,279);
        label5.setLocation(91,306);
        label5.setLocation(79,304);
    }
}
