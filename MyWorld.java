import greenfoot.*;

public class MyWorld extends World {
    public int score = 0;
    Label scoreLabel;
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
