package Fundamentals.Loops;

public class NstepforLoop{
    public static void main(String args[]){
        for (int i = 5; i <= 50; i += 5){
            System.out.println(i);
        }

        // reverse
        System.out.println("Recverse");

        for (int i = 50; i >= 5; i -= 5){
            System.out.println(i);
        }
    }
}
