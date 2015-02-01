public class Insertionsort{
	public static void main(String args[])
	 {
		int[] array={2,5,3,1,6,3,7,12,11,3,10,22};
		System.out.println("before sorting");
		for (int i = 0; i < array.length; i++)
		{
		System.out.print(array[i]+",");
		}
		System.out.println();
		insertion_sort(array,array.length);
		System.out.println("array after sorting ");
		for (int i = 0; i < array.length; i++) 
		{
		 System.out.print(array[i]+",");
		}
	}

	private static void insertion_sort(int[] array,int n)
		 {
		  for(int i=1;i<n;i++)
		   {
	            int temp=array[i];
	            int j;
	            for ( j = i-1; j >=0 && temp<array[j]; j--)
 			{
	        	  array[j+1]=array[j];
			
           	        }
	           array[j+1]=temp;
		  }
              }
}
