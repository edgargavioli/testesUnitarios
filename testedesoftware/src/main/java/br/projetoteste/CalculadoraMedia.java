package br.projetoteste;

import java.util.Scanner;

public class CalculadoraMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler as três notas do aluno
        System.out.println("Informe a primeira nota:");
        double nota1 = scanner.nextDouble();

        System.out.println("Informe a segunda nota:");
        double nota2 = scanner.nextDouble();

        System.out.println("Informe a terceira nota:");
        double nota3 = scanner.nextDouble();

        // Calcular a média das notas
        double media = (nota1 + nota2 + nota3) / 3;

        // Exibir a média
        System.out.println("A média do aluno é: " + media);

        // Determinar o estado do aluno com base na média
        if (media >= 7) {
            System.out.println("O aluno está aprovado.");
        } else if (media >= 4 && media <= 6.9) {
            System.out.println("O aluno está em 2ª oportunidade.");
        } else {
            System.out.println("O aluno está reprovado.");
        }

        // Fechar o scanner
        scanner.close();
    }
}