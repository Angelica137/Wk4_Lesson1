public class Search {
	public Integer search(int[] array, int x) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == x) {
				return i;
			} else {
				return null;
			}
		}
		return x;
	}

	public static void main(String[] args) {
		Search s = new Search();
		int[] a = { 2, 4, 7, 8 };
		int x = 0;
		System.out.println(s.search(a, x));
	}

}