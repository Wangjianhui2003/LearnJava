//反转数组
public class ReverseArray{
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5,6,7};

		for(int i = 0;i < arr.length/2;i++){
			int temp = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = arr[i];
			arr[i] = temp;
		}

		for (int j : arr) {
			System.out.println(j);
		}
	}
}