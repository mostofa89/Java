package OOP.Encapsulation_and_HasRelation;

public class Triangle {
    private int base;
    private int height;
    private float area;


    public Triangle(int base, int height){
        this.base = base;
        this.height = height;
        this.area = 0;
        this.CalcArea(base, height);
    }

    
    public void setBase(int new_base){
        this.base = new_base;
    }


    public int getBase(){
        return this.base;
    }

    public void setHeight(int new_height){
        this.height = new_height;
    }


    public int getHeight(){
        return this.height;
    }

    public float getArea(){
        return this.area;
    }


    private void CalcArea(int base, int height){
        this.area = (float) ((float) 1/2 * base * height);
    }

}
