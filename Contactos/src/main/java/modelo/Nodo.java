package modelo;

public class Nodo {

    private String nombre;
    private long numero;
    private Nodo siguiente;

    public Nodo(String nombre, long numero) {
        this.nombre = nombre;
        this.numero = numero;
        this.siguiente = null;
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

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}