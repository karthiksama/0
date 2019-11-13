import java.util.*;
class OBST
{
	static int[] p = new int[30];
	static int[] q = new int[30];
	static int[][] w = new int[30][30];
	static int[][] r=new int[30][30];
	static int[][] c=new int[30][30];
	public static void main(String args[])
	{
		int i,j,n;
		Scanner s = new Scanner(System.in);
		System.out.println("enter n value:");
		n=s.nextInt();
		System.out.println("enter probability:");
		for(i=1;i<=n;i++)
	        p[i]=s.nextInt();
		System.out.println("enter probability of unsucessful");
		for(i=0;i<=n;i++)
		q[i]=s.nextInt();
		obst(p,q,n);

	}
		static void obst(int p[],int q[],int n)
		{
			int i,j,m,k;
			for(i=0;i<=n-1;i++)
			{
				w[i][i+1]=q[i];
				r[i][i]=0;
				c[i][i]=0;
				w[i][i+1]=q[i]+q[i+1]+p[i+1];
				r[i][i+1]=i+1;
				c[i][i+1]=q[i]+q[i+1]+p[i+1];
			}
			w[n][n]=q[n];
			r[n][n]=0;
			c[n][n]=0;
			for(m=2;m<=n;m++)
			{
				for(i=0;i<=n-m;i++)
				{
					j=i+m;
					w[i][j]=w[i][j-1]+p[j]+q[j];
					k=find(c,r,i,j);
					c[i][j]=w[i][j]+c[i][k-1]+c[k][j];
					r[i][j]=k;
				}
			}
			System.out.println("minimum cost"+c[0][n]+" "+"root"+r[0][n]);
		}
		static int find(int c[][],int r[][],int i,int j)
		{
			int min=999,l=0;
			for(int m=r[i][j-1];m<=r[i+1][j];m++)
			{
				if(c[i][m-1]+c[m][j]<min)
				{
					min= c[i][m-1]+c[m][j];
					l=m;
				}
			}
			return l;
		}

}
