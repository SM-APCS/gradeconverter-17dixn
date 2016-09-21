/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg17dixngradeconverter;

/**
 *
 * @author nate
 */

import java.util.Scanner;

public class Main {

    

    public static void main(String[] args) 
    {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number grade: ");
    float gradeN = scanner.nextFloat();
    if(gradeN >= 90)
    {
        System.out.print("You got an A");
    }
    else if(gradeN >= 80)
    {
        System.out.print("You got a B");
    }
    else if(gradeN >= 70)
    {
        System.out.print("You got a C");
    }
    else if(gradeN >= 60)
    {
        System.out.print("You got a D");
    }
    else
    {
        System.out.print("You got a F");
    }
    
    }
    
}
