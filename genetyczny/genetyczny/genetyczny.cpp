#include "stdafx.h"
#include <iostream>
#include <time.h>
#include "gen.h"
#include "genetyczny.h"

#define ilosc 5

using namespace std;

int main()
{
	srand(time(NULL));
	gen geny[ilosc];

	for (int i = 0; i < ilosc; i++) {
		int tmp = rand() % 127 + 1;
		geny[i] = gen(tmp);
		cout << "tmp = " << tmp << endl << "var = " << geny[i].liczba() << endl << endl;
	}


	system("PAUSE");
    return 0;
}

