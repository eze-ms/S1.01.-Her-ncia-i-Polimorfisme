package instrumentos.modelo.string;

import instrumentos.modelo.Instrument;

public class Cello extends Instrument {

    // Constructor
    public Cello(String name, Double price) {
        super(name, price);
    }

    @Override
    public void tocar() {
        System.out.println("Està sonant un instrument de corda");
    }
}
