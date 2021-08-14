import java.util.Scanner;

public class ALPHABET {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int[] count = new int[26];
		for (int i = 0; i < str.length(); i++) {
			count[str.charAt(i) - 'a']++;
		}
		int num = scan.nextInt();

		for (int i = 0; i < num; i++) {
			String word = scan.next();
			boolean flag = true;
			for (int j = 0; j < word.length(); j++) {
				if (count[word.charAt(j) - 'a'] == 0) {
					System.out.println("No");
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println("Yes");
			}
		}
		scan.close();
	}
}
