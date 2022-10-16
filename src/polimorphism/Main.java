package polimorphism;

public class Main {
    public static void main(String[] args) {


        Koile k1 = new Koile();
        k1.sing();
        Bird  B1=new Bird();
        B1.sing();
    }
}
/* same method vaya pani method bhitra ko agremunt different x vane 2 otai resul aaux .for ex here inside bird  and inside
koile tow same mathod but different parameter  when we calld bout of bird and koile it will be print differnt  .
        but if i comment koliles method  then it will be print  print bouth same sing output besause i extand bird for koile.*/