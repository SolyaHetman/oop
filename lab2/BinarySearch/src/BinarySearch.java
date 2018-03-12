
public class BinarySearch {

	public static void main(String[] args) {
		int data[] = { 3, 6, 7, 10, 34, 56, 60 };
		int numberToFind = 10;
		int length = data.length;
		int firstIndex = 0;
		int secondIndex = length -1;
		
		while(firstIndex <= secondIndex)
		{         
			int  mid = (secondIndex-firstIndex)/2;
			if( data[mid] == numberToFind )
			{
				System.out.println(numberToFind);
			}	
			else if (data[mid] > numberToFind)
			{
				mid +=1;
			}
			else if (data[mid] < numberToFind)
				{
				mid -=1;
				}
				
		}
		
	}
}
