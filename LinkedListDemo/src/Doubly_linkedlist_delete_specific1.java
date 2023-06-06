
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
class Nodee1
{
    int data;
    Nodee1 previous;
    Nodee1 next;
}
public class Doubly_linkedlist_delete_specific1 
{
    
    Nodee1 Start;
   //Nodee End;
   
    
    Doubly_linkedlist_delete_specific1()
    {
        
    }
    
    void addnote()
    {
        System.out.println("Enter data...");
        
        Scanner sc2 = new Scanner(System.in);
        int item = sc2.nextInt();
        
        Nodee1 newnode = new Nodee1();
        newnode.data = item;
        newnode.previous = null;
        newnode.next = null;
        
        if(Start==null)
        {
            Start=newnode;
            
        }
        else
        {
            Nodee1 current=Start;
            while(current.next!=null)
            {
                current = current.next;
            }
            current.next=newnode;
            newnode.previous = current;
            
        }
        System.out.println("data inserted...");
       
    }
    
    void addnode_spc()
    {
        System.out.println("Enter value....");
        Scanner scn1 = new Scanner(System.in);
        int m2 = scn1.nextInt();
        
        System.out.println("Enter data");
        Scanner scn2 = new Scanner(System.in);
        int item2 = scn2.nextInt();
        
        Nodee1 newnode1 = new Nodee1();
        newnode1.data = item2;
        newnode1.previous = null;
        newnode1.next = null;
        
        if(Start == null)
        {
           Start = newnode1; 
        }
        else if(newnode1.data == m2)
        {
            Nodee1 current = Start;
            while(current.next!=null)
            {
                current = current.next;
            }
            current.next=newnode1;
            newnode1.previous = current;
        }
        System.out.println("data inserted...");
    }
    void del_spc_node4()
    {
        System.out.println("Enter the number ");
        Scanner scn = new Scanner(System.in);
        int m1 = scn.nextInt();
        Nodee1 temp = Start;
        Start.previous = null;
        
        if(temp != null && temp.data == m1)
        {
            Start = temp.next;
            return;
        }
        while(temp!=null && temp.data != m1)
        {
            Start.previous=temp;
            temp = temp.next;
        }
        
        if(temp==null)
        {
            return;
        }
        Start.previous.next = temp.next;
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
   /*( void spc_node3()
    {
        Start.previous = null;
        System.out.println("Enter the number ");
        //Scanner scn = new Scanner(System.in);
        //int m1 = scn.nextInt();
        
        if(Start!=null && Start.data == m1)
        {
            Start = Start.next;
            return;
        }
        while(Start!=null && Start.data!=m1)
        {
            Start.previous = Start;
            Start = Start.next;
        }
        if(Start == null)
        {
            return;
        }
        
        Start.previous.next = Start.next;     
          
    }
    */
    void delete_spc_node2()
    {
        System.out.println("Enter the number ");
        Scanner sc5 = new Scanner(System.in);
        int n2 = sc5.nextInt();
        
        if(Start == null)
        {
            System.out.println("Doubly list empty.. ");
            
        }
        else
        {
            while(Start.data!=n2)
            {
                System.out.println("deleted "+Start.data);
                Start = Start.next;
               // Start.previous = null;
            }
            Start.previous = null;
        }
    }
    /*
    void delete_spc_node2()
    {
        System.out.println("Enter the number ");
        Scanner sc5 = new Scanner(System.in);
        int n2 = sc5.nextInt();
        
        if(Start == null)
        {
            System.out.println("Doubly list empty..");
        }
        else
        {
            System.out.println("deleted "+Start.data);
            if(Start.data==n2)
            {
                Start = Start.next;
                
            }
            Start.previous = null;
            
        }
    }
*/
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
                Nodee1 current=Start;
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
    
    void delete_spc_last()
    {
        System.out.println("Enter value..");
        Scanner sc5 = new Scanner(System.in);
        int n5 = sc5.nextInt();
        
        if(Start == null)
        { 
            Start = null;
        }
        else
        {
            Nodee1 current = Start;
            while(current.previous!=null)
            {
                while(Start.data!=n5)
                {
                    current = current.previous;
                }
            }
            System.out.println("deleted "+current.data);
            current = current.next;
            current.next=null;
        }
    }
    
    void delete_specific_element()
    {
        System.out.println("Enter value to be deleted: ");
        Scanner sc6 = new Scanner(System.in);
        int m = sc6.nextInt();
        
        Nodee1 current = Start;
        current.previous = Start;
        while(current.data!=m)
        {
            if(current.next==null)
            {
                System.out.println("Empty linked list..");
            }
            else
            {
                current.previous = current;
                current = current.next;
                
            }
        }
        if(current == Start)
            Start = Start.next;
        else
            current.previous=Start.next;
        System.out.println(current);
    }
    
    void delete_specified_node()
    {
        System.out.println("Enter the number: ");
        Scanner sc4 = new Scanner(System.in);
        int n1 = sc4.nextInt();
        if(Start == null)
        {
            Start = null;
        }
        else
        {
            if(Start.next==null)
            {
                Start = null;
            }
            else
            {
                Nodee1 current= Start;
                if(current.data == n1)
                {
                while(current.next!=null)
                {
                   
                    current = current.next;
                }
                }
                System.out.println("deleted "+current.data);
                current = current.previous;
                //current.previous=null;
            }
        }
    }
    
    
    void transversenode()
    {
        Nodee1 current = Start, temp = null;
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
            
            Nodee1 current1;
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
            Nodee1 current;
            
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
        Doubly_linkedlist_delete_specific1 obj = new Doubly_linkedlist_delete_specific1();
        
        while(true)
        {
            System.out.println("\nPress 1 for insert: ");
            System.out.println("Press 2 for delete: ");
            System.out.println("Press 3 for transverse: ");
            System.out.println("Press 4 for search: ");
            System.out.println("Press 5 for Exit: ");
            System.out.println("Press 6 for delete from last: ");
            System.out.println("Press 7 for delete specific node");
            System.out.println("Press 8 for deleting specific node part");
            System.out.println("Press 9 for deleting spefic node from last");
            System.out.println("Press 10 for deleting specific element..");
            System.out.println("Press 11 for deleting specific node..");
            System.out.println("Press 12 for inserting after a specific value..");
            
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
                obj.delete_specified_node();
                break;
            }
            else if(ch==8)
            {
                obj.delete_spc_node2();
                break;
            }
            else if(ch==9)
            {
                obj.delete_spc_last();
                break;
            }
            else if(ch==10)
            {
                obj.delete_specific_element();
                break;
            }
            else if(ch==11)
            {
                obj.del_spc_node4();
                break;
            }
            else if(ch==12)
            {
                obj.addnode_spc();
                break;
            }
            else
            {
                System.out.println("Wrong Choice...");
            }
                
           
        }
    }
}
