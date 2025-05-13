package Exemplo3;

public class Endereco {
    private String rua;
    private int numero;
    private Endereco endereco;

    public Endereco(String rua, int numero, Endereco endereco) {
        this.rua = rua;
        this.numero = numero;
        this.endereco = endereco;
    }

    public String getRua() {
        return rua;
    }

    public int getNumero() {
        return numero;
    }

    public Endereco getEndereco() {
        return endereco;
    }
}
