
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

class Node_db
{
    int data;
    Node_db previous;
    Node_db next;
}
public class doubly_middle_top1 
{
     
   Node_db Start;
   //Nodee End;
   
    
    doubly_middle_top1()
    {
        
    }
    
    void addnote()
    {
        System.out.println("Enter data...");
        
        Scanner sc2 = new Scanner(System.in);
        int item = sc2.nextInt();
        
        Node_db newnode = new Node_db();
        newnode.data = item;
        newnode.previous = null;
        newnode.next = null;
        
        if(Start==null)
        {
            Start=newnode;
            
        }
        else
        {
            Node_db current=Start;
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
                Node_db current=Start;
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
        Node_db current = Start, temp = null;
        //temp=null;
        int count=1;
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
                count++;
            }
            System.out.print(" "+current.data+"\n"+count);
            //reverse
            
            System.out.println("\n---.....Reverse.....--- ");
            //Nodee current = End;
            
            Node_db current1;
            for(current1=current; current1!=null;current1=current1.previous)
            {
                System.out.print(" "+current1.data);
            }

        }
    }
    
    void midtotop()
    {
        int temp=0;
        int count=1;
        if(Start==null)
        {
            System.out.println("Empty");
        }
        else
        {
            for(Node_db current=Start;current!=null;current=current.next)
            {
                count++;
            }
        }
        
        if(Start==null)
        {
            System.out.println("Empty");
        }
        else
        {
            for(Node_db current=Start;current.data<=count;current=current.next)
            {
                temp = Start.data;
                Start.data=current.data;
                current.data=temp;
                System.out.println(current.data);
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
            Node_db current;
            
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
        doubly_middle_top1 obj = new doubly_middle_top1();
        
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
            else if(ch==7)
            {
                obj.midtotop();
                
            }
            else
            {
                System.out.println("Wrong Choice...");
            }
                
           
        }
    }
    
}
