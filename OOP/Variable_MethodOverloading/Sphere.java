package OOP.Variable_MethodOverloading;

public class Sphere {
    public String id;
    public String color;
    public int redius;
    public float volume;


    public Sphere(String id, String color, int redius){
        this.id = id;
        this.color = color;
        this.redius = redius;
        this.volume = (float) ((float) Math.pow(redius, 3) * (float) 4/3 * 3.14);
    }


    public Sphere(String id, String color){
        this.id = id;
        this.color = color;
        this.redius = 1;
        this.volume = (float) ((float) Math.pow(redius, 3) * (float) 4/3 * 3.14);
    }

    public Sphere(String id, int redius){
        this.id = id;
        this.color = "White";
        this.redius = redius;
        this.volume = (float) ((float) Math.pow(redius, 3) * (float) 4/3 * 3.14);
    }


    public Sphere(String id){
        this.id = id;
        this.color = "White";
        this.redius = 1;
        this.volume = (float) ((float) Math.pow(redius, 3) * (float) 4/3 * 3.14);
    }


    public void printDetails(){
        System.out.println("Sphere Id: " + this.id);
        System.out.println("Color : " + this.color);
        System.out.println("Volume : " + this.volume);
    }


    public void merge_sphere(Sphere ... spheres){
        for (var sphere : spheres){
            if (!this.color.equals(sphere.color)){
                this.color = "Mixed";
            }
            this.volume += sphere.volume;
        }

        System.out.println("Spheres are being merged");
    }

}
