package org.ies.tierno.stores.models;

import java.util.Objects;

public class BigAlmacenes {
    public String name;
    public String direction;
    public Section<Product> productSection;
    public Section<ProductElectronic> productElectronicSection;
    public Section<ProductRop> productRopSection;

    public BigAlmacenes(String name, String direction, Section<Product> productSection, Section<ProductElectronic> productElectronicSection, Section<ProductRop> productRopSection) {
        this.name = name;
        this.direction = direction;
        this.productSection = productSection;
        this.productElectronicSection = productElectronicSection;
        this.productRopSection = productRopSection;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public Section<Product> getProductSection() {
        return productSection;
    }

    public void setProductSection(Section<Product> productSection) {
        this.productSection = productSection;
    }

    public Section<ProductElectronic> getProductElectronicSection() {
        return productElectronicSection;
    }

    public void setProductElectronicSection(Section<ProductElectronic> productElectronicSection) {
        this.productElectronicSection = productElectronicSection;
    }

    public Section<ProductRop> getProductRopSection() {
        return productRopSection;
    }

    public void setProductRopSection(Section<ProductRop> productRopSection) {
        this.productRopSection = productRopSection;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BigAlmacenes that = (BigAlmacenes) o;
        return Objects.equals(name, that.name) && Objects.equals(direction, that.direction) && Objects.equals(productSection, that.productSection) && Objects.equals(productElectronicSection, that.productElectronicSection) && Objects.equals(productRopSection, that.productRopSection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, direction, productSection, productElectronicSection, productRopSection);
    }

    @Override
    public String toString() {
        return "BigAlmacenes{" +
                "name='" + name + '\'' +
                ", direction='" + direction + '\'' +
                ", productSection=" + productSection +
                ", productElectronicSection=" + productElectronicSection +
                ", productRopSection=" + productRopSection +
                '}';
    }
}
