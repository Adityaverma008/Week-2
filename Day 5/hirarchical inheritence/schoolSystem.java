class person{               //superclass 
    String name;
    int age;
    person(String name , int age){
        this.name = name;
        this.age = age;
    }
    void displayPerson(){
        System.out.println("name is:- " + name);
        System.out.println("age is:- " + age);
    }
}

class teacher extends person{               //teacher subclass inherit superclass person
    String teachSubject;
    teacher(String name , int age , String teachSubject){
        super(name, age);
        this.teachSubject = teachSubject;
    }
    void displayTeacher(){
        System.out.println("teacher name is:- " + name);
        System.out.println("teacher age is:- " + age);
        System.out.println("teacher teaches subject is:- " + teachSubject);
    }

}

class student extends person{                  //student subclass inherit superclass person
    String grade; 
    student(String name , int age , String grade){
        super(name, age);
        this.grade = grade;
    }
    void displayStudent(){
        System.out.println("student name is :- " + name);
        System.out.println("student age is:- " + age);
        System.out.println("student grade is:- " + grade);
    }

}

class staff extends person{                    //staff subclass inherit superclass person
    int salery;
    staff(String name , int age , int salery){
        super(name , age);
        this.salery = salery;
    }
    void displayStaff(){
        System.out.println("staff name is:- " + name );
        System.out.println("staff age is:- " + age);
        System.out.println("staff salery is:- " + salery);
    }
}



public class schoolSystem {
    public static void main(String[] args){
        teacher Tobj = new teacher("Amit sir" , 27 , "Mathematics");
        student Sobj = new student("Addy" , 24 , "A+");
        staff stobj = new staff("Suresh" , 26 , 15000);

        // all class method calling
        Tobj.displayTeacher();
        Sobj.displayStudent();
        stobj.displayStaff();

    }
}
