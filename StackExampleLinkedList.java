/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackdemo1;
import java.util.Scanner;
import java.util.*;
/**
 *
 * @author biprajitdebnath
 */

class Node
{
    int data;
    Node next;

}
public class StackExampleLinkedList {
   
    Node top;
    StackExampleLinkedList()
    {
            
        top= null;
   
    }
    void push()
    {
        System.out.println("Enter data");
        Scanner sc2 = new Scanner(System.in);
        int newitem = sc2.nextInt();
        
        Node newnode = new Node();
        newnode.data = newitem;
        newnode.next = top;
        
        top = newnode;
        System.out.println("data inserted ...");
    }
    
    void pop()
    {
        if(top==null)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            System.out.println("deleted element: "+top);
            top = top.next;
        }
                
     
                    
    }
        
    void tranverse()
    {
        if(top == null)
        {
            System.out.println("Stack Empty");
        }
        else
        {
            Node current;
            for(current=top; current!=null; current=current.next)
            {
                System.out.println(current.data);
            }
        }
    }
    
   
    public static void main (String args[])
    {
        StackExampleLinkedList obj = new StackExampleLinkedList();
        while (true)
        {
            System.out.println("press 1 for push: ");
            System.out.println("press 2 for pop");
            System.out.println("press 3 for transverse: ");
            System.out.println("press 4 for exit n:");
            
            System.out.println("Enter your choice...");
            
           //System.out.println("Enter ur choice....");
           Scanner sc = new Scanner(System.in);
           int ch =sc.nextInt();
            
            
            switch(ch)
           {
               case 1:
                   obj.push();
                   break;
               case 2:
                   obj.pop();
                   break;
               case 3:
                   obj.tranverse();
                   break;
               case 4:
                   System.exit(0);
                   break;
               default:
                   System.out.println("Wrong choice.....");
           }
        
            
            
          
            
        }
        
        //obj.pop();
        //obj.push();
        //obj.tranverse();
      
        
        
        
    }
 
    
    
}
