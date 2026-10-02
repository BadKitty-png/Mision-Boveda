/**
 * Bóveda con un arreglo interno de capacidad fija.
 */
public class BovedaArreglo<T> implements Boveda<T> {

    private final Object[] datos;
    private int cantidad;

    public BovedaArreglo(int capacidad) {
        datos = new Object[capacidad];
        cantidad = 0;
    }

    @Override
    public void guardar(T elemento) {
        if (cantidad == datos.length) {
            throw new IllegalStateException(
                "La bóveda está llena (capacidad: " + datos.length + ")");
        }
        datos[cantidad] = elemento;
        cantidad++;
    }

    @Override
    @SuppressWarnings("unchecked")
    public T sacar() {
        if (estaVacia()) {
            throw new IllegalStateException("La bóveda está vacía, no hay nada que sacar");
        }
        cantidad--;
        T elemento = (T) datos[cantidad];
        datos[cantidad] = null; // liberar la referencia
        return elemento;
    }

    @Override
    public boolean estaVacia() {
        return cantidad == 0;
    }

    @Override
    public int tamanio() {
        return cantidad;
    }
}
