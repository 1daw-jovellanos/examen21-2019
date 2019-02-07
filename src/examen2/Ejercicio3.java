package examen2;

public class Ejercicio3 {

    static int obtenerTasacionPlantacion(int[][] plantacion) {
        int [] valor = {11, 27, 50};
        int suma = 0;
        for (int i = 0; i < plantacion.length; i++) {
            for (int j = 0; j < plantacion[i].length; j++) {
                suma += valor[plantacion[i][j]];
            }
        }
        return suma;
    }
    
    /**
     * Tus pruebas aquí
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
