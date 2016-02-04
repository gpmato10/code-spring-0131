package org.zerock.domain;

/**
 * Created by dw on 2016. 2. 4..
 */
public class ProductVo {
    private String name;
    private double price;

    public ProductVo(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "ProductVo{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
