#include <stdio.h>
#include <stdlib.h>

int main(int argc, char const *argv[])
{
	int i = 0;
	char* r = "Hello World!";
	printf("%s\n", r);
	for (i = 0; i < 10; ++i)
	{
		/* code */
		printf("%s\n", r);
	}
	return 0;
}


