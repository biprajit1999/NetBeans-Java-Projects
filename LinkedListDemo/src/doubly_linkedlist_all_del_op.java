
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

class Nodee3
{
    int data;
    Nodee3 previous;
    Nodee3 next;
}

public class doubly_linkedlist_all_del_op 
{
    Nodee3 Start;
    Nodee3 End;
   
    
    doubly_linkedlist_all_del_op()
    {
        
    }
    
    void addnote(int item)
    {
        
        Nodee3 newnode = new Nodee3();
        newnode.data = item;
        newnode.previous = null;
        newnode.next = null;
        
        if(Start==null)
        {
            Start=newnode;
            
        }
        else
        {
            Nodee3 current=Start;
            while(current.next!=null)
            {
                current = current.next;
            }
            current.next=newnode;
            newnode.previous = current;
            
        }
        System.out.println("data inserted,....");
    }
    
     
    void add_node_specific_after()
    {
        System.out.println("Enter value after which node to be inserted...");
        
        Scanner sc5 = new Scanner(System.in);
        int n = sc5.nextInt();
        
        System.out.println("Enter value to be inserted...");
        
        Scanner sc6 = new Scanner(System.in);
        int n2 = sc6.nextInt();
        
        Nodee3 newnode = new Nodee3();
        newnode.data = n2;
        newnode.next=null;
        newnode.previous=null;
        
        for(Nodee3 current=Start; current.next!=null; current=current.next)
        {
            
            if(current.next.data==n)
            {
                current.next.next.data=n2;
             
            }
        }
    }
    
    void add_node_specific_replacement()
    {
        System.out.println("Enter old value...");
        
        Scanner scn1 = new Scanner(System.in);
        int n = scn1.nextInt();
        
        System.out.println("Enter new value...");
        
        Scanner scn2 = new Scanner(System.in);
        int n2 = scn2.nextInt();
        
        for(Nodee3 current=Start; current.next!=null; current=current.next)
        {
            
            if(current.next.data==n)
            {
                current.next.data=n2;
            }
        }
    }
    
    void add_node_specific_before()
    {
        System.out.println("Enter the value before which node to be inserted");
        
        Scanner scn3 = new Scanner(System.in);
        int n = scn3.nextInt();
        
        System.out.println("Enter the value to be inserted...");
        
        Scanner scn4 = new Scanner(System.in);
        int n2 = scn4.nextInt();
        
        for(Nodee3 current=Start; current.next!=null; current=current.next)
        {
            
            if(current.next.data==n)
            {
                current.data=n2;
            }
        }
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
                Nodee3 current=Start;
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
    
    void deletenodelast_sp1(int item)
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
                Nodee3 current=Start;
                while(current.next!=null)
                {
                    //current = current.next;
                    if(current.next.data==item)
                    {
                        current = current.next;
                    }
                }
                System.out.println("deleted "+current.data);
                
                current = current.previous;
                current.next = null;
            }
        }
    }
    
    void transversenode()
    {
        Nodee3 current = Start, temp = null;
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
            /*
            System.out.println("\n---.....Reverse.....--- ");
            //Nodee current = End;
            
            Nodee3 current1;
            for(current1=current; current1!=null;current1=current1.previous)
            {
                System.out.print(" "+current1.data);
            }
*/
        }
    }
    
    void del_specific_value()
    {
        System.out.println("Enter value before which node to be deleted...");
        
        Scanner sc2 = new Scanner(System.in);
        int n = sc2.nextInt();
        
        for(Nodee3 current=Start; current.next!=null; current=current.next)
        {
            
            if(current.next.data==n)
            {
                current.next=current.next.next;
                current.next.previous=null;
            }
        }
    }
    
    void del_specific_value_after()
    {
        System.out.println("Enter value before which node to be deleted...");
        
        Scanner sc3 = new Scanner(System.in);
        int n = sc3.nextInt();
        
        for(Nodee3 current=Start; current.next!=null; current=current.next)
        {
            
            if(current.next.data==n)
            {
                current.next.next=current.next.next.next;
                //current.next.next.previous=null;
            }
        }
    }
    
    void del_specific_value_before()
    {
        System.out.println("Enter value before which node to be deleted...");
        int count=0;
        Scanner sc4 = new Scanner(System.in);
        int n = sc4.nextInt();
        
        Nodee3 current;
        for(current=Start; current.next!=null; current=current.next)
        {
            if(current.next.data == n)
            {
                current.next.previous = current.next.previous.previous;
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
            Nodee3 current;
            
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
        doubly_linkedlist_all_del_op obj = new doubly_linkedlist_all_del_op();
        
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
                System.out.println("Enter data...");
                Scanner sc2 = new Scanner(System.in);
                int item = sc2.nextInt();
                obj.addnote(item);
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
                obj.del_specific_value();
            }
            else if(ch==8)
            {
                obj.del_specific_value_after();
            }
            else if(ch==9)
            {
                obj.del_specific_value_before();
            }
          
            else if(ch==11)
            {
                obj.add_node_specific_after();
            }
            else if(ch==12)
            {
                obj.add_node_specific_before();
            }
            else if(ch==13)
            {
                obj.add_node_specific_replacement();
            }
            else
            {
                System.out.println("Wrong Choice...");
            }
                
           
        }
    }
    
}
