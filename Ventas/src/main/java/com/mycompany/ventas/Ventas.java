package com.mycompany.ventas;

/**
 *
 * @author minjinmin
 */
public class Ventas {

    public static void main(String[] args) {
        Venta v = new Venta();
        v.poblar();
        v.imprimirTabla();
        System.out.println("Promedio total: " + v.promedio());
        float[] promedios = v.PromedioAnual();

        for (int i = 0; i < promedios.length; i++) {
            System.out.println("Ano" + i + "=" + promedios[i]);
        }

        int[] peorAnioPorMes = v.PeroesMeses();
        for (int mes = 0; mes < peorAnioPorMes.length; mes++) {
            System.out.println("Mes " + (mes + 1) + ": Peor año = " + peorAnioPorMes[mes]);
        }
    }
}
