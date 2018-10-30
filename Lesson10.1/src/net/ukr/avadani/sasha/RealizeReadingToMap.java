package net.ukr.avadani.sasha;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class RealizeReadingToMap implements ReadToMap {

	@Override
	public Map<String, String> toMap(File file) {
		StringBuilder sb = new StringBuilder();
		Map<String, String> map = new TreeMap<>();
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String textOne = " ";
			for (; (textOne = br.readLine()) != null;) {
				String[] word = textOne.split(",");
				map.put(word[0], word[1]);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return map;
	}

}
