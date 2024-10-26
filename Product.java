package cse213.midautumn;

import java.time.LocalDate;

public class Product {
    private String name;
    private int id;
    private String material;
    private int quantity;
    private LocalDate delivery;

    public Product(String name, String material, int quantity, int id) {
        this.name = name;
        this.id = this.id;
        this.material = this.material;
        this.quantity = this.quantity;
        this.delivery = delivery;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDate getDelivery() {
        return delivery;
    }

    public void setDelivery(LocalDate delivery) {
        this.delivery = delivery;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", material='" + material + '\'' +
                ", quantity=" + quantity +
                ", delivery=" + delivery +
                '}';
    }
}
