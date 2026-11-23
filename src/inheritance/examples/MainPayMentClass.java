package inheritance.examples;

public class MainPayMentClass {
    public  static void main(String[] args) {
        PayMent pm;
        pm=new UpI();
        pm.pay();

        //PayMent pm;
        pm=new CreditCard();
        pm.pay();


       // PayMent pm;
        pm=new Cash();
        pm.pay();


    }
}
