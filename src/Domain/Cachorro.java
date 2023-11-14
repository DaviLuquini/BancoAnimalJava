package Domain;

import Domain.Animal;

public class Cachorro extends Animal {
    private String nomeDono;
    public String getNomeDono() {
        return nomeDono;
    }

    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }
    public Cachorro(String nome,String nomeDono, int idade, int QntdDePatas) {
        setNome(nome);
        setNomeDono(nomeDono);
        setIdade(idade);
        setQntdDePatas(QntdDePatas);
    }

    @Override
    public void fazerBarulho() {
        System.out.println("Au au");
    }

    public String toString() {
        return "Nome: " + getNome() + " , Nome do Dono: " + getNomeDono() + " , Idade: " + getIdade() + " , Quantidade de Patas: " + getQntdDePatas();
    }

    @Override
    public void imprimirAtributos() {
        System.out.println(this.toString());
    }

}
