package Fundamentals.Methods;

public class fibonacci {
    public static void fibo(int num){
        int x = 0;
        int y = 1;
        System.out.print(x + " ");
        while(y <= num){
            System.out.print(y + " ");
            int z = x + y;
            x = y;
            y = z;
        }
    }


    public static void main(String[] args) {
        fibo(10);
    }
}
