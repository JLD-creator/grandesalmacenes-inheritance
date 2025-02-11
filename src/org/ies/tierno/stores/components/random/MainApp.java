package org.ies.tierno.stores.components.random;

import org.ies.tierno.stores.components.reader.Reader;
import org.ies.tierno.stores.models.BigAlmacenes;

public class MainApp {
    private final Reader<BigAlmacenes> storeReader;

    public MainApp(Reader<BigAlmacenes> storeReader) {
        this.storeReader = storeReader;
    }
    public void run(){
        var store = storeReader.read();

    }
}
