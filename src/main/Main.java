package main;

import java.util.Scanner;
import java.util.Random;
import functionality.CheckingPlay;

public class Main {
	// Criar 1 matrizes, 3 colunas
	// Criar jogadores
	// Definir jogadas do usuario
	// Definiar jogadas do cpu
	// Verificação de vitoria
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random horizontalRandomCollumn = new Random();
		Random verticalRandomCollumn = new Random();

		CheckingPlay checkPlay = new CheckingPlay();

		Character[][] ticTac = new Character[3][3];

		for (int x = 0; x < ticTac.length; x++) {
			for (int y = 0; y < ticTac.length; y++) {
				ticTac[x][y] = '?';
			}
		}

		// definindo escolhas dos players

		char player = '@';
		char cpu = '@';

		boolean checkingPlayerChoice = true;
		while (checkingPlayerChoice) {
			System.out.print("X ou O: ");
			String choise = sc.nextLine();

			if (choise.equals("X") || choise.equals("x")) {
				player = 'X';
				cpu = 'O';
				checkingPlayerChoice = false;
			} else if (choise.equals("O") || choise.equals("o")) {
				player = 'O';
				cpu = 'X';
				checkingPlayerChoice = false;
			} else {
				System.out.println("Caractere inválido, tente novamente: ");
			}

		}

		System.out.println("");

		System.out.println("-----------");

		System.out.println("");

		// game

		checkPlay = new CheckingPlay(ticTac, player, cpu);

		boolean win = true;
		while (win) {
			// user
			boolean playerPlay = true;
			while (playerPlay) {
				System.out
						.println("Escolha uma coluna horizontal e uma vertical e faça sua jogada(contando do 0 - 2): ");
				int playerHorizontalCollumn = sc.nextInt();
				int playerVerticalCollumn = sc.nextInt();

				if (checkPlay.checking(playerHorizontalCollumn, playerVerticalCollumn) == false) {
					ticTac[playerHorizontalCollumn][playerVerticalCollumn] = player;
					playerPlay = false;
				}

			}

			boolean cpuPlayer = true;
			while (cpuPlayer) {
				int cpuHorizontalCollumn = horizontalRandomCollumn.nextInt(3);
				int cpuVerticalCollumn = verticalRandomCollumn.nextInt(3);

				if (checkPlay.checking(cpuHorizontalCollumn, cpuVerticalCollumn) == false) {
					ticTac[cpuHorizontalCollumn][cpuVerticalCollumn] = cpu;
					cpuPlayer = false;
				}
			}

			for (int x = 0; x < ticTac.length; x++) {
				for (int y = 0; y < ticTac.length; y++) {
					System.out.print(ticTac[x][y] + "|");
				}
				System.out.println("");

			}
			// check win
			if (checkPlay.checkingWin().equals("player")) {
				System.out.println("Player win");
				win = false;
			} else if (checkPlay.checkingWin().equals("cpu")) {
				System.out.println("cpu win");
				win = false;
			}

		}

		sc.close();

	}
}
