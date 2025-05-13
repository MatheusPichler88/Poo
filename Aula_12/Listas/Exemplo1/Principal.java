package Listas.Exemplo1;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Pessoa> listaPessoas = new ArrayList<Pessoa>();

        Pessoa pessoa1 = new Pessoa("Matheus", 22);
        Pessoa pessoa2 = new Pessoa("Gabriel", 34);
        Pessoa pessoa3 = new Pessoa("Andriza", 17);

        exibirPessoa(listaPessoas);
    }
    public static void exibirPessoa(List<Pessoa> lista) {
        for (Pessoa p : lista) {
            System.out.println("Nome: " + p.getNome());
            System.out.println("Idade:" + p.getIdade());
        }
    }
}
