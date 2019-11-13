import java.util.*;
class hamil
{
	static int n;
	static int[][] cost=new int[20][20];
	static int[] x=new int[20];
	public static void main(String args[])
	{
		int i,j;
		Scanner in=new Scanner(System.in);
		System.out.println("enter no.of vertices");
		n=in.nextInt();
		System.out.println("enter adjancecy matrix");
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			cost[i][j]=in.nextInt();
		}
		x[1]=1;
		for(i=2;i<=n;i++)
		{
			x[i]=0;
		}
		hamil(2);
	}
	public static int hamil(int k)
	{
		int i;
		while(true)
		{
			nextValue(k);
			if(x[k]==0)
			return 0;
			if(k==n)
			{
				System.out.println("solution");
				for(i=1;i<=n;i++)
				System.out.println(" "+x[i]);
				System.out.println(" "+x[1]);
				System.out.println();
			}
			else
			hamil(k+1);
		}
	}
	public static int nextValue(int k)
	{
		int j;
		while(true)
		{
			x[k]=(x[k]+1)%(n+1);
			if(x[k]==0)
			return 0;
			if(cost[x[k-1]][x[k]]!=0)
			{
				for(j=1;j<=k-1;j++)
				{
					if(x[j]==x[k])
					break;
				}
				if(j==k)
				{
					if((k<n)||((k==n)&&(cost[x[n]][x[1]]!=0)))
					return 0;
				}
			}
		}
	}
}

