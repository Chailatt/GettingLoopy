import java.util.Scanner;

public class CtoF
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double C = 0;
        double F = 0;
        boolean done = false;
        String trash = "";

        System.out.println("Welcome to Celsius to Fahrenheit Converter!");

        do
        {
            System.out.println(" Enter your desired temperature (Celsius): ");
            if (scan.hasNextDouble())

            {
                C = scan.nextDouble();
                scan.nextLine();
                done = true;
            }

            else
            {
                trash = scan.nextLine();
                System.out.println("You typed " + trash + ", " +
                        " this is the wrong input, please try again ");
            }
        } while (!done);

        F = (C/5) * 9 + 32 * 1.0;
        System.out.println(" This is " + F + " in Fahrenheit");

    }
}