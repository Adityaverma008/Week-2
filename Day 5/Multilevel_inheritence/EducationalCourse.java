class course{
    String CourseName;
    int CourseDuration;

    course(String CourseName , int CourseDuration){
        this.CourseDuration = CourseDuration;
        this.CourseName = CourseName;
    }
}

class onlineCourse extends course{
    String platForm;
    String isRecorded;

    public onlineCourse(String CourseName , int CourseDuration , String platForm , String isRecorded) {
        super(CourseName, CourseDuration);
        this.platForm = platForm;
        this.isRecorded = isRecorded;
    }
}

class paidOnlineCourse extends onlineCourse{
    int fees;
    int discount;

    public paidOnlineCourse(String CourseName , int CourseDuration , String platForm , String isRecorded , int fees , int discount) {
        super(CourseName ,  CourseDuration , platForm , isRecorded);
        this.fees = fees;
        this.discount = discount;
    }

    void displayCourseDetail(){
        System.out.println("course name is :- " + CourseName);
        System.out.println("Course duration in hours:- " + CourseDuration);
        System.out.println("course platform is:- " + platForm);
        System.out.println("course isRecorded is:- " + isRecorded);
        System.out.println("course fees :- " + fees);
        System.out.println("course discout is:- " + discount);
    }
}

public class EducationalCourse {
    public static void main(String[] args) {
        paidOnlineCourse obj = new paidOnlineCourse("Dsa", 200, "Google Meet", "Yes", 20000, 3000);
        obj.displayCourseDetail();
    }
}
