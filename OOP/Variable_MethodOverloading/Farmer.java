package OOP.Variable_MethodOverloading;

import java.util.ArrayList;
import java.util.Arrays;

public class Farmer {
    public String name;
    public int id;
    public ArrayList<String> crops;
    public ArrayList<String> fishes;


    public Farmer(String name, int id){
        this.id = id;
        this.name = name;
        this.crops = new ArrayList<>();
        this.fishes = new ArrayList<>();
        System.out.println("Welcome your Fram " + this.name + ". Your Farmer Id is: " + this.id + ".");
    }


    public Farmer(String name){
        this.name = name;
        this.crops = new ArrayList<>();
        this.fishes = new ArrayList<>();
        System.out.println("Welcome your Fram " + this.name + "!");
    }


    public Farmer(int id){
        this.id = id;
        this.crops = new ArrayList<>();
        this.fishes = new ArrayList<>();
        System.out.println("Welcome your Fram! Your Farmer Id is: " + this.id + ".");
    }


    public Farmer(){
        this.crops = new ArrayList<>();
        this.fishes = new ArrayList<>();
        System.out.println("Welcome your Fram!");
    }


    public void addCrops(String ... cropss){
        for (String crop : cropss){
            if (this.crops.contains(crop) != true){
                this.crops.add(crop);
            }
        }

        if (this.crops.isEmpty() == true){
            System.out.println("No crop added");
        }
        else{
            System.out.println(this.crops.size() + " crop(s) added.");
        }
    }


    public void addFishes(String ... fishess){
        for (String fish : fishess){
            if (this.fishes.contains(fish) == false){
                this.fishes.add(fish);
            }
            
        }

        if (this.fishes.isEmpty() == true){
            System.out.println("No Fish added");

        }
        else{
            System.out.println(this.fishes.size() + " fish(s) added.");
        }
    }


    public void showGoods(){
        if (this.crops.isEmpty() == true){
            System.out.println("You Don't have any crop(s).");

        }
        else{
            System.out.println("You Have " + this.crops.size() + " crop(s):");
            for (int i = 0; i < this.crops.size(); i ++){
                if (i == this.crops.size() - 1){
                    System.out.println(this.crops.get(i));

                }
                else{
                    System.out.print(this.crops.get(i) + ", ");
                }
            }
        }

        if (this.fishes.isEmpty() == true){
            System.out.println("You Don't have any fish(s).");

        }
        else{
            System.out.println("You Have " + this.fishes.size() + " fish(s):");
            for (int i = 0; i < this.fishes.size(); i ++){
                if (i == this.fishes.size() - 1){
                    System.out.println(this.fishes.get(i));

                }
                else{
                    System.out.print(this.fishes.get(i) + ", ");
                }
            }
        }
    }

}
