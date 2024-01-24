package Dicegame;

import java.util.Random;

public class Player_1 {
	protected int player_1_score;

	public Player_1() {
		this.player_1_score = player_1_score;
	}

	protected int randGen() {
		Random random = new Random();
		int player_1_score = random.nextInt(1, 7);
		this.player_1_score = player_1_score;
		return player_1_score;

	}

}
