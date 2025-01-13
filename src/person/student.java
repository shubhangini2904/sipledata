package person;

public class student extends Mainperson {
    String grade;
    student(String name,
            int age,
            String grade){
        super (name, age);
        this.grade = grade;
    }
     void displaydetails(){
        System.out.println("student :"+name+",Age:"+age+",Grade:"+grade);
     }
}
