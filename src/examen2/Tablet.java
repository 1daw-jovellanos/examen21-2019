package examen2;

import java.time.LocalDate;

/**
 * Clase Tablet para el examen
 * @author victor
 * @version Feb/2019
 */
public class Tablet {
    
    private String marca;
    private String modelo;
    private LocalDate fechaCompra;
    private String descripcionAveria;
    private double horas;
    private static double precioHora;   
    
    public static double getPrecioHora() {
        return precioHora;
    }

    public static void setPrecioHora(double aPrecioHora) {
        precioHora = aPrecioHora;
    }

    static {
        precioHora = 45;
    }
    
    public Tablet(String marca, String modelo, LocalDate fechaCompra, String descripcionAveria) {
        this.marca = marca;
        this.modelo = modelo;
        this.fechaCompra = fechaCompra;
        this.descripcionAveria = descripcionAveria;
        this.horas = 0.25;
    }
    /**
     * Devuelve el modelo
     * @return el modelo, como cadena
     */
    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public String getDescripcionAveria() {
        return descripcionAveria;
    }

    public double getHoras() {
        return horas;
    }
    
    /**
     * Establece las horas empleadas en la reparación
     * @param horas Horas empleadas
     */
    public void setHoras(double horas) {
        this.horas = horas;
    }
    
    public int calcularPrecioReparacion() {
        return (int) Math.ceil(horas * precioHora);
    }
    
}
