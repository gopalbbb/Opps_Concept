package inheritense;

public class Main {
    public static void main(String[] args) {
        Car3 c1= new Car3();
        c1.companyName();
        c1.usear();

        System.out.println("================================");
        Car1 car1=new Car1();
        car1.companyName();
     car1.companyAddress();
        car1.color();
        System.out.println("================================");

        Car2 C2=new Car2();
        C2.companyName();
        C2.carName();
        C2.Engine();

    }


}
