
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
public class CircularQueueExample 
{
    int ar[];
    int Front, Rear;
    
    CircularQueueExample()
    {
        ar = new int[5];
        Front = -1;
        Rear = -1;
        
    }
    void insert()
    {
        if(Front == 0 && Rear == 4 || Rear == Front-1)
        {
            System.out.println("Queue Full");
        }
        else
        {
            System.out.println("Enter data... ");
            Scanner sc = new Scanner(System.in);
            int data = sc.nextInt();
            
            if(Front == -1)
            {
                Front = 0;
            }
            if(Rear < 4)
            {
                Rear = Rear +1;
            }
            else if(Rear == 4 && Front != 0)
            {
                Rear = 0;
            }
            
            ar[Rear] = data;
            System.out.println("Data inserted... ");
        }
    }
    
    void delete()
    {
        if(Front == -1)
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
            else if(Front<Rear)
            {
                System.out.println("deleted :"+ar[Front]);
                Front = Front+1;
            }
            else if(Front == 4 && Rear<Front)
            {
                System.out.println("deleted :"+ar[Front]);
                Front = 0;
            }
            else if(Rear<Front)
            {
                System.out.println("deleted "+ar[Front]);
                Front = Front+1;
            }
        }
    }
    
    void traverse()
    {
        if(Front == -1 || Front == Rear+1)
        {
            System.out.println("Queue Empty ");
        }
        
        else
        {
            if(Front<=Rear)
            {
                for(int i=Front;i<=Rear;i++)
                {
                    System.out.print(" "+ar[i]);
                }
            }
            else
            {
                for(int i=Front;i<=4;i++)
                {
                    System.out.print(" "+ar[i]);
                }
                for(int i=0;i<=Rear;i++)
                {
                    System.out.print(" "+ar[i]);
                }
            }
        }
    }
    
    public static void main(String args[])
    {
        CircularQueueExample obj = new CircularQueueExample();
        
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
