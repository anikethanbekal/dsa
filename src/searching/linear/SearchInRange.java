package searching.linear;

//search for 3 in the range of index [1,4] index
public class SearchInRange {
	public static void main(String[] args) {
		int nums[] = { 23, 45, 58, 10, -50, 19, 90, -10 };
		int target = 19;
		int ans = linearSearch(nums, target, 4, 6);
		System.out.println(ans);
	}
	// serach in the array: return the index if item found
	// otherwise if item not found return -1

	static int linearSearch(int arr[], int target, int start, int end) {
		if (arr.length == 0) {
			return -1;
		}

		// run for loop
		for (int index = start; index <= end; index++) {
			// check for element at every index
			int element = arr[index];
			if (element == target) {
				return index;
			}
		}
		// if none is found then target not found so return -1
		return -1;
	}
}
