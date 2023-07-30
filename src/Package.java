import APackage.AClass;

public class Package
{
	public static void main(String[] args){
		AClass a1 = new AClass();
		BPackage.AClass a2 = new BPackage.AClass();
		System.out.println(a1);
		System.out.println(a2);
	}
}