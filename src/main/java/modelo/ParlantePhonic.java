package modelo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class ParlantePhonic {
    private String marca; // idealmente "PHONIC" pero aceptamos otras
    private String modelo;
    private BigDecimal precio;
    private boolean esPortatil;
    private double potenciaWatt;
    private LocalDate fechaFabricacion;

    // Constructor por defecto
    public ParlantePhonic() {
        this.marca = "PHONIC";
        this.modelo = "PH-100";
        this.precio = new BigDecimal("129.90");
        this.esPortatil = true;
        this.potenciaWatt = 20.0;
        this.fechaFabricacion = LocalDate.now().minusYears(1);
    }

    // Constructor con parámetros (usa setters)
    public ParlantePhonic(String marca, String modelo, BigDecimal precio,
                          boolean esPortatil, double potenciaWatt, LocalDate fechaFabricacion) {
        setMarca(marca);
        setModelo(modelo);
        setPrecio(precio);
        setEsPortatil(esPortatil);
        setPotenciaWatt(potenciaWatt);
        setFechaFabricacion(fechaFabricacion);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca == null || marca.trim().isEmpty()) throw new IllegalArgumentException("Marca no puede ser nula o vacía");
        this.marca = marca.trim();
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.trim().isEmpty()) throw new IllegalArgumentException("Modelo no puede ser nulo o vacío");
        this.modelo = modelo.trim();
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        if (precio == null) throw new IllegalArgumentException("Precio no puede ser nulo");
        if (precio.compareTo(BigDecimal.ZERO) <= 0 || precio.compareTo(new BigDecimal("10000")) >= 0)
            throw new IllegalArgumentException("Precio debe ser > 0 y < 10000");
        this.precio = precio;
    }

    public boolean isEsPortatil() {
        return esPortatil;
    }

    public void setEsPortatil(boolean esPortatil) {
        this.esPortatil = esPortatil;
    }

    public double getPotenciaWatt() {
        return potenciaWatt;
    }

    public void setPotenciaWatt(double potenciaWatt) {
        if (potenciaWatt <= 0 || potenciaWatt > 2000) throw new IllegalArgumentException("Potencia inválida");
        this.potenciaWatt = potenciaWatt;
    }

    public LocalDate getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(LocalDate fechaFabricacion) {
        if (fechaFabricacion == null) throw new IllegalArgumentException("fechaFabricacion no puede ser nula");
        if (fechaFabricacion.isAfter(LocalDate.now())) throw new IllegalArgumentException("fechaFabricacion no puede ser futura");
        if (fechaFabricacion.isBefore(LocalDate.of(2000,1,1))) throw new IllegalArgumentException("fechaFabricacion muy antigua (antes de 2000)");
        this.fechaFabricacion = fechaFabricacion;
    }

    @Override
    public String toString() {
        return "\n" +
                "ParlantePhonic:" + "\n" +
                "  Marca ='" + marca + '\'' + "\n" +
                "  Modelo ='" + modelo + '\'' + "\n" +
                "  Precio =" + precio + "\n" +
                "  Es Portatil =" + esPortatil + "\n" +
                "  Potencia WattS =" + potenciaWatt + "\n" +
                "  FechaFabricacion =" + fechaFabricacion + "\n";
    }
}

