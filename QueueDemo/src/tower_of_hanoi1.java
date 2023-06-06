/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author biprajitdebnath
 */
public class tower_of_hanoi1 
{
    void tower_hanoi(int n,char from,char inter,char to)
    {
        if(n==1)
        {
            System.out.println("Shift tower "+n+" from "+ from+" to "+to);
        }
        else
        {
            tower_hanoi(n-1,from,to,inter);
            
            System.out.println("Shift "+n+" from "+from+" to "+to);
            
            tower_hanoi(n-1,inter,from,to);
            
            
            
        }
    }
    


public static void main(String args[])
{
    tower_of_hanoi1 obj = new tower_of_hanoi1();
    obj.tower_hanoi(8, 'A','B','C');
    
    

}

}