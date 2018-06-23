package br.com.uds.pizzaria;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.UUID;

public class Pizza {


    private final UUID id;

    private final LocalDateTime dataCadadastro;

    private String massa;
    private String queijo;
    private String molho;
    private String sabor;

    private int tempoDePreparo;

    public Pizza() {
        this.id = UUID.randomUUID();
        this.dataCadadastro = LocalDateTime.now();
    }

    public Pizza(String massa, String queijo, String molho, String sabor, int tempoDePreparo) {
        this();
        this.massa = massa;
        this.queijo = queijo;
        this.molho = molho;
        this.sabor = sabor;
        this.tempoDePreparo = tempoDePreparo;
    }

    public UUID getId() {
        return id;
    }

    public LocalDateTime getDataCadadastro() {
        return dataCadadastro;
    }

    public String getMassa() {
        return massa;
    }

    public String getQueijo() {
        return queijo;
    }

    public String getMolho() {
        return molho;
    }

    public String getSabor() {
        return sabor;
    }

    public int getTempoDePreparo() {
        return tempoDePreparo;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "id=" + id +
                ", dataCadadastro=" + dataCadadastro +
                ", massa='" + massa + '\'' +
                ", queijo='" + queijo + '\'' +
                ", molho='" + molho + '\'' +
                ", sabor='" + sabor + '\'' +
                ", tempoDePreparo=" + tempoDePreparo +
                '}';
    }
}