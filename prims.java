
import java.util.*;
class prims
{ static int infinity=999;
	public static void main(String args[])
	{
		int i,j,j1=0,n,k,l=0,mincost,min,k1=1,l1=2;
		Scanner in=new Scanner(System.in);
		System.out.println("enter no.of vertices");
		n=in.nextInt();
		int[][] cost=new int[10][10];
		System.out.println("enter adjacency matrix");
		for(i=1;i<=n;i++)
		{
		 for(j=1;j<=n;j++)
		 {		
		cost[i][j]=in.nextInt();
		if(cost[i][j]==0)
			cost[i][j]=infinity;
		}
		}
		int[][] t=new int[10][10];
		int[] near=new int[10];
		mincost=cost[1][2];
		for(k=1;k<=n;k++)
		{
			for(l=1;l<=n;l++)
			{
				if(mincost>cost[k][l])
				{
					mincost=cost[k][l];
					k1=k;
					l1=l;
				}
			}
		}
		for(i=1;i<=n;i++)
		near[i]=0;
		t[1][1]=k1;
		t[1][2]=l1;
		for(i=1;i<=n;i++)
		{
			if(cost[i][l1]<cost[i][k1])
			near[i]=l1;
			else
			near[i]=k1;
		}
		near[k1]=0;
		near[l1]=0;
		for(i=2;i<=n-1;i++)
		{
			min=cost[1][1];
			for(j=1;j<=n;j++)
			{
				if(near[j]!=0&&(min>cost[j][near[j]]))
				{
					min=cost[j][near[j]];
					j1=j;
				}
			}
			t[i][1]=j1;
			t[i][2]=near[j1];
			mincost=mincost+cost[j1][near[j1]];
			near[j1]=0;
			for(k=0;k<n;k++)
			{
				if(near[k]!=0&&(cost[k][near[k]])>cost[k][j1])
				near[k]=j1;
			}
		}
		System.out.println("the"+(n-1)+"edges are");
		for(i=1;i<=n;i++)
		near[i]=0;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=2;j++)
			System.out.print(t[i][j]+" ");
			System.out.println();
		}
		System.out.println("min cost is"+mincost);
	}
}
