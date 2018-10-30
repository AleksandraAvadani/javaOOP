package net.ukr.avadani.sasha;

import java.io.File;
import java.util.Map;

public class Realize {
	private ReadToMap rtm;
	private AddWords add;

	public Realize(ReadToMap rtm, AddWords add) {
		super();
		this.rtm = rtm;
		this.add = add;
	}

	public Realize() {
		super();
	}

	public ReadToMap getRtm() {
		return rtm;
	}

	public void setRtm(ReadToMap rtm) {
		this.rtm = rtm;
	}

	public AddWords getAdd() {
		return add;
	}

	public void setAdd(AddWords add) {
		this.add = add;
	}

	public Map<String, String> toMap(File file) {
		if (file == null) {
			throw new IllegalArgumentException();
		}
		return rtm.toMap(file);
	}

	public void addWord(Map<String, String> map) {
		for (; add.addConsole() == true;) {
			map.putAll(add.toMap(map));
		}
	}

	public void saveToFile(Map<String, String> map, File file) {
		add.saveToDict(map, file);
	}
}
