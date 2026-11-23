package interfaces.examples;

public class ChildInterfaceClass implements DemoInterface,SampleInterface{

    public void sample1(){
        System.out.println("a is :"+SampleInterface .aa);
        System.out.println("b is :"+SampleInterface .bb);
        System.out.println("c is :"+SampleInterface .cc);
        System.out.println("d is :"+SampleInterface .dd);
        System.out.println("e is :"+SampleInterface .ee);
        System.out.println("sample1 is implemented in the child class");

    }
    public void sample2(){
        System.out.println("sample2 is implemented in the child class");


    }
    public void sample3(){
        System.out.println("sample3 is implemented in the child class");



    }
    public void sample4(){
        System.out.println("sample4 is implemented in the child class");



    }

    @Override
    public void general() {

    }

}
