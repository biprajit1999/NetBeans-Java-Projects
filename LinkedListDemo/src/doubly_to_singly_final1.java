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

class Node_doubly
{
    int data;
    Node_doubly previous;
    Node_doubly next;
    
}

class Node_singly
{
    int data1;
    Node_singly next;   
}
public class doubly_to_singly_final1 
{
    Node_doubly Start;
    Node_singly Start1;
    
    doubly_to_singly_final1()
    {
        Start = null;
        Start1 = null;
    }
    
    void addnode_doubly()
    {
        System.out.println("Enter data..");
        
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        
        Node_doubly newnode = new Node_doubly();
        newnode.data = data;
        newnode.previous = null;
        newnode.next = null;
        
        if(Start == null)
        {
            Start = newnode;
        }
        else
        {
            Node_doubly current = Start;
            while(current.next!=null)
            {
                current = current.next;
            }
            current.next = newnode;
            newnode.previous = current;
        }
        System.out.println("Data inserted ...");
    }
    
    void addnode_singly(int item)
    {
        Node_singly newnode1 = new Node_singly();
        newnode1.data1 = item;
        newnode1.next = null;
        
        if(Start1 == null)
        {
            Start1 = newnode1;
        }
        else
        {
            Node_singly current = Start1;
            while(current.next != null)
            {
                current = current.next;
            }
            current.next = newnode1;          
        }
        System.out.println("Data inserted..");
    }
    
    void traverse_doubly()
    {
        System.out.println("The doubly linked list :-");
        
        for(Node_doubly current=Start;current!=null;current=current.next)
        {
            System.out.print("  "+current.data);
        }
    }
    
    void doubly_singly_transfer()
    {
        for(Node_doubly current=Start; current!=null; current=current.next)
        {
            if(current.data%2==0)
            {
                doubly_to_singly_final1 obj = new doubly_to_singly_final1();
                obj.addnode_singly(current.data);
                obj.traverse_singly2(current.data);
            }
        }
    }
    
    void traverse_singly()
    {
        for(Node_singly current=Start1;current!=null;current=current.next)
        {
            System.out.print("  "+current.data1);
        }
    }
    
    void traverse_singly2(int item)
    {
        Node_singly current = Start1;
        current.data1 = item;
        while(current!=null)
        {
            System.out.print("  "+current.data1);
            current = current.next;
        }
        System.out.println("");
        
    }
    
public static void main(String args[])
{
    doubly_to_singly_final1 obj = new doubly_to_singly_final1();
    
    while(true)
    {
        System.out.println("\nPress 1 to insert data in doubly..");
        System.out.println("Press 2 for transfer data from doubly to singly");
        System.out.println("Press 3 for doubly traverse");
        System.out.println("Press 4 for singly traverse");
        
        System.out.println("Enter your choice");       
        Scanner sc2 = new Scanner(System.in);
        int ch = sc2.nextInt();
        
        switch(ch)
        {
            case 1:
                obj.addnode_doubly();
                break;
            case 2:
                obj.doubly_singly_transfer();
                break;
            case 3:
                obj.traverse_doubly();
                break;
            case 4:
                obj.traverse_singly();
                break;
            case 5:
                //obj.traverse_singly2();
                break;
            default:
                System.out.println("Worng Choice..");
        }
    }
}
    
}

