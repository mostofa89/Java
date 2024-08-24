package Fundamentals;

class typeCasting{
    public static void main(String[] args) {
        String str_num= "1234";
        int num = 3455;
        float num1 = 3.50f;
        double num2 = 3.48898975;
        boolean flag = true;

        System.out.println("Integer --> " + num);
        System.out.println("String --> " + str_num);
        System.out.println("Float --> " + num1);
        System.out.println("Double --> " + num2);
        System.out.println("Boolean  --> " + flag);
        // type casting
        int snum = Integer.parseInt(str_num);
        int fnum = (int) num1;
        int dnum = (int) num2;
        String inum = num + "";
        float stof = Float.parseFloat(str_num);
        double ftod = (double) num1;
        
        System.out.println("After Type Casting");
        System.out.println(snum);
        System.out.println(fnum);
        System.out.println(dnum);
        System.out.println(inum);
        System.out.println(stof);
        System.out.println(ftod);

    }
}