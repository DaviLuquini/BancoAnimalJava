package Application;

import Domain.Cachorro;
import Domain.Gato;

public class AnimalFactory {
    public Cachorro criarCachorro(String nome, String nomeDono, int idade, int QntdDePatas) {
        return new Cachorro(nome, nomeDono, idade, QntdDePatas);
    }

    public Gato criarGato(String nome,String corGato, int idade, int QntdDePatas) {
        return new Gato(nome, corGato, idade, QntdDePatas);
    }
}
