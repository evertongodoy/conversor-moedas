package br.senac.sp.moedas.domain.entity;

public class MoedaEntity {

    private Double moedaReais;

    public MoedaEntity(Double moedaReais){
        this.moedaReais = moedaReais;
    }

    public Double converterMoedaParaDollarAmericano(){
        return moedaReais * 5.48;
    }

}