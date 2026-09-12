//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
EstacionMeteorologica estacion = new EstacionMeteorologica("San Martin");

Sensor sensorTemp = new Sensor("Temperatura");
Sensor sensorHum = new Sensor("Humedad");
Sensor sensorPresion = new Sensor("Presion");

estacion.agregarSensor(sensorTemp);
estacion.agregarSensor(sensorHum);
estacion.agregarSensor(sensorPresion);

estacion.reporteClimatico();

}
