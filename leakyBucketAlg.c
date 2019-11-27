#include<stdio.h>
int bucketsize;
void main()
{
int n,i,output,pktsize;
printf("enter output rate");
scanf("%d",&output);
printf("enter the no. of packets");
scanf("%d",&n);
for(i=1;i<=n;i++)
{
	printf("\n enter packetsize");
	scanf("%d",&pktsize);
	printf("packetno %d,packetsize %d",i,pktsize);
	solution(pktsize,output);
}
}
int solution(int pktsize,int output)
{
	int bucketsize=512;
	if(pktsize>bucketsize)
	printf("bucket overflow");
	else
	{
		while(pktsize>output)
		{
			printf("%d bytes outputed",output);
			pktsize=pktsize-output;
		}
		if(pktsize>0)
		printf("%d bytes outputed",pktsize);
	}
}
