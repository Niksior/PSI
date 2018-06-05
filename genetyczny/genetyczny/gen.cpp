#include "stdafx.h"
#include "gen.h"
#include <cmath>

//dodatek
//przetestowaæ przy zmiennym prawdopodbieñstwie mutacji i prawd krzy¿owania

gen::gen()
{
}

gen::gen(int val) {
	int i = 6;
	int tmp;
	while (val - pow(2, i) == 0)
		i--;
	while (val) {
		bytes[i] = val % 2;
		val /= 2;
		i--;
		if (i < 0) break;
	}

}

int gen::liczba() {
	int val = 0;
	for (int i = 0; i < 7; i++) {
		val += (bytes[i] * pow(2, i));
	}
	return val;
}

gen::~gen()
{
}
