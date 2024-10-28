package OOP.Encapsulation_and_HasRelation;

public class Circle {
    private int radius;
    private float area;


    public Circle(int radius){
        this.radius = radius;
        this.area = 0f;
    }


    public void CalcArea(){
        this.area = (float) (3.14f * Math.pow(this.radius, 2));
    }


    public float getArea(){
        return this.area;
    }

    public int getRadius(){
        return this.radius;
    }

    public void SetRedius(int radius){
        this.radius = radius;
    }

}
