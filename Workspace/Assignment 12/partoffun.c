#include<stdio.h>
void sum(int,int );
void main()
{
	int a,b;
	printf("Enter a number :\n");
	scanf("%d%d",&a,&b);
	sum(a,b);	
}
void sum(int x,int y)
{
	int res=x+y;
	printf("%d",res);
}
