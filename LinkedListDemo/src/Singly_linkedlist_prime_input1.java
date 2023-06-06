
import java.util.Scanner;
import java.util.*;
import java.math.*;

class Node5
{
    int rollno;
    Node5 next;
}

public class Singly_linkedlist_prime_input1 
{
    Node5 Start;
   Singly_linkedlist_prime_input1()
   {
       Start = null;
   }
   
   
    boolean isprime(int n)
    {
       boolean flag=true;
       int m = n/2;
       for(int i=2;i<m-1;i++)
       {
           if(n%i==0)
           {
               flag=false;
           }
           else
               continue;
           
       }
       return flag;
   }
      
    void addnode()
    {
        System.out.println("Enter data: ");
        Scanner sc2 = new Scanner(System.in);
        //BigInteger rn = sc2.nextBigInteger();
        int rn = sc2.nextInt();
        
        
        
        Node5 newnode = new Node5();
        newnode.rollno = rn;
        newnode.next = null;
        
        if(Start == null)
        {
            //if(isprime(Start.next.rollno))
           
                Start = newnode;
          
        }
        else
        {
            Node5 current = Start;
            while(current.next != null)
            {
                {
                    
                    current = current.next;
                    
                }
                //current.next;
                //current = current.next;
            }
            if(isprime(newnode.rollno)==false)
            {
                current.next = newnode;
            }
            
        }
        System.out.println("data inserted... ");
    }
    
    void deletenodebegin()
    {
        if(Start == null)
        {
            System.out.println("List empty ");
        }
        else
        {
            System.out.println("deleted: "+Start.rollno);
            Start = Start.next;
        }
    }
    
    void deletenodelast()
    {
        
    }
    
    void transversenode()
    {
        int count = 0;
        if(Start==null)
        {
            System.out.println("List empty ");
        }
        else
        {
            Node5 current;
            for(current=Start; current!=null; current=current.next)
            {
                System.out.print(" "+current.rollno);
                count++;
            }
            System.out.println("\nNumber of elements in the linkedlist: "+count);
        }
    }
    
    void searchnode()
    {
        if(Start==null)
        {
            System.out.println("List empty");
        }
        else
        {
            System.out.println("Enter searching element...");
            Scanner sc3 = new Scanner(System.in);
            int se = sc3.nextInt();
            
            Node5 current;
            int count = 0;
            
            for(current = Start; current != null; current=current.next)
            {
                if(current.rollno == se)
                {
                    count++;
                    break;
                }
            }
            
            if(count>0)
            {
                System.out.println("Found ");
            }
            else
            {
                System.out.println("Not Found ");
            }  
            
        }
    }
    public static void main(String args[])
    {
        Singly_linkedlist_prime_input1 obj = new Singly_linkedlist_prime_input1();
        
        while(true)
        {
            System.out.println("\npress 1 for insert: ");
            System.out.println("press 2 for delete: ");
            System.out.println("press 3 for transverse: ");
            System.out.println("press 4 for search: ");
            System.out.println("press 5 for exit: ");

            
            System.out.println("Enter your choice: ");
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();
            
            switch(ch)
            {
                case 1:
                    obj.addnode();
                    break;
                case 2:
                    obj.deletenodebegin();
                    break;
                case 3:
                    obj.transversenode();
                    break;
                case 4:
                    obj.searchnode();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong Choice ");
            }
            


        }
    }
    
    
}
