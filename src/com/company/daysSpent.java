package com.company;
import com.sun.org.apache.xerces.internal.impl.dv.xs.DayDV;

import java.text.DateFormat;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;
import java.lang.*;
import java.text.DecimalFormat;
import java.time.*;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class daysSpent {

    public void days()throws Exception
    {
        int year=0;
        int month=0;
        int day;
        boolean condition=false;
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter you date of in the following format Year/Month/Day");

        System.out.println("Enter year of birth :");
        year = enter.nextInt();
        
        System.out.println("Enter month of birth :");
        month =enter.nextInt();
        while (month<0 ||month >12)
        {
            System.out.println(" Month of birth must be greater than 0 and less than 12");
            System.out.println("Enter year of birth :");
            month =enter.nextInt();
        }
        System.out.println("Enter day of birth :");
        day =enter.nextInt();
        if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
        {
            while (day<0 || day>31)
            {
                System.out.println("Day must be greater than 0 and less than 32 for month "+month);
                day =enter.nextInt();

            }

        }
        if(month==4||month==6||month==9||month==11)
        {
            while (day<0 || day>30) {
                System.out.println("Day must be greater than 0 and less than 31 for month " + month);
                day = enter.nextInt();

            }
        }
        if(month==2) {
            while (day<0 || day>29) {
                System.out.println("Day must be greater than 0 and less than 30 for month " + month);
                day = enter.nextInt();

            }
        }


        String dateFormat = "dd/mm/yyyy";
        DateFormat form = new SimpleDateFormat(dateFormat);


        LocalDate nowDate=LocalDate.now();
        String temp1 = year+"/"+month+"/"+day;
        Date bod = form.parse(temp1);

        Instant temp = nowDate.atStartOfDay(ZoneId.systemDefault()).toInstant();

        long Dayslived = ChronoUnit.DAYS.between(bod.toInstant(),temp);

        System.out.println("Today's date is :"+ nowDate);
        System.out.println("Your year of birth is :"+ temp1);
        System.out.println("Days lived are :"+ Dayslived);



    }
}
