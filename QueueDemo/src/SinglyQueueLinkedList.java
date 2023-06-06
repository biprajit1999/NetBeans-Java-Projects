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

class Node
{
    int data;
    Node next;
}
public class SinglyQueueLinkedList {
    
    Node Front, Rear;
    SinglyQueueLinkedList()
    {
        Front = null;
        Rear = null;
    }
    
    void insert()
    {
        System.out.println("Enter data ");
        Scanner sc3 = new Scanner(System.in);
        int item = sc3.nextInt();
        
        Node newnode = new Node();
        newnode.data = item;
        newnode.next = null;
        
        if(Front == null)
        {
            Front = newnode;
            Rear = newnode;
          
        }
        else
        {
            Node current = Rear;
            while(current.next != null)
            {
                current = current.next;
                
            }
            current.next = newnode;
        }
        
    }
    
    void delete()
    {
        if(Front == null)
        {
            System.out.println("Queue empty ");
        }
        else
        {
            System.out.println("deleted : "+Front.data);
            Front = Front.next;
        }
    }
    
    void poll()
    {
        if(Rear==null)
        {
            System.out.println("queue empty");
        }
        else
        {
            System.out.println("deleted "+Rear.data);
            
        }
    }
    
    void traverse()
    {
        if(Front == null || Rear == null)
        {
            System.out.println("Queue empty ");
        }
        else
        {
            for(Node current=Front; current!=null;current=current.next)
            {
                System.out.print("  "+current.data);              
            }
        }
    }
    
    public static void main(String args[])
    {
        SinglyQueueLinkedList obj = new SinglyQueueLinkedList();
        
        while(true)
        {
            System.out.println("\nPress 1 for insert ");
            System.out.println("Press 2 for delete ");
            System.out.println("Press 3 for traverse ");
            System.out.println("Press 4 for exit ");
            
            System.out.println("Enter your choice: ");
            
            Scanner sc1 = new Scanner(System.in);
            int ch = sc1.nextInt();
            
            switch(ch)
            {
                case 1:
                    obj.insert();
                    break;
                    
                case 2:
                    obj.delete();
                    break;
                   
                case 3:
                    obj.traverse();
                    break;
                  
                case 4:
                    System.exit(0);
                    break;
                    
                case 5:
                    obj.poll();
                    break;
                    
                default:
                    System.out.println("Wrong choice...");
            }
        }
    }
    
}

//difference between peek and pop ...1 marks