//Milind Pathiyal
//Mike Bollhorst Copy
// Program creates a fraction calculator

import java.util.*;
public class FractionDriver
{
    public static void start()
    {
        // declare three Fractions, a, b, c
        Fraction a = new Fraction(1,2);
        Fraction b = new Fraction(2,3);
        Fraction c = new Fraction();
        Fraction r = new Fraction();
        boolean done = false;
        Scanner keys = new Scanner(System.in);
        System.out.println("a = " + a.toString() + " and b = " + b.toString());
        while (!done)
        {
            System.out.println("\nWelcome to the fraction calculator"); 
            System.out.println("1:  Set fraction a");
            System.out.println("2:  Set fraction b");
            System.out.println("3:  Multiply a * b");
            System.out.println("4:  Divide a / b");
            System.out.println("5:  Add a + b");
            System.out.println("6:  Subtract a - b");
            System.out.println("7:  Set a to its reciprocal");
            System.out.println("8:  Set a random fraction c");
            System.out.println("9:  Raise a to a positive integer power");
            System.out.println("0:  Quit");
            int input = keys.nextInt();
            if (input == 1)
            {
                System.out.println("Enter the numerator and denominator for a");
                int num = keys.nextInt();
                int denom = keys.nextInt();
                a.setNumerator(num);
                a.setDenominator(denom); 
                System.out.println("a now equals " + a);
            }
            else if (input == 2)
            {
                System.out.println("Enter the numerator and denominator for b");
                int num = keys.nextInt();
                int denom = keys.nextInt();
                b.setFraction(num, denom);
                System.out.println("b now equals " + b);
            }
            else if (input == 3)
            {
                c = a.multiply(b);
                System.out.println("a * b = " + c);
            }
            else if (input == 4)
            {
                c = a.divide(b);
                System.out.println("a / b = " + c);
            }
            
            else if (input == 5)
            {
                c = a.add(b);
                System.out.println("a + b = " + c);
            }
            else if (input == 6)
            {
                c = a.subtract(b);
                System.out.println("a - b = " + c);
            }
            else if (input == 7)
            {
                a.makeReciprocal();
                System.out.println("a has been set to its reciprocal.  It is now " + a);
            }
            else if (input == 8)
            {
                c = Fraction.createRandomFraction();        // sets c to have a random numerator -10 to 10,
                System.out.println("c = " + c);             // and a random denominator, 1-100
            }
            
            else if (input == 9)
            {
                System.out.println("Enter the positive integer that will raise a to that power");
                int pow = keys.nextInt();
                a.power(pow);
                System.out.println("a = " + a);
            }
            
            else if (input == 0)
            {
                done = true;
                System.out.println("Goodbye");
                
            }  
        }
    }   
    
}

