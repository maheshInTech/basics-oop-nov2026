package polymorphism.examples;

public class PerformSum {
    public void sum(int a,int b){
        System.out.println("sum of two int numbers is:"+(a+b));
    }
    public void sum(int a,int b,int c){
        System.out.println("sum of three int numbers is:"+(a+b+c));
    }
    public void sum(double a,int b){
        System.out.println("sum of one double and one  int numbers is:"+(a+b));
    }
    public void sum(float a,int b){
        System.out.println("sum of one float and one int numbers is:"+(a+b));
    }
    public void sum(double a,double b) {
        System.out.println("sum of two double  numbers is:" + (a + b));
    }
        public void sum(float a,float b){
            System.out.println("sum of two float  numbers is:"+(a+b));
        }
    }

