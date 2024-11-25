package instrumentos.modelo;

public abstract class Instrument {
    private final String name;
    private final Double price;

    // Bloque estático
    static {
        System.out.println("Clase Instrument cargada en memoria.");
    }

    // Miembro estático
    public static final String CATEGORY = "Instrumento musical";

    public Instrument(String name, Double price) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo o vacío.");
        }
        if (price == null || price <= 0) {
            throw new IllegalArgumentException("El precio debe ser mayor que 0.");
        }

        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public abstract void tocar();

    @Override
    public String toString() {
        return String.format("Instrumento: %s | Precio: %.2f€", name, price);
    }
}
