import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        Eco us = new Eco();
        addObject(us, 300, 400);
    }
}
