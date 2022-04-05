package app;

import dto.Viagem;
import enums.Destinos;

public class App {
    public static void main(String[] args) {
        Viagem viagem = new Viagem(Destinos.GRAMADO);

        viagem.setDestino(Destinos.CURITIBA);

        System.out.println(viagem.getDestino().getCidade());
    }
}
