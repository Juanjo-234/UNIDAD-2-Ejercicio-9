Este programa está diseñado para modelar y gestionar la recolección de datos ambientales mediante una **estación meteorológica** y diversos **sensores** utilizando programación orientada a objetos (por ejemplo, en Java).

A continuación se detalla exactamente lo que hace cada parte del programa:

* **Define la clase `Sensor`:** Modela un dispositivo de medición conteniendo sus atributos principales: el tipo de variable que monitorea (`tipo`, como temperatura o humedad) y un método de simulación (`obtenerLectura()`) que retorna un valor numérico aleatorio dentro de un rango realista según la magnitud física que evalúa.
* **Desarrolla la clase `EstacionMeteorologica`:** Implementa el centro de control que almacena una colección de objetos `Sensor` (`List<Sensor>`), agrupando y administrando la red de monitoreo activa de la estación.
* **Genera el reporte climático (`generarReporteClimatico`):** Implementa un método dentro de la estación que recorre la colección de sensores, les envía el mensaje de lectura de forma iterativa y consolida los datos obtenidos para estructurar un informe general del estado ambiental.
* **Ejecuta la prueba (`main`):** Instancia la estación meteorológica, crea y agrega al menos tres sensores de distintos tipos (por ejemplo, temperatura, humedad y presión atmosférica), y ejecuta la generación del reporte climático imprimiendo los resultados detallados por consola.
