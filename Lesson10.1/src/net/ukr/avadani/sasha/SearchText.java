package net.ukr.avadani.sasha;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class SearchText {
	public static String[] toStringBuil(File file) {
		StringBuilder sb = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String text = " ";
			for (; (text = br.readLine()) != null;) {
				sb.append(text);
			}
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		String tx = sb.toString();
		String[] txOne = tx.split("[ .,\\n!]");
		System.out.println(Arrays.toString(txOne));
		return txOne;
	}

	public static String compare(String[] txOne, Map<String, String> map) {
		StringBuilder sbOne = new StringBuilder();
		Set<String> setOne = map.keySet();
		boolean k = false;
		for (String tx : txOne) {
			for (String key : setOne) {
				if (key.equals(tx) == true) {
					k = true;
				}
			}
			if (k == true) {
				sbOne.append(map.get(tx));
				sbOne.append(" ");
			} else {
				sbOne.append("* ");
			}
			k = false;

		}
		return sbOne.toString();
	}

	public static void saveToFile(File fileOne, String text) {
		try (PrintWriter pw = new PrintWriter(fileOne)) {
			pw.print(text);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
