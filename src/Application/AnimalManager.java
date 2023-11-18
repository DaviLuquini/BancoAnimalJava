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
    boolean continuar = true;
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
        while (continuar) {
            if (!cachorros.isEmpty()) {
                System.out.print("Lista de Cachorros existentes: ");
                for (Cachorro cachorro : cachorros) {
                    System.out.print(cachorro.getNome() + ", ");
                }
                System.out.println();
                System.out.println("Você deseja verificar algum cachorro em específico?");
                String respostaSimNao = scanner.nextLine().toLowerCase();

                switch (respostaSimNao) {
                    case "sim":
                        System.out.println("Qual cachorro você deseja verificar em específico?");
                        for (Cachorro cachorro : cachorros) {
                            System.out.print(cachorro.getNome() + ", ");
                        }
                        System.out.println();
                        String cachorroVerificar = scanner.nextLine();
                        for (Cachorro cachorro : cachorros) {
                            if (cachorroVerificar.equals(cachorro.getNome())) {
                                cachorroVerificar = cachorro.toString();
                                System.out.println(cachorroVerificar);
                                continuar = false;
                            } else {
                                System.out.println("Digite o nome do cachorro corretamente, porfavor.");
                            }
                        }
                        break;
                    case "nao":
                        System.out.println("Ok voltando ao menu...");
                        continuar = false;
                        break;
                    default:
                        System.out.println("Digite Sim ou Nao.");
                        break;
                }

            } else {
                System.out.println("A lista de cachorros ainda esta vazia.");
                continuar = false;
            }
        }
    }

    public void VerificarGato() {
        while (continuar) {
            if (!gatos.isEmpty()) {
                System.out.print("Lista de Gatos existentes: ");
                for (Gato gato : gatos) {
                    System.out.print(gato.getNome() + ", ");
                }
                System.out.println();
                System.out.println("Você deseja verificar algum gato em específico?");
                String respostaSimNao = scanner.nextLine().toLowerCase();

                switch (respostaSimNao) {
                    case "sim":
                        System.out.println("Qual gato você deseja verificar em específico?");
                        for (Gato gato : gatos) {
                            System.out.print(gato.getNome() + ", ");
                        }
                        System.out.println();
                        String gatoVerificar = scanner.nextLine();
                        for (Gato gato : gatos) {
                            if (gatoVerificar.equals(gato.getNome())) {
                                gatoVerificar = gato.toString();
                                System.out.println(gatoVerificar);
                                continuar = false;
                            } else {
                                System.out.println("Digite o nome do gato corretamente, porfavor.");
                            }
                        }
                        break;
                    case "nao":
                        System.out.println("Ok voltando ao menu...");
                        continuar = false;
                        break;
                    default:
                        System.out.println("Digite Sim ou Nao.");
                        break;
                }

            } else {
                System.out.println("A lista de gatos ainda esta vazia.");
                continuar = false;
            }
        }
    }
}


