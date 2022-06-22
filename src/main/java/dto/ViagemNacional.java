package dto;

import enums.Destinos;
import interfaces.CalculadoraDePrevisao;
import utils.ArquivosUtils;
import java.util.List;

public class ViagemNacional extends Viagem implements CalculadoraDePrevisao {
    private String cpf;

    public ViagemNacional(Destinos lugarDeDestino) {
        super(lugarDeDestino);
    }

    public String getCpf(){
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public void setAcompanhantes(List<Acompanhante> acompanhantes) throws Exception {

        int limiteDeAcompanhantes = Integer.parseInt(ArquivosUtils.getPropriedade("viagem.nacional.acompanhantes.limite"));

        if (acompanhantes.size() <= limiteDeAcompanhantes) {
            super.setAcompanhantes(acompanhantes);
        } else {
            throw new Exception("Viagens nacionais não podem ter mais que " + limiteDeAcompanhantes + " acompanhante");
        }
    }

    public int calcularPrevisaoDeDiasParaRetorno() {
        int quantidadeDeDias = 0;

        switch (this.getDestino()){
            case BONITO: quantidadeDeDias = 4; break;
            case GRAMADO: quantidadeDeDias = 9; break;
            case CURITIBA: quantidadeDeDias = 2; break;
            case CAPITOLIO: quantidadeDeDias = 6; break;
            case BELOHORIZONTE: quantidadeDeDias = 2; break;
        }

        return quantidadeDeDias;
    }
}
