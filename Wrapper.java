class Wrapper
{
	public static void main(String args[])
	{
		Integer i1=Integer.valueOf("123");
		Double i2=Double.valueOf("23");
		System.out.println(i1);
		System.out.println(i2);
		int a=Integer.parseInt("122");
		double c=Double.parseDouble("234");
		System.out.println(a);
		System.out.println(c);
		int d=i1.intValue();
		System.out.println(d);
	}
}