/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author biprajitdebnath
 */

import java.util.*;

public class SinglyQueueExample 
{
    int ar[];
    int Front, Rear;
    
    SinglyQueueExample()
    {
        ar = new int [5];
        Front = -1;
        Rear = -1;
    }
    
    void insert()
    {
        if(Rear == 4)
        {
            System.out.println("Queue Full ");
        }
        else
        {
            System.out.println("Enter Data... ");
            Scanner sc2 = new Scanner(System.in);
            int data = sc2.nextInt();
            
            if(Front == -1)
            {
                Front = 0;
                
            }
            
            Rear = Rear+1;
            ar[Rear] = data;
            System.out.println("data inserted... ");
        }
    }
    
    void delete()
    {
        if(Front == -1 || Rear == -1)
        {
            System.out.println("Queue Empty ");
        }
        else
        {
      
                if(Front == Rear)
                {
                    System.out.println("deleted "+ar[Front]);
                    Front = -1;
                    Rear = -1;
                    
                }
                else
                {
                    System.out.println("deleted "+ar[Front]);
                    Front = Front+1;
                }
               
            
        }
    }
    
    void traverse()
    {
        if(Front == -1 || Rear == -1)
        {
            System.out.println("Queue Empty ");
        }
        else
        {
            System.out.println("------Singly Queue------");
            for(int i=Front;i<=Rear;i++)
            {
                System.out.print("  "+ar[i]);
            }
        }
    }
        
    public static void main(String args[])
    {
        SinglyQueueExample obj = new SinglyQueueExample();
        
        while(true)
        {
            System.out.println("\nPress 1 for insert");
            System.out.println("Press 2 for delete");
            System.out.println("Press 3 for traverse");
            System.out.println("Press 4 for Exit");
            
            System.out.println("Enter your choice ");
            Scanner sc1 = new Scanner(System.in);
            int ch = sc1.nextInt();
            
            switch(ch)
            {
                case 1:
                    obj.insert();
                    break;
                
                case 2:
                    obj.delete();
                    break;
                
                case 3:
                    obj.traverse();
                    break;
                
                case 4:
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("Wrong choice ");
                    
            }
            
        }
    }
    
}
