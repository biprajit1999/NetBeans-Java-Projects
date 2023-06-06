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
    int rollno;
    Node next;
}

public class SinglyLinkedList {
    
    Node Start;
   SinglyLinkedList()
   {
       Start = null;
   }
    
   
    
    void addnode()
    {
        System.out.println("Enter data: ");
        Scanner sc2 = new Scanner(System.in);
        int rn = sc2.nextInt();
        
        Node newnode = new Node();
        newnode.rollno = rn;
        newnode.next = null;
        
        if(Start == null)
        {
            Start = newnode;
        }
        else
        {
            Node current = Start;
            while(current.next != null)
            {
                current = current.next;
            }
            current.next=newnode;
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
        if(Start==null)
        {
            System.out.println("dooubly List empty");
        }
        else
        {   
            if(Start.next==null)
            {
                System.out.println("deleted: "+Start.rollno);
                Start=null;
            }
            else
            {
                Node current=Start;
                while(current.next!=null)
                {    
                    if(current.next.next==null)
                    {
                        current.next=null;
                    }
                    current=current.next;
                }
                System.out.println("deleted: "+current.rollno);
               // current.next=current;
                //current.next=null;
                if(current.next.next==null)
                {
                    current.next = null;
                }
               
              
            }
        }
    }
    
   
   
    void deletenodebyvalue()
    {
        if(Start==null)
        {
            System.out.println("List empty");
        }
        else
        {
            System.out.println("Enter data");
            Scanner sc4=new Scanner(System.in);
            int deleteElement=sc4.nextInt();
            Node current;
            int count=0;
            for(current=Start;current.next!=null;current=current.next)
            {
                if(current.next.rollno==deleteElement)
                {
                    count++;
                    if(current.next.next==null)
                    {
                        current.next=null;
                        break;
                    }
                    //current.next.next.previous=current;
                    current.next=current.next.next;
                } 
            }
            if(Start.rollno==deleteElement)
            {
                count++;
                Start=Start.next;
                //START.previous=null;
            }
            
            if(count==0)
            {
                System.out.println("Not Found");
            }
            else
            {
                System.out.println("Found: "+count+", deleted: "+deleteElement);
            }
            
        }
        
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
            Node current;
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
            
            Node current;
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
        SinglyLinkedList obj = new SinglyLinkedList();
        
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
                case 6:
                    obj.deletenodelast();
                    break;
                case 7:
                    obj.deletenodebyvalue();
                    break;
                default:
                    System.out.println("Wrong Choice ");
            }
            


        }
    }
    
    
}
