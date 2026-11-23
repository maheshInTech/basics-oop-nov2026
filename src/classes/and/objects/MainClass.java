package classes.and.objects;

import java.net.SocketOption;

public class MainClass {
//    void display(){
//        System.out.println("hello mahesh..!!!");
//    }
//
//    public void main(String[] args){
//        System.out.println("HI mahesh..!!!");
//
//        MainClass obj=new MainClass();
//        obj.display();
//     }
//}
    public static void main(String args[]){

         System.out.println("Hello all, wellcome to spring 1 module..!");

         Student student1=new Student();
        System.out.println("student1 before assigning the values : "+student1);
        student1.ID=2453;
        student1.Name="Karthik M";
        student1.EMAIL="KarthikMolugu@gmail.com";
        student1.Age=17;
        student1.Standard="x";
        System.out.println("student1 after assigning the values:"+student1);
        System.out.println("student1 is :"+student1);

        Student student2=new Student("karthik m",2553,"karthikmolugu@gmail.com",17,"x");
        System.out.println("student2:"+student2);
      //  First one calls the no-argument constructor.
              //  Second one calls the parameterized constructor.
        Demo D1=new Demo();
        System.out.println("aaa:"+D1.aaa);
        System.out.println("bbb :"+Demo.bbb);
        D1.Demo1();
        Demo.Demo2();

        final int n1=2345;
        int n2=873;
        System.out.println("n1 and n2 is :"+n1+"...."+n2);
        //n1=2323;
        n2=768;
    }
}
