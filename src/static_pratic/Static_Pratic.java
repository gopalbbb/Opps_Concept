package static_pratic;

//public class Static_Pratic {
 /* int  a =1;
    // we can't print a because didn't have object or it is not inside main method

    public static void main(String[] args) {
        System.out.println(a);
    }
    }}
    */


   /* class Static_a{


        int a=10;
    void getMethod(){
    System.out.println(a);
}


    public static void main(String[] args) {
        Static_a pratic =new Static_a();
        pratic.getMethod();

    }


}*/



/*
class Real_Static{
    static int a=10; //we can print this a without any method and  any object why ...?? because of use static keyboard.
// this mean if we use static keyboard we don't need to make any object.
       public static void main(String[] args) {
           System.out.println(a);
       }
   }*/


//IN Real_world Project
class Employee {
    String getEmpName;
    String getempDep;
    int getEmpId;
  static String companyName;

// this is static block
static {
    companyName = "Code Intract";
}

 void getEmp(){
        System.out.println(getEmpName+":"+getempDep+":"+getEmpId+":"+companyName);

    }
    public static void main(String[] args) {
        Employee gopal = new Employee();
        gopal.getEmpName="Gopal";
        gopal.getempDep="Deployment";
        gopal.getEmpId=01;



        Employee bishal=new Employee();
        bishal.getEmpName="Bishal";
        bishal.getempDep="Testing";
        bishal.getEmpId=02;

        Employee abc=new Employee();
        abc.getEmpName="Something";
        abc.getempDep="development";
        abc.getEmpId=03;

       // Employee.companyName="Code Intract";
        // The company name is similar for both employee and if we make static and call by class then it will print at all

        gopal.getEmp();
        bishal.getEmp();
        abc.getEmp();



    }
}

