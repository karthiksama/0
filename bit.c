#include<stdio.h>
void main()
{
 int i, n,k=0,m=0;
printf("enter n value\n");
scanf("%d",&n);
int a[n],b[20],count=0;
printf("enter bits\n");
for( i=0;i<n;i++)
{ scanf("%d",&a[i]);
}
for( i=0;i<n;i++)
{
 if(a[i]==1 && count!=5)
  {count++;
 b[k++]=a[i];
  }
 else
 {count=0;
  b[k++]=a[i];
 }
if(count==5)
  b[k++]=0;
}

count=0;
printf("\n");
for( i=0;i<k;i++)
{
 if(b[i]==1 && count!=5)
  {
  count++;
  a[m++]=b[i];
  }
else
{
 count=0;
a[m++]=b[i];
}
if(count==5)
{
 i=i+2;
a[m++]=b[i];

}
}
printf("after stuffing\n");
for(i=0;i<k;i++)
printf("%d",b[i]);

printf("after destuffing \n");
for(i=0;i<n;i++)
 printf("%d",a[i]);
}
