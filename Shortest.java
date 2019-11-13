import java.util.*;
public class Shortest
{
 static int infinity=999;
 static int[][] G = new int[50][50];
 static int[] dist =new int[50];
 static int[] s =new int[50];
 static int min,u;
 public static void main(String args[])
 {
  int n,v,i,j;
  Scanner sc = new Scanner(System.in);
  System.out.println("Shortest path:");
  System.out.println("Enter no. of nodes:");
  n=sc.nextInt();
  System.out.println("Enter graph in matrix format:");
  for(i=1;i<=n;i++)
  {
   for(j=1;j<=n;j++)
   {
    G[i][j]=sc.nextInt();
    if(G[i][j]==0 && i!=j)
	G[i][j]=infinity;
   }
  }
  System.out.println("Enter source vertex :");
  v=sc.nextInt();
  shortestPath(v,n);
 }
 public static void shortestPath(int v,int n)
 {
  int i,j,w,num;
  for(i=1;i<=n;i++)
  {
   s[i]=0;
   dist[i]=G[v][i];
  }
  s[v]=1;
  dist[v]=0;
  for(num=2;num<=n;num++)
  {
   for(i=1;i<=n;i++)
   {
    if(s[i]!=1)
    {
      u=i;
      min=dist[u];
      break;
    }
   }
   for(i=1;i<=n;i++)
   {
    if(dist[i]<min && s[i]!=1)
    {
     u=i;
     min=dist[u];
    }
   }
   s[u]=1;
   for(w=1;w<=n;w++)
   {
    if(G[u][w]!=infinity && G[u][w]!=0)
    {
     if(dist[w]>(dist[u]+G[u][w]))
         dist[w]=dist[u]+G[u][w];
    }
   }
  }
  for(i=1;i<=n;i++)
  {
   System.out.println("node "+i+" cost = "+dist[i]);
  }
 }
}
