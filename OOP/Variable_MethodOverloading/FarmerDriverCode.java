package OOP.Variable_MethodOverloading;

public class FarmerDriverCode {
    public static void main(String[] args) {
        Farmer f1 = new Farmer();
        System.out.println("-------------------");
        f1.addCrops("Rice", "Jute", "Cinnamon");
        System.out.println("-------------------");
        f1.addFishes();
        System.out.println("-------------------");
        f1.addCrops("Mustard");
        System.out.println("-------------------");
        f1.showGoods();
        System.out.println("-------------------");
        Farmer f2 = new Farmer("Korim Mia");
        System.out.println("-------------------");
        f2.addFishes("Pangash", "Magur");
        System.out.println("-------------------");
        f2.addCrops("Wheat", "Potato");
        System.out.println("-------------------");
        f2.addFishes("Koi", "Tuna", "Sardine");
        System.out.println("-------------------");
        f1.showGoods();
        System.out.println("-------------------");
        Farmer f3 = new Farmer(5127000);
        System.out.println("-------------------");
        f3.addCrops();
        System.out.println("-------------------");
        f3.addFishes("Katla");
        System.out.println("-------------------");
        f3.showGoods();
        System.out.println("-------------------");
    }
}
