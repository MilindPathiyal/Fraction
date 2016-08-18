//Milind Pathiyal
// a fraction calculator
//Program follows fractorDriver by adding, subtracting, multiplying, dividing,reducing, creating reciprocals, and converting decimals to fractions
import java.util.*;
public class Fraction
{
    private int num;
    private int denom;
    //Pre:None
    //Post:Sets values to a standard fraction
    public Fraction()
    {
        num = 0;
        denom = 1;
    }
    //Pre: Values must have units
    //Post: Sets given num and denom 
    public Fraction(int num, int denom)
    {
        this.num = num;
        this.denom = denom;
        this.reduce();
    }
    //Pre: There must be a value for each unit
    //Post:Sets the values and reduces the fraction
    public void setFraction(int num, int denom)
    {
        this.num = num;
        this.denom = denom;
        this.reduce();
    }
    //Pre:None
    //Post:prints fraction in a string formation
    public String toString()
    {
        String answer = new String();
        this.reduce();
        answer = answer + num + "/" + denom;
        return answer;
    }
    //Pre: Denom must be greater than 0
    //Post: sets denom to given value
    public void setDenominator(int denom)
    {
       this.denom = denom; 
    }
    //Pre:Num must greater than zero
    //Post:sets num to given value
    public void setNumerator(int num)
    {
        this.num = num;
    }
    //Pre: num and denom must be greate than zero
    //Post:multiplies fractions together
    public Fraction multiply(Fraction multiplier)
    {
        Fraction answer = new Fraction();
        answer.num = this.num * multiplier.num;
        answer.denom = this.denom * multiplier.denom;
        this.reduce();
        return answer;
    }
    //Pre: num and denom must be greate than zero
    //Post:divides fractions and reduces, if denom is zero then prints out message
    public Fraction divide(Fraction other)
    {
        if(other.num == 0 || other.denom ==0)
        {
            System.out.println("Cannot divide fraction by 0");
            return this;
        }
        else
        {
            Fraction answer = new Fraction();
            answer.num = this.num * other.denom;
            answer.denom = this.denom * other.num;
            answer.reduce();
            answer = null;
            return null;
        }
    }
    //Pre:num and denom must be greater than zero
    //Post: adds fractions together and reduces
    public Fraction add(Fraction other)
    { 
        Fraction answer = new Fraction();
        answer.num = (this.num * other.denom) + (this.denom * other.num);
        answer.denom = this.denom * other.denom;
        this.reduce();
        return answer;
    }
    //Pre:num and denom must be greater than zero
    //Post: subtracts fractions whilst reducing
    public Fraction subtract(Fraction other)
    {
        Fraction answer = new Fraction();
        answer.num = (this.num * other.denom) - (this.denom * other.num);
        answer.denom = this.denom * other.denom;
        this.reduce();
        return answer;
    }
    //Pre:num cannot be zero 
    //Post:flips fraction
    public Fraction makeReciprocal()
    {
        Fraction answer = new Fraction();
        int num1 = this.denom;
        this.denom = this.num;
        this.num = num1;
        this.reduce();
        return answer;
    }
    //Pre:none
    //Post:creates a random fraction with num between -10 and 10 and denom between 0 and 100
    public static Fraction createRandomFraction()
    {
        Fraction answer = new Fraction();
        answer.num = (int)(Math.random() * 20) - 10;
        answer.denom = (int)(Math.random() * 100) + 1;
        answer.reduce();
        return answer;
    }
    //Pre:none
    //Post:multiplies fraction by itelf the amount of times user enters for pow
    public void power(int pow)
    {
        this.num = (int)Math.pow(this.num, pow);
        this.denom = (int)Math.pow(this.denom, pow);
    }
    //Pre:none
    //Post:reduces fraction to a simpler form
    private void reduce()
    {
        boolean finish = false;
        int sum = this.num;
        while(!finish)
        {
            if(sum == 0)
            {
                finish = true;
            }
            else if (this.num % sum == 0 && this.denom % sum == 0)
            {
               finish = true;
               this.num = this.num / sum;
               this.denom = this.denom / sum;
            }
            else
            {
                sum--;
            }
        }
    }
}
/*
a = 1/2 and b = 2/3

Welcome to the fraction calculator
1:  Set fraction a
2:  Set fraction b
3:  Multiply a * b
4:  Divide a / b
5:  Add a + b
6:  Subtract a - b
7:  Set a to its reciprocal
8:  Set a random fraction c
9:  Raise a to a positive integer power
0:  Quit
3
a * b = 1/3
*/
