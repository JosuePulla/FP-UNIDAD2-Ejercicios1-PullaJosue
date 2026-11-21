package AmbitoVariables;

//Sesión: S11 - Ámbito de las variables
//Ejercicio 04: Reescribir sin static
//Enunciado: Incluir la versión original con variables static comentada y la nueva versión usando parámetros y return.
//Autor: Pulla Josue
//Fecha: 17/11/2026

public class Ejm4 {

    /*
     * --- VERSIÓN ORIGINAL CON VARIABLES STATIC ---
     *
     * static double saldo = 100.0;
     *
     * public static void depositar(double monto) {
     *     saldo += monto;
     * }
     *
     * public static void retirar(double monto) {
     *     if (monto <= saldo) {
     *         saldo -= monto;
     *     }
     * }
     *
     * public static void main(String[] args) {
     *     depositar(50.0);
     *     retirar(30.0);
     *     System.out.println("Saldo final: " + saldo);
     * }
     */

    // --- NUEVA VERSIÓN SIN VARIABLES DE CLASE STATIC (USANDO PARÁMETROS Y RETURN) ---
    public static double depositar(double saldoActual, double monto) {
        return saldoActual + monto;
    }

    public static double retirar(double saldoActual, double monto) {
        if (monto <= saldoActual) {
            return saldoActual - monto;
        }
        System.out.println("Fondos insuficientes para retirar $" + monto);
        return saldoActual;
    }

    public static void main(String[] args) {
        double saldo = 100.0;

        saldo = depositar(saldo, 50.0);
        saldo = retirar(saldo, 30.0);

        System.out.println("Saldo final (sin estado static): $" + saldo);
    }
}
