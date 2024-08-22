package br.senac.sp.moedas.application.usecase.impl;

import br.senac.sp.moedas.application.dto.MoedaRequest;
import br.senac.sp.moedas.application.usecase.CalculaMoedaUseCase;
import br.senac.sp.moedas.domain.entity.MoedaEntity;
import org.springframework.stereotype.Service;

@Service
public class CalculaMoedaUseCaseImpl implements CalculaMoedaUseCase {

    @Override
    public Double converterMoeda(MoedaRequest request) {
        MoedaEntity moedaEntity = new MoedaEntity(request.getValorReais());
        return moedaEntity.converterMoedaParaDollarAmericano();
    }

}
