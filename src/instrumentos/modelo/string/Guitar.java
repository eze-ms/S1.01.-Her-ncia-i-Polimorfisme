package instrumentos.modelo.string;

import instrumentos.modelo.Instrument;

public class Guitar extends Instrument {

    // Constructor
    public Guitar(String name, Double price) {
        super(name, price);
    }

    @Override
    public void tocar() {
        System.out.println("Està sonant un instrument de corda");
    }
}
