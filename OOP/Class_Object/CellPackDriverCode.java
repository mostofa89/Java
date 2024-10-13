package OOP.Class_Object;

public class CellPackDriverCode {
    public static void main(String[] args) {
        cellPackage package1 = new cellPackage(150, "6 GB", 99, 20, "7%", 7);
        System.out.println("============== Package-1 Details ==============");
        System.out.println("Talktime : " + package1.talktime + " Munites.");
        System.out.println("Data : " + package1.data + " MB.");
        System.out.println("SMS : " + package1.sms + ".");
        System.out.println("Validity : " + package1.validity + " Days.");
        System.out.println("-----> price : " + package1.price + " Tk.");
        System.out.println("Buy now to get " +  package1.discount + " tk cashback.");
        System.out.println("===============================================");
        cellPackage package2 = new cellPackage(700, "35 GB", 0, 700, "10%", 30);
        System.out.println("============== Package-2 Details ==============");
        System.out.println("Talktime : " + package2.talktime + " Munites.");
        System.out.println("Data : " + package2.data + " MB.");
        System.out.println("SMS : " + package2.sms + ".");
        System.out.println("Validity : " + package2.validity + " Days.");
        System.out.println("-----> price : " + package2.price + " Tk.");
        System.out.println("Buy now to get " +  package2.discount + " tk cashback.");
        System.out.println("===============================================");
        cellPackage package3 = new cellPackage(190, "0 GB", 100, 150, "7%", 15);
        System.out.println("============== Package-2 Details ==============");
        System.out.println("Talktime : " + package3.talktime + " Munites.");
        System.out.println("Data : " + package3.data + " MB.");
        System.out.println("SMS : " + package3.sms + ".");
        System.out.println("Validity : " + package3.validity + " Days.");
        System.out.println("-----> price : " + package3.price + " Tk.");
        System.out.println("Buy now to get " +  package3.discount + " tk cashback.");
        System.out.println("===============================================");
    }
}
