package OOP.Variable_MethodOverloading;

public class Student {
    public int id;
    public String name;
    public String dept;
    public int dEffort;
    public String sugst;

    public Student(String name, int id){
        this.id = id;
        this.name = name;
        this.sugst = "";
        this.dept = "CSE";
        this.dEffort = 0;
    }


    public Student(String name, int id, String dept){
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.sugst = "";
        this.dept = dept;
        this.dEffort = 0;
    }


    public void dailyEffort(int hours){
        this.dEffort = hours;
        if (hours <= 2){
            this.sugst = "Should give more effort!";

        }else if (hours <= 4){
            this.sugst = "Keep up the good work!";

        }
        else{
            this.sugst = "Excellent! Now motivate others.";

        }
    }


    public void printDetails(){
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.id);
        System.out.println("Department: " + this.dept);
        System.out.println("Daily Effort: " + this.dEffort);
        System.out.println("Suggestion: " + this.sugst);
    }

}
