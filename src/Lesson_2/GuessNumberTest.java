package Lesson2;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Имя первого игрока: ");
        String namePlayer1 = scanner.nextLine();
        Player player1 = new Player(namePlayer1);

        System.out.print("Имя второго игрока: ");
        String namePlayer2 = scanner.nextLine();
        Player player2 = new Player(namePlayer2);

        GuessNumber game = new GuessNumber(player1, player2);
        String answer = "yes";

        do {
            if ("yes".equals(answer)){
                game.start();
            }
            System.out.println("Хотите продолжить игру? [yes/no]: ");
            answer = scanner.nextLine();
        } while (!"no".equals(answer));



    }
}
