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
public class power_num_recursion {
    
    void power(int a,int b)
    {
        int num = 1;
        for(int i=1;i<=b;i++)
        {
            num=num*a;
        }
        System.out.println(num);
        
        
    }
    public static void main(String args[])
    {
        
    
        power_num_recursion obj = new power_num_recursion();
        System.out.println("Enter number and power");
   
        Scanner sc1 = new Scanner(System.in);
        int n = sc1.nextInt();
        int n2 = sc1.nextInt();
        
        
        obj.power(n, n2);
        
    }
    
}
