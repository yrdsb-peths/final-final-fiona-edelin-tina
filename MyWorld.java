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
    public MyWorld() {
        super(600, 400, 1);
        setBackground("road.jpg");
        
        // Create the person object
        Eco us = new Eco();
        addObject(us, 300, 350);
        
        // Create a label
        scoreLabel = new Label(0, 60);
        addObject(scoreLabel, 40, 50);
        
        createTrash();
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
            
            int lane1 = 65;
            int lane2 = 135;
            
            if(amount == 1)
            {
                return;
            }
            if(amount == 2)
            {
                int lane = Greenfoot.getRandomNumber(2);

                Cars car = new Cars(0);

                if(lane == 0)
                {
                    addObject(car, 650, lane1);
                }
                else
                {
                    addObject(car, 650, lane2);
                }
            }
            if(amount == 3)
            {
                Cars car1 = new Cars(0);
                Cars car2 = new Cars(0);

                addObject(car1, 650, lane1);
                addObject(car2, 650, lane2);
            }
        }
    }
    /**
     * End the game and draw 'GameOver'
     */
    public void gameOver()
    {
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
