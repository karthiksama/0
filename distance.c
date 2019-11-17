#include<stdio.h>
#include<stdlib.h>
int bellman_ford(int G[20][20], int V, int E,int edge[20][2])
{	int i,u,v,k,distance[20],parent[20],s,flag=1;
	for(i=0;i<V;i++)
	{	distance[i]=1000;
		parent[i]=-1;
	}
	printf("enter source");
	scanf("%d",&s);
	distance[s-1]=0;
	for(i=0;i<V -1;i++)
	{	for(k=0;k<E;k++)
		{	u=edge[k][0];
			v=edge[k][1];
			if(distance[u]+G[u][v]< distance[v])
			{	distance[v]= distance[u]+G[u][v];
				parent[v]=u;
			}
		}
	}
	for(k=0;k<E;k++)
	{	u=edge[k][0];
		v=edge[k][1];
		if(distance[u]+G[u][v]<distance[v])
			flag=0;
	}
	if(flag)
	{	for(i=0;i<V;i++)
			printf("\n Node %d------>cost=%d via :%d\n",i+1,distance[i],parent[i]+1);
	}
	return flag;
}
int main()
{	int V,edge[20][2],G[20][20],i,j,k=0;
	printf("\nBELLMAN-FORD:\n");
	printf("enter no of edges:");
	scanf("%d",&V);
	printf("\nenter the graph in matrix form:\n");
	for(i=0;i<V;i++)
	{	for(j=0;j<V;j++)
		{	scanf("%d",&G[i][j]);
			if(G[i][j]!=0)
			{	edge[k][0]=i;
				edge[k++][1]=j;
			}
		}
	}
	if(bellman_ford(G,V,k,edge))
		printf("\n NO Negative weight cycle\n");
	else
		printf("\n Negative weight cycle exists\n");
	return 0;
}
