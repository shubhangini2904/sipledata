package person;

import javax.security.auth.Subject;

public class Teacher extends Mainperson {
    String subject;
    Teacher(String name,int age, String subject){
        super(name,age);
        this.subject = subject;
    }
    void displaydetails(){
        System.out.println("Teacher:"+ name +",Age:"+ age +",Subject:" + subject  );


    }
}
