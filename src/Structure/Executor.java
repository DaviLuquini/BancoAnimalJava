package Structure;

import Domain.Cachorro;
import Domain.Gato;
import Application.AnimalManager;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Executor {

    public static void main(String[] args) {
        AnimalManager animalManager = new AnimalManager();
        Scanner scanner = new Scanner(System.in);
        boolean continuarSistema = true;
        String entrada;
        List<String> entradas = new ArrayList<>();
        List<Cachorro> cachorros = new ArrayList<>();
        List<Gato> gatos = new ArrayList<>();

        while (continuarSistema) {
            System.out.println("Digite o numero que você deseja fazer: " +
                    "Adicionar um cachorro ao banco(1) Adicionar um gato ao banco(2) " +
                    "Verificar cachorros existentes no banco(3) Verificar gatos existentes no banco(4) " +
                    "Remover cachorro existente no banco(5) Remover gato existente no banco(6) Encerrar sistema(7)");
            String resposta1 = scanner.nextLine();
            switch (resposta1) {
                case "1":
                    System.out.println("Digite os Atributos do seu cachorro: (Nome, Nome do Dono, Idade e Quantidade de Patas)");
                    entrada = scanner.nextLine();
                    entradas.add(entrada);

                    cachorros = animalManager.criarCachorrosDinamicamente(entradas);

                    int indiceUltimoCachorro = cachorros.size() - 1;
                    Cachorro ultimoCachorro = cachorros.get(indiceUltimoCachorro);
                    System.out.println("Cachorro criado: " + ultimoCachorro.getNome());
                    break;
                case "2":
                    System.out.println("Digite os Atributos do seu gato: (Nome, Cor do gato, Idade e Quantidade de Patas)");
                    entrada = scanner.nextLine();
                    entradas.add(entrada);

                    gatos = animalManager.criarGatosDinamicamente(entradas);

                    int indiceUltimoGato = gatos.size() - 1;
                    Gato ultimoGato = gatos.get(indiceUltimoGato);
                    System.out.println("Gato criado: " + ultimoGato.getNome());
                    break;
                case "3":
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
                    break;
                case "4":
                    if (!gatos.isEmpty()) {
                        System.out.println("Lista de Gatos existentes: ");
                        for (Gato gato : gatos) {
                            System.out.println(gato.getNome());
                        }
                    } else {
                        System.out.println("Ainda não existe Gatos no banco.");
                    }
                    break;
                case "7":
                    System.out.println("Ok, Sistema encerrando...");
                    System.exit(0);
                default:
                    System.out.println("Digite sua escolha de 1 a 7");
                    break;
            }
        }
    }
}
/*
        dog1.fazerBarulho();
        dog1.imprimirAtributos();

        Domain.Gato cat1 = new Domain.Gato("Poly","Branco", 11, 4);
        Domain.Gato cat2 = new Domain.Gato("Jacoby","Preto", 7, 4);
        Domain.Gato cat3 = new Domain.Gato("Lai","Laranja", 1, 4);
        cat1.fazerBarulho();
        cat1.imprimirAtributos();
    }

}
*/