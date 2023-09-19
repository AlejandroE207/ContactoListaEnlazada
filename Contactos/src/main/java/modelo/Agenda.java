package modelo;

import modelo.Nodo;

public class Agenda {

    private Nodo inicio;
    private Nodo fin;

    public Agenda() {
        this.inicio = null;
        this.fin = null;
    }

    public void agregarContacto(String nombre, long numero) {
        Nodo nuevoNodo = new Nodo(nombre, numero);
        if (inicio == null) {
            inicio = nuevoNodo;
        } else {
            Nodo nodoActual = inicio;
            while (nodoActual.getSiguiente() != null) {
                nodoActual = nodoActual.getSiguiente();
            }
            nodoActual.setSiguiente(nuevoNodo);
        }
    }

    public void agregarAlFinal(String nombre, long numero) {
        Nodo nuevoNodo = new Nodo(nombre, numero);
        if (!estaVacia()) {
            inicio = nuevoNodo;
        } else {
            fin = nuevoNodo;
        }
    }

    public void buscarContacto(String nombre) {
        if (inicio == null) {
            System.out.println("No hay contactos");
        } else {
            Nodo nodoActual = inicio;
            while (nodoActual != null) {
                if (nodoActual.getNombre().equals(nombre)) {
                    System.out.println("Nombre: " + nodoActual.getNombre() + ", Número: " + nodoActual.getNumero());
                    break;
                }
                nodoActual = nodoActual.getSiguiente();
            }
            if (nodoActual == null) {
                System.out.println("No se encontró el contacto");
            }
        }
    }

    public void imprimir() {
        if (inicio == null) {
            System.out.println("No hay contactos");
        } else {
            Nodo nodoActual = inicio;
            while (nodoActual != null) {
                System.out.println("Nombre: " + nodoActual.getNombre() + ", Número: " + nodoActual.getNumero());
                nodoActual = nodoActual.getSiguiente();
            }
        }
    }

    public boolean estaVacia() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public void eliminarContacto(String nombre) {
        if (inicio == null) {
            System.out.println("La agenda está vacía");
            return;
        }

        Nodo nodoActual = inicio;
        Nodo nodoAnterior = null;

        while (nodoActual != null) {
            if (nodoActual.getNombre().equals(nombre)) {
                break;
            }

            nodoAnterior = nodoActual;
            nodoActual = nodoActual.getSiguiente();
        }

        if (nodoActual == null) {
            System.out.println("El contacto no se encuentra en la agenda");
            return;
        }

        if (nodoAnterior == null) {
            inicio = nodoActual.getSiguiente();
        } else {
            nodoAnterior.setSiguiente(nodoActual.getSiguiente());
        }

        nodoActual = null;
    }

}


