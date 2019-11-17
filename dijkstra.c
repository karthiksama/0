#include<stdio.h>
#define INFINITY 999
void dijkstra(int n,int v,int cost[10][10],int dist[])
{	int i,u,count,w,flag[10],min,pred[10],j;
	for(i=1;i<=n;i++)
	{	flag[i]=0;
		dist[i]=cost[v][i];
		pred[i]=v;
	}
	count=2;
	while(count<=n)
	{	min=99;
		for(w=1;w<=n;w++)
		{	if(dist[w]<min && !flag[w])
			{	min=dist[w];
				u=w;
			}
		}
		flag[u]=1;
		count++;
		for(w=1;w<=n;w++)
		{	if(dist[u]+cost[u][w]<dist[w])
			{	dist[w]=dist[u]+cost[u][w];
				pred[w]=u;
			}
		}
	}
	printf("\n Shortest paths:");
	for(i=1;i<=n;i++)
	{	if(i!=v)
		{	printf("\nTotal cost from node %d to %d is %d",v,i,dist[i]);
			printf("\n Path:%d",i);
			j=i;
			do
			{	j=pred[j];
				printf("<----%d",j);
			}while(j!=v);
		}
	}
	printf("\n");

}
int main()
{	int i,j,n,v,cost[10][10],dist[10],pred[10];
	printf("\n enter the number of nodes:");
	scanf("%d",&n);
	printf("\n enter the adjacency matrix:");
	for(i=1;i<=n;i++)
	{	for(j=1;j<=n;j++)
		{	scanf("%d",&cost[i][j]);
			if(cost[i][j]==0)
				cost[i][j]=INFINITY;
		}
	}
	printf("enter the source vertex");
	scanf("%d",&v);
	dijkstra(n,v,cost,dist);
	return 0;
}

