package OOP.Class_Object;

public class BankAccaount {
    public String name;
    public String acc_type;
    public float balance;

    public BankAccaount(String name, String acc_type){
        this.name = name;
        this.acc_type = acc_type;
        this.balance = 0f; // Initial Balance
    }
    
}
