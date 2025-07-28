#include<stdio.h>
void main ()
{
	int min = 140;
	int hr;
	hr = min/60;
	min = min%60;
	printf("%d %d",hr,min);
	
}