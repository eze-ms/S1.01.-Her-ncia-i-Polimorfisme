package instrumentos.modelo.wind;

import instrumentos.modelo.Instrument;

public class Trumpet extends Instrument {

    // Constructor
    public Trumpet(String name, Double price) {
        super(name, price);
    }

    @Override
    public void tocar() {
        System.out.println("Està sonant un instrument de vent");
    }
}
