import java.util.Scanner;

public class SafeInputObj
{
    static Scanner in = new Scanner(System.in);

    public SafeInputObj(Scanner pipe)
    {
        this.in = in;
    }

    public static String getNonZeroLenString(String prompt)
    {
        String retVal = "";

        do
        {
            System.out.print(prompt + ": ");
            retVal = in.nextLine();
            if(retVal.isEmpty())
            {
                System.out.println("You must enter at least one character!");
            }
        } while(retVal.isEmpty());

        return retVal;
    }

    public static int getInt(String prompt)
    {
        int retVal = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print(prompt + ": ");
            if(in.hasNextInt())
            {
                retVal = in.nextInt();
                in.nextLine();
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You must enter a valid integer not " + trash);
            }

        } while(!done);

        return retVal;
    }


    public static double getDouble(String prompt)
    {
        double retVal = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print(prompt + ": ");
            if(in.hasNextDouble())
            {
                retVal = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You must enter a valid double not " + trash);
            }

        } while(!done);

        return retVal;
    }


    public static int getRangedInt(String prompt, int low, int high)
    {
        int retVal = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print(prompt +  " [" + low + " - " + high + "]: ");
            if(in.hasNextInt())
            {
                retVal = in.nextInt();
                in.nextLine();

                if(retVal >= low && retVal <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("You must enter a valid integer in range [" + low + " - " + high + "]: ");
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You must enter a valid integer not " + trash);
            }

        } while(!done);

        return retVal;
    }

    public static double getRangedDouble(String prompt, double low, double high)
    {
        double retVal = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print(prompt +  " [" + low + " - " + high + "]: ");
            if(in.hasNextDouble())
            {
                retVal = in.nextDouble();
                in.nextLine();

                if(retVal >= low && retVal <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("You must enter a valid double in range [" + low + " - " + high + "]: ");
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You must enter a valid double not " + trash);
            }

        } while(!done);

        return retVal;
    }


    public static boolean getYNConfirm(String prompt)
    {
        String input = "";
        boolean retVal = false;
        boolean done = false;

        do
        {
            System.out.println(prompt + "[Yy/Nn]: ");
            input = in.nextLine();
            if(input.isEmpty())
            {
                System.out.println("You must enter Y or N!");
            }
            else if(input.equalsIgnoreCase("Y"))
            {
                retVal = true;
                done = true;
            }
            else if(input.equalsIgnoreCase("N"))
            {
                retVal = false;
                done = true;
            }
            else
            {
                System.out.println("You must enter Y or N! Not: " + input);
            }

        } while(!done);

        return retVal;
    }


    public static String getRegExString(String prompt, String regEx)
    {
        String retVal = "";
        boolean done = false;

        do
        {
            System.out.print(prompt + regEx + ": ");
            retVal = in.nextLine();
            if(retVal.matches(regEx))
            {
                done = true;
            }
            else
            {
                System.out.println("You must enter a value that matches pattern " + regEx + "not " + retVal);
            }
        } while(!done);

        return retVal;
    }
}
