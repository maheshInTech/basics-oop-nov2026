package interfaces.examples;

public interface SampleInterface {
    public int aa=23;
    public static int bb=27;
    public final int cc=78;
    int  dd=56;
    public  static final  int ee=98;

    // private  int  dd=56; not allowed
    // protected int  dd=56; not allowed
    public  void sample1();
     abstract void sample2();
     void sample3();

     private  void  sample4(){
         System.out.println("I am a private method and here to give info like blueprint");

    }
    public void general();
}
