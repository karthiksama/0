
#include<stdio.h>
#include<string.h>
void div(char Amsg[],int n,int nB);
char A[30],Amsg[30],sfmsg[30],B[30],R[50],app[40],fR[10],z=0,Rapp[10],y,Rmsg[30],wmsg[30];
void main()
{
int i,nB,nAmsg;
printf("enter msg\n");
gets(A);
strcpy(Amsg,A);
printf("enter divisor\n");
gets(B);
nB=strlen(B);
printf("length of the divisor=%d\n",nB);
printf("append %d  0's to the msg\n",nB-1);
gets(app);
strcat(Amsg,app);
nAmsg=strlen(Amsg);
printf("msg=%s\n",A);
printf("divisor=%s\n",B);
printf("augmnted msg=%s\n",Amsg);
strcpy(R,Amsg);
printf("******at sender side****\n");
div(Amsg,nAmsg,nB-1);
printf("final remainder to be added to msg=%s\n",Rapp);
strcpy(sfmsg,A);
printf("final msg to be send at senderside=\n");
strcat(sfmsg,Rapp);
printf("%s\n",sfmsg);
strcpy(Rmsg,sfmsg);
printf("msg recieved by receiver=%s\n",Rmsg);
printf("*****at receiver side ******\n");
strcpy(R,Rmsg);
div(Rmsg,nAmsg,nB-1);
printf("final reminder=%s\n",Rapp);
if(strcmp(Rapp,"000")==0)
printf("no error");
else
printf("error");
}
char xor(char p,char q)
{
if(p=='0')
{
if(q=='0')
return '0';
else
return '1';

}
else
{
if(q=='0')
return '1';
else
return '0';
}
}void div(char Amsg[],int n,int nB)
{
int s=0,i,j;
while(nB<n)
{
if(R[s]=='1')
{
for(i=s,j=0;i<=nB;i++,j++)
{
R[i]=xor(R[i],B[j]);
}
}
else
{;
}
 
nB++;
R[nB]=Amsg[nB];
if(nB==n)
{y=s;
for(i=y+1;i<nB;i++)
Rapp[z++]=R[i];
}
printf("remaindr\n");
for(i=s;i<=nB;i++)
printf("%c",R[i]);
printf("\n");
s++;
}
z=0;
}

/*if(nB==n)
{
y=s;
for(i=y+1;i<nB;i++)
Rapp[z++]=R[i];
}
printf("remainder\n");
for(i=s;i<=nB;i++)
printf("%c",R[i]);
printf("\n");
s++;
}
z=0;
}*/


