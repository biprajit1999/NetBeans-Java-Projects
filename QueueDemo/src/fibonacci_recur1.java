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
public class fibonacci_recur1 
{
    int fibbo(int n)
    {
        if(n<=1)
            return n;
        return fibbo(n-1)+fibbo(n-2);
    }
    public static void main(String args[])
    {
        fibonacci_recur1 obj = new fibonacci_recur1();
        System.out.println("Enter number:  ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println(obj.fibbo(n));
    }
}
