package instrumentos.modelo.percusion;

import instrumentos.modelo.Instrument;

public class Xylophone extends Instrument {

    // Constructor
    public Xylophone(String name, Double price) {
        super(name, price);
    }

    @Override
    public void tocar() {
        System.out.println("Està sonant un instrument de percusión");
    }

}
