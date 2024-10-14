package OOP.Class_Object;

public class GreenPhone {
    public String model;
    public int version;
    public int cameras;
    public int getUpdate;


    public GreenPhone(String model, int version, int cameras){
        this.model = model;
        this.version = version;
        this.cameras = cameras;
        this.model = model;
        this.getUpdate = 0;

        if (model.charAt(0) == 'A'){
            this.getUpdate = 2;

        } else if(model.charAt(0) == 'M'){
            this.getUpdate = 3;

        } else if (model.charAt(0) == 'U'){
            this.getUpdate = 4;
        }
    }



    public void updatePhone(){
        if (this.getUpdate == 0){
            System.out.println("Your phone Greenphone " + this.model + " is already up to date.");

        }else{
            this.version += 1;
            this.getUpdate -= 1;
            System.out.println("Your phone Greenphone " + this.model + "is upgraded to Android Version: " + this.version + ".");
        }
    }


    public void showSpecification(){
        System.out.println("Phone Company: GreenPhone\nModel : " + this.model + ".\nVersion : " + this.version + ".\nCameras  : " + this.cameras + ".");
    }


}
