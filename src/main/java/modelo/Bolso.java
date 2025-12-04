package modelo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Bolso {
    private String marca;
    private BigDecimal precio;
    private double altoCm;
    private int capacidadLitros;
    private boolean conCierre;
    private LocalDate fechaCompra;
    private List<String> colores; // lista de colores (se requiere >=6)

    // Constructor por defecto (vacío) // Constructor por defecto
    public Bolso() {
        this.marca = "MarcaGenérica";
        this.precio = new BigDecimal("49.99");
        this.altoCm = 30.0;
        this.capacidadLitros = 8;
        this.conCierre = true;
        this.fechaCompra = LocalDate.now().minusMonths(1);
        this.colores = new ArrayList<>();
        // valores razonables: 6 colores por defecto
        this.colores.add("rojo");
        this.colores.add("amarillo");
        this.colores.add("azul");
        this.colores.add("verde");
        this.colores.add("negro");
        this.colores.add("blanco");
    }

    // Constructor con parámetros (usa setters para aprovechar validaciones)
    public Bolso(String marca, BigDecimal precio, double altoCm, int capacidadLitros,
            boolean conCierre, LocalDate fechaCompra, List<String> colores) {
        setMarca(marca);
        setPrecio(precio);
        setAltoCm(altoCm);
        setCapacidadLitros(capacidadLitros);
        setConCierre(conCierre);
        setFechaCompra(fechaCompra);
        setColores(colores);
    }

    // Getters y setters con validaciones
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca == null || marca.trim().isEmpty())
            throw new IllegalArgumentException("La marca no puede ser nula o vacía");
        this.marca = marca.trim();
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        if (precio == null)
            throw new IllegalArgumentException("Precio no puede ser nulo");
        if (precio.compareTo(BigDecimal.ZERO) <= 0 || precio.compareTo(new BigDecimal("10000")) >= 0)
            throw new IllegalArgumentException("Precio debe ser > 0 y < 10000");
        this.precio = precio;
    }

    public double getAltoCm() {
        return altoCm;
    }

    public void setAltoCm(double altoCm) {
        if (altoCm <= 0 || altoCm > 200)
            throw new IllegalArgumentException("Alto en cm inválido");
        this.altoCm = altoCm;
    }

    public int getCapacidadLitros() {
        return capacidadLitros;
    }

    public void setCapacidadLitros(int capacidadLitros) {
        if (capacidadLitros < 0 || capacidadLitros > 200)
            throw new IllegalArgumentException("Capacidad inválida");
        this.capacidadLitros = capacidadLitros;
    }

    public boolean isConCierre() {
        return conCierre;
    }

    public void setConCierre(boolean conCierre) {
        this.conCierre = conCierre;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        if (fechaCompra == null)
            throw new IllegalArgumentException("fechaCompra no puede ser nula");
        if (fechaCompra.isAfter(LocalDate.now()))
            throw new IllegalArgumentException("fechaCompra no puede ser futura");
        if (fechaCompra.isBefore(LocalDate.of(2000, 1, 1)))
            throw new IllegalArgumentException("fechaCompra muy antigua (antes de 2000)");
        this.fechaCompra = fechaCompra;
    }

    public List<String> getColores() {
        return new ArrayList<>(colores);
    }

    public void setColores(List<String> colores) {
        if (colores == null)
            throw new IllegalArgumentException("colores no puede ser nulo");
        if (colores.size() < 6)
            throw new IllegalArgumentException("El bolso debe tener al menos 6 colores");
        for (String c : colores)
            if (c == null || c.trim().isEmpty())
                throw new IllegalArgumentException("Cada color debe ser una cadena no vacía");
        this.colores = new ArrayList<>();
        for (String c : colores)
            this.colores.add(c.trim());
    }

    @Override
    public String toString() {
        return "\n" +
                "Bolso:\n" +
                "  Marca: " + marca + "\n" +
                "  Precio: " + precio + "\n" +
                "  Alto (cm): " + altoCm + "\n" +
                "  Capacidad (L): " + capacidadLitros + "\n" +
                "  Con cierre: " + conCierre + "\n" +
                "  Fecha de compra: " + fechaCompra + "\n" +
                "  Colores: " + colores + "\n";
    }
}
