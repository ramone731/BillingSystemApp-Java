class Item{
    private String name;
    private int quantity;
    private double price;

    //constructor: item details
    public Item(String name, int quantity, double price){
        this.name = name;
        this.quanity = quantity;
        this.price = price;
    }

    //getters: item properties
    public  String  getName(){
        return name;
    }

    public int getQuantity(){
        return quantity;
    }
    public double getPrice(){
        return price;
    }
}