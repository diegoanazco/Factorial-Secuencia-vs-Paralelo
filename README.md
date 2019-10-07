# Factorial Recursivo: Secuencial vs Paralelo 

El siguiente proyecto consiste en comparar los tiempos de la programación secuencial vs la programación paralela. 
Utilizamos el algoritmo para hallar el factorial de un número de manera recursiva, primero de manera secuencial, y posteriomente de manera paralela haciendo uso de hilos (Threads).

### Main1 (Secuencial) 🚀

Dado un número ingresado en el código fuente, devuelve su factorial.

### Main2 (Secuencial) 🚀

Genera un número aleatorio como entrada, devuelve el factorial de dicho número.

### Main3 (Secuencial) 🚀

Genera un rango de números (este rango aleatorio) y dentro de este rango halla el factorial de un número al azar.

### Main4 (Secuencial) 🚀

Genera un rango de números (este rango aleatorio) y dentro de este rango halla el factorial de un número al azar.
Retorna el tiempo que ha demorado en hallar todos los factoriales de dicho rango.

### Main5 (Secuencial) 🚀

Dado un número ingreso en el código fuente, generará arrays de forma ascendente hasta llegar al número. Por ejemplo: 
```
  Num = 10;
  Primera iteración:
    1 -> 1
  Segunda iteración:
    1 -> 1
    2 -> 2
  Tercera iteración: 
    1 -> 1
    2 -> 2
    3 -> 6
    .
    .
    .
  Decima iteraación:
    1 -> 1
    2 -> 2
    3 -> 6
    
    .
    .
    .
    
    10 -> 3628800
```
Posteriormente guarda el tiempo de cada iteración que se hizo en un archivo de texto (.txt)

Finalmente genera un ejecutable .plot, para ver los tiempos en un diagrama de lineas.

### Main6 (Paralelo) 🚀

Siguiento la misma lógica del anterior main, ahora se crea un Main6 pero con hilos. 
Este Main6 tiene como métodos principales el Run (donde se halla el factorial) y el Time(retorna el tiempo).

### Simulación (Paralelo) 🚀

- Es la simulación del Main6 ya usando Threads, se crea un array de Main6 para poder crear un hilo por cada iteración.
- Se inicializan los arrays. 
- Se inicializan los hilos.
- Se guarda el tiempo de cada iteración que s ehizo en un archivo de texto (.txt)
- Finalmente genera un ejecutable .plot, para ver los tiempos en un diagrama de lineas.


## Autores

* **Diego Joseph Añazco Bolívar** -> Alumno de la Universidad La Salle - Arequipa  
* **Richard Escobedo** -> Docente de la Universidad La Salle - Arequipa  
