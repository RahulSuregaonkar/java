package Practice;

public class Bubble_sort_practice_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {50,80,30,55,44,33};
		for (int i=0; i<arr.length-1;i++) 
		{
			for (int j=0;j<arr.length-1;j++) 
			{
				if(arr[j]>arr[j+1]) 
				{
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for (int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i]);
		}

	}

}
