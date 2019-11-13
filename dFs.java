import java.util.Scanner;
 class main
{
public static void main(String args[])
{
int n,m,i,j,k,v,l=0,top=0,s[],visit[],out[];
s=new int[50];
visit=new int[50];
out=new int[50];
System.out.println("enter the no. of vertices");
Scanner in=new Scanner(System.in);
n=in.nextInt();
System.out.println("enter the n0. of edges");
m=in.nextInt();
int[][] cost=new int[n][n];
System.out.println("enter adjacency matrix:");
for(i=0;i<n;i++)
for(j=0;j<n;j++)
cost[i][j]=in.nextInt();
for(i=0;i<n;i++)
visit[i]=0;
System.out.println("enter the source vertex:");
v=in.nextInt();
s[top]=v;
out[l]=v;
top++;
l++;
visit[v]=1;
k=1;
while(k<=n)
{
for(j=0;j<n;j++)
{
if(cost[v][j]!= 0&& visit[j]!=1)
{
s[top]=j;
out[l]=j;l++;
visit[j]=1;j=0;
v=s[top];top++;
}
}
top=top-1;
v=s[top];
k=k+1;
}
System.out.println("trversed path:");
for(i=0;i<n;i++)
System.out.println(out[i]+"");
}
}
