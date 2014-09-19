

/**
 * Write a description of class Vending_Machine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vending_Machine
{
    /** description of instance variable x (add comment for each instance variable) */
    private int totalCoins;
    //The total amount of coins in the vending machine
    private int totalCans;
    //The total amount of cans in the vending machine

    /**
     * Default constructor for objects of class Vending_Machine
     */
    public Vending_Machine()
    {
        // initialise instance variables
        this.totalCoins = 0;
        this.totalCans = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public int addCan(int canAmount)
    {
        // put your code here
        totalCans = totalCans + canAmount;
        return totalCans;
    }
    
        /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public int insertToken(int tokenAmount)
    {
        // put your code here
        totalCoins = totalCoins + tokenAmount;
        return totalCoins;
    }
    
        /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public int takeCan(int takeCanAmount)
    {
        // put your code here
        totalCans = totalCans - takeCanAmount;
        return totalCans;
    }
}
