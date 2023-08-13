package OOP;

//可变参数
public class VarParameter{
	public static void main(String[] args)
	{
		nums object = new nums();
		object.getsum(1,2,3,4,5);
	}
}

class nums{
	public void getsum(int... nums){
		int sum = 0;
		for(int i : nums){
			sum += i;
		}
		System.out.println(sum);
	}
}