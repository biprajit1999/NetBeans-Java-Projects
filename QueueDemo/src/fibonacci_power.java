/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author biprajitdebnath
 */
import java.util.*;
public class fibonacci_power {
    
    public static int fibonacci_series(int n)
    {     
        int a = 0, b = 1, c;
        if (n == 0)
            return a;
        for (int i = 2; i <= n; i++)
        {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
 
    }
    
    public static void main(String args[])
    {
        fibonacci_power obj = new fibonacci_power();
        
        System.out.println("Enter the number of terms of the series..");
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        //obj.fibonacci_series(n);
        System.out.println(fibonacci_series(n));
    }
    
}
