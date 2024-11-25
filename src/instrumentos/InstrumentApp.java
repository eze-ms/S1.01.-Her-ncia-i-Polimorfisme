package instrumentos;

import instrumentos.modelo.Instrument;
import instrumentos.modelo.percusion.Drums;
import instrumentos.modelo.percusion.Tambourine;
import instrumentos.modelo.percusion.Xylophone;
import instrumentos.modelo.string.Cello;
import instrumentos.modelo.string.Guitar;
import instrumentos.modelo.string.Violin;
import instrumentos.modelo.wind.Flute;
import instrumentos.modelo.wind.Saxophone;
import instrumentos.modelo.wind.Trumpet;

public class InstrumentApp {
    public static void main(String[] args) {
        System.out.println("Inicio del programa.");

        // Acceder al miembro estático (sin crear instancias)
        System.out.println("Categoría de instrumentos: " + Instrument.CATEGORY);

        // Crear instrumentos de viento
        Flute flute = new Flute("Flute", 130.0);
        Saxophone saxophone = new Saxophone("Saxophone", 150.0);
        Trumpet trumpet = new Trumpet("Trumpet", 90.0);

        // Llamar al metodo tocar()
        flute.tocar();
        saxophone.tocar();
        trumpet.tocar();


        // Crear instrumentos de cuerda
        Guitar guitar = new Guitar("Guitar", 300.0);
        Violin violin = new Violin("Violin", 400.0);
        Cello cello = new Cello("Cello", 250.0);

        // Llamar al metodo tocar()
        guitar.tocar();
        violin.tocar();
        cello.tocar();

        // Crear instrumentos de percusión
        Drums drums = new Drums("Drums", 500.0);
        Xylophone xylophone = new Xylophone("Xylophone", 200.0);
        Tambourine tambourine = new Tambourine("Tambourine", 400.0);

        // Llamar al metodo tocar()
        drums.tocar();
        xylophone.tocar();
        tambourine.tocar();

        System.out.println("Fin del programa.");

        // Imprimir detalles de los instrumentos
        System.out.println("\nDetalles de los instrumentos de viento:");
        System.out.println(flute);
        System.out.println(saxophone);
        System.out.println(trumpet);

        System.out.println("\nDetalles de los instrumentos de cuerda:");
        System.out.println(guitar);
        System.out.println(violin);
        System.out.println(cello);

        System.out.println("\nDetalles de los instrumentos de percusión:");
        System.out.println(drums);
        System.out.println(xylophone);
        System.out.println(tambourine);
    }
}
