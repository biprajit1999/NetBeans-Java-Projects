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

class Nodee
{
    int data;
    Nodee previous;
    Nodee next;
}
        

public class DoublyLinkedList {
    
    
   Nodee Start;
   //Nodee End;
   
    
    DoublyLinkedList()
    {
        
    }
    
    void addnote()
    {
        System.out.println("Enter data...");
        
        Scanner sc2 = new Scanner(System.in);
        int item = sc2.nextInt();
        
        Nodee newnode = new Nodee();
        newnode.data = item;
        newnode.previous = null;
        newnode.next = null;
        
        if(Start==null)
        {
            Start=newnode;
            
        }
        else
        {
            Nodee current=Start;
            while(current.next!=null)
            {
                current = current.next;
            }
            current.next=newnode;
            newnode.previous = current;
            
        }
        System.out.println("data inserted,....");
    }
    
    
    void deletenode()
    {
        //delete from begin
        if(Start==null)
        {
            System.out.println("Doubly List is empty..");
        }
        else
        {
            System.out.println("deleted"+Start.data);
            Start = Start.next;
            Start.previous = null; 
        }
    }
    
    void deletenodelast()
    {
        if(Start == null)
        {
            System.out.println("Doubly list is empty...");
        }
        else
        {
            if(Start.next == null)
            {
                //System.out.println("deleted "+Start.data);
                Start = null;                
            }
            else
            {          
                Nodee current=Start;
                while(current.next!=null)
                {
                    current = current.next;
                }
                System.out.println("deleted "+current.data);
                current = current.previous;
                current.next = null;
            }
        }
    }
    
    
    void transversenode()
    {
        Nodee current = Start, temp = null;
        //temp=null;
        if(Start == null)
        {
            System.out.println("Doubly list empty");
        }
        else
        {
            //forward
           // Nodee current;
            
            System.out.println("---.....Forward.....--- ");
            for(current = Start; current.next!=null; current= current.next)
            {
                System.out.print(" "+current.data);
            }
            System.out.print(" "+current.data);
            //reverse
            
            System.out.println("\n---.....Reverse.....--- ");
            //Nodee current = End;
            
            Nodee current1;
            for(current1=current; current1!=null;current1=current1.previous)
            {
                System.out.print(" "+current1.data);
            }

        }
    }
    
    void searchnode()
    {
        if(Start==null)
        {
            System.out.println("Linked list is empty...");
        }
        else
        {
            System.out.println("Enter the value to be searched..");
            
            Scanner sc3 = new Scanner(System.in);
            int searchvalue = sc3.nextInt();
            
            int count = 0;
            Nodee current;
            
            for(current=Start; current!=null; current=current.next)
            {
                if(current.data == searchvalue)
                {
                    count++;
                    break;
                }
            }
                if(count>0)
                {
                    System.out.println("Value found..");
                }
                else
                {
                    System.out.println("Value not found..");
                }
            
        }
    }
           
    public static void main(String args[])
    {
        DoublyLinkedList obj = new DoublyLinkedList();
        
        while(true)
        {
            System.out.println("\nPress 1 for insert: ");
            System.out.println("Press 2 for delete: ");
            System.out.println("Press 3 for transverse: ");
            System.out.println("Press 4 for search: ");
            System.out.println("Press 5 for Exit: ");
            System.out.println("Press 6 for delete from last: ");
            
            System.out.println("Enter your choice: ");
            Scanner sc1 = new Scanner(System.in);
            int ch = sc1.nextInt();
            
            if(ch==1)
            {
                obj.addnote();
            }
            else if(ch==2)
            {
                obj.deletenode();
            }
            else if(ch==3)
            {
                obj.transversenode();
            }
            else if(ch==4)
            {
                obj.searchnode();
            }
            else if(ch==5)
            {
                System.exit(0);
            }
            else if(ch==6)
            {
                obj.deletenodelast();
            }
            else
            {
                System.out.println("Wrong Choice...");
            }
                
           
        }
    }
}
