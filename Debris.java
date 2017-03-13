import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Debris here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Debris extends Actor
{
    private int speed;
    
    private int w;
    
    private int h;
    
    private GreenfootImage spaceJunk = new GreenfootImage("debris.png");
    public Debris()
    {
        int w = Greenfoot.getRandomNumber(19)+1;
        int h = Greenfoot.getRandomNumber(19)+1;
        
        setRotation( Greenfoot.getRandomNumber(361) );
        
        spaceJunk.scale(w, h);
        
        speed = Greenfoot.getRandomNumber(10)+5;
    }
    
    /**
     * Act - do whatever the Debris wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        BadWorld myWorld = (BadWorld)getWorld();
        move(speed);
        
        if(getX() <= 0 || getX() >= 599 || getY() <= 0 || getY() >= 390)
        {
            myWorld.removeObject(this);
        }
    }    
}
