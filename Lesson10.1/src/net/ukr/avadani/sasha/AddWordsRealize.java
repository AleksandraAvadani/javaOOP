package net.ukr.avadani.sasha;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.file.StandardOpenOption;
import java.util.Map;
import java.util.TreeMap;

public class AddWordsRealize implements AddWords {

	public AddWordsRealize() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean addConsole() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Do you want to input new words to the dictionary:");
		String text = null;
		try {
			text = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean k = false;
		if ((text.equals("yes")) || text.equals("y")) {
			return k = true;
		}
		return false;

	}

	@Override
	public Map<String, String> toMap(Map<String, String> mapOne) {
		BufferedReader brOne = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input English word: ");
		String tex = null;
		String ukr = null;
		try {
			tex = brOne.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Input Ukrainian translation: ");

		try {
			ukr = brOne.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mapOne.put(tex, ukr);

		return mapOne;
	}

	@Override
	public void saveToDict(Map<String, String> map, File file) {
		try (BufferedWriter fw = new BufferedWriter(new FileWriter(file, true))){
			map.forEach((key, value) -> {
				try {
					fw.write(System.lineSeparator()+key + "," + value);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
		} 
		catch(IOException e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		
	}


}
