
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

class Node_queue
{
    int data;
    Node_queue next;
}
public interface queuedem_abs1 
{
    abstract void insert(int data);
    abstract int delete();
    abstract boolean isEmpty();
    abstract void traverse();
    abstract boolean search(int num);  
}

class queuedem implements queuedem_abs1
{
    Node_queue Front, Rear;
    
    queuedem()
    {
        Front=null;
        Rear=null;
    }
    
    public void insert(int item)
    {
        Node_queue newnode = new Node_queue();
        newnode.data = item;
        newnode.next = null;
        
        if(Front == null)
        {
            Front = newnode;
            Rear = newnode;
          
        }
        else
        {
            Node_queue current = Rear;
            while(current.next != null)
            {
                current = current.next;
                
            }
            current.next = newnode;
        }
    } 
    public int delete()
    {
        if(Front == null)
        {
            return 0;
        }
        else
        {
            Front=Front.next;
            return Front.data;
        }
        
    }
    
    public boolean isEmpty()
    {
        if(Front == null||Rear == null)
        {
            return true;
        }
        else 
            return false;
    }
    
    public void peek()
    {
        if(isEmpty())
        {
            return;
        }
        else
        {
            System.out.println(Front.data);
        }
    }
    
    public void traverse()
    {
        if(isEmpty())
        {
            System.out.println("Empty queue..");
        }
        else
        {
            for(Node_queue current=Front;current!=null;current=current.next)
            {
                System.out.print("  "+current.data);
            }
        }
    }
    
    public boolean search(int num)
    {
        boolean flag = false;
        if(isEmpty())
        {
            System.out.println("Empty queue..");
        }
        else
        {
            for(Node_queue current=Front;current!=null;current=current.next)
            {
                if(current.data==num)
                {
                    flag=true;
                    System.out.append("Value found");
                }
            }
        }
        return flag;
    }
    
        public static void main(String args[])
    {
        queuedem obj=new queuedem();
        
        while(true)
        {
            System.out.println("\npress 1 for insert");
            System.out.println("press 2 for delete");
            System.out.println("press 3 for isEmpty");
            System.out.println("press 4 for traverse");
            System.out.println("press 5 for search");
            
            System.out.println("enter your choice");
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();
            
            
            
            switch(ch)
            {
                case 1:
                    System.out.println("Enter data");
                    Scanner sc1 = new Scanner(System.in);
                    int n = sc1.nextInt();
                    obj.insert(n);
                    break;
                case 2:
                    obj.delete();
                    break;
                case 3:
                    obj.isEmpty();
                    break;
                case 4:
                    obj.traverse();
                    break;
                case 5:
                    System.out.println("Enter data to be searched: ");
                    Scanner sc2 = new Scanner(System.in);
                    int num = sc2.nextInt();
                    obj.search(num);
                    break;
                case 6:
                    obj.peek();
                    break;
                default:
                    System.out.println("Wrong Choice");
            }
        }
    }

}