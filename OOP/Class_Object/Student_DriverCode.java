package OOP.Class_Object;

public class Student_DriverCode {
    public static void main(String[] args) {
        Student student1 = new Student("Clark", 3.45f, 4);
        System.out.println("Name : " + student1.name);
        System.out.println("Cgpa : " + student1.cgpa);
        System.out.println("Couses Taken : " + student1.course_taken);
        System.out.println("Student Type : " + student1.student_status);
        System.out.println("Advising Status : " + student1.advising_status);
        System.out.println("--------------------------------------------------------------------------------");
        Student student2 = new Student("Berry", 1.93f, 2);
        System.out.println("Name : " + student2.name);
        System.out.println("Cgpa : " + student2.cgpa);
        System.out.println("Couses Taken : " + student2.course_taken);
        System.out.println("Student Type : " + student2.student_status);
        System.out.println("Advising Status : " + student2.advising_status);
        System.out.println("--------------------------------------------------------------------------------");
        Student student3 = new Student("Daina", 2.91f, 2);
        System.out.println("Name : " + student3.name);
        System.out.println("Cgpa : " + student3.cgpa);
        System.out.println("Couses Taken : " + student3.course_taken);
        System.out.println("Student Type : " + student3.student_status);
        System.out.println("Advising Status : " + student3.advising_status);
        System.out.println("--------------------------------------------------------------------------------");
        Student student4 = new Student("Burce", 1.52f, 5);
        System.out.println("Name : " + student4.name);
        System.out.println("Cgpa : " + student4.cgpa);
        System.out.println("Couses Taken : " + student4.course_taken);
        System.out.println("Student Type : " + student4.student_status);
        System.out.println("Advising Status : " + student4.advising_status);
        System.out.println("--------------------------------------------------------------------------------");
    }
}
