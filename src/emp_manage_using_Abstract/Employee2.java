package emp_manage_using_Abstract;

import java.util.Scanner;

public class Employee2 extends Employee{

    @Override
    void empId() {
        System.out.println(12345);

    }

    @Override
    void firstName() {
        System.out.println("Hariiii");

    }

    @Override
    public void getLogIn() {
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your user name and password");
            String username = sc.nextLine();
            int password = sc.nextInt();

            if (username == "user") {
                if (password == 1234) {
                    System.out.println("Log in Successfully!");
                } else {
                    System.out.println("Incorrect User name or Password");
                }
            }
        }
    }}