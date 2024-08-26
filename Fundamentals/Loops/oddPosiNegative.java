package Fundamentals.Loops;

public class oddPosiNegative {
    public static void main(String[] args) {
        int a = 18;
        int b = 63;
        for (int i = a; i <= b; i += 9) {
            if (i < b) {
                if (i % 2 == 0) {
                    System.out.print(i + ", ");
                } else {
                    System.out.print(-i + ", ");
                }
            } else if (i == b) {
                System.out.println(-i);
            }
        }
    }
}
