package java2_11;

public class item {
    private int id,product_id,qty;
    private float price,discount;
    public item(int product_id, int qty, float price ){
        this.product_id = product_id;
        this.qty = qty;
        this.price = price;
    }
    public item(int product_id, int qty, float price,float discount ){
        this.product_id = product_id;
        this.qty = qty;
        this.price = price;
        this.discount=discount;
    }

    public int getProduct_id() {
        return product_id;
    }

    public int getQty() {
        return qty;
    }

    public float getPrice() {
        return price;
    }

    public float getDiscount() {
        return discount;
    }

    @Override
    public String toString() {
        return "item{" +
                "id=" + id +
                ", product_id=" + product_id +
                ", qty=" + qty +
                ", price=" + price +
                ", discount=" + discount +
                '}';
    }
}

