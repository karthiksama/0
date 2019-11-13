import java.util.*;
import java.util.Scanner;
 class kruskals
{
 static int path[];
 static int n,m,mincost,i,j;
 public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
  System.out.println("Enter number of vertices in Graph");
  n=s.nextInt();
  System.out.println("Enter number of edges in graph");
  m=s.nextInt();
  path=new int[n+1];
  edge e[]=new edge[m];
  edge t=new edge();
  for(i=0;i<m;i++)
  {
   e[i]=new edge();
   System.out.println("Enter two vertices and weight of edge");
   System.out.println("First Vertex");
   e[i].u=s.nextInt();
   System.out.println("Second Vertex");
   e[i].v=s.nextInt();
   System.out.println("Enter weight");
   e[i].wt=s.nextInt();
  }
 for(i=0;i<m-1;i++)
{
 for(j=0;j<m-i-1;j++)
 {
  if(e[j].wt>e[j+1].wt)
  {
   t=e[j];
   e[j]=e[j+1];
   e[j+1]=t;
   }
  }
}
for(i=1;i<=n;i++)
path[i]=0;
i=0;
j=0;
mincost=0;
System.out.println();
while((i!=n-1)&&(j!=m))
{
 System.out.println("edge("+e[j].u+","+e[j].v+")"+"with weight"+e[j].wt+" ");
 if(checkcycle(e[j]))
  {
   mincost=mincost+e[j].wt;
   i++;
   System.out.println("is selected");
   System.out.println(mincost);
   }
 else
 System.out.println("Is discarded");
 j++;
 }
if(i!=n-1)
 System.out.println("Minimum Spanning Tree cannot be formed");
 s.close();
 }
public static boolean checkcycle(edge e)
{
 int u=e.u;
 int v=e.v;
 while(path[u]>0)
  u=path[u];
 while(path[v]>0)
  v=path[v];
  if(u!=v)
   {
    path[u]=v;
    return true;
   }
  return false;
}
static class edge
{
 int u,v,wt;
}
}
