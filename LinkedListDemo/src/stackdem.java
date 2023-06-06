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

class Node2
{
    int data;
    Node2 next;
}
public interface stackdem {
    
    abstract void push(int data);
    abstract int pop();
    abstract int peek();
    abstract boolean isEmpty();
    abstract void traverse();
    
}
class stackdem2 implements stackdem
{
    Node2 top;
    
    stackdem2()
    {
        top = null;
    }
    public void push(int data)
    {
        //System.out.println("Enter data");
        Node2 newnode= new Node2();
        newnode.data=data;
        newnode.next=top;
        top= newnode;
        
        System.out.println("Data inserted");
    }
    
    public int pop()
    {
        System.out.println("deleted item"+top.data);
        if(isEmpty() == true)
        {
            System.out.println("Stack empty..");
        }
        else
        {
            top = top.next;
            
        }
        
        return top.data;
    }
    
    public int peek()
    {
        if(isEmpty()==true)
        {
            System.out.println("Stack empty");
        }
        else
            System.out.println(top.data);
        return top.data;
    }
    
    public boolean isEmpty()
    {
        if(top==null)
            return true;
        else
            return false;
    }
    
    public void traverse()
    {
        if(isEmpty()==true)
       {
           System.out.println("Stack Empty");
       }
       else
       {
           Node2 current;
           for(current=top;current!=null;current= current.next)
           {
               System.out.print("  "+current.data);
           }
       }
    }
    
    public static void main(String args[])
    {
        stackdem2 obj=new stackdem2();
        
        while(true)
        {
            System.out.println("\npress 1 for push");
            System.out.println("press 2 for pop");
            System.out.println("press 3 for peek");
            System.out.println("press 4 for isEmpty");
            System.out.println("press 5 for traverse");
            System.out.println("Press 6 for exit");
            
            System.out.println("enter your choice");
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();
            
            
            
            switch(ch)
            {
                case 1:
                    System.out.println("Enter data");
                    Scanner sc1 = new Scanner(System.in);
                    int n = sc1.nextInt();
                    obj.push(n);
                    break;
                case 2:
                    obj.pop();
                    break;
                case 3:
                    obj.peek();
                    break;
                case 4:
                    obj.isEmpty();
                    break;
                case 5:
                    obj.traverse();
                    break;
                    
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Wrong Choice");
            }
        }
    }
    
}

