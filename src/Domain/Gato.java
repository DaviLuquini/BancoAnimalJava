package Domain;

import Domain.Animal;

public class Gato extends Animal {
    private String corGato;
    public String getCorGato() {
        return corGato;
    }

    public void setCorGato(String corGato) {
        this.corGato = corGato;
    }
    public Gato(String nome,String corGato, int idade, int QntdDePatas) {
        setNome(nome);
        setCorGato(corGato);
        setIdade(idade);
        setQntdDePatas(QntdDePatas);
    }

    @Override
    public void fazerBarulho() {
        System.out.println("Miau");
    }


    public String toString() {
        return "Nome: " + getNome() + ", Cor do gato: " + getCorGato() + ", Idade: " + getIdade() + ", Quantidade de Patas: " + getQntdDePatas();
    }

    @Override
    public void imprimirAtributos() {
        System.out.println(this.toString());
    }


}
