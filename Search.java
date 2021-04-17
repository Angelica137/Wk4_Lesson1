public class Search {
	public int[] search(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("Hello");
		}
		return array;
	}

	public static void main(String[] args) {
		Search s = new Search();
		int[] a = { 2, 4, 7, 8 };
		System.out.println(s.search(a));
	}

}