/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen_u1_u2;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Examen_U1_U2
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        Scanner lectura = new Scanner (System.in);
        Scanner lectura2 = new Scanner(System.in);
        Scanner lectura3 = new Scanner(System.in);
        System.out.println("Escribe el nombre del primer instrumento:");
        String nombre = lectura.nextLine();
        System.out.println("Digite el precio:");
        double precio = lectura.nextDouble();
        
        System.out.println("Escribe el nombre del segundo instrumento:");
        String nombre2 = lectura2.nextLine();
        System.out.println("Digite el precio: ");
        double precio2 = lectura2.nextDouble();
        
        System.out.println("Escribe el nombre del tercer instrumento:");
        String nombre3 = lectura3.nextLine();
        System.out.println("Digite el precio: ");
        double precio3 = lectura3.nextDouble();

        double instrumento1 = 1250.45;
        double instrumento2 = 3743.00;
        double instrumento3 = 2683.78;
        
        double ganancia1 = instrumento1-precio;
        double ganancia2 = instrumento2-precio2;
        double ganancia3 = instrumento3-precio3;
        
        System.out.println("************************************************************************");
        System.out.println("El porcentaje de ganancia de " + nombre + "es " + (ganancia1/precio) * 100);
        System.out.println("El porcentaje de ganancia de " + nombre2 + "es " + (ganancia2/precio2) * 100);
        System.out.println("El porcentaje de ganancia de " + nombre3 + "es " + (ganancia3/precio3) * 100);
        System.out.println("************************************************************************");
        
        lectura.close();
        lectura2.close();
        lectura3.close();

        

        
        
       

        

        
        
         
    }
    
}
