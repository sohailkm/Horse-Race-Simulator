import java.security.KeyStore;

/**
 * Write a description of class Horse here.
 * 
 * @author (Sohail Mahmood)
 * @version (a version number or a date)
 */
public class Horse
{
    //Fields of class Horse
    private String name;
    private char symbol;
    private int distance;
    private boolean hasFallen;
    private double confidence;
    
    
      
    //Constructor of class Horse
    /**
     * Constructor for objects of class Horse
     */
    public Horse(char horseSymbol, String horseName, double horseConfidence)
    {
        name = horseName;
        symbol = horseSymbol;
        distance = 0;
        hasFallen = false;
        confidence = horseConfidence;
    }
    
    
    
    //Other methods of class Horse
    public void fall()
    {
        hasFallen = true;
    }
    
    public double getConfidence()
    {
        return confidence;
    }
    
    public int getDistanceTravelled()
    {
        return distance;
    }
    
    public String getName()
    {
        return name;
    }
    
    public char getSymbol()
    {
        return symbol;
    }
    
    public void goBackToStart()
    {
        distance = 0;
    }
    
    public boolean hasFallen()
    {
        return hasFallen;
    }

    public void moveForward()
    {
        distance++;
    }

    public void setConfidence(double newConfidence)
    {
        confidence = newConfidence;
    }
    
    public void setSymbol(char newSymbol)
    {
        symbol = newSymbol;
    }
    
    public void setName(String newName){
        name = newName;
    }
    
    public void setDistance(char newDistance){
        distance = newDistance;
    }
    
    public void setHasFallen(boolean NewHasFallen) {
        hasFallen = NewHasFallen;
    }
}
