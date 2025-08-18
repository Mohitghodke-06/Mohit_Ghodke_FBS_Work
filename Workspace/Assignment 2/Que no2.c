#include<stdio.h>
void main ()
{
	int s1= 5;
	int s2= 10;
	int s3= 5;
	if(s1==s2&&s2==s3)
	{
		printf("It is equilateral triangle");
		
	} else { 
			if(s1==s2||s2==s3||s1==s3)
			{
				printf("It is isoscales Traingle");
			}
			else {
					if(s1==s2&&s2!=s3&&s1!=s3);
					{printf("It is Scalene Traingle");
					
					}
			}
	}
}