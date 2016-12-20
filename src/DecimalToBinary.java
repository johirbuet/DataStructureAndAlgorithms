
public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=25;
		System.out.println(getBinary(n));
	}
	
	public static String getBinary(int n)
	{
		if(n<0)
			throw new IllegalArgumentException();
		if(n<=1)
			return Integer.toString(n);
		return getBinary(n/2)+Integer.toString(n%2);
	}

}
