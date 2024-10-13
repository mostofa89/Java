package OOP.Class_Object;

public class cellPackage {
    public int talktime;
    public int data;
    public  int sms;
    public float discount;
    public int validity;
    public int price;


    public cellPackage(int price, String data, int sms, int talktime, String discount, int validity){
        String str_data = data.substring(0, data.length() - 3);
        this.data = Integer.parseInt(str_data);
        this.talktime = talktime;
        this.price = price;
        this.sms = sms;
        this.discount = Float.parseFloat(discount.substring(0, discount.length() - 1)) / 100 * price;
        this.validity = validity;
    }

    

}
