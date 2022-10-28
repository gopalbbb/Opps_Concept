package employee_management_;

public class MainEmpSummary extends Employee{

    public static void main(String[] args) {



        Employee emp1=new Employee();
        emp1.setEmpId(1);
        emp1.setFirstName("Dipak");
        emp1.setLastName("Thapa");
        emp1.setLevel(20);
        emp1.setContactNumber(123456);



    while(true){
        emp1.getLogIn();
        emp1.getClockIn();

        System.out.println("Employee Id"+":"+emp1.getEmpId());
        System.out.println("First Name"+":"+emp1.getFirstName());
        System.out.println("Last Name"+":"+emp1.getLastName());
        System.out.println("Level"+":"+emp1.getLevel());
        System.out.println("Contact Number"+":"+emp1.getContactNumber());

        emp1.getClockOut();
        emp1.viewPaycheck();
        emp1.getPayCheckDetails();


    }}
}
