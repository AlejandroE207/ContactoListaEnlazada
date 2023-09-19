/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vista;
import java.util.Scanner;
import javax.swing.JOptionPane;
import modelo.*;
/**
 *
 * @author USUARIO
 */
public class Contactos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc;
            Agenda agenda = new Agenda();
            String nomb;
            long num;
        do{
            System.out.println("\nMENU\n1. Agregar Contacto\n2. Buscar Contacto\n3. Mostrar agenda\n4.Eliminar\n5. Salir\n");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    System.out.print("Digite el nombre: ");
                    nomb = sc.next();
                    System.out.print("Digite el numero: ");
                    num = sc.nextLong();
                    agenda.agregarContacto(nomb,num);
                    break;

                case 2:
                    System.out.print("Digite el nombre: ");
                    nomb = sc.next();
                    agenda.buscarContacto(nomb);
                    break;

                case 3:
                    agenda.imprimir();
                    break;   
                case 4:
                    System.out.print("Digite el nombre: ");
                    nomb = sc.next();
                    agenda.eliminarContacto(nomb);
                    break;
            }
            
        }
        while(opc!=5);
        
        
        
    }
}
