package Fundamentals.Array;

import java.util.Arrays;
import java.util.Scanner;

public class StringtoArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String of a List : ");
        String str1 = input.nextLine();
        int [] arr = new int[5];
        int counter = 0;
        String str = ""; 
        for (int i = 0; i < str1.length(); i++){
            if(str1.charAt(i) == ','){
                arr[counter] = Integer.parseInt(str);
                counter += 1;
                str = "";
            }else if(str1.charAt(i) == ' '){
                continue;
            }
            else{
                str += str1.charAt(i);
            }
        }

        arr[counter] = Integer.parseInt(str);
        System.out.println(Arrays.toString(arr));

    }
}
