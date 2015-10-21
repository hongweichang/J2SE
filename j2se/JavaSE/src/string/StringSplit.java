package string;

public class StringSplit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*String str = "helloworld!";
		String s[] = str.split("o");
		for (String ss : s) {
			System.out.println(ss);
		}
		System.out.println("size:"+s.length);
		System.out.println(str.contains("wor"));*/
		String str = "a:12|b:13|c:22";
		String s1[] = str.split("\\|");
		for (String ss1 : s1) {
			String s2[] = ss1.split(":");
			for (String ss2 : s2) {
				System.out.print(ss2+" ");
			}
			System.out.println("");
		}
		
	}

}
