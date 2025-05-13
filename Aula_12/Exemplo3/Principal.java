package Exemplo3;

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Matheus",22, new Endereco("Batista",123,));

        System.out.println("Nome: "+pessoa.getNome());
        System.out.println("Idade: "+pessoa.getIdade());
        System.out.println("Endereço: "+pessoa.getEndereco().getRua()+","+""+pessoa.getEndereco().getNumero());

    }
}
