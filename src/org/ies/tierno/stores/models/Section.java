package org.ies.tierno.stores.models;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Section<T extends Product> {
    public  int floor;
    public String managerName;
    public T[] products;

    public Section(int floor, String managerName, T[] products) {
        this.floor = floor;
        this.managerName = managerName;
        this.products = products;
    }
    public void showElectronicProducts() {
        for(T product: products) {
            if(product instanceof ProductElectronic) {
                product.info();
            }
        }
    }
    public void showClothesProducts() {
        for(T product: products) {
            if(product instanceof ProductRop) {
                product.info();
            }
        }
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public T[] getProducts() {
        return products;
    }

    public void setProducts(T[] products) {
        this.products = products;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Section<?> section = (Section<?>) o;
        return floor == section.floor && Objects.equals(managerName, section.managerName) && Objects.deepEquals(products, section.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(floor, managerName, Arrays.hashCode(products));
    }

    @Override
    public String toString() {
        return "Section{" +
                "floor=" + floor +
                ", managerName='" + managerName + '\'' +
                ", products=" + Arrays.toString(products) +
                '}';
    }
}
