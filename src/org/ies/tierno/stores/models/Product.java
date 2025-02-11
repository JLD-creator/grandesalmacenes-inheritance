package org.ies.tierno.stores.models;

import java.util.Objects;

public abstract class Product {
    protected int idProduct;
    protected double price;
    protected int unit;

    public Product(int idProduct, double price, int unit) {
        this.idProduct = idProduct;
        this.price = price;
        this.unit = unit;
    }
    public abstract void info();

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return idProduct == product.idProduct && Double.compare(price, product.price) == 0 && unit == product.unit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProduct, price, unit);
    }
}
