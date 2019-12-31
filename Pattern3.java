class Pattern3
{
	public static void main(String[] args)
	{
		int max=1;
		for(int x=1; x<=5; x++)
		{
			for(int i=1; i<=max; i++)
			{
				System.out.print(i);
			}
			System.out.println();
			max++;
		}
	}
}