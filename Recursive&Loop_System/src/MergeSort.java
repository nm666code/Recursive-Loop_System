import java.util.Arrays;
public class MergeSort {
	private static int[] data;
	
	private static int[] mergeSort(int[] arr) {
		int len = arr.length;
		if(len < 2)
			return arr;
		
		int mid = len / 2;
		int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
		int[] right = mergeSort(Arrays.copyOfRange(arr, mid, len));
		
		int i = 0, j = 0, r = 0;
		int[] result = new int[len];
		
		while(i < left.length && j < right.length) {
			if(left[i] < right[j]) { 
		        result[r] = left[i];
		        i++;
			}
			else { 
				result[r] =right[j];
			    j++;
			}
			r++;
		}
		
		while (i < left.length) { 
			result[r] = left[i];
	        i++; r++;
		}
		
	    while (j < right.length) { 
	    	result[r] =right[j];
		    j++; r++;
	    }
		return result;
	}
	
	public static int[] ms_a(int[] arr) {
		return mergeSort(arr);
	}
	
	public static int[] ms_d(int[] arr) {
		int[] result = mergeSort(arr);
		reverse(result);
		return result;
	}
	
	private static void reverse(int[] data) {
	    for (int left = 0, right = data.length - 1; left < right; left++, right--) {
	        // swap the values at the left and right indices
	        int temp = data[left];
	        data[left]  = data[right];
	        data[right] = temp;
	    }
	}

	public static int[] getData() {
		return data;
	}

	public static void setData(int[] ldata) {
		data = ldata;
	}
}
