class Cmd
{
	public static void main(String []args)
	{
		System.out.println("This is Command line argument");
		int n = args.length;
		System.out.println("total arguments = " + n);

		for(int i=0;i<n;i++)
		{
			System.out.println(args[i]);
		}
		if(i%2==0)
		{
			System.out.println(args[i]);
	    }
	}
}