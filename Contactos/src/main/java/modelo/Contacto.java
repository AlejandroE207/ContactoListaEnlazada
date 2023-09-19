/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class Contacto {

    String nombre;
    long numero;

    public Contacto(String nombre, long numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

    public Contacto() {
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    ArrayList<Contacto> agenda = new ArrayList<Contacto>();

    public void agregarContacto() {
        String nomb = JOptionPane.showInputDialog(null, "Digite el nombre a agregar: ");
        long num = Long.parseLong(JOptionPane.showInputDialog(null, "Digite el numero del contacto: "));
        Contacto cont = new Contacto(nomb, num);
        agenda.add(cont);
    }

    public void buscarCont() {
        String nomb = JOptionPane.showInputDialog(null, "Digite nombre del contacto a buscar: ");
        Iterator it = agenda.iterator();
        if(agenda.size()==0){
            JOptionPane.showMessageDialog(null, "NO HAY CONTACTOS");
        }
        while (it.hasNext()) {
            Object objeto = it.next();
            Contacto contac = (Contacto) objeto;
            if ((contac.getNombre()).equals(nomb)) {
                JOptionPane.showMessageDialog(null, "\tCONTACTO\t\nNombre: " + contac.getNombre() + "\nNumero: " + contac.getNumero());
            }
        }
    }

    public void imprimir() {
        Iterator it = agenda.iterator();
        if(agenda.size()==0){
            JOptionPane.showMessageDialog(null, "NO HAY CONTACTOS");
        }
        while (it.hasNext()) {
            Object produc = it.next();
            Contacto pro = (Contacto) produc;
            JOptionPane.showMessageDialog(null,"\tAgenda\t\nNombre: " + pro.getNombre() + "\nNumero: " + pro.getNumero());
        }
    }
}
