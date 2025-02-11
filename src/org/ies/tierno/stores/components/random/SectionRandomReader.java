package org.ies.tierno.stores.components.random;

import org.ies.tierno.stores.components.reader.Reader;
import org.ies.tierno.stores.models.Product;
import org.ies.tierno.stores.models.Section;

import java.util.Random;

public class SectionRandomReader<T extends Product> implements Reader<Section<T>> {
    private final static String[] ADDRESSES ={
            "Calle Falsa 1",
            "Calle Falsa 2",
            "Calle Falsa 3",
            "Calle Falsa 4",
            "Calle Falsa 5"
    };
    private final Random random;
    private final Reader<T> productReader;

    public SectionRandomReader(Random random, Reader<T> productReader) {
        this.random = random;
        this.productReader = productReader;
    }

    @Override
    public Section<T> read() {
        T[] products = (T[]) new Product[random.nextInt(10)];

        for (int i = 0; i < products.length; i++) {
            products[i] = productReader.read();;
        }
        return new Section<>(
                random.nextInt(10),
                ADDRESSES[random.nextInt(ADDRESSES.length)],
                products
        );
    }
}
