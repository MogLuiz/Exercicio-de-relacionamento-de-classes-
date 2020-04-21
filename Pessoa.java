package Leitura;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;


    public Pessoa(String no,int id,String sex) {
        this.nome = no;
        this.idade = id;
        this.sexo = sex;
    }

    public void fazerAniver(){
        this.setIdade(getIdade() + 1);
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String no){
        this.nome = no;
    }

    public int getIdade() {
        return this.idade;
    }
    public void setIdade(int id){
        this.idade = id;
    }
    public String getSexo() {
        return this.sexo;
    }
    public void setSexo(String sex){
        this.sexo = sex;
    }

}
