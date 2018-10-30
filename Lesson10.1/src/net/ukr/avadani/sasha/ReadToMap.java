package net.ukr.avadani.sasha;

import java.io.File;
import java.util.Map;
import java.util.TreeMap;

public interface ReadToMap {

	public Map<String, String> toMap(File file);
}
