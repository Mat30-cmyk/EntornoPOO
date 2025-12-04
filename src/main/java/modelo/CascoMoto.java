package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CascoMoto {
    private String fabricante;
    private String talla; // S, M, L, XL
    private boolean tieneIntercom;
    private int bateriaPorcentaje; // 0 - 100
    private List<String> contactosPareados; // lista de nombres de dispositivos pareados
    private ParlantePhonic parlanteIntegrado; // componente - uso de objeto propio
    private LocalDate fechaCompra;

    // Constructor por defecto
    public CascoMoto() {
        this.fabricante = "GenHelmet";
        this.talla = "M";
        this.tieneIntercom = true;
        this.bateriaPorcentaje = 75;
        this.contactosPareados = new ArrayList<>();
        this.contactosPareados.add("Tel: Juan");
        this.contactosPareados.add("Tel: Ana");
        this.parlanteIntegrado = new ParlantePhonic();
        this.fechaCompra = LocalDate.now().minusMonths(6);
    }

    // Constructor con parámetros (usa setters)
    public CascoMoto(String fabricante, String talla, boolean tieneIntercom, int bateriaPorcentaje,
                     List<String> contactosPareados, ParlantePhonic parlanteIntegrado, LocalDate fechaCompra) {
        setFabricante(fabricante);
        setTalla(talla);
        setTieneIntercom(tieneIntercom);
        setBateriaPorcentaje(bateriaPorcentaje);
        setContactosPareados(contactosPareados);
        setParlanteIntegrado(parlanteIntegrado);
        setFechaCompra(fechaCompra);
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        if (fabricante == null || fabricante.trim().isEmpty()) throw new IllegalArgumentException("Fabricante no puede ser nulo o vacío");
        this.fabricante = fabricante.trim();
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        if (talla == null || talla.trim().isEmpty()) throw new IllegalArgumentException("Talla no puede ser nula");
        String t = talla.trim().toUpperCase();
        if (!(t.equals("S") || t.equals("M") || t.equals("L") || t.equals("XL"))) throw new IllegalArgumentException("Talla inválida (S/M/L/XL)");
        this.talla = t;
    }

    public boolean isTieneIntercom() {
        return tieneIntercom;
    }

    public void setTieneIntercom(boolean tieneIntercom) {
        this.tieneIntercom = tieneIntercom;
    }

    public int getBateriaPorcentaje() {
        return bateriaPorcentaje;
    }

    public void setBateriaPorcentaje(int bateriaPorcentaje) {
        if (bateriaPorcentaje < 0 || bateriaPorcentaje > 100) throw new IllegalArgumentException("bateriaPorcentaje debe estar entre 0 y 100");
        this.bateriaPorcentaje = bateriaPorcentaje;
    }

    public List<String> getContactosPareados() {
        return new ArrayList<>(contactosPareados);
    }

    public void setContactosPareados(List<String> contactosPareados) {
        if (contactosPareados == null) throw new IllegalArgumentException("contactosPareados no puede ser nulo");
        this.contactosPareados = new ArrayList<>();
        for (String c : contactosPareados) {
            if (c == null || c.trim().isEmpty()) throw new IllegalArgumentException("Cada contacto debe ser una cadena no vacía");
            this.contactosPareados.add(c.trim());
        }
    }

    public ParlantePhonic getParlanteIntegrado() {
        return parlanteIntegrado;
    }

    public void setParlanteIntegrado(ParlantePhonic parlanteIntegrado) {
        if (parlanteIntegrado == null) throw new IllegalArgumentException("parlanteIntegrado no puede ser nulo");
        this.parlanteIntegrado = parlanteIntegrado;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        if (fechaCompra == null) throw new IllegalArgumentException("fechaCompra no puede ser nula");
        if (fechaCompra.isAfter(LocalDate.now())) throw new IllegalArgumentException("fechaCompra no puede ser futura");
        if (fechaCompra.isBefore(LocalDate.of(2000,1,1))) throw new IllegalArgumentException("fechaCompra muy antigua (antes de 2000)");
        this.fechaCompra = fechaCompra;
    }

    @Override
    public String toString() {
        return "\n" +
                "Casco Moto:" + "\n" +
                "  Fabricante ='" + fabricante + '\'' + "\n" +
                "  Talla ='" + talla + '\'' + "\n" +
                "  Tiene Intercomunicador =" + tieneIntercom + "\n" +
                "  Bateria Porcentaje =" + bateriaPorcentaje + "\n" +
                "  Contactos Pareados =" + contactosPareados + "\n" +
                "  Parlante Integrado =" + (parlanteIntegrado != null ? parlanteIntegrado.toString() : "null") + "\n" +
                "  Fecha Compra =" + fechaCompra + "\n";
    }
}