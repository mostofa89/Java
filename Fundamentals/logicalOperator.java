package Fundamentals;

public class logicalOperator {
    public static void main(String[] args) {
        int num = 25;
        boolean flag = true;

        if (num >= 18 && flag == true){
            System.out.println("Both are Correct");
        }else if (num > 17 || flag == false){
            System.out.println("One is correct.");
        }
        
        if (num != 24){
            System.out.println("Number is not 24");
        }
    }
}
