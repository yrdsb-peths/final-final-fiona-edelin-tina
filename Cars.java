import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Obstacles for our hero.
 * 
 * @author Fiona, Edelin, Tina 
 * @version May 2026
 */
public class Cars extends Actor
{
    /**
     * Act - do whatever the Cars wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //for the cars varrying speed
    int speed; 
    private GreenfootImage[] carImage = new GreenfootImage[14];
    public Cars(int direction)
    {
        // random speed 
        speed = Greenfoot.getRandomNumber(3) + 2;
        if(direction == 0)
        {
            // so the cars like move left yk
            speed = - speed;
        }
        for(int i = 0; i < carImage.length; i++)
        {
            carImage[i] = new GreenfootImage("car/car" + i + ".png");
            carImage[i].scale(80,40);
        }
        int randomImage = Greenfoot.getRandomNumber(carImage.length);
        setImage(carImage[randomImage]);
    }
    public void act()
    {
        // Add your action code here.
        setLocation(getX() + speed, getY());
        //so this is if the car runs of the screen we dont want it to keep running 
        if(getX() < 0)
        {
            getWorld().removeObject(this);
        }
    }
}
