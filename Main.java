package Leitura;

public class ProjetoLivro {
    public static void main (String [] args){
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[2];

        p[0] = new Pessoa("Luiz Henrique" , 20 , "M");
                p[1] = new Pessoa("Carol Souza ", 20 , "F");

                l[0] = new Livro("Do mil ao Milhão" , "Tiago Nigro " , 260 , "Luiz Henrique ");
                l[1] = new Livro ("Coisas da vida " , "Bruno Niyemaier" , 432 , "Carol Souza");

                l[0].folhear(129);
                l[0].avancarPag();
                l[0].detalhes();
    }
}
