#include<stdio.h>
# define INFINITY 999
int main()
{
	int i,j,j1=0,n,k,l=0,mincost,min,k1=1,l1=2,cost[50][50],t[20][20],near[20];
	printf("enter no.of vertices");
	scanf("%d",&n);
	printf("enter adjacency matrix");
	for(i=1;i<=n;i++)
	{
	for(j=1;j<=n;j++)
	{scanf("%d",&cost[i][j]);
	if(cost[i][j]==0)
	cost[i][j]=INFINITY;
}}
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
	printf("the %d edges are",(n-1));
	for(i=1;i<=n;i++)
	near[i]=0;
	for(i=1;i<=n-1;i++)
	{
		for(j=1;j<=2;j++)
		printf("%d\t",t[i][j]);
		printf("\n");
	}
		printf("mincost is %d",mincost);
	
}
