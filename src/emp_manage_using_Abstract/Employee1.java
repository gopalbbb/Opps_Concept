package emp_manage_using_Abstract;

import javax.swing.*;

class Employee1 extends Employee {


 @Override
 void empId() {
  System.out.println(123);
 }

 @Override
 void firstName() {
  System.out.println("Gopal");

 }

 @Override
 public void getLogIn() {
  int attempt = 0;
  String username = "gopal";
  String password = "1234";
  String usernameEntered;
  String passwordEntered;

  do {
   usernameEntered = (JOptionPane.showInputDialog("Please enter the username"));
   passwordEntered = (JOptionPane.showInputDialog("Please enter the password"));
   attempt++;
  } while (usernameEntered != username && passwordEntered != password && attempt < 1);
 }

}


