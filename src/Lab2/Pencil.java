package Lab2;

public class Pencil {
    private String color;
    private double length;
    private double price;

    //constructor
    public Pencil(String color, double length, double price){
        this.color = color;
        this.length = length;
        this.price = price;
    }

    public void display(){
        System.out.println(this.color);
        System.out.println(this.length);
        System.out.println(this.price);
    }
}
