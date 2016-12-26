
public class BinarySearch {

	public static void main(String[] args) {
		int [] arr={2,3,4,5,6,7,8,9,10,11,12,15};
		System.out.println(binarySearch(arr,0,arr.length-1,10));
	}
	
	public static int binarySearch(int [] arr,int first,int last,int key)
	{
		if(first<=last)
		{
			int mid=(first+last)/2;
			if(arr[mid]<key)
			{
				return binarySearch(arr, mid+1, last, key);
			}
			else if(arr[mid]>key)
			{
				return binarySearch(arr, first, mid-1, key);
			}
			else
			{
				return mid;
			}
		}
		return -1;
	}

}
