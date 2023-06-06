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
class Node3
{
    String data;
    Node3 next;
}
public class Stack_linkedlist_string1 {
    
    Node3 top;
    Stack_linkedlist_string1()
    {
      top= null;      
    }
    void push()//insert
    {
      System.out.println("Enter Data");
      Scanner sc2= new Scanner(System.in);
      String newitem= sc2.next();
      
      Node3 newnode= new Node3();
      newnode.data=newitem;
      newnode.next=top;
      
      top= newnode;
      System.out.println("data insterted...");
    }
    void pop()//delete
    {
        if(top==null)
        {
            System.out.println("Stack is Empty");
        }
        else
        {
            System.out.println("deleted element :"+top.data);
            top = top.next;
        }
    }
    void traverse()//view
    {
       if(top==null)
       {
           System.out.println("Stack Empty");
       }
       else
       {
           Node3 current;
           for(current=top;current!=null;current= current.next)
           {
               System.out.print("  "+current.data);
           }
       }
    
    }
    
    void search_string()
    {
        System.out.println("Enter the string to be searched: ");
        Scanner sc4 = new Scanner(System.in);
        String str = sc4.next();
        Node3 current2;
        for(current2 = top;current2!=null;current2 = current2.next)
        {
            if(current2.data.matches(str))
            {
                System.out.println("String found ");
            }
        }
    }
   
    public static void main(String args[])
    {
        Stack_linkedlist_string1 obj=new Stack_linkedlist_string1();
        /*obj.push();
        obj.pop();
        obj.traverse();*/
        while(true)
        {
            System.out.println("\npress 1 for push");
            System.out.println("press 2 for pop");
            System.out.println("press 3 for traverse");
            System.out.println("press 4 for exit");
            System.out.println("press 5 for search string");
            
            System.out.println("enter your choice");
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();
            
            switch(ch)
            {
                case 1:
                    obj.push();
                    break;
                case 2:
                    obj.pop();
                    break;
                case 3:
                    obj.traverse();
                    break;
                case 4:
                    System.exit(0);
                    break;
                case 5:
                    obj.search_string();
                    break;
                default:
                    System.out.println("Wrong choice");
                    
                    
               
                    
                     
            }
        }
    }
    
}
