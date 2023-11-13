package Application;

import Domain.Cachorro;
import Domain.Gato;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;


public class AnimalManager {
    CreateAnimal createAnimal = new CreateAnimal();
    Scanner scanner = new Scanner(System.in);
    List<Cachorro> cachorros = new ArrayList<>();
    List<Gato> gatos = new ArrayList<>();
    String entrada;
    List<String> entradas = new ArrayList<>();
    //Adiciona o animal ao Array utilizando do CreateAnimal
    public void AdicionarCachorro() {
        System.out.println("Digite os Atributos do seu cachorro: (Nome, Nome do Dono, Idade e Quantidade de Patas)");
        entrada = scanner.nextLine();
        entradas.add(entrada);

        cachorros = createAnimal.criarCachorrosDinamicamente(entradas);

        int indiceUltimoCachorro = cachorros.size() - 1;
        Cachorro ultimoCachorro = cachorros.get(indiceUltimoCachorro);
        System.out.println("Cachorro criado: " + ultimoCachorro.getNome());
    }

    public void AdicionarGato() {
        System.out.println("Digite os Atributos do seu gato: (Nome, Cor do gato, Idade e Quantidade de Patas)");
        entrada = scanner.nextLine();
        entradas.add(entrada);

        gatos = createAnimal.criarGatosDinamicamente(entradas);

        int indiceUltimoGato = gatos.size() - 1;
        Gato ultimoGato = gatos.get(indiceUltimoGato);
        System.out.println("Gato criado: " + ultimoGato.getNome());
    }

    public void VerificarCachorro() {
        if (!cachorros.isEmpty()) {
            System.out.println("Lista de Cachorros existentes: ");
            for (Cachorro cachorro : cachorros) {
                System.out.println(cachorro.getNome());
            }
            System.out.println("Você deseja verificar algum cachorro em específico?");
            String respostaSimNao = scanner.nextLine().toLowerCase();
            if(respostaSimNao.equals("sim")) {
                System.out.println("Qual cachorro você deseja verificar em específico?");
                for (Cachorro cachorro : cachorros) {
                    System.out.println(cachorro.getNome());
                }
            } else {
                System.out.println("Ok, voltando ao menu...");
            }

        } else {
            System.out.println("Ainda não existe Cachorros no banco.");
        }
    }
    public void VerificarGato() {
        if (!gatos.isEmpty()) {
            System.out.println("Lista de Gatos existentes: ");
            for (Gato gato : gatos) {
                System.out.println(gato.getNome());
            }
        } else {
            System.out.println("Ainda não existe Gatos no banco.");
        }
    }

}


