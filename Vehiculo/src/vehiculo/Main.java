/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehiculo;

/**
 *
 * @author juaan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo();
        System.out.println(vehiculo1.conocerMarcha());
        
        vehiculo1.subirCambio();
        System.out.println(vehiculo1.conocerMarcha());
        System.out.println("La valocidad es de " + vehiculo1.getVelocidad() + " km/h");

        

        
    }
    
}
