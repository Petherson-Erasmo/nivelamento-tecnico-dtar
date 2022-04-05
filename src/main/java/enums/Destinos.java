package enums;

public enum Destinos {
    GRAMADO("Gramado"),
    CURITIBA("Curitiba"),
    BELOHORIZONTE("Belo Horizonte"),
    CAPITOLIO("Capitólio"),
    BONITO("Bonito");

    private String cidade;

    Destinos(String cidade) {
        this.cidade = cidade;
    }

    public String getCidade() {
        return this.cidade;
    }
}
