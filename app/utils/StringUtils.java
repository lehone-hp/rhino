package utils;

import java.text.Normalizer;
import java.util.regex.Pattern;

public class StringUtils {

	private static final Pattern NONLATIN = Pattern.compile("[^\\w-]");
	private static final Pattern WHITESPACE = Pattern.compile("[\\s]");

	public static String slug(String str) {
		String nowhitespace = WHITESPACE.matcher(str).replaceAll("-");
		String normalized = Normalizer.normalize(nowhitespace, Normalizer.Form.NFD);
		String slug = NONLATIN.matcher(normalized).replaceAll("");
		return slug.toLowerCase();
	}

}
