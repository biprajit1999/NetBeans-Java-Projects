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
class Nodee7
{
    int data;
    Nodee7 previous;
    Nodee7 next;
}
public class Doubly_linkedlist_all_ops1 
{
    Nodee7 START;
    Doubly_linkedlist_all_ops1()
    {
        START=null;
    }
    void addnode()
    {
        System.out.println("Enter data");
        Scanner sc2=new Scanner(System.in);
        int item=sc2.nextInt();
        
        Nodee7 newnode=new Nodee7();
        newnode.data=item;
        newnode.previous=null;
        newnode.next=null;
        if(START==null)
        {
            START=newnode;
        }
        else
        {
            Nodee7 current=START;
            while(current.next!=null)
            {
                current=current.next;
            }
            current.next=newnode;
            newnode.previous=current;
        }
        System.out.println("data inserted...");
    }
    void deletenode()
    {
        if(START==null)
        {
            System.out.println("doubly List empty");
        }
        else
        { 
            if(START.next==null)
            {
                System.out.println("deleted: "+START.data);
                START=null;
            }
            else
            {
                System.out.println("deleted: "+START.data);
                START=START.next;
                START.previous=null;
            }
        }
    }
    void deletenodelast()
    {
        if(START==null)
        {
            System.out.println("dooubly List empty");
        }
        else
        {   
            if(START.next==null)
            {
                System.out.println("deleted: "+START.data);
                START=null;
            }
            else
            {
                Nodee7 current=START;
                while(current.next!=null)
                {
                    current=current.next;
                }
                System.out.println("deleted: "+current.data);
                current.previous.next=null;
            }
        }
    }
    void deletenodebyvalue()
    {
        if(START==null)
        {
            System.out.println("List empty");
        }
        else
        {
            System.out.println("Enter data");
            Scanner sc4=new Scanner(System.in);
            int deleteElement=sc4.nextInt();
            Nodee7 current;
            int count=0;
            for(current=START;current.next!=null;current=current.next)
            {
                if(current.next.data==deleteElement)
                {
                    count++;
                    if(current.next.next==null)
                    {
                        current.next=null;
                        break;
                    }
                    current.next.next.previous=current;
                    current.next=current.next.next;
                } 
            }
            if(START.data==deleteElement)
            {
                count++;
                START=START.next;
                START.previous=null;
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
    void traversenode()
    {
        if(START==null)
        {
            System.out.println("doubly List empty");
        }
        else
        {
            //forward
            Nodee7 current;
            System.out.println("---------forward--------");
            for(current=START;current.next!=null;current=current.next)
            {
                System.out.print(current.data+" ");
            }
            System.out.println(current.data);
            //reverse
            System.out.println("----------reverse--------");
            
            Nodee7 current1;
            for(current1=current;current1!=null;current1=current1.previous)
            {
                System.out.print(current1.data+" ");
            }
            System.out.println();
        }
    }
    void searchnode()
    {
        if(START==null)
        {
            System.out.println("doubly List empty");
        }
        else
        {
            System.out.println("Enter data");
            Scanner sc3=new Scanner(System.in);
            int sea=sc3.nextInt();
            Nodee7 current;
            int count=0;
            for(current=START;current!=null;current=current.next)
            {
                if(current.data==sea)
                {
                    count++;
                    break;
                }
            }
            if(count>0)
            {
                System.out.println("Found");
            }
            else
            {
                System.out.println("Not Found");
            }
        } 
    }
    void insertnodebeforevalue()
    {
        if(START==null)
        {
            System.out.println("List empty");
        }
        else
        {
            Scanner sc5=new Scanner(System.in);
            System.out.print("Insert value before: ");
            int specific_value=sc5.nextInt();
            int count=0;
            
            Nodee7 current=START;
            while(current!=null)
            {
                if(current.data==specific_value)
                {
                    count++;
                    break;
                }
                if(current.next==null)
                {
                    break;
                }
                current=current.next;
            }
            if(count==0)
            {
                System.out.println("Value not in list");
            }
            else
            {
                System.out.print("value to insert: ");
                int insertElement=sc5.nextInt();

                while(current!=null)
                {
                    if(current.data==specific_value)
                    {
                        Nodee7 newnode=new Nodee7();
                        newnode.data=insertElement;
                        newnode.previous=current.previous;
                        newnode.next=current;
                        if(START.data==specific_value)
                        {
                            START=newnode;
                        }
                        else
                        {
                            current.previous.next=newnode;
                        }
                        current.previous=newnode;
                    }
                    current=current.next; 
                }
            }
        }
    }
    void insertnodeaftervalue()
    {
        if(START==null)
        {
            System.out.println("List empty");
        }
        else
        {
           
            Scanner sc6=new Scanner(System.in);
            System.out.print("Insert value after: ");
            int specific_value=sc6.nextInt();
            int count=0;
            
            Nodee7 current=START;
            while(current!=null)
            {
                if(current.data==specific_value)
                {
                    count++;
                    break;
                }
                if(current.next==null)
                {
                    break;
                }
                current=current.next;
            }
            if(count==0)
            {
                System.out.println("Value not in list");
            }
            else
            {
                System.out.print("value to insert: ");
                int insertElement=sc6.nextInt();

                while(current!=null)
                {
                    if(current.data==specific_value)
                    {
                        Nodee7 newnode=new Nodee7();
                        newnode.data=insertElement;
                        newnode.previous=current;
                        newnode.next=current.next;
                        if(current.next!=null)
                        {
                            current.next.previous=newnode;
                        }
                        current.next=newnode;
                    }
                    current=current.next;
                }
            }
        }
    }
    void deletenodebeforevalue()
    {
        if(START==null)
        {
            System.out.println("List empty");
        }
        else
        {
            Scanner sc7=new Scanner(System.in);
            System.out.print("delete value before: ");
            int specific_value=sc7.nextInt();
            int count=0;
            
            Nodee7 current=START;
            while(current!=null)
            {
                if(current.data==specific_value)
                {
                    count++;
                    
                    System.out.println("deleted: "+current.previous.data+" before: "+current.data);
                    if(current.previous.previous==null)
                    {
                        START=current;
                    }
                    else
                    {
                        current.previous.previous.next=current;
                    }
                    current.previous=current.previous.previous;
                    
                }
                current=current.next;
            }
            if(START.data==specific_value)
            {
                count++;
            }
            if(count==0)
            {
                System.out.println("Value not in list");
            }
        }
    }
    void deletenodeaftervalue()
    {
        if(START==null)
        {
            System.out.println("List empty");
        }
        else
        {
            Scanner sc8=new Scanner(System.in);
            System.out.print("delete value after: ");
            int specific_value=sc8.nextInt();
            int count=0;
            
            Nodee7 current=START;
            while(current.next!=null)
            {
                if(current.data==specific_value)
                {
                    count++;
                    
                    System.out.println("deleted: "+current.next.data+" after: "+current.data);
                    if(current.next.next==null)
                    {
                        current.next=null;
                        break;
                    }
                    else
                    {
                        current.next.next.previous=current;
                    }
                    
                    current.next=current.next.next;
                    
                }
                current=current.next;
            }
            if(current.data==specific_value)
            {
                count++;
            }
            if(count==0)
            {
                System.out.println("Value not in list");
            }
        }
    }
    public static void main(String args[])
    {
        Doubly_linkedlist_all_ops1 obj=new Doubly_linkedlist_all_ops1();  
        while(true)
        {
            System.out.println("Press 1 for insert");
            System.out.println("Press 2 for delete");
            System.out.println("Press 3 for traverse");
            System.out.println("Press 4 for search");
            System.out.println("Press 5 for Exit");
            System.out.println("Press 6 for delete last");
            System.out.println("Press 7 for delete by value");
            System.out.println("Press 8 for insert before value");
            System.out.println("Press 9 for insert after value");
            System.out.println("Press 10 for delete before value");
            System.out.println("Press 11 for delete after value");
            
            
            System.out.println("Enter ur choice");
            Scanner sc=new Scanner(System.in);
            int ch=sc.nextInt();
            if(ch==1)
            {
                obj.addnode();
            }
            else if(ch==2)
            {
                obj.deletenode();
            }
            else if(ch==3)
            {
                obj.traversenode();
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
                obj.deletenodebyvalue();
            }
            else if(ch==8)
            {
                obj.insertnodebeforevalue();
            }
            else if(ch==9)
            {
                obj.insertnodeaftervalue();
            }
            else if(ch==10)
            {
                obj.deletenodebeforevalue();
            }
            else if(ch==11)
            {
                obj.deletenodeaftervalue();
            }
            else if(ch==12)
            {
                System.exit(0);
            }
            else
            {
                System.out.println("wrong choice");
            }
        }
    }
    
}
