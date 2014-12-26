package StringExample;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String s = "geekdforgeeks";
		String res = "";
		int count[] = new int[256];
		for (int i = 0; i < s.length(); i++) {
			count[s.charAt(i)]++;
			if (count[s.charAt(i)] > 0 && count[s.charAt(i)] <= 1)
				res += s.charAt(i);
		}
		System.out.println(res);
	}

}
