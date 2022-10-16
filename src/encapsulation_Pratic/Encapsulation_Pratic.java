package encapsulation_Pratic;

public class Encapsulation_Pratic {
private String firstName;
   private String lastname;
    String address;
    int mobileNumber;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Encapsulation_Pratic() {
    }

    void createStudent(){
        System.out.println("Student Details");
    }
}
