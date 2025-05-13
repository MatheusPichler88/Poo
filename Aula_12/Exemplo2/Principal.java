package Exemplo2;

public class Principal {
    public static void main(String[] args) {
        Produto p = new Produto("KitKat", 7.99);
        Produto p2 = p.clone();

        System.out.printf("Produto 1:"+p.getNome()+"\nPreço: \n"+p.getPreco());
        System.out.printf("Produto 2:: "+p2.getNome()+"\nPreço: \n"+p2.getPreco());

        p2.setPreco(2.0);

        System.out.printf("Produto 1: "+p.getNome()+"\nPreço: \n"+p.getPreco());
        System.out.printf("Produto 2: "+p2.getNome()+"\nPreço: \n"+p2.getPreco());
    }
}
