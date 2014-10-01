import java.util.Scanner;

public class Invalid_Class_Name
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String user = "";
        
        System.out.print("Please enter an integer between 1,000 and 999,999: ");
        user = s.nextLine();
        int length = user.length();
        
        String user_sub2 = user.substring(-3);
        user_sub = ("," + user_sub);
        String user_sub1 = user.substring(0, (length - 3));
        String realString = 
        System.out.println(user_sub);
    }
}