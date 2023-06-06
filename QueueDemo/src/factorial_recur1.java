/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author biprajitdebnath
 */
import java.util.Scanner;
public class factorial_recur1 
{
    int fact(int n)
    {
        if(n==0)
        {
            return 1;
        }
        else 
            return n*fact(n-1);

    }
public static void main(String args[])
{
    factorial_recur1 obj = new factorial_recur1();
    System.out.println("Enter the number: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(obj.fact(n));
}
    
}

