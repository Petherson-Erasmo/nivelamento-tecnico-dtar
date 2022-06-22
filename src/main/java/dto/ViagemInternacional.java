package dto;

import enums.Destinos;

import java.util.List;

public class ViagemInternacional extends Viagem {
    private String passaporte;

    public ViagemInternacional(Destinos lugarDeDestino) {
        super(lugarDeDestino);
    }

    public String getPassaporte() {
        return this.passaporte;
    }

    public void setPassaporte(String passaporte) {
        this.passaporte = passaporte;
    }

    @Override
    public void setAcompanhantes(List<Acompanhante> acompanhantes) throws Exception {
        if (acompanhantes.size() <= 4) {
            super.setAcompanhantes(acompanhantes);
        } else {
            throw new Exception("Viagens nacionais não podem ter mais que 4 acompanhantes");
        }
    }
}
