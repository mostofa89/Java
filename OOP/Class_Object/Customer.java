package OOP.Class_Object;

public class Customer {
    public int price;
    public int counter;

    public Customer(){
        this.counter = 0;
        System.out.println("Welcome to ABC Memorial Park!");
    }


    public void buyTicket(String name, int age){
        this.counter += 1;
        if (this.counter <= 3){
            if(age <= 10){
                this.price += 50;
            }else{
                this.price += 100;
            }
        }else{
            System.out.println("You can not buy more than 3 tickets.");
        }
        
    }


    public void ShowDetails(){
        System.out.println("Ammount of tickets : " + this.counter + ".\nPrice " + this.price + " Taka." );
    }


}
