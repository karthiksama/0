import java.lang.*;
import java.util.Scanner;
class nqueens
{
  static int[] x=new int[50];
  public static void main(String args[])
  {
    int n;
    System.out.println("enter no. of queens");
    Scanner in =new Scanner (System.in);
    n= in.nextInt();
    nqueens(1,n);
  }
  public static void nqueens(int k,int n)
  {
    int i,j;
    for(i=1;i<=n;i++)
    {
      if(place(k,i)==1)
      {
        x[k]=i;
        if(k==n)
        {
           for(j=1;j<=n;j++)
           System.out.println(x[j]+" ");
           System.out.println(" ");
        }
        else
         nqueens(k+1,n);
      }
    }
  }
  public static int place(int k,int i)
  {
    for(int j=1;j<=k-1;j++)
    {
      if((x[j]==i)||(Math.abs(x[j]-i)==Math.abs(j-k)))
      return 0;
    }
    return 1;
  }
}



