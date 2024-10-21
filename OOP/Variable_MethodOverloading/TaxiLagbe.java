package OOP.Variable_MethodOverloading;

import java.util.ArrayList;

public class TaxiLagbe {
    public String num;
    public String location;
    public int fare;
    public ArrayList<String> passengers;


    public  TaxiLagbe(String num, String location){
        this.num = num;
        this.location = location;
        this.fare = 0;
        this.passengers = new ArrayList<>();
    }


    public void addPassenger(String ... passengers){
        for (String passenger : passengers){
            if (this.passengers.size() < 5){
                String name = "";
            for (int i = 0; i < passenger.length(); i++){
                if (passenger.charAt(i) == '_'){
                    name = passenger.substring(0, i);
                    this.fare += Integer.parseInt(passenger.substring(i + 1, passenger.length()));
                    break;
                }
            }
            this.passengers.add(name);
            System.out.println(name + "! Welcome to TaxiLagbe.");

            }
            else{
                System.out.println("Taxi Full! No more passengers can be added.");
            }
            
        }
    }


    public void printDetails(){
        System.out.println("Trip info for Taxi number : " + this.num);
        System.out.println("This taxi can only cover the" +this.location + "area");
        System.out.println("Total passengers: " + this.passengers.size());
        System.out.println("Passenger lists:");
        for (int i = 0; i < this.passengers.size(); i++){
            if (i == this.passengers.size() - 1){
                System.out.println(this.passengers.get(i));

            }
            else{
                System.out.print(this.passengers.get(i) + ", ");
            }

        }

        System.out.println("Total fare: : " + this.fare);
    }


}
