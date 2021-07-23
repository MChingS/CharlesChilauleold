package com.company;
import org.omg.PortableInterceptor.USER_EXCEPTION;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
     userinput out = new userinput();
     daysSpent dd = new daysSpent();
     reverseword ww = new reverseword();
     int opt =0;
     Scanner input = new Scanner(System.in);

     System.out.println("Enter number 1 for double system or number 2 for days spent system and 3 for word reverse");
        opt = input.nextInt();
        while (opt <1 || opt >3)
        {
            System.out.println("Enter number 1 or 2 or 3 to choose system");
            opt = input.nextInt();
        }

     if(opt==1)
     {
         out.doublenumbers();
     }
     if (opt==2)
     {
         //int yy=0,mm=0,ddd=0;
         dd.days();
     }
        if (opt==3)
        {
           ww.word();
        }

    }
}
