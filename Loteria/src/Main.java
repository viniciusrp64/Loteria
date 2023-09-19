import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

class Lotofacil {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number;
        char letter;
        boolean validInput = true;
        double saldo = 0.00;

        do {
            System.out.println("**************************");
            System.out.println("Menu LOTOFÁCIL:");
            System.out.println("1) Apostar de 0 a 100");
            System.out.println("2) Apostar de A à Z");
            System.out.println("3) Apostar em par ou ímpar");
            System.out.println("0) Sair");
            System.out.println("**************************");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Digite um número de 0 a 100: ");
                    number = scanner.nextInt();

                    if (number < 0 || number > 100) {
                        System.out.println("Aposta inválida.");
                    } else {
                        int randomNumber = random.nextInt(101);

                        if (number == randomNumber) {
                            System.out.println("Você ganhou R$ 1.000,00 reais.");
                        } else {
                            System.out.println("Que pena! O número sorteado foi: " + randomNumber + ".");
                        }
                    }
                    break;

                case 2:
                    System.out.print("Digite uma letra de A à Z: ");
                    letter = Character.toUpperCase((char) System.in.read());

                    if (!Character.isLetter(letter)) {
                        System.out.println("Aposta inválida.");
                    } else {
                        char randomLetter = (char) (random.nextInt(26) + 'A');

                        if (letter == randomLetter) {
                            System.out.println("Você ganhou R$ 1.000,00 reais.");
                        } else {
                            System.out.println("Que pena! A letra sorteada foi: " + randomLetter + ".");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Digite um número inteiro: ");
                    int num = scanner.nextInt();
                    num = num % 2;
                    if (num == 0) {
                        saldo += 100;
                        System.out.println("Você ganhou R$ 100,00");
                    } else {
                        System.out.println("Que pena!\n" +
                                "O número digitado é ímpar e a premiação foi para números pares.");
                    }
                    break;

                case 0:
                    validInput = false;
                    break;

                default:
                    System.out.println("Escolha inválida.");
            }
        } while (validInput);

        scanner.close();
    }
}
