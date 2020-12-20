package eg1;
// title case is when you want all letters starting with uppercase
public class TitleCase {
	public static void main(String[] args) {
		
		
		String s = "hello hi good evening how are you doing today";
		
		StringBuilder sb = new StringBuilder();
		String ar[] = s.split(" ");
		for (int i = 0; i < ar.length; i++) {
			sb.append(Character.toUpperCase(ch));
		}
		System.out.println(sb.toString().trim());
	}
/// Task- convert every word's last charatcter to uppercase and print back the sentence.
}
