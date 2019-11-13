import java.util.*;
class mergesort
{
      public static void main(String args[]) 
      {
          int n,i;
          System.out.println("enter no. of elements");
          Scanner s=new Scanner(System.in);
          n=s.nextInt();
          System.out.println("enter the elements");
          int a[]=new int[n];
          for(i=0;i<n;i++)
          a[i]=s.nextInt();
          sort t = new sort();
          t.merge(a,0,n-1);
          System.out.println("elements are:");
          for(i=0;i<n;i++) 
          System.out.print(" "+a[i]);
     }
}
class sort
{
     void merge(int b[],int low,int high)
    {
          if(low<high)
          {
            int mid=(low+high)/2;
            merge(b,low,mid);
            merge(b,mid+1,high);
            msort(b,low,mid,high);
          }
    }
     void msort(int a[],int l,int m,int h)
     {
          int temp[] = new int[23];
          int i=l,j=m+1,lo=l;
          while((lo<=m)&&(j<=h))
          {
            if(a[lo]<=a[j])
             {
               temp[i++]=a[lo++];
             }
            else
             {
               temp[i++]=a[j++];
             }
          }
          if(lo>m)
          {
              for(int k=j;k<=h;k++)
              temp[i++]=a[k];
          }
          else
          {
              for(int k=lo;k<=m;k++)
              temp[i++]= a[k];
          }
         for(int p=l;p<=h;p++)
          {
              a[p]=temp[p];
          }
     }
}
