
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author biprajitdebnath
 */
class Node7
{
    int data;
    Node7 next;
}
public interface Stack_inp1 {
    
    abstract void push(int data);
    abstract int pop();
    abstract int peek();
    abstract boolean isEmpty();
    abstract void traverse();
    
}
class stackdem3 implements Stack_inp1
{
    Node7 top;
    
    stackdem3()
    {
        top = null;
    }
    public void push(int data)
    {
        //System.out.println("Enter data");
        Node7 newnode= new Node7();
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
           Node7 current;
           for(current=top;current!=null;current= current.next)
           {
               System.out.print("  "+current.data);
           }
       }
    }
    
    public static void main(String args[])
    {
        stackdem3 obj=new stackdem3();
        
        while(true)
        {
            System.out.println("\npress 1 for push");
            System.out.println("press 2 for pop");
            System.out.println("press 3 for peek");
            System.out.println("press 4 for isEmpty");
            System.out.println("press 5 for traverse");
            System.out.println("press 6 for exit");
            
            System.out.println("enter your choice");
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();
            
            
            
            switch(ch)
            {
                case 1:
                    System.out.println("Enter data");
                    Scanner sc1 = new Scanner(System.in);
                    int n = sc1.nextInt();
                    
                    while(n!=0)
                    {
                        int a=n%10;
                        obj.push(a);
                        n=n/10;
                       
                    }
                    //obj.push(a);
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
