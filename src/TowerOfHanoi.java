
public class TowerOfHanoi {

	public static void main(String[] args) {
		move(3,'A','C','B');
	}
	
	public static void move(int n,char source,char temp,char dest)
	{
		String s="Moving Disk "+n+" from "+source+" to "+dest;
		if(n==1)
		{
			System.out.println(s);
			return;
		}
		move(n-1,source,dest,temp);
		System.out.println(s);
		move(n-1,temp,source,dest);
	}

}
