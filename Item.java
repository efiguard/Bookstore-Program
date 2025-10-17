package item;
/**
 * 
 *  Author: Alex Jacobs
 *  Student number: 251093263
 *  
 */
public class Item {
    // attributes
    private String code = new String();
    private String name = new String();
    private double price = 0.0;
    private int qtyOnHand = 0;
    
    // constructor
    public Item(String code, String name, double price, int qtyOnHand) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.qtyOnHand = qtyOnHand;
    }
    
    // getters
    public String getCode() {
        return this.code;
    }
    
    public String getName() {
        return this.name;
    }
    
    public double getPrice() {
        return this.price;
    }
    
    public int getQtyOnHand() {
        return this.qtyOnHand;
    }
    
    // setters 
    public void setCode(String code) {
        this.code = code;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setQtyOnHand(int qtyOnHand) {
        this.qtyOnHand = qtyOnHand;
    }
    
    public void decrQtyOnHand(int decr) {
        this.qtyOnHand = qtyOnHand - decr;
    }
    
    @Override
    public String toString() {
        return "Code: " + this.code + "\t Name: " + this.name + " Price: R" + this.price + "\t Quantity On Hand: " + this.qtyOnHand; 
    }
    
    
}
