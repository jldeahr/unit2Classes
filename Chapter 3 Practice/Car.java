

/**
 * The Car class models a car with a constant fuel effiency and tracks
 * how much fuel is left in its tank.
 * 
 * @author Joe Deahr
 * @version 12 September 2014
 */
public class Car
{
    /** The fuel efficiency of this car measured in miles per gallon (MPG)*/
    private double fuelEfficiency;

    /** The fuel, measured in gallons, left in this car's tank */
    private double fuelInTank;
    
    
    /**
     * Constructor for Car that specifies fuel efficiency
     */
    public Car(double fuelEfficiency)
    {
    }

    /**
     * This method adds the specified number of gallons of fuel to this car's tank.
     *
     * @pre     The specified number of gallons will not exceed this car's tank capacity.   

     * @param    gallons    The number of gallons of fuel to add to this car's tank.
     * 
     */
    public void addGas(double gallons)
    {
    }
    
    /** Reduces the fuel in this car's tank based on this car's fule
     * efficiency and the specified number of miles driven.
     * 
     * @pre     the specified number of miles will not consume more
     *          than the amound of fuel in this car's tank.
     * @param   miles   the number of miles driven
     * 
     */
    public void drive(double miles)
    {
    }
    
    /**
     * returns the number of gallons of gas remaining in this car's tank
     *
     * 
     * @return  the number of gallons of gas remaining in this car's tank
     */
    public double getGasInTank()
    {
        return 0;        
    }

}
