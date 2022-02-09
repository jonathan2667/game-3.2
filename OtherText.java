import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class OtherText here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OtherText extends Writing
{
    /**
     * Act - do whatever the OtherText wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    String text;
    int size;
    
    Color color1;
    Color color2;
    Color color3;
    
    public OtherText(String text, int size,  Color color1, Color color2, Color color3) {
        this.text = text;
        this.size = size;
        
        this.color1 = color1;
        this.color2 = color2;
        this.color3 = color3;
        
        GreenfootImage image = new GreenfootImage( text, size, color1, color2, color3); 
        setImage(image);
    }
    public void act()
    {
        // Add your action code here.
        GreenfootImage image = new GreenfootImage( text, size, color1, color2, color3); 
        setImage(image);
    }
}
