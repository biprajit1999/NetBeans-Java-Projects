/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author biprajitdebnath
 */

import java.util.Arrays;
import java.util.Scanner;

class Student
{
    int sid;
    String sname;
    int rollno;
    Student previous;
    Student next;
}
 
public class doubly_linkedlist_sorted1 
{
     
   Student Start;
   //Nodee End;
   
    
    doubly_linkedlist_sorted1()
    {
        
    }
    
    void addnote()
    {
        System.out.println("Enter sid...");
        
        Scanner sc2 = new Scanner(System.in);
        int id = sc2.nextInt();
        
        System.out.println("Enter name");
        Scanner sc3 = new Scanner(System.in);
        String name = sc3.next();
        
        System.out.println("Enter rollno.");
        Scanner sc4 = new Scanner(System.in);
        int roll = sc4.nextInt();
        
        Student newnode = new Student();
        newnode.sid = id;
        newnode.sname = name;
        newnode.rollno = roll;
        newnode.previous = null;
        newnode.next = null;
        
        if(Start==null)
        {
            Start=newnode;
            
        }
        else
        {
            Student current=Start;
            while(current.next!=null)
            {
                current = current.next;
            }
            current.next=newnode;
            newnode.previous = current;
            
        }
        System.out.println("data inserted,....");
    }
    
    void sort_linklist_sid()
    {
        Student current = null, current1 = null;
        int temp;
        
        if(Start == null)
        {
            System.out.println("Empty linked list..");
        }
        else
        {
            for(current = Start; current !=null; current = current.next)
            {
                for(current1 = current.next; current1 != null; current1 = current1.next)
                {
                    if(current.sid > current1.sid)
                    {
                        temp = current.sid;
                        current.sid = current1.sid;
                        current1.sid = temp;
                    }
                }
            }
        }
    }
    
    void sort_linkedlist_sname()
    {
        Student current = null, current1 = null;
        String temp;
        
        if(Start == null)
        {
            System.out.println("Empty linked list..");
        }
        else
        {
            for(current = Start; current != null; current = current.next)
            {
                for(current1 = current.next; current1 !=null; current1 = current1.next)
                {
                    if(current.sname.compareTo(current1.sname)>0)
                    {
                        temp = current.sname;
                        current.sname = current1.sname;
                        current1.sname = temp;
                        
                    }
                }
            }
        }
    }
    
    void sort_linkedlist_rollno()
    {
        Student current = null, current1 = null;
        int temp;
        
        if(Start == null)
        {
            System.out.println("Empty linked list..");
        }
        else
        {
            for(current = Start; current !=null; current = current.next)
            {
                for(current1 = current.next; current1 != null; current1 = current1.next)
                {
                    if(current.rollno > current1.rollno)
                    {
                        temp = current.rollno;
                        current.rollno = current1.rollno;
                        current1.rollno = temp;
                    }
                }
            }
        }
    }
    
    void traverse2()
    {
        Student current = Start, temp = null;
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
                System.out.print(" "+current.sid+"\t"+current.sname+"\t"+current.rollno+"\n");
            }
            System.out.print(" "+current.sid+"\t"+current.sname+"\t"+current.rollno+"\n");
    }
}
    public static void main(String args[])
{
    doubly_linkedlist_sorted1 obj = new doubly_linkedlist_sorted1();
    
    while(true)
        {
            System.out.println("\nPress 1 for insert: ");
            System.out.println("Press 2 for traverse: ");
            System.out.println("Press 3 for sorting by student id ..");
            System.out.println("Press 4 for sorting by Student name ..");
            System.out.println("Press 5 for sorting by student roll number ..");
            
            System.out.println("Enter your choice: ");
            Scanner sc1 = new Scanner(System.in);
            int ch = sc1.nextInt();
            if(ch==1)
            {
                obj.addnote();           
            }
            
            else if(ch==2)
            {
                obj.traverse2();
            }
            else if(ch==3)
            {
                obj.sort_linklist_sid();
                
            }
            else if(ch==4)
            {
                obj.sort_linkedlist_sname();
            }
            else if(ch==5)
            {
                obj.sort_linkedlist_rollno();
            }
            else
            {
                System.out.println("Wrong choice");
            }
    
        }
    
    }
}

 