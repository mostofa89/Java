package OOP.Class_Object;

public class MangoTreeDriverCode {
   public static void main(String[] args) {
       MangoTree mangotree1 = new MangoTree("Gopalvog");
       System.out.println("==============================================");
       System.out.println("Mango Tree Details : ");
       System.out.println("Varity : " + mangotree1.varity);
       System.out.println("Height : " + mangotree1.height);
       System.out.println("Number of Mango : " + mangotree1.numberOfMango);
       System.out.println("==============================================");
       MangoTree mangotree2 = new MangoTree("Amrupali");
       System.out.println("==============================================");
       System.out.println("Mango Tree Details : ");
       System.out.println("Varity : " + mangotree2.varity);
       System.out.println("Height : " + mangotree2.height);
       System.out.println("Number of Mango : " + mangotree2.numberOfMango);
       System.out.println("==============================================");
       // After 5 Years 
       mangotree1.height += 15;
       mangotree2.height += 15;
       mangotree1.numberOfMango = (int) mangotree1.height * 10;
       mangotree2.numberOfMango = (int) mangotree1.height * 15;
       System.out.println("Updated details after 5 years :");
       System.out.println("==============================================");
       System.out.println("Mango Tree Details : ");
       System.out.println("Varity : " + mangotree1.varity);
       System.out.println("Height : " + mangotree1.height);
       System.out.println("Number of Mango : " + mangotree1.numberOfMango);
       System.out.println("==============================================");
       System.out.println("==============================================");
       System.out.println("Mango Tree Details : ");
       System.out.println("Varity : " + mangotree2.varity);
       System.out.println("Height : " + mangotree2.height);
       System.out.println("Number of Mango : " + mangotree2.numberOfMango);
       System.out.println("==============================================");


   } 
}
