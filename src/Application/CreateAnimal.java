package Application;

import Domain.Cachorro;
import Domain.Gato;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreateAnimal {
    AnimalFactory factory = new AnimalFactory();
    Scanner scanner = new Scanner(System.in);
//Classe que Cria um array de animal e adiciona eles ao Array
    public List<Cachorro> criarCachorrosDinamicamente(List<String> entradas) {
        List<Cachorro> cachorros = new ArrayList<>();
        boolean atributosCorretos = false;

        while (!atributosCorretos) {
            for (String entrada : entradas) {
                String[] atributos;
                if (entrada.contains(",")) {
                    atributos = entrada.split(",");
                } else {
                    atributos = entrada.split(" ");
                }
                if (atributos.length == 4) {
                    String nome = atributos[0].trim();
                    String nomeDono = atributos[1].trim();
                    int idade;
                    int qntdPatas;
                    try {
                        idade = Integer.parseInt(atributos[2].trim());
                        qntdPatas = Integer.parseInt(atributos[3].trim());
                    } catch (NumberFormatException e) {
                        System.out.println("Idade e quantidade de patas devem ser números inteiros.");
                        return new ArrayList<>();
                    }

                    Cachorro novoCachorro = factory.criarCachorro(nome, nomeDono, idade, qntdPatas);
                    cachorros.add(novoCachorro);
                    atributosCorretos = true;
                } else {
                    System.out.println("Por favor, forneça os atributos corretamente.");
                    System.out.println("Digite os Atributos do seu Cachorro: (Nome, Nome do dono, Idade e Quantidade de Patas)");
                    entradas.clear();
                    entradas.add(scanner.nextLine());
                    break;
                }
            }
        }
        return cachorros;
    }

    public List<Gato> criarGatosDinamicamente(List<String> entradas) {
        List<Gato> gatos = new ArrayList<>();
        boolean atributosCorretos = false;

        while (!atributosCorretos) {
            for (String entrada : entradas) {
                String[] atributos;
                if (entrada.contains(",")) {
                    atributos = entrada.split(",");
                } else {
                    atributos = entrada.split(" ");
                }
                if (atributos.length == 4) {
                    String nome = atributos[0].trim();
                    String cor = atributos[1].trim();
                    int idade;
                    int qntdPatas;
                    try {
                        idade = Integer.parseInt(atributos[2].trim());
                        qntdPatas = Integer.parseInt(atributos[3].trim());
                    } catch (NumberFormatException e) {
                        System.out.println("Idade e quantidade de patas devem ser números inteiros.");
                        return new ArrayList<>();
                    }

                    Gato novoGato = factory.criarGato(nome, cor, idade, qntdPatas);
                    gatos.add(novoGato);
                    atributosCorretos = true;
                } else {
                    System.out.println("Por favor, forneça os atributos corretamente.");
                    System.out.println("Digite os Atributos do seu gato: (Nome, Cor do gato, Idade e Quantidade de Patas)");
                    entradas.clear();
                    entradas.add(scanner.nextLine());
                    break;
                }
            }
        }
        return gatos;
    }
}



