package Leitura;

public interface Publicacao {
    public void abrir ();
    public void fechar (int pag);
    public void folhear();

    default void folhear(int pag) {

    }

    public void avancarPag();
    public void voltarPag();
}
