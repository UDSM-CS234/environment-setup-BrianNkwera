package Lab2;

public class Invoice {
    private int number;
    private String description;
    private double price;
    //constructor
    public Invoice(int number,String description,double price){
        this.number = number;
        this.description = description;
        this.price = price;
    }
        void display() {
            System.out.println("number:" + " " + number);
            System.out.println("description:" + " " + description);
            System.out.println("price:" + " " + price);
        }
}
