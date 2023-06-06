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

class Nodee2
{
    int data;
    Nodee2 previous;
    Nodee2 next;
}

public class DoublyLinkedList_del_spc1 
{
    Nodee2 Start;
   //Nodee End;
   
    DoublyLinkedList_del_spc1()
    {
        
    }
    
    
    void addnote()
    {
        System.out.println("Enter data...");
        
        Scanner sc2 = new Scanner(System.in);
        int item = sc2.nextInt();
        
        Nodee2 newnode = new Nodee2();
        newnode.data = item;
        newnode.previous = null;
        newnode.next = null;
        
        if(Start==null)
        {
            Start=newnode;
            
        }
        else
        {
            Nodee2 current=Start;
            while(current.next!=null)
            {
                current = current.next;
            }
            current.next=newnode;
            newnode.previous = current;
            
        }
        System.out.println("data inserted,....");
    }
    
    void addnode_spc(int n)
    {
        //System.out.println("Enter value....");
        //Scanner scn1 = new Scanner(System.in);
        //int m2 = scn1.nextInt();
        
        System.out.println("Enter data");
        Scanner scn2 = new Scanner(System.in);
        int item2 = scn2.nextInt();
        
        Nodee2 newnode1 = new Nodee2();
        newnode1.data = item2;
        newnode1.previous = null;
        newnode1.next = null;
        
       
        if(Start == null)
        {
           Start = newnode1;
           newnode1.data = n;
        }
        else
        {
            Nodee2 current = Start;
            while(current.next!=null)
            {
                current = current.next;
            }
            current.next=newnode1;
            newnode1.previous = current;
        }
        System.out.println("data inserted...");
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
                Nodee2 current=Start;
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
    
    void deletenodelast1()
    {
        System.out.println("Enter the number whose next node to be deleted..");
        Scanner sc4 = new Scanner(System.in);
        int n2 = sc4.nextInt();
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
                Nodee2 current=Start;
                while(current.next!=null)
                {
                    
                   current = current.next;
                    
                }
                
                if(current.data == n2)
                {
                    current = current.previous;
                    current.next = null;
                }
                System.out.println("deleted "+current.data);
            }
        }
    }
    
    void del_spc1()
    {
        System.out.println("Enter number specific...");
        Scanner sc1 = new Scanner(System.in);
        int n1 = sc1.nextInt();
        
        Nodee2 current = Start;
        Nodee2 previous = Start;
        
        while(current.data!=n1)
        {
            if(current.next==null)
            {
                Start = null;
            }
            else
            {
                previous = current;
                current = current.next;
            }
        }
        
        if(current == Start)
            Start = Start.next;
        else
            previous.next = current.next;
        //System.out.println(" "+current);
    }
    
    void transversenode()
    {
        Nodee2 current = Start, temp = null;
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
            
            Nodee2 current1;
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
            Nodee2 current;
            
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
        DoublyLinkedList_del_spc1 obj = new DoublyLinkedList_del_spc1();
        
        while(true)
        {
            System.out.println("\nPress 1 for insert: ");
            System.out.println("Press 2 for delete: ");
            System.out.println("Press 3 for transverse: ");
            System.out.println("Press 4 for search: ");
            System.out.println("Press 5 for Exit: ");
            System.out.println("Press 6 for delete from last: ");
            System.out.println("Press 7 for adding node after specific value: ");
            System.out.println("Press 8 for del_spc: ");
            System.out.println("Press 9 for del_spc_after:");
            
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
            else if(ch == 7)
            {
                obj.addnode_spc(5);
                break;
            }
            else if(ch==8)
            {
                obj.del_spc1();
                break;
            }
            else if(ch==9)
            {
                obj.deletenodelast1();
                break;
            }
            else
            {
                System.out.println("Wrong Choice...");
            }
                
           
        }
    }
}
    
