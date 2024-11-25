package instrumentos.modelo.percusion;

import instrumentos.modelo.Instrument;

public class Drums extends Instrument {

    // Constructor
    public Drums(String name, Double price) {
        super(name, price);
    }

    @Override
    public void tocar() {
        System.out.println("Està sonant un instrument de percusión");
    }
}
