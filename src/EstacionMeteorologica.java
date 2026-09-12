import java.util.ArrayList;
import java.util.List;

public class EstacionMeteorologica {
    String ubicacion;
    List<Sensor> sensores;

    public  EstacionMeteorologica(String ubicacion){
        this.ubicacion = ubicacion;
        this.sensores = new ArrayList<>();
    }

public void agregarSensor(Sensor sensor){
        this.sensores.add(sensor);
}

public void reporteClimatico(){
        System.out.println("Estacion meteorológica: " + this.ubicacion);
        for(Sensor sensor: sensores){
            System.out.println("Sensor de " + sensor.getTipo() + ":" + sensor.obtenerLectura());
        }
}

}
