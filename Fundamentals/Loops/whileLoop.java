package Fundamentals.Loops;

public class whileLoop {
    public static void main(String[] args) {
        int i = 5;
        while (i <= 50){
            if (i == 50){
                System.out.println(i);
            }else{
                System.out.print(i + ", ");
            }
            i += 5;
        }
    }
}
