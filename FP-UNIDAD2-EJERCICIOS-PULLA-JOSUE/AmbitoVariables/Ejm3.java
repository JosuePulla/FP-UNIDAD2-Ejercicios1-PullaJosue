package AmbitoVariables;

//Sesión: S11 - Ámbito de las variables
//Ejercicio 03: Traza del contador static
//Enunciado: Programa que utiliza una variable static y tabla de traza (línea | variables vivas | valor) en comentario.
//Autor: Pulla Josue
//Fecha: 17/11/2026

public class Ejm3 {

    static int contador = 0; // Línea 9

    public static void registrarEvento(int incremento) { // Línea 11
        int local = incremento * 2; // Línea 12
        contador += local; // Línea 13
    } // Línea 14

    public static void main(String[] args) { // Línea 16
        int paso = 1; // Línea 17
        registrarEvento(paso); // Línea 18
        paso = 3; // Línea 19
        registrarEvento(paso); // Línea 20
        System.out.println("Contador final: " + contador); // Línea 21
    } // Línea 22
}

/*
 * TABLA DE TRAZA DE MEMORIA:
 * -----------------------------------------------------------------------------------------
 * Línea | Variables vivas                         | Valor
 * -----------------------------------------------------------------------------------------
 *   9   | contador                                | contador = 0
 *  17   | contador, paso                          | contador = 0, paso = 1
 *  18   | contador, paso                          | Llama a registrarEvento(1)
 *  11   | contador, paso, incremento              | contador = 0, paso = 1, incremento = 1
 *  12   | contador, paso, incremento, local       | contador = 0, paso = 1, incremento = 1, local = 2
 *  13   | contador, paso, incremento, local       | contador = 2, paso = 1, incremento = 1, local = 2
 *  14   | contador, paso                          | contador = 2, paso = 1 (mueren incremento y local)
 *  19   | contador, paso                          | contador = 2, paso = 3
 *  20   | contador, paso                          | Llama a registrarEvento(3)
 *  11   | contador, paso, incremento              | contador = 2, paso = 3, incremento = 3
 *  12   | contador, paso, incremento, local       | contador = 2, paso = 3, incremento = 3, local = 6
 *  13   | contador, paso, incremento, local       | contador = 8, paso = 3, incremento = 3, local = 6
 *  14   | contador, paso                          | contador = 8, paso = 3 (mueren incremento y local)
 *  21   | contador, paso                          | Imprime "Contador final: 8"
 *  22   | (ninguna)                               | Finaliza el programa y se libera memoria
 * -----------------------------------------------------------------------------------------
 */