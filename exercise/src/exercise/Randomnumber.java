package exercise;

import java.util.Random;

class Player_1 {
	String name;
	int number;

	public Player_1(String name) {
		this.name = name;
		Random random = new Random();
		number = random.nextInt(1, 7);
		this.number = number;

	}

}

class Player_2 {
	String name;
	int number;

	public Player_2(String name) {
		this.name = name;
		Random random = new Random();
		number = random.nextInt(1, 7);
		this.number = number;

	}

}

class Game {
	Player_1 player_1;
	Player_2 player_2;

	public Game(Player_1 player_1, Player_2 player_2) {
		this.player_1 = player_1;
		this.player_2 = player_2;
	}

	public void play() {
		if (player_1.number > player_2.number) {
			System.out.println("winer is " + player_1.name);
		} else {
			System.out.println("winer is " + player_2.name);
		}
	}
}

public class Randomnumber {

	public static void main(String[] args) {

		Player_1 player_1 = new Player_1("yaser");
		Player_2 player_2 = new Player_2("gisele");
		Game game = new Game(player_1, player_2);
		System.out.println("player_1 number is " + player_1.number);
		System.out.println("player_2 number is " + player_2.number);
		game.play();

	}
}
