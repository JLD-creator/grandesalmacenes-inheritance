package org.ies.tierno.stores.models;

import java.util.Objects;

public class ProductRop  extends Product{
    public String type;
    public String talla;
    public String marca;

    public ProductRop(int idProduct, double price, int unit, String type, String talla, String Marca) {
        super(idProduct, price, unit);
        this.type = type;
        this.talla = talla;
        this.marca = Marca;
    }

    @Override
    public void info() {
        System.out.println("Este producro tiene id: "+idProduct+" tiene un precio de "+price+" € y tiene "+unit+" unidades y es del tipo "+type+" de la talla "+ talla +" y marca "+ marca);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ProductRop that = (ProductRop) o;
        return Objects.equals(type, that.type) && Objects.equals(talla, that.talla) && Objects.equals(marca, that.marca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type, talla, marca);
    }

    @Override
    public String toString() {
        return "ProductRop{" +
                "type='" + type + '\'' +
                ", productName='" + talla + '\'' +
                ", fabricante='" + marca + '\'' +
                ", idProduct=" + idProduct +
                ", price=" + price +
                ", unit=" + unit +
                '}';
    }
}
