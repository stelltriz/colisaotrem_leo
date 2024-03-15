package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double posicaoA, posicaoB, velocidadeA, velocidadeB;

        try {
            System.out.println("Insira a posição do trem A (entre 0 e 10000): ");
            posicaoA = sc.nextDouble();
            if (posicaoA > 10000 || posicaoA < 0) {
                System.out.println("A posição do trem deve ser entre KM 0 e KM 10.000");
                return;
            }
            System.out.println("Insira a posição do trem B (entre 0 e 10000): ");
            posicaoB = sc.nextDouble();
            if (posicaoB > 10000 || posicaoB < 0) {
                System.out.println("A posição do trem deve ser entre KM 0 e KM 10.000");
                return;
            }
            System.out.println("Insira a velocidade do trem A (POSITIVA): ");
            velocidadeA = sc.nextDouble();
            if (velocidadeA < 0) {
                System.out.println("A velocidade do trem deve ser positiva");
                return;
            }
            System.out.println("Insira a velocidade do trem B (NEGATIVA): ");
            velocidadeB = sc.nextDouble();
            if (velocidadeB > 0) {
                System.out.println("A velocidade do trem deve ser negativa");
                return;
            }
        } catch (InputMismatchException e) {
            System.out.println("Você inseriu um caractere inválido");
            return;
        }

        double tempo = (posicaoA - posicaoB) / (velocidadeB - velocidadeA);

        if (tempo >= 0) {
            double posicaoEncontro = velocidadeA * tempo;

            double horas = (posicaoEncontro - posicaoA) / velocidadeA;
            double minutos = horas * 60;
            double segundos = minutos * 60;

            double horaInicial = 17;
            double horaFinal = horaInicial + horas;

            System.out.println("Os trens se encontram no KM:" + posicaoEncontro + "em " + segundos + " segundos");

        } else {
            System.out.println("Os trens nunca se encontrarão.");
        }
    }
}
