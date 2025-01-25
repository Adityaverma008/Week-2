class Employee{
    

    void displayDetail(String name , int id , int salery){             //method to display every class details
        System.out.println("Name of the employee is:- " + name + " " + "And the id is:- " + id + " " + "And their salery is:- " + salery);

    }
}

class Manager extends Employee{                 //manager class inherit employee
    int teamSize = 10;
    void details(){
        System.out.println("The total member of team of manager is:- " + teamSize);

    }
}

class Developer extends Employee{               //developer class inherit employee
    String programmingLanguage = "Java";
    void details(){
        System.out.println("The programming language of developer is:- " + programmingLanguage);

    }
}

class Intern extends Employee{                  //intern class inherit employee
    int internship_duration = 3;
    void details(){
        System.out.println("The total duration of internship of the intern is:- " + internship_duration);
    }
}

public class job {
    public static void main(String[] args) {
        
        Manager manager = new Manager();
        Developer developer = new Developer();
        Intern intern = new Intern();

        manager.displayDetail("Addy", 9, 30000);
        developer.displayDetail("Ankit" , 19, 40000);
        intern.displayDetail("Dhananjay", 36, 30000);

        intern.details();
    }
}
