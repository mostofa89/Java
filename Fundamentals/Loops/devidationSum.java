package Fundamentals;

public class devidationSum {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 601; i += 1){
            if (i %7 == 0 && i %9 == 0){
                continue;
            }else if (i %7 == 0 || i %9 == 0){
                sum += i;
            }
        }
        System.out.println("The Sum is : " + sum);
    }
}
