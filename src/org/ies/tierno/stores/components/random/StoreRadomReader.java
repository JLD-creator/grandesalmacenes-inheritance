package org.ies.tierno.stores.components.random;

import org.ies.tierno.stores.components.reader.Reader;
import org.ies.tierno.stores.models.*;

import java.util.Random;

public class StoreRadomReader implements Reader<BigAlmacenes> {
    private final static String[] NAMES = {
            "El Corte Inglés", "Mercadona", "Carrefour", "Fnac", "Eroski"
    };

    private final static String[] ADDRESSES = {
            "Calle Falsa 1",
            "Calle Falsa 2",
            "Calle Falsa 3",
            "Calle Falsa 4",
            "Calle Falsa 5",
            "Calle Falsa 6",
            "Calle Falsa 7",
            "Calle Falsa 8"
    };

    private final Random random;
    private final Reader<Section<Product>> generalSectionReader;
    private final Reader<Section<ProductRop>> ropSectionReader;
    private final Reader<Section<ProductElectronic>> ElectronicSectionReader;

    public StoreRadomReader(Random random, Reader<Section<Product>> generalSectionReader, Reader<Section<ProductRop>> ropSectionReader, Reader<Section<ProductElectronic>> electronicSectionReader) {
        this.random = random;
        this.generalSectionReader = generalSectionReader;
        this.ropSectionReader = ropSectionReader;
        ElectronicSectionReader = electronicSectionReader;
    }

    @Override
    public BigAlmacenes read() {
        return new BigAlmacenes(
                NAMES[random.nextInt(NAMES.length)],
                ADDRESSES[random.nextInt(ADDRESSES.length)],
                generalSectionReader.read(),
                ElectronicSectionReader.read(),
                ropSectionReader.read()
        );

    }
}
