/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.project_a;

/**
 *
 * @author nyaga
 */ 
import java.util.*;
public class Project_A {
    public static void main(String[] args) {
        //System.out.println("Hello World!");
        System.out.println("enter your service pin \n");
        Scanner pinscan=new Scanner(System.in);
        Scanner scanner=new Scanner(System.in);
        int truepin=4750;
         int pin= pinscan.nextInt();
      int initialBalance=20;
      if(pin!=truepin){
          System.out.println("incorrect service pin \n");
      }else{
      
        
        System.out.println("0:Sh20(30mins,3hrs)\n1:Sh10(15mins,1hr)\n2:Sh20(15mins,midnight)\n3:Okoa 50\n4:Okoa 20\n5:Okoa 10\n6:Okoa 5\n7:Okoa 20(900MB,1hr)\n8:Okoa Internet\n");
        System.out.println("choose a number:");
        int number= scanner.nextInt();
        
        switch(number)
        {
            case 0:
                System.out.println("Sh20(30mins,3hrs)");
                System.out.println("confirm okoa Sh20(30mins,3hrs)\n ");
                System.out.println("choose 1 or 2");
                System.out.println("1:Accept\n2:Decline\n");
                
                int choice=scanner.nextInt();
                switch(choice){
                    case 1:
                        int balance=initialBalance+20;
                        System.out.println("\"confirmed you have received 30 mins valid for 3hr.your new okoa balance is:"+balance);
                         System.out.println("thank you for using this service");  
                       break;
                    case 2:
                        System.out.println("thank you for using our services");
                                
                }
                break;
            case 1:
                System.out.println("Sh10(15mins,1hr)");
                System.out.println("confirm okoa Sh10(15mins,1hr)\n ");
                System.out.println("choose 1 or 2");
                System.out.println("1:Accept\n2:Decline\n");
                
                int option=scanner.nextInt();
                switch(option){
                    case 1:
                        int balance=initialBalance+10;
                        System.out.println("confirmed you have received 15 mins valid for 1hr.your new okoa balance is:"+balance);
                         System.out.println("thank you for using this service");  
                       break;
                    case 2:
                        System.out.println("thank you for using our services");
                 break;
                }
            case 2:
                 System.out.println("Sh20(15mins,midnight)");
                 System.out.println("confirm okoa Sh20(15mins,midnight)\n ");
                System.out.println("choose 1 or 2");
                System.out.println("1:Accept\n2:Decline\n");
                
                int pick=scanner.nextInt();
                switch(pick){
                    case 1:
                        int balance=initialBalance+20;
                        System.out.println("confirmed you have received 15 mins valid till midnight.your new okoa balance is:"+balance);
                       System.out.println("thank you for using this service");  
                       break;
                    case 2:
                        System.out.println("thank you for using our services");
                 break;
                }
                        
             case 3:
                System.out.println("Okoa 50");
                 System.out.println("confirm okoa Sh20(15mins,midnight)\n ");
                System.out.println("choose 1 or 2");
                System.out.println("1:Accept\n2:Decline\n");
                
                int enter=scanner.nextInt();
                switch(enter){
                    case 1:
                        int balance=initialBalance+50;
                        System.out.println("confirmed you have received sh50.your new okoa balance is:"+balance);
                        System.out.println("thank you for using this service"); 
                       break;
                    case 2:
                        System.out.println("thank you for using our services");
                 break;
                }
             case 4:
                System.out.println("Okoa 20");
                System.out.println("confirm okoa Sh20\n ");
                System.out.println("choose 1 or 2");
                System.out.println("1:Accept\n2:Decline\n");
                
                int pick_one=scanner.nextInt();
                switch(pick_one){
                    case 1:
                        int balance=initialBalance+20;
                        System.out.println("confirmed you have received sh20.your new okoa balance is:"+balance);
                         System.out.println("thank you for using this service"); 
                       break;
                    case 2:
                        System.out.println("thank you for using our services");
                 break;
                }
                 
            case 5:
                System.out.println("Okoa 10");
                 System.out.println("confirm okoa Sh10\n ");
                System.out.println("choose 1 or 2");
                System.out.println("1:Accept\n2:Decline\n");
                
                int decide=scanner.nextInt();
                switch(decide){
                    case 1:
                        int balance=initialBalance+10;
                        System.out.println("confirmed you have received sh10.your new okoa balance is:"+balance);
                         System.out.println("thank you for using this service"); 
                       break;
                    case 2:
                        System.out.println("thank you for using our services");
                 break;
                }
            case 6:
                System.out.println("Okoa 5");
                 System.out.println("confirm okoa Sh5\n ");
                System.out.println("choose 1 or 2");
                System.out.println("1:Accept\n2:Decline\n");
                
                int your_choice=scanner.nextInt();
                switch(your_choice){
                    case 1:
                        int balance=initialBalance+5;
                        System.out.println("confirmed you have received sh5.your new okoa balance is:"+balance);
                        System.out.println("thank you for using this service"); 
                       break;
                    case 2:
                        System.out.println("thank you for using our services");
                 break;
                }
            case 7:
                    System.out.println("Okoa 20(900MB,1hr");
                     System.out.println("confirm okoa Sh20(900MB,1hr)\n ");
                System.out.println("choose 1 or 2");
                System.out.println("1:Accept\n2:Decline\n");
                
                int entered=scanner.nextInt();
                switch(entered){
                    case 1:
                        int balance=initialBalance+20;
                        System.out.println("confirmed you have received sh20.your new okoa balance is:"+balance);
                        System.out.println("thank you for using this service"); 
                       break;
                    case 2:
                        System.out.println("thank you for using our services");
                 break;
                }
            case 8:
                    System.out.println("Okoa Internet");
                     System.out.println("confirm okoa Sh20(15mins,midnight)\n ");
                System.out.println("choose 1 or 2");
                System.out.println("1:Accept\n2:Decline\n");
                
                int picked=scanner.nextInt();
                switch(picked){
                    case 1:
                        int balance=initialBalance+20;
                        System.out.println("your new okoa balance is:"+balance);
                        
                       break;
                    case 2:
                        System.out.println("thank you for using our services");
                 break;
                }
            default:
                System.out.println("invalid option");
        }
        
      // System.out.println("your okoa balance is:"+new_okoa_balance); 
    }
    }
}
