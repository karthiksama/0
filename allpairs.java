
import java.util.*;
class allpairs
{  static int infinity=999;
   static int[][] a=new int[20][20];
   static int[][] cost=new int[20][20];
   static int i,j,k,n;
   public static void main(String args[])
     {
	Scanner s = new Scanner(System.in);
	System.out.println("enter no of vertices");
	n=s.nextInt();
	System.out.println("enter adjacency matrix");
	for(i=1;i<=n;i++)
	{
	  for(j=1;j<=n;j++)
	   {
		cost[i][j]=s.nextInt();
		if(cost[i][j]==0)
		 cost[i][j]=infinity;
	   }
	}
	for(i=1;i<=n;i++)
	for(j=1;j<=n;j++)
	a[i][j]=cost[i][j];
	for(k=1;k<=n;k++)
	{
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{

				if(i==j)
					{
						System.out.println(" 0");
						continue;
					}
				if(a[i][j]>(a[i][k]+a[k][j]))
				{
					a[i][j]=a[i][k]+a[k][j];
//					if(i==j)
//						System.out.println("0");
					System.out.println(" "+a[i][j]);
				}
				else
				{
					a[i][j]=a[i][j];
					System.out.println(" "+a[i][j]);
				}
			}
			System.out.println();
		}
	}
   }
}
