import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tanah here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tanah extends World
{

    /**
     * Constructor for objects of class Tanah.
     * 
     */
    public Tanah()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Ular ular = new Ular();
        addObject(ular,99,211);
        ular.setLocation(35,164);
        Katak katak = new Katak();
        addObject(katak,213,59);
        Katak katak2 = new Katak();
        addObject(katak2,471,140);
        Katak katak3 = new Katak();
        addObject(katak3,280,246);
        Katak katak4 = new Katak();
        addObject(katak4,327,134);
        Katak katak5 = new Katak();
        addObject(katak5,486,312);
        Katak katak6 = new Katak();
        addObject(katak6,172,279);
        Katak katak7 = new Katak();
        addObject(katak7,348,337);
        Katak katak8 = new Katak();
        addObject(katak8,527,55);
        Katak katak9 = new Katak();
        addObject(katak9,420,44);
        Katak katak10 = new Katak();
        addObject(katak10,55,357);
    }
}
