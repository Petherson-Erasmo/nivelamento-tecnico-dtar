package app;

import dto.Viagem;

public class App {
    public static void main(String[] args) {
        Viagem viagem = new Viagem("Maringá");

        viagem.setDestino("Nova Friburgo");

        System.out.println(viagem.getDestino());
    }
}
