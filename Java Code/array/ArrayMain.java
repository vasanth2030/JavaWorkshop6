package array;

public class ArrayMain {
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60,70,80,90,100};
		binarySearch(arr, 120);
	}
	
	public static void binarySearch(int arr[],int x)
	{
		int l=0;
		int r= arr.length-1;
		
		while(l<=r)
		{
			int mid= (l+r)/2;
			
			if(arr[mid]==x)
			{
				System.out.println("Binary Search: Element found at index: "+mid);
				return;
			}
			else if(arr[mid]<x)
			{
				l=mid+1;
			}
			else {
				r=mid-1;
			}
		}
		System.out.println("Binary Search: Element not found");
	}
}
