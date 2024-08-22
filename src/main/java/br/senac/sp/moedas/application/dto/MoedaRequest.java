package br.senac.sp.moedas.application.dto;

import java.util.Objects;

public class MoedaRequest {

    private Double valorReais;

    public MoedaRequest(){}

    public MoedaRequest(final Double valorReais){
        this.valorReais = valorReais;
    }

    public Double getValorReais() {
        return valorReais;
    }

    public MoedaRequest setValorReais(Double valorReais) {
        this.valorReais = valorReais;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MoedaRequest that = (MoedaRequest) o;
        return Objects.equals(valorReais, that.valorReais);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(valorReais);
    }

}