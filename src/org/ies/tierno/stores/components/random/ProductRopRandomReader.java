package org.ies.tierno.stores.components.random;

import org.ies.tierno.stores.components.reader.Reader;
import org.ies.tierno.stores.models.ProductRop;

import java.util.Random;

public class ProductRopRandomReader  implements Reader<ProductRop> {
    private final Random random;
    private final static String[] TYPE ={
            "Pantalon", "Jersey", "camiseta"
    };
    private final static String[] TALLA ={
            "L", "M", "XL"
    };
    private final static String[] MARCA ={
            "Nike", "Adidas"
    };


    public ProductRopRandomReader(Random random) {
        this.random = random;
    }

    @Override
    public ProductRop read() {
        int idProduct = random.nextInt(100);
        double price = random.nextDouble(1000000);
        int unit = random.nextInt(1000);
        String type = TYPE[random.nextInt(TYPE.length)];
        String talla = TALLA[random.nextInt(TALLA.length)];
        String marca = MARCA[random.nextInt(MARCA.length)];
        return new ProductRop(idProduct,price,unit,type,talla,marca);
    }
}
