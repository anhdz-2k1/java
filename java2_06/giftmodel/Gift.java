package giftmodel;

public class Gift {
    private String id,name;
    private float price,qty;
    public Gift(String id, String name){
        this.id = id;
        this.name = name;
    }
    public Gift(String id, String name, float price, float qty){
        this.id = id;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }
    public Gift( String name, float price, float qty){
        this.id = id;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }
    public Gift(String id){
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }
    public float getPrice() {
        return price;
    }
    public float getQty() {
        return qty;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public void setQty(float qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Gift{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }
}
