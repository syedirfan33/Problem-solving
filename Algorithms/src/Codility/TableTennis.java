package Codility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TableTennis {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfPlayers = sc.nextInt();
		List<PlayerHours> players = new ArrayList<>();
		while (noOfPlayers > 0) {
			PlayerHours player = new PlayerHours();
			player.startTime = sc.nextInt();
			player.endTime = sc.nextInt();
			players.add(player);
			noOfPlayers--;
		}
		sc.close();
		Map<Integer, Integer> counter = new HashMap<>();
		for (PlayerHours playerHours : players) {
			for (int i = playerHours.startTime; i < playerHours.endTime; i++) {
				if (!counter.containsKey(i)) {
					counter.put(i, 1);
				} else {
					counter.put(i, counter.get(i) + 1);
				}
			}
		}
		calculatePlayerCounts(counter);
	}

	private static void calculatePlayerCounts(Map<Integer, Integer> playerMap) {
		int[] singleCount = { 0 };
		int[] doubleCount = { 0 };

		playerMap.forEach((k, v) -> {
			if (v == 2 || v == 3)
				singleCount[0]++;
			if (v > 3)
				doubleCount[0]++;
		});
		System.out.println(singleCount[0]+" "+ doubleCount[0]);
	}
}

class PlayerHours {
	int startTime;
	int endTime;
}
