public class Search {
	public void search(int[] array, int x) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == x) {
				System.out.println(i);
				System.out.println("Success");
			} else {
				System.out.println("x does not live here");
			}
		}
	}

	public static void main(String[] args) {
		Search s = new Search();
		int[] a = { 2, 4, 7, 8 };
		int x = 7;
		s.search(a, x);
	}

}