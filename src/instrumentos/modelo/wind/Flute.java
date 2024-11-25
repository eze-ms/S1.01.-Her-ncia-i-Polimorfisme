package instrumentos.modelo.wind;

import instrumentos.modelo.Instrument;

public class Flute extends Instrument {

    // Constructor
    public Flute(String name, Double price) {
        super(name, price);
    }

    @Override
    public void tocar() {
        System.out.println("Està sonant un instrument de vent");
    }
}
