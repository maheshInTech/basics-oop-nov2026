package encapsulation.examples;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.awt.desktop.SystemSleepEvent;

public class MainEncapsulationClass {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        teacher1.setId(101);
        teacher1.setName("kiran");
        teacher1.setQualification("B.ed");
        teacher1.setSalary(45000);
        teacher1.setAge(35);
        teacher1.setEmail("kiranmaiye@gmail.com");
        System.out.println("Teacher is:" + teacher1);
        System.out.println ("Teacher name is:"+teacher1.getName());
        System.out.println ("Teacher id is:"+teacher1.getId());
        System.out.println ("Teacher salary is:"+teacher1.getSalary());
        System.out.println ("Teacher email is:"+teacher1.getEmail());

    }
}
