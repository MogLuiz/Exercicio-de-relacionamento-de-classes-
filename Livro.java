package Leitura;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPagina;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    //construct
    public Livro(String tit, String aut, int totpag , Pessoa leit){
        this.titulo = tit;
        this.autor = aut;
        this.totPagina = totpag;
        this.leitor = leit;
        this.aberto = false ;
        this.pagAtual = 0 ;
    }

    public void detalhes() {
        System.out.println("------ Detalhes do livro ------");
        System.out.println("Titulo : " + titulo + "\n Autor : " + autor + "\n Total de páginas " + totPagina + " \n Página atual : " + pagAtual +
                "\n Aberto : " + aberto + "\n Leitor : " +  leitor.getNome() +  "Idade : " + leitor.getIdade() + "Sexo : " + leitor.getSexo() );
    }

    public void setTitulo(String tit){
        this.titulo = tit;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public void setAutor(String aut) {
        this.autor = aut;
    }
    public String getAutor(){
        return this.autor;
    }
    public void setTotPagina(int tot) {
        this.totPagina = tot;
    }
    public int getTotPagina() {
        return totPagina;
    }
    public void setPagAtual(int atual){
        this.pagAtual = atual;
    }
    public int getPagAtual(){
        return pagAtual;
    }
    public void setAberto(boolean aber){
        this.aberto = aber;
    }
    public boolean getAberto(){
        return this.aberto;
    }
    public void setLeitor(Pessoa lei){
        this.leitor = lei;
    }
    public Pessoa getLeitor(){
        return this.leitor;
    }



    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar(int pag) {

    }

    @Override
    public void folhear(int pag) {
        setPagAtual(pag);
    }


    public void fechar() {
        this.aberto = false;
    }


    public void avancarPag() {
        setPagAtual(getPagAtual() + 1 );
    }

    public void voltarPag() {
        if (getPagAtual() > 0) {
            setPagAtual(getPagAtual() - 1);
        }
        else {
            System.out.println("Impossível voltar página");
        }

    }
}
