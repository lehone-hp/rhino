package utils;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.List;

public class StringUtils {

	private static final Pattern NONLATIN = Pattern.compile("[^\\w-]");
	private static final Pattern WHITESPACE = Pattern.compile("[\\s]");

	public static String slug(String str) {
		String nowhitespace = WHITESPACE.matcher(str).replaceAll("-");
		String normalized = Normalizer.normalize(nowhitespace, Normalizer.Form.NFD);
		String slug = NONLATIN.matcher(normalized).replaceAll("");
		return slug.toLowerCase();
	}

	public static List<String> locationSplit(String str) {
		String[] ret = str.split("[,]");
		List<String> ret2 = new ArrayList<>();
		for(int i=0; i<ret.length; i++) {
			String s = ret[i].trim();
			if (s.length() > 0) {
				ret2.add(s);
			}
		}
		return ret2;
	}

}
