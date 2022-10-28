package employee_management_;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

 public class Employee {
     private int empId;
     private String firstName;
     private String lastName;
     private LocalDateTime checkInDate;
     private LocalDateTime checkOutDate;

    private int level;
     private int contactNumber;
     private int salary;
     static String companyName;

     public Employee(int empId, String firstName, String lastName, LocalDateTime checkInDate, LocalDateTime checkOutDate, int level, int contactNumber, int salary) {
         this.empId = empId;
         this.firstName = firstName;
         this.lastName = lastName;
         this.checkInDate = checkInDate;
         this.checkOutDate = checkOutDate;
         this.level = level;
         this.contactNumber = contactNumber;
         this.salary = salary;
     }

     public Employee() {

     }

     public int getEmpId() {
         return empId;
     }

     public int getLevel() {
         return level;
     }

     public void setLevel(int level) {
         this.level = level;
     }

     public void setEmpId(int empId) {
         this.empId = empId;
     }

     public String getFirstName() {
         return firstName;
     }

     public void setFirstName(String firstName) {
         this.firstName = firstName;
     }

     public String getLastName() {
         return lastName;
     }

     public void setLastName(String lastName) {
         this.lastName = lastName;
     }

     public int getContactNumber() {
         return contactNumber;
     }

     public void setContactNumber(int contactNumber) {
         this.contactNumber = contactNumber;
     }

     public int getSalary() {
         return salary;
     }

     public void setSalary(int salary) {
         this.salary = salary;
     }

     public static String getCompanyName() {
         return companyName;
     }

     public static void setCompanyName(String companyName) {
         Employee.companyName = companyName;
     }

     public LocalDateTime getCheckInDate() {
         return checkInDate;
     }

     public void setCheckInDate(LocalDateTime checkInDate) {
         this.checkInDate = checkInDate;
     }

     public LocalDateTime getCheckOutDate() {
         return checkOutDate;
     }

     public void setCheckOutDate(LocalDateTime checkOutDate) {
         this.checkOutDate = checkOutDate;
     }


     @Override
     public String toString() {
         return "Employee{" +
                 "empId=" + empId +
                 ", firstName='" + firstName + '\'' +
                 ", lastName='" + lastName + '\'' +
                 ", checkInDate=" + checkInDate +
                 ", checkOutDate=" + checkOutDate +
                 ", level=" + level +
                 ", contactNumber=" + contactNumber +
                 ", salary=" + salary +
                 '}';
     }


     /*void  getClockIn() {
       Scanner sc = new Scanner(System.in);
       System.out.println("Please enter number 1 for ClockIn");
       String operation = sc.nextLine();
       switch (operation) {
         case "1":
           java.util.Date date = new java.util.Date();
           System.out.println("ClockIn" + ":" + date);
           break;
           default:
               System.out.println("Mismatch!!check your number");
               System.exit(2);}}
   */
     public void getClockIn() {
         Scanner sc = new Scanner(System.in);
         System.out.println("Please enter number 1 for ClockIn");
         String operation = sc.nextLine();
         if ("1".equals(operation)) {
             LocalDateTime date1 = LocalDateTime.now();
             this.checkInDate=date1;
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

     public void getLogIn() {

         Scanner log = new Scanner(System.in);
         System.out.println("Input your LogIn ID");
         //1234
         int id = log.nextInt();
         if (id == 1234) {
             System.out.println("Login successfully");
         } else {
             System.out.println("incorrect ID");
             System.exit(2);
         }
     }


     public void viewPaycheck() {

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
     public void getPayCheckDetails() {
         Duration p = Duration.between(this.checkInDate,this.checkOutDate);
       /*p.toHours();
         p.toMinutes();*/

         float sum = p.getSeconds();
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




