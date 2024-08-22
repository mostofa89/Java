import java.util.Scanner;
public class userInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String name = input.nextLine();
        System.out.print("Enter Your id : ");
        int id = input.nextInt();
        System.out.print("Enter Your cgpa : ");
        float cgpa = input.nextFloat();
        System.out.println("Name : " + name + ", Id : " + id + ", Cgpa : " + cgpa + ".");

        input.close();

    }
}
