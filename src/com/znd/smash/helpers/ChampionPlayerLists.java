package com.znd.smash.helpers;

import java.util.ArrayList;
import java.util.HashMap;

public class ChampionPlayerLists {
	public static enum ListNames {
		KNIGHT,
		ARCHER,
		TANK,
	};
	
	public static ArrayList<String> knightList = new ArrayList<String>();
	public static ArrayList<String> archerList = new ArrayList<String>();
	public static ArrayList<String> tankList = new ArrayList<String>();
	
	public static HashMap<String, ArrayList<String>> playerListMap = new HashMap<String, ArrayList<String>>();
	
	public ChampionPlayerLists() {
		playerListMap.put("knight", knightList);
		playerListMap.put("archer", archerList);
		playerListMap.put("tank", tankList);
	}
}
