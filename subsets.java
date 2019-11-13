import java.util.*;
import java.util.Scanner;
class subsets
{
  static int m;
  static int x[]=new int[50];
  static int w[]=new int[50];
  public static void main(String args[])
  {
    int n,total=0,i;
    Scanner in=new Scanner(System.in);
    System.out.println("enter no. of elements");
    n=in.nextInt();
    System.out.println("enter"+n+"elements");
    for(i=1;i<=n;i++)
    {
      w[i]=in.nextInt();
      total=total+w[i];
    }
    System.out.println("enter the max weight");
    m=in.nextInt();
    if(total<m)
    {
      System.out.println("not possible");
      System.exit(1);
    }
    subset(0,1,total);
  }
  public static int subset(int s,int k,int r)
  {
    int i=0;
    x[k]=1;
    if(s+w[k]==m)
    {
     System.out.println("insolutions");
     for(i=1;i<=k;i++)
     System.out.println("\t"+x[i]);
    }
    else if(s+w[k]+w[k+1]<=m)
    subset(s+w[k],k+1,r-w[k]);
    if((s+r-w[k]>=m) && (s+w[k+1]<=m))
    {
     x[k]=0;
     subset(s,k+1,r-w[k]);
    }
    return 0;
  }
}

