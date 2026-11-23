package classes.and.objects;

public class Student {
    String Name;
     int ID;
    String EMAIL;
    public int Age;
   String   Standard;
public  Student(){

}
    public Student(String name, int ID, String EMAIL, int age, String standard) {
        this.Name = name;
        this.ID = ID;
        this.EMAIL = EMAIL;
        this.Age = age;
      this.  Standard = standard;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", ID=" + ID +
                ", EMAIL='" + EMAIL + '\'' +
                ", Age=" + Age +
                ", Standard='" + Standard + '\'' +
                '}';
    }
}
