import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Winner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Winner extends Solve
{
    /**
     * Act - do whatever the Winner wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Winner() {
        getImage().scale(getImage().getWidth()/6, getImage().getHeight()/6);
    }
    
    public void act()
    {
        // Add your action code here.
        
        setLocation(getX() + 1/3, getY());
    }
}
