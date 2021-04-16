package day7.lab5;


class ABC
{
	public String representABC()
	{
		return "this is ABC";
	}
	public String toString()
	{
		return "this is the ABC representation from toString";
	}
}
public class Demo {

	public static void main(String[] args) {
		
		ABC a = new ABC();
		int x = 10;
		System.out.println(x);
		System.out.println(a.representABC());
		System.out.println(a);
	}
}
