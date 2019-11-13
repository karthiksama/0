import java.util.*;
class jobsequencing
{
     public static void main(String args[])
     {
	int i,r,q,k=1,x=0,n,p[],d[],j[],max=0;
	Scanner in = new Scanner(System.in);
	System.out.println("enter no of  jobs");
	n=in.nextInt();
	p=new int[20];
	d=new int[20];
	System.out.println("enter profits");
	for(i=1;i<=n;i++)
      { 
	p[i]=in.nextInt();
      }
	System.out.println("enter dead lines");
	for(i=1;i<=n;i++)
	d[i]=in.nextInt();

 	j=new int[20];
	d[0]=0;j[0]=0;j[1]=1;
	for(i=2;i<=n;i++)
	{
 	  r=k;
	    while((d[j[r]]>d[i])&&(d[j[r]]!=r))
	        r=r-1;
		if((d[j[r]]<=d[i])&&(d[i]>r))
		{
		  for(q=k;q>=r;q--)
			j[q+1]=j[q];
			j[r+1]=i;
			k=k+1;
		}
	}
System.out.println("max.profit");
for(i=1;i<=n;i++)
max=max+(p[j[i]]);
System.out.println(max);
System.out.println("job sequener");
for(i=1;i<=n;i++)
System.out.println(j[i]+" ");
}
}
