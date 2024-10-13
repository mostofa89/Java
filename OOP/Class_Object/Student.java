package OOP.Class_Object;

public class Student {
    public String name;
    public float cgpa;
    public int course_taken;
    public String advising_status;
    public String student_status;


    public Student(String name, float cgpa, int course_taken){
        this.name = name;
        this.cgpa = cgpa;
        this.course_taken = course_taken;
        this.advising_status = "Aproved";
        this.student_status = "Regular";

        if (cgpa < 2 && course_taken > 2){
            this.course_taken = 0;
            this.advising_status = "Denied";
            this.student_status = "Probation";
            System.out.println("Sorry, " + name + ", you are on probation and cannot take more than 2 courses.");

        }else if (cgpa < 2 && course_taken < 3){
            this.student_status = "Probation";
            System.out.println("Study hard this time, " + name);

        }else if (cgpa >= 2 && course_taken <= 2){
            this.advising_status = "Denied";
            this.course_taken = 0;
            System.out.println("Hello " + this.name + ", You are a regular student and have to take between 3 to 5 courses.");

        }else if (cgpa >= 2 && course_taken > 5){
            this.advising_status = "Denied";
            this.course_taken = 0;
            System.out.println("Sorry " + this.name + ", you are on probation and cannot take more than 5 courses.");
        }else if (cgpa >= 2 && course_taken > 2 && course_taken < 6){
            System.out.println("All the best" + this.name + ", for upcomig Semester.");
        }
    }

    
}
