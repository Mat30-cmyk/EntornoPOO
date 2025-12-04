package com.example;

import modelo.Bolso;
import modelo.CascoMoto;
import modelo.ParlantePhonic;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Bolso: instancia por defecto
        Bolso bolsoDefault = new Bolso();
        System.out.println(bolsoDefault.toString());

        // Bolso: instancia parametrizada
        List<String> colores = Arrays.asList("fucsia","naranja","celeste","lila","gris","marrón","turquesa");
        Bolso bolsoParam = new Bolso("ColorMix", new BigDecimal("79.99"), 35.5, 12, true, LocalDate.of(2024,5,10), colores);
        System.out.println(bolsoParam);

        // ParlantePhonic: por defecto
        ParlantePhonic pDefault = new ParlantePhonic();
        System.out.println(pDefault);

        // ParlantePhonic: parametrizado
        ParlantePhonic pParam = new ParlantePhonic("JBL", "PH-300", new BigDecimal("269.99"), true, 80.0, LocalDate.of(2023,8,1));
        System.out.println(pParam);

        // CascoMoto: por defecto
        CascoMoto cascoDefault = new CascoMoto();
        System.out.println(cascoDefault);

        // CascoMoto: parametrizado (usa parlante integrado que ya creamos)
        CascoMoto cascoParam = new CascoMoto("RiderCorp", "L", true, 90,
                Arrays.asList("Tel: Carlos","Tel: Laura","Parlante: JBL"), pParam, LocalDate.of(2024,2,20));
        System.out.println(cascoParam);
    }
}