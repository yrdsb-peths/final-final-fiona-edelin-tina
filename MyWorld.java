import greenfoot.*;

/**
 * The World our hero lives in.
 * 
 * @author Fiona, Edelin, Tina
 * @version May 2026
 */
public class MyWorld extends World {
    public int score = 0;
    Label scoreLabel;
    int carTimer = 0;
    public boolean gameOver = false;
    private GreenfootSound traffic = new GreenfootSound("traffic.mp3");
    public MyWorld() {
        super(600, 400, 1, false);
        setBackground("road.jpg");
        
        // Create the person object
        Eco us = new Eco();
        addObject(us, 300, 350);
        
        // Create a label
        scoreLabel = new Label(0, 60);
        addObject(scoreLabel, 40, 50);
        
        createTrash();
        traffic.playLoop();
    }
    
    public void act()
    {
        spawnCars();
    }
    
    public void spawnCars()
    {
        carTimer++;
        if(carTimer >= 100)
        {
            carTimer = 0;
            int amount = Greenfoot.getRandomNumber(3) + 1;
            //top lanes (right to left)
            int lane1 = 65;
            int lane2 = 135;
            //bottom lanes (left to right)
            int lane3 = 265;
            int lane4 = 315;
            if(amount == 1)
            {
                return;
            }
            if(amount == 2)
            {
                int lane = Greenfoot.getRandomNumber(4);

                Cars car = new Cars(0);

                if(lane == 0)
                {
                    addObject(car, 650, lane1);
                    addObject(car, 650, lane3);
                }
                else
                {
                    addObject(car, 650, lane2);
                    addObject(car, 650, lane4);
                }
            }
            if(amount == 3)
            {
                Cars car1 = new Cars(0);
                Cars car2 = new Cars(0);
                Cars car3 = new Cars(1);
                Cars car4 = new Cars(1);

                addObject(car1, 650, lane1);
                addObject(car2, 650, lane2);
                
                addObject(car3, -50, lane3);
                addObject(car4, -50, lane4);
            }
        }
    }
    /**
     * End the game and draw 'GameOver'
     */
    public void gameOver()
    {
        gameOver = true;
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
    }
    
        /**
         * Increase score
         */
        public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
    
        if(score == 5)
        {
            addObject(new Achievement("Achievement: Eco Beginner!"), 300, 30);
        }
    
        if(score == 10)
        {
            addObject(new Achievement("Achievement: Trash Collector!"), 300, 30);
        }
    
        if(score == 20)
        {
            addObject(new Achievement("Achievement: Clean-Up Hero!"), 300, 30);
        }
    
        if(score == 40)
        {
            addObject(new Achievement("Achievement: Eco Warrior!"), 300, 30);
        }
    
        if(score == 80)
        {
            addObject(new Achievement("Achievement: Planet Protector!"), 300, 30);
        }
    
        if(score == 160)
        {
            addObject(new Achievement("Achievement: Legend of Recycling!"), 300, 30);
        }
    }
        
    /**
     * Create trash at random locations at top and bottom of screen
     */
    public void createTrash()
    {
        Trash litter = new Trash();
        int x = Greenfoot.getRandomNumber(600);
        int yspot = Greenfoot.getRandomNumber(2);
        int y = 0;
        if(yspot == 1)
        {
            y = 50;
        }
        else
        {
            y = 350;
        }
        addObject(litter, x, y);
    }
}
