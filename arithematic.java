package desigPrinciples;

public class arithematic extends ExClass {
	public void validation(String a,String b,int c)
	{
		String x=a.trim();
		String y=b.trim();
		try
		{
		int m=Integer.parseInt(x);
		int n=Integer.parseInt(y);
		switch(c)
		{	
			case 1:addition(m,n);
			       break;
			case 2:subtraction(m,n);
			       break;
			case 3:multiplication(m,n);
			       break;
			case 4:division(m,n);
			       break;
			default:System.out.println("SPECIFY WITHIN MENTIONED OPTIONS ONLY");
		//System.out.println(m+n);
		}
		}
		catch(NumberFormatException e)
		{
			exfun();
		}
	}
	public void addition(int a,int b)
	{
		System.out.println(a+b);
	}
	public void subtraction(int a,int b)
	{
		if(a>b)
		{
			System.out.println(a-b);
		}
		else
		{
			System.out.println(b-a);
		}
	}
	public void multiplication(int a,int b)
	{
		System.out.println(a*b);
	}
	public void division(int a,int b)
	{
		System.out.println(a/b);
	}

}
