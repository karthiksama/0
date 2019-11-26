import java.util.*;
class Bfs 
{
    public static void main(String args[])
    {
        int n,i,j,k,f=0,r=0,v;
        int cost[][]=new int[50][50];
        int visit[]=new int[50];
        int q[]=new int[50];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of vertices");
        n=sc.nextInt();
        System.out.println("enter adjancency matrix");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                cost[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<n;i++)
            visit[i]=0;
        System.out.println("Enter source vertex");
        v=sc.nextInt();
        q[r]=v;
        visit[v]=1;
        k=1;
        System.out.println(v);
        while(k<=n)
        {
            for(j=0;j<n;j++)
            {
                if(cost[v][j]!=0 && visit[j]!=1)
                { 
                    r=r+1;
                    q[r]=j;
                    System.out.println(" "+j);
                    visit[j]=1;
                }
            }
            f=f+1;
            k=k+1;
            v=q[f];
        }
    }    
}
