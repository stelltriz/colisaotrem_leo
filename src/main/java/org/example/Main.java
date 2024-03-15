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
                System.out.println("A velocidade do trem A deve ser positiva");
                return;
            }
            System.out.println("Insira a velocidade do trem B (NEGATIVA): ");
            velocidadeB = sc.nextDouble();
            if (velocidadeB > 0) {
                System.out.println("A velocidade do trem B deve ser negativa");
                return;
            }
        } catch (InputMismatchException e) {
            System.out.println("Você inseriu um caractere inválido!");
            return;
        }

        double tempo = (posicaoA - posicaoB) / (velocidadeB - velocidadeA);

        if (tempo >= 0) {
            double posicaoEncontro = posicaoA + (velocidadeA * tempo);
            double segundos = tempo * 3600;

            double horasEncontro = 17 + (int)(tempo);
            double minutosEncontro = (tempo - (int)tempo) * 60;

            System.out.println("KM " + posicaoEncontro + ", " + segundos + " segundos, " + (int)horasEncontro + " horas e " + (int)minutosEncontro + " minutos.");

        } else {
            System.out.println("Os trens nunca se encontrarão.");
        }
    }
}
