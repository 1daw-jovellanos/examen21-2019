package examen2;

public class Ejercicio4 {

    public static boolean hayExterior(String[] paradas) {
        if (paradas == null) {
            throw new IllegalArgumentException();
        }        
        boolean encontrado = false;
        int i = 0;
        int cuenta = 0;
        while (!encontrado && i < paradas.length) {
            if (paradas[i].toUpperCase().contains("IVELANY")) {
                cuenta++;
            }
            if (cuenta == 2) {
                encontrado = true;
            } else {
                i++;
            }
        }
        return encontrado;
    }

    /**
     * Tus pruebas aquí
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

}
