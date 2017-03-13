import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rock extends Actor
{
    
    private void explode()
    {
        BadWorld myWorld = (BadWorld)getWorld();
        Greenfoot.playSound("MetalExplosion.wav");
        
        for(int i = 0; i < 50; i++)
        {
            myWorld.addObject( new Debris(), getX(), getY() );
        }
        
        myWorld.removeObject(this);
    }
    
    /**
     * Act - do whatever the Rock wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        explode();
    }    
}
