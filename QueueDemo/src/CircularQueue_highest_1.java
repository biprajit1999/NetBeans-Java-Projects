
import java.util.Arrays;
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
public class CircularQueue_highest_1 
{
    
    int ar[];
    int Front, Rear;
    
    CircularQueue_highest_1()
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
        if(Front == -1 || Rear == -1)
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
        Arrays.sort(ar);
        System.out.println("\n"+ar[Rear+1]);
    }
    
    void highest2()
    {
        if(Front == -1 || Rear == -1)
        {
            System.out.println("Queue Empty ");
        }
        
        else
        {
            int temp=0;
            int temp1=0;
            int temp2=0;
            if(Front<=Rear)
            {
                for(int i=Front;i<=Rear;i++)
                {
                    for(int j=i;j<=Rear;j++)
                    {
                        if(ar[i]>ar[j])
                        {
                            temp = ar[i];
                            ar[i]=ar[j];
                            ar[j]=temp;
                        }
                    }
                    
                }
                System.out.println("Highest "+ar[4]);
            }
            else
            {
                for(int i=Front;i<=4;i++)
                {
                    for(int j=i;j<=4;j++)
                    {
                        if(ar[i]>ar[j])
                        {
                            temp1=ar[i];
                            ar[i]=ar[j];
                            ar[j]=temp1;
                        }
                    }
                }
                System.out.print(" "+ar[4]);
                for(int i=0;i<=Rear;i++)
                {
                    for(int j=i;j<=Rear;j++)
                    {
                        if(ar[i]>ar[j])
                        {
                            temp2=ar[i];
                            ar[i]=ar[j];
                            ar[j]=temp2;
                        }
                    }
                     
                }
                System.out.print(" "+ar[4]);
            }
        }
        Arrays.sort(ar);
        System.out.println("\n"+ar[Rear+1]);
    }
    
    void highest_queue()
    {
        int temp = 0;
        for(int i=0;i<=ar.length;i++)
        {
            for(int j=i;j<=ar.length;j++)
            {
                if(ar[j]<ar[i])
                {
                    temp = ar[j];
                    ar[j]=ar[i];
                    ar[i]=temp;
                }
            }
        }
        System.out.println(ar[Rear]);
    }
    
    
    void highest()
    {
        
        int temp=0;
            //Arrays.sort(ar);
        if(Front == -1 || Rear == -1)
        {
            System.out.println("Queue Empty ");
        }
        
        else
        {
            if(Front<=Rear)
            {
                for(int i=Front;i<=Rear;i++)
                {
                    for(int j=i;j<=Rear;j++)
                    {
                        temp = ar[j];
                        ar[j]=ar[i];
                        ar[i]=temp;
                    }
                }
                System.out.println(ar[Rear]);
            }
            else
            {
                for(int i=Front;i<=4;i++)
                {
                    for(int j=i;j<=4;j++)
                    {
                        temp = ar[j];
                        ar[j]=ar[i];
                        ar[i]=temp;
                    }
                }
                System.out.println(ar[4]);
                for(int i=0;i<=Rear;i++)
                {
                    for(int j=i;j<=Rear;j++)
                    {
                        temp = ar[j];
                        ar[j]=ar[i];
                        ar[i]=temp;
                    }
                    
                }
                System.out.print(ar[Rear]);
            }
        }
            //Arrays.sort(ar);
            //Arrays.sort(ar, Front, Rear);
            //Arrays.sort(ar, Front, ar.length);
           // System.out.println("\n"+ar[ar.length]);
        
    }
    
    public static void main(String args[])
    {
        CircularQueue_highest_1 obj = new CircularQueue_highest_1();
        
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
                case 5:
                    obj.highest();
                    break;
                case 6:
                    obj.highest_queue();
                    break;
                case 7:
                    obj.highest2();
                    break;
                default:
                    System.out.println("Wrong choice ");
                    
            }
            
        }
    }
    
  
    
}
