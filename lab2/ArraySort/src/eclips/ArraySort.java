package eclips;

public class ArraySort {

	public static void main(String[] args) {
		int[] array = {30, 2, 10, 4, 6};
		int length = array.length;

		for ( int i = 0; i < length; i++)
		{	
		for (int j= length - 1; j > i; j-- )
		{
			if (array[j] < array[j-1])
			{
		     int c = array[j];
				 array[j] = array[j-1];
				 array[j-1] = c;
			}
		}
		}

		for (int i = 0; i < length; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
