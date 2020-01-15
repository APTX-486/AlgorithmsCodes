package cp1;
import java.util.Scanner;

class GetInputFromUser
{
    public static void main(String args[])
    {
        // Using Scanner for Getting Input from User
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        System.out.println("You entered integer " + a);
    }
}

