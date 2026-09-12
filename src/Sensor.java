import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Sensor {
    private String tipo;

    public Sensor(String tipo) {
        this.tipo = tipo;
    }
    public double obtenerLectura() {
        Random random = new Random();

        if (tipo.equalsIgnoreCase("temperatura")) {
            return 10.0 + (35.0 - 10.0) * random.nextDouble();
        } else if (tipo.equalsIgnoreCase("humedad")) {
            return 20.0 + (90.0 - 20.0) * random.nextDouble();
        } else {
            return random.nextDouble() * 100.0; // Valor genérico
        }
    }

    public String getTipo() {
        return tipo;
    }
}
