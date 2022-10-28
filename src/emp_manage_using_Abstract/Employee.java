package emp_manage_using_Abstract;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

abstract class Employee {
    abstract void empId();
    abstract void firstName();
    private LocalDateTime checkInDat;
    private LocalDateTime checkOutDate;


    abstract public void getLogIn();
    /*{ Scanner sc=new Scanner(System.in);
        System.out.println("Enter your user name and password");
        String username=sc.nextLine();
        int password=sc.nextInt();

         if(username=="user"){
            if (password==1234){
                System.out.println("Log in Successfully!");
            }
            else{
                System.out.println("Incorrect User name or Password");
            }
        }
    }  */






    public void getClockIn() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number 1 for ClockIn");
        String operation = sc.nextLine();
        if ("1".equals(operation)) {
            LocalDateTime date1 = LocalDateTime.now();
            this.checkInDat=date1;
            System.out.println("ClockIn" + ":" + date1);
        } else {
            System.out.println("Mismatch!!check your number");
            System.exit(2);
        }
    }


    public void getClockOut() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter number 2 for ClockOut");
        String operation = sc.nextLine();
        if ("2".equals(operation)) {
            LocalDateTime date2 = LocalDateTime.now();
            this.checkOutDate=date2;
            System.out.println("ClockOut" + ":" + date2);
        } else {
            System.out.println("Mismatch!!check your number");
            System.exit(2);
        }
    }



      void viewPaycheck() {

        Scanner log = new Scanner(System.in);
        System.out.println("Enter number 3 for view PayCheck Details or any number for exit");
        //1234
        int id = log.nextInt();
        if (id == 3) {
            System.out.println("Your payCheckDetails is loading....");
        } else {
            System.exit(2);
        }
    }
      void getPayCheckDetails() {
        Duration p = Duration.between(this.checkInDat,this.checkOutDate);
         /*p.toHours();
         p.toMinutes();*/

        float sum = p.toMinutes();
        System.out.println("Total workingHours" + ":" + sum);
        float ratePerHour =2;
        float earning= ratePerHour*sum;
        System.out.println("Earning amount is $"+":"+earning);
        float tax = 0.015f/earning*100;
        System.out.println("tax"+":"+tax);
        float amount=earning-tax;
        System.out.println("Net Receive Amount"+":"+amount);

    }
}










