package br.senac.sp.moedas.domain.entity;

import java.util.Objects;

public class PesoArgentino {

    private Double moedaReais;

    public PesoArgentino(Double moedaReais){
        this.moedaReais = moedaReais;
    }

    public Double converterMoedaParaPesoArgentino(){
        return moedaReais * 172.96;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PesoArgentino that = (PesoArgentino) o;
        return Objects.equals(moedaReais, that.moedaReais);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(moedaReais);
    }

}