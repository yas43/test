package Dicegame;

import java.util.Random;

public class Player_2 {
	protected int player_2_score;

	public Player_2() {
		this.player_2_score = player_2_score;
	}

	protected int randGen() {
		Random random = new Random();
		int player_2_score = random.nextInt(1, 7);
		this.player_2_score = player_2_score;
		return player_2_score;

	}

}
