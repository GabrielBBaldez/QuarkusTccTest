package study.factory;

public class Product {

    private final String name;
    private final double price;


    private Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public static Product createProduct(String name, double price){

        if(name == null|| name.isEmpty()){
            throw new IllegalArgumentException("Name canot be null ou empity");
        }

        if(price < 0){
            throw new IllegalArgumentException("Price canot be negative");
        }

        return new Product(name,price);
    }

    public static Product giftProduct(String name){
        if(name == null|| name.isEmpty()){
            throw new IllegalArgumentException("Name canot be null ou empity");
        }

        return new Product(name,0);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + "}";
    }
}
