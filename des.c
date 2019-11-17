#include<stdio.h>
#include<stdlib.h>
void main()
{
	int h,n,i,key,ch;
char a[100];
printf("enter thesize of plain text");
scanf("%d",&n);
printf("enter string");

scanf("%s",&a);
printf("enter the key");
scanf("%d",&key);
while(1)
{
printf("\nenter a choice:1.encryption 2.decryption 3.exit\n");
scanf("%d",&h);
switch(h)
{
case 1:printf("encryption");
	for(i=0;i<=n;i++)
	{
	a[i]=a[i]+key;
	printf("%c",a[i]);
	}
	break;
case 2:printf("decryption");
	for(i=0;i<=n;i++)
	{a[i]=a[i]-key;
printf("%c",a[i]);
}break;
case 3:printf("exit\n");
	exit(0);
}}}
