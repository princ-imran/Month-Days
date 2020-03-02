/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labthreethird;

import java.util.Scanner;

/**
 *
 * @author Spy Hacker
 */
public class LabThreeThird {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int month_days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        Scanner myObj = new Scanner(System.in);
        System.out.print("Month Start in 0-11.\nLike 0 = January, 1 = February\nEnter month serial numnber: ");
        int num = myObj.nextInt();
        System.out.println("Your month have: " +month_days[num] +"Days");
    }
    
}
