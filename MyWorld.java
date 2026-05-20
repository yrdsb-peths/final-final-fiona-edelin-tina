import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        setBackground("road.jpg");
        Eco us = new Eco();
        addObject(us, 300, 350);
        createTrash();
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
