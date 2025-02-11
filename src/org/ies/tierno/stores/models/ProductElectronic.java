package org.ies.tierno.stores.models;

import java.util.Objects;

public class ProductElectronic  extends Product{
    public String type;
    public String modelName;
    public String fabricante;

    public ProductElectronic(int idProduct, double price, int unit, String type, String modelName, String fabricante) {
        super(idProduct, price, unit);
        this.type = type;
        this.modelName = modelName;
        this.fabricante = fabricante;
    }

    @Override
    public void info() {
        System.out.println("Este producto tiene el id: "+idProduct+ " un precio de "+price+" € y tiene "+unit+" unidades, es el del tipo "+type+" es del modelo "+ modelName + " y del fabricante "+ fabricante);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public boolean equals(Object o) {

        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ProductElectronic that = (ProductElectronic) o;
        return Objects.equals(type, that.type) && Objects.equals(modelName, that.modelName) && Objects.equals(fabricante, that.fabricante);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type, modelName, fabricante);
    }

    @Override
    public String toString() {
        return "ProductElectronic{" +
                "type='" + type + '\'' +
                ", talla='" + modelName + '\'' +
                ", marca='" + fabricante + '\'' +
                ", idProduct=" + idProduct +
                ", price=" + price +
                ", unit=" + unit +
                '}';
    }
}
