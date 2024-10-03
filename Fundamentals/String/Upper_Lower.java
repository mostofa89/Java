package Fundamentals.String;

import java.util.Scanner;

public class Upper_Lower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String with mixed Letter : ");
        String str1 = input.nextLine();
        String upperStr = "";
        String lowerStr = "";
        for(int i = 0; i < str1.length(); i++){
            if(str1.codePointAt(i) >= 65 && str1.codePointAt(i) <= 90){
                lowerStr += (char) (str1.codePointAt(i) + 32);
                upperStr += str1.charAt(i);

            }else if(str1.codePointAt(i) >= 97 && str1.codePointAt(i) <= 122){
                upperStr += (char) (str1.codePointAt(i) - 32);
                lowerStr += str1.charAt(i);

            }
            else{
                upperStr += str1.charAt(i);
                lowerStr += str1.charAt(i);
            }
        }

        System.out.println("Upper Case letters : " + upperStr);
        System.out.println("lower Case letters : " + lowerStr);
    }
}
