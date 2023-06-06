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

class Nodee5
{
    int data;
    Nodee5 next;
    
}
class Node6
{
    int data1;
    Node6 previous;
    Node6 next;
}

public class doubly_to_singly1 {
    
    Nodee5 Start;
    Node6 Start1;
   doubly_to_singly1()
   {
       Start = null;
       Start1 = null;
   }
    

   
    
    void addnode_singly()
    {
        System.out.println("Enter data: ");
        Scanner sc2 = new Scanner(System.in);
        int rn = sc2.nextInt();
        
        Nodee5 newnode = new Nodee5();
        newnode.data = rn;
        newnode.next = null;
        
        
        
        if(Start == null)
        {
            Start = newnode;
        }
        else
        {
            Nodee5 current = Start;
            while(current.next != null)
            {
                current = current.next;
            }
            current.next=newnode;
        }
        System.out.println("data inserted... ");
    }
    
    
    void addnode_doubly(int item)
    {   
        Node6 newnode = new Node6();
        newnode.data1 = item;
        newnode.previous = null;
        newnode.next = null;
        
        if(Start1==null)
        {
            Start1=newnode;          
        }
        else
        {
            Node6 current=Start1;
            while(current.next!=null)
            {
                current = current.next;
            }
            current.next=newnode;
            newnode.previous = current;           
        }
        System.out.println("data inserted,....");
    }
    
    void traverse_doubly2(int item)
    {   
        Node6 newnode = new Node6();
        newnode.data1 = item;
        newnode.previous = null;
        newnode.next = null;
        
        if(Start1==null)
        {
            Start1=newnode;          
        }
        else
        {
            Node6 current=Start1;
            while(current.next!=null)
            {
                current = current.next;
            }
            current.next=newnode;
            newnode.previous = current;  
            System.out.print(current.data1);
        }
       // System.out.print(current.data1);
        
    }
    
    
    void transversenode_singly()
    {
        if(Start==null)
        {
            System.out.println("List empty ");
        }
        else
        {
            Nodee5 current;
            for(current=Start; current!=null; current=current.next)
            {
                System.out.print(" "+current.data);
            }
        }
    }
    
    void singly_to_doubly_even()
    {
        if(Start==null)
        {
            System.out.println("List empty ");
        }
        else
        {
            Nodee5 current;
            for(current=Start; current!=null; current=current.next)
            {
                doubly_to_singly1 obj = new doubly_to_singly1();
                if(current.data%2==0)
                {
                    obj.addnode_doubly(current.data);
                }
            }
        }
    }
    
    void singly_to_doubly_even1()
    {
        if(Start==null)
        {
            System.out.println("List empty ");
        }
        else
        {
            Nodee5 current;
            for(current=Start; current!=null; current=current.next)
            {
                doubly_to_singly1 obj = new doubly_to_singly1();
                if(current.data%2==0)
                {
                   //obj.transversenode_doubly2(current.data);
                    obj.transversenode_doubly2(current.data);
                }
            }
        }
    }
   
     void transversenode_doubly()
    {
        Node6 current = Start1;
        if(Start1 == null)
        {
            System.out.println("Doubly list empty");
        }
        else
        {
            //Node6 current;
            System.out.println("---.....Forward.....--- ");
            for(current = Start1; current.next!=null; current= current.next)
            {
                System.out.print(" "+current.data1);
            }
            System.out.print(" "+current.data1);
            
            System.out.println("\n---.....Reverse.....--- ");
            
            Node6 current1;
            for(current1=current; current1!=null;current1=current1.previous)
            {
                System.out.print(" "+current1.data1);
            }

        }
   
    }
    void transversenode_doubly2(int item)
    {
        Node6 newnode = new Node6();
        newnode.data1 = item;
        newnode.previous = null;
        newnode.next = null;
        
        //Node6 current = Start1;
        if(Start1 == null)
        {
            Start1 = newnode;
        }
        else
        {   
            Node6 current = Start1;
            while(current!=null)
            {
                current=current.next;
                
                
            }
            current.next=newnode;
            current.previous = current;
            System.out.print("  "+current.data1);
        }
        
    }
  
     
public static void main(String args[])
{
    doubly_to_singly1 obj = new doubly_to_singly1();
    
    while(true)
        {
            System.out.println("\nPress 1 for insert in singly: ");
            System.out.println("Press 2 to transfer the singly even data in doubly: ");           
            System.out.println("Press 3 for traverse in singly : ");
            System.out.println("Press 4 for traverse in doubly ..");
            System.out.println("Press 5 for traverse 2 in doubly..");
            
            
            System.out.println("Enter your choice: ");
            Scanner sc1 = new Scanner(System.in);
            int ch = sc1.nextInt();
            if(ch==1)
            {
                obj.addnode_singly();
            }
            else if(ch==2)
            {
                obj.singly_to_doubly_even();
            }
            
            else if(ch==3)
            {
                obj.transversenode_singly();
                
            }
            else if(ch == 4)
            {
                obj.transversenode_doubly();
            }
            else if(ch == 5)
            {
                obj.singly_to_doubly_even1();
            }
            else if(ch==6)
            {
                obj.addnode_singly();
            }
            else if(ch==7)
            {
                obj.transversenode_doubly2(ch);
            }
            else
            {
                System.out.println("Wrong Choice..");
            }
        }
    }
}
