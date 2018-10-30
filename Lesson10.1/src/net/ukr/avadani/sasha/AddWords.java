package net.ukr.avadani.sasha;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public interface AddWords {
	public boolean addConsole();
	public Map<String, String> toMap(Map<String, String> mapOne);
	public void saveToDict(Map<String, String> map, File file);
}
