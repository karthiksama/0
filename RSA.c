#include<stdio.h>
#include<math.h>
int gcd(int n1,int n2);
int powmod(int msg,int z,int n);
int main()
{
	int j,p,q,n,tot,e,i,k,m,cipher,decrypt,d;
	printf("enter two prime numbers \n");
	scanf("%d %d",&p,&q);
	n=p*q;
	printf("value of modulus=%d \n",n);
	tot=(p-1)*(q-1);
	printf("value of totient function=%d \n",tot);
	for(i=2;i<tot;i++)
	{
		if(gcd(i,tot)==1)
			e=i;
	}
	printf("\n e=%d ",e);
	for(k=0;k<e;k++)
	{
		j=((1+k*tot)%e);
		if(j==0)
			d=((1+k*tot)/e);
	}
	printf("\n d=%d",d);
	printf("\n enter the plain message:");
	scanf("%d",&m);
	cipher=powmod(m,e,n);
	printf("\n cipher text=%d",cipher);
	decrypt=powmod(cipher,d,n);
	printf("\n decrypted text=%d \n",decrypt);
	return 0;
}
int gcd(int n1,int n2)
{
	int i,g;
	for(i=1;i<=n1&&i<=n2;i++)
	{
		if(n1%i==0&&n2%i==0)
			g=i;
	}
	if(g==1)
		return 1;
	else
		return 0;
}
int powmod(int msg,int z,int n)
{
	int a;
	long c;
	c=pow(msg,z);
	a=c%n;
	return a;
}

