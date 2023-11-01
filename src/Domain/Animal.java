package Domain;

// Press Shift twice to open the Search Everywhere
// Press Alt+Enter with your caret at the highlighted text to see how
// IntelliJ IDEA suggests fixing it.
public class Animal {
    private String nome;
    private int idade;
    private int QntdDePatas;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getQntdDePatas() {
        return QntdDePatas;
    }

    public void setQntdDePatas(int qntdDePatas) {
        QntdDePatas = qntdDePatas;
    }


    public void fazerBarulho() {
        System.out.println("Barulho genérico de um animal.");
    }

    public void imprimirAtributos() {
        System.out.println("Atributos genéricos de um animal.");
    }

}


