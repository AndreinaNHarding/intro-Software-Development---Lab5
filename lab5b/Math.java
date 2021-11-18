
/**
 * Write a description of class Math here.
 *
 * @author (Andreina Nunez)
 * @version (2019/02/13)
 */
public class Math
{

    // instance variables 
    private static int x;
    private static  int y;
    private String operation;
    private boolean operator;

    //Constants
    private static final String MULTIPLICATION = "*";
    private static final String DIVISION = "/";
    private static final String REMAINDER = "%";
    private static final String SUM = "+";
    private static final String SUBTRACT = "-";
    /**
     * Method divide
     *
     * @param x 
     * @param y 
     * @return division x/y
     */
    public static int divide (int x, int y)
    {   if (y==0){
            System.out.println("ERROR");
            return 0;
        } else{
            return x/y;
        }          
    }

    /**
     * Method max
     *
     * @param x
     * @param y 
     * @return The grater number x or y
     */
    public static int max (int x, int y)
    {
        if(x>y){
            System.out.println("x is bigger");
            return x;

        } else {
            System.out.println("y is bigger");
            return y;
        }
    }

    /**
     * Method triple
     *
     * @param x 
     * @return x times three
     */
    public static int triple (int x)
    {
        x=x*3;
        return x;
    }

    /**
     * Method remainder
     *
     * @param x 
     * @param y 
     * @return The remainder of the division x/y
     */
    public static int remainder (int x, int y)
    {
        if (y==0){
            System.out.println("ERROR");
            return 0;
        } else{
            return x%y;
        }          
    }

    /**
     * Method isValidOperation
     *
     * @param operation 
     * @return operator ("*","/","%","+" or "-")
     */
    public static boolean isValidOperation (String operation)
    {
        boolean isValid= false;
        switch (operation){
            case MULTIPLICATION:
            case DIVISION:
            case REMAINDER:
            case SUM:
            case SUBTRACT:
            isValid=true;
            break;
            default:
            isValid= false;
        }

        return isValid;
    }
}

