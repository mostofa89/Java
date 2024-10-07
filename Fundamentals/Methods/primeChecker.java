package Fundamentals.Methods;

public class primeChecker {
    public static void checker(int num){
        int i = 1;
        int counter = 0;
        while (i <= num){
            if (num %i == 0 ){
                counter += 1;
                
            }
            i += 1;
        }
        if (counter == 2){
            System.out.println(num + " is a Prime number.");
        }
        else {
            System.out.println(num + " is not a Prime number.");
        }
    }

    public static void main(String[] args) {
        checker(71);
    }
}
