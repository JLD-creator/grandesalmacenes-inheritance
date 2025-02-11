package org.ies.tierno.stores.components.random;

import org.ies.tierno.stores.components.reader.Reader;
import org.ies.tierno.stores.models.Product;
import org.ies.tierno.stores.models.ProductElectronic;
import org.ies.tierno.stores.models.ProductRop;

import java.util.Random;

public class ProductRandomReader implements Reader<Product> {
    private final Random random;
    private final Reader<ProductElectronic> productElectronicReader;
    private final Reader<ProductRop> productRopReader;

    public ProductRandomReader(Random random, Reader<ProductElectronic> productElectronicReader, Reader<ProductRop> productRopReader) {
        this.random = random;
        this.productElectronicReader = productElectronicReader;
        this.productRopReader = productRopReader;
    }

    @Override
    public Product read() {
        int type = random.nextInt(2);
        if (type == 0){
            return productElectronicReader.read();
        }else {
            return productRopReader.read();
        }
    }
}
