#include<stdio.h>
#include<string.h>
void main()
{
 int i=10,j;
char a[20][20],c[20];
printf("enter the flag");
scanf("%s",a[0]);
printf("\nenter the string s");
printf("\nenter x to exit");
i=1;
while(i<15)
     { 	
	scanf("%s",c);
	if((strcmp(c,"x")==0))
  	break;
	if((strcmp(c,a[0])==0)||(strcmp(c,"esc")==0))
	{
	 strcpy(a[i],"esc");
	  i++;
	 strcpy(a[i],c);
	  i++;
	}
	else
	 {
	  strcpy(a[i],c);
	  i++;
 	 }
    }
strcpy(a[i],a[0]);
for(j=0;j<=i;j++)
{
 printf("%s",a[j]);
}

}
