package Dicegame;

public class Play {
	Player_1 player_1;
	Player_2 player_2;

	public void score() {
		if (player_1.player_1_score < player_2.player_2_score) {
			player_2.player_2_score += 1;
		}

		else if (player_1.player_1_score > player_2.player_2_score) {
			player_1.player_1_score += 1;
		} else
			;

	}

}
