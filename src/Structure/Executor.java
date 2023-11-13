package Structure;

import Application.AnimalManager;
import Domain.Cachorro;
import Domain.Gato;

import java.util.Scanner;

public class Executor {
    public static void main(String[] args) {
        AnimalManager animalManager = new AnimalManager();
        Scanner scanner = new Scanner(System.in);

        boolean continuarSistema = true;

        while (continuarSistema) {
            System.out.println("Digite o numero que você deseja fazer: " +
                    "Adicionar um cachorro ao banco(1) Adicionar um gato ao banco(2) " +
                    "Verificar cachorros existentes no banco(3) Verificar gatos existentes no banco(4) " +
                    "Remover cachorro existente no banco(5) Remover gato existente no banco(6) Encerrar sistema(7)");
            String resposta1 = scanner.nextLine();
            switch (resposta1) {
                case "1":
                    animalManager.AdicionarCachorro();
                    break;
                case "2":
                    animalManager.AdicionarGato();
                    break;
                case "3":
                   animalManager.VerificarCachorro();
                    break;
                case "4":
                    animalManager.VerificarGato();
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