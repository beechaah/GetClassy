import java.util.Scanner;

public class ObjInputTest
{
    public static void main(String[] args)
    {
        SafeInputObj.getNonZeroLenString("Enter a Non-Zero Length String");
        SafeInputObj.getInt("Give me an Integer");
        SafeInputObj.getDouble("Give me a Double");
        SafeInputObj.getRangedInt("Give me an Interger between 5 and 10", 5, 10);
        SafeInputObj.getRangedDouble("Give me a double between 5.00 and 10.00", 5.00, 10.00);
        SafeInputObj.getRegExString("Give me an ID number: ", "000000");
        SafeInputObj.getYNConfirm("Do you want to exit");

    }
}
