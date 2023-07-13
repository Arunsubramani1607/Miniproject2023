package com.atmpackage;

import java.util.Scanner;

public class MainClass 
{
    public static void main(String[] args)
    {
        AtmOperationInterf op=new AtmOperationImpl();
        
        int atmnumber=123456;
        
        int atmpin=1234;
        
        Scanner in=new Scanner(System.in);
        
        System.out.println("            Welcome to RBI ATM Machine !!!        ");
        
        System.out.print("\nEnter ATM Number : ");
        
        int atmNumber=in.nextInt();
        
        System.out.print("Enter ATM Pin: ");
        
        int pin=in.nextInt();
        
        if((atmnumber==atmNumber)&&(atmpin==pin))
        {
            while(true)
            {
                System.out.println("\n1.View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View Ministatement\n5.Exit");
                
                System.out.println("\nEnter Choice : ");
                
                int choice=in.nextInt();
                
                if(choice==1)
                {
                    op.viewBalance();

                }
                else if(choice==2)
                {
                    System.out.println("Enter amount to withdraw ");
                    
                    double withdrawAmount=in.nextDouble();
                    
                    op.withdrawAmount(withdrawAmount);

                }
                else if(choice==3)
                {
                    System.out.println("Enter Amount to Deposit :");
                    
                    double depositAmount=in.nextDouble();//5000
                    
                    op.depositAmount(depositAmount);


                }
                else if(choice==4)
                {
                    op.viewMiniStatement();

                }
                else if(choice==5)
                {
                    System.out.println("Collect your ATM Card\n  \n        Thank you for using RBI  ATM Machine!!");
                    
                    System.exit(0);
                }
                else
                {
                    System.out.println("\nPlease enter correct choice");
                }
            }
        }
        else
        {
            System.out.println("Incorrect Atm Number or pin");
            System.exit(0);
        }


    }
}

