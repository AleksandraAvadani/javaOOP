package net.ukr.avadani.sasha;

import java.io.File;
import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("translate.txt");
		File fileOne = new File("English.in");
		File fileTwo = new File("Ukrainian.out");
		AddWords add = new AddWordsRealize();
		ReadToMap rtm = new RealizeReadingToMap();
		Realize real = new Realize(rtm, add);

		Map<String, String> map = new TreeMap<>();
		map = real.toMap(file);
		String textOne[] = SearchText.toStringBuil(fileOne);
		String textTwo = SearchText.compare(textOne, map);
		SearchText.saveToFile(fileTwo, textTwo);

		Map<String, String> mapOne = new TreeMap<>();
		real.addWord(mapOne);
		real.saveToFile(mapOne, file);

	}

}
