package OOP.Class_Object;
import OOP.Class_Object.BankAccaount;

public class bankAcc_DriverCode {
    public static void main(String[] args) {
        BankAccaount accaount1 = new BankAccaount("Bilbo", "Svaing");
        System.out.println("=====================================");
        System.out.println("Accaount name : " + accaount1.name);
        System.out.println("Accaount Type : " + accaount1.acc_type);
        System.out.println("Balance : " + accaount1.balance);
        System.out.println("=====================================");
        BankAccaount accaount2 = new BankAccaount("Frodo", "Business");
        System.out.println("=====================================");
        System.out.println("Accaount name : " + accaount2.name);
        System.out.println("Accaount Type : " + accaount2.acc_type);
        System.out.println("Balance : " + accaount1.balance);
        System.out.println("=====================================");
        accaount1.updateBalance(3500f);
        accaount2.updateBalance(6000f);
    }
}
