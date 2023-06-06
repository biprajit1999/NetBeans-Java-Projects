
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

class Nodee6
{
    int data;
    Nodee6 previous;
    Nodee6 next;
}


public class doubly_linkedlist_all_add_op1 
{
    Nodee6 Start;
   //Nodee End;
   
    
    doubly_linkedlist_all_add_op1()
    {
        
    }
    
    void addnote()
    {
        System.out.println("Enter data...");
        
        Scanner sc2 = new Scanner(System.in);
        int item = sc2.nextInt();
        
        Nodee6 newnode = new Nodee6();
        newnode.data = item;
        newnode.previous = null;
        newnode.next = null;
        
        if(Start==null)
        {
            Start=newnode;
            
        }
        else
        {
            Nodee6 current=Start;
            while(current.next!=null)
            {
                current = current.next;
            }
            current.next=newnode;
            newnode.previous = current;
            
        }
        System.out.println("data inserted,....");
    }
    
    void addnote_sp(int loc, int item)
    {   
        Nodee6 newnode = new Nodee6();
        newnode.data = item;
        newnode.previous = null;
        newnode.next = null;
        
        if(Start==null)
        {
            Start=newnode;
            
        }
        else
        {
            Nodee6 current=Start;
            while(current.next!=null)
            {
                if(current.next.data==loc)
                {
                    current = current.next;
                }
            }
            //if(current.data==loc)
            //{
                current.next=newnode;
                newnode.previous = current;
                //newnode.next=current.next.next;
           // }
            
        }
        System.out.println("data inserted,....");
    }
    
      
   void insert_between(int loc,int item)
   {
       Nodee6 newnode = new Nodee6();
        newnode.data = item;
       // newnode.previous = null;
        newnode.previous = Start;
        newnode.next = null;
        
        if(Start==null)
        {
            Start=newnode;
            
        }
        else
        {
            Nodee6 current;
            for(current=Start;current!=null;current=current.next)
            {
                if(current.next.data==loc)
                {
                    newnode.next=current;
                    newnode.previous=current.previous;
                    current.previous=newnode;
                    current.next=newnode;
                    
                }
            }
        }       
   }
 /*   
    void insertNth(int data, int position) {
        //create new node.
        Nodee6 node = new Nodee6();
        node.data = data;
        node.next = null;


        if (Start == null) {
            //if head is null and position is zero then exit.
            if (position != 0) {
                return;
            } else { //node set to the head.
                Start = node;
            }
        }

        if (Start != null && position == 0) {
            node.next = Start;
            Start = node;
            return;
        }

        Nodee6 current = Start;
        Nodee6 previous = null;

        int i = 0;

        while (i < position) {
            previous = current;
            current = current.next;

            if (current == null) {
                break;
            }

            i++;
        }

        node.next = current;
        previous.next = node;
    }
    


void InsertNth(int data, int position) {
    int count = 0;
    Nodee6 node = Start;
    node.previous = null;
    while(count != position){
      count++;
      node = node.next;
      node.previous = node;
    }

    Nodee6 newNode = new Nodee6();
    newNode.data = data;


    newNode.next = node;
    if(count == 0){
          Start = newNode;
       }else{
          node.previous.next = newNode;
    }
    //return Start;          
}
*/
    
    
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
                Nodee6 current=Start;
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
        Nodee6 current = Start, temp = null;
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
            
            Nodee6 current1;
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
            Nodee6 current;
            
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
        doubly_linkedlist_all_add_op1 obj = new doubly_linkedlist_all_add_op1();
        
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
                System.out.println("Enter loc...");
        
                Scanner scn1 = new Scanner(System.in);
                int n = scn1.nextInt();
        
                System.out.println("Enter value...");
        
                Scanner scn2 = new Scanner(System.in);
                int n2 = scn2.nextInt();
                obj.addnote_sp(n, n2);
                //obj.InsertNth(n2, n);
                //obj.addnode_after(n, n2);
            }
            else
            {
                System.out.println("Wrong Choice...");
            }
                
           
        }
    }
    
}
