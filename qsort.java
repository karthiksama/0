import java.io.*;
import java.util.*;
class qsort
{
  public static void main(String args[])
  { int i,j,k,temp;
     Scanner s= new Scanner(System.in);
     System.out.println("enter no. of values");
     int n=s.nextInt();
     int a[]=new int[n];
     for(i=0;i<n;i++)
       {
         System.out.println("enter element");
         a[i]=s.nextInt();
       }
       sort sr= new sort();
       sr.quicksort(a,0,n-1);
      System.out.println("sorted elements are:");
      for(i=0;i<n;i++)
     System.out.println(a[i]);
   }

}
class sort
{
 void quicksort(int a[],int l, int h)
 {
  int key,i,j,temp;
  i=l;
  j=h;
  while(i<j) 
  {
   key=a[l];
     while(a[i]<key)
     i=i+1;
     while(a[j]>key)
     j=j-1;
     if(i<j)
     {
       temp=a[i];
       a[i]=a[j];
       a[j]=temp;
     }
     else
       {

    temp=a[l];
    a[l]=a[j];
    a[j]=temp;
    }
    quicksort(a,l,j-1);
    quicksort(a,j+1,h);
  }
 }
}
