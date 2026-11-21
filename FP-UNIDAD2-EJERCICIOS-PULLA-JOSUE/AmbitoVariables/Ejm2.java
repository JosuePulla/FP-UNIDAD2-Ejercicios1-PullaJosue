package AmbitoVariables;

//Sesión: S11 - Ámbito de las variables
//Ejercicio 02: Líneas que no compilan
//Enunciado: Comentar las líneas con error de ámbito, documentando el mensaje del compilador y la causa.
//Autor: Pulla Josue
//Fecha: 17/11/2026

public class Ejm2{

    static int variableClase = 100;

    public static void metodoAuxiliar() {
        int variableLocalMetodo = 50;
        System.out.println("Accediendo a clase: " + variableClase);
    }

    public static void main(String[] args) {
        int x = 10;

        if (x > 5) {
            int y = 20;
            System.out.println("Dentro del if: " + (x + y));
        }

        // ERROR 1: Uso de variable de bloque fuera de su bloque 'if'
        // System.out.println(y);
        // Mensaje del compilador: error: cannot find symbol - symbol: variable y
        // Causa: La variable 'y' fue declarada dentro del bloque if, por lo que al cerrar la llave '}' deja de existir en memoria.

        for (int i = 0; i < 3; i++) {
            int acumulador = i * 2;
        }

        // ERROR 2: Uso de variable de control de ciclo fuera del 'for'
        // System.out.println("Último valor de i: " + i);
        // Mensaje del compilador: error: cannot find symbol - symbol: variable i
        // Causa: La variable 'i' tiene ámbito limitado exclusivamente a la cabecera y cuerpo del bucle for.

        // ERROR 3: Acceso a una variable local declarada en otro método
        // System.out.println(variableLocalMetodo);
        // Mensaje del compilador: error: cannot find symbol - symbol: variable variableLocalMetodo
        // Causa: 'variableLocalMetodo' es local de metodoAuxiliar() y no es visible desde main().

        // ERROR 4: Declaración duplicada en el mismo ámbito local
        // int x = 30;
        // Mensaje del compilador: error: variable x is already defined in method main(String[])
        // Causa: No se puede declarar otra variable con el mismo identificador 'x' dentro del mismo ámbito de método.
    }
}