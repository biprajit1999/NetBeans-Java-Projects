
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
public class Stack_array_1 
{
    int top;
        int maxsize = 10;
        int[] arr = new int[maxsize];


        boolean isEmpty()
        {
            return (top < 0);
        }
        Stack_array_1()
        {
            top = -1;
        }
        boolean push (Scanner sc)
        {
            if(top == maxsize-1)
            {
                System.out.println("Overflow !!");
                return false;
            }
            else
            {
            
                System.out.println("Enter Value");
                int val = sc.nextInt();
                top++;
                arr[top]=val;
                
                System.out.println("Item pushed");
                return true;
            }
        }
        boolean pop ()
        {
            if (top == -1)
            {
                System.out.println("Underflow !!");
                return false;
            }
            else
            {
                top --;
                System.out.println("Item popped");
                return true;
            }
        }
        void display ()
        {
            System.out.println("Printing stack elements .....");
            for(int i = top; i>=0;i--)
            {   
                System.out.print(arr[i]+"  ");                         
            }
        }
        
        void search_string()
        {
            System.out.println("Enter the string");
            Scanner sc3 = new Scanner(System.in);
            int str = sc3.nextInt();
            for(int i=top;i>=0;i--)
            {
                if(arr[i]==str)
                {
                    System.out.println("String found");
                }
                else
                    continue;
            }
        }
    }
    class Stack_Operations3 {
        public static void main(String[] args) {
            int choice=0;
            Scanner sc = new Scanner(System.in);
           
            Stack_array_1 s = new Stack_array_1();
            System.out.println("*********Stack operations using array*********\n");
            System.out.println("\n------------------------------------------------\n");
            while(choice != 4)
            {
                System.out.println("\nChose one from the below options...\n");
                System.out.println("\n1.Push\n2.Pop\n3.Show\n4.Exit");
                System.out.println("\nEnter 5 for string search specific");
                System.out.println("\n Enter your choice \n");
                choice = sc.nextInt();
                switch(choice)
                {
                    case 1:
                    {
                        s.push(sc);
                        break;
                    }
                    case 2:
                    {
                        s.pop();
                        break;
                    }
                    case 3:
                    {
                        s.display();
                        break;
                    }
                    case 4:
                    {
                        System.out.println("Exiting....");
                        System.exit(0);
                        break;
                    }
                    case 5:
                        s.search_string();
                        break;
                    default:
                    {
                        System.out.println("Please Enter valid choice ");
                    }
                }
            }
        }
    
    
}
