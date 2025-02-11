package org.ies.tierno.stores.components.random;

import org.ies.tierno.stores.components.reader.Reader;
import org.ies.tierno.stores.models.ProductElectronic;

import java.util.Random;

public class ProductElectronicRandomReader implements Reader<ProductElectronic> {
    private final static String[] TYPE ={
      "ordenador", "televisor", " teclado", "raton", "Playstation"
    };
    private final static String[] FABRICANTE ={
      "intel", "sony", "LG", "Samsung", "Ryzen"
    };
    private final static String[] MODEL ={
            "PS5", "intel-5", "Ryzen-7"
    };
    private final Random random;

    public ProductElectronicRandomReader(Random random) {
        this.random = random;
    }

    @Override
    public ProductElectronic read() {
        int idProduct = random.nextInt(100);
        double price = random.nextDouble(1000000);
        int unit = random.nextInt(1000);
        String type = TYPE[random.nextInt(TYPE.length)];
        String fabricante = FABRICANTE[random.nextInt(FABRICANTE.length)];
        String model = MODEL[random.nextInt(MODEL.length)];

        return new ProductElectronic(idProduct,price,unit,type,model,fabricante);
    }
}
