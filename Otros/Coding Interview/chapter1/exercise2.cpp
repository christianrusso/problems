#include <fstream>
#include <iostream>
#include <istream>
#include <vector>
#include <math.h>
#include <string>
#include <stdio.h>
#include <stdlib.h>

using namespace std;

void reverse(char *str){
     char * end = str;
    char tmp;
    if(str){
        while(*end){
            ++end;
        }
         --end;


        while(str< end){
            tmp = *str;
            *str++ = *end;
            *end-- = tmp;
        }
    }
}



int main(int argc, char* argv[]){
    char * str = "hola";
    reverse(str);
    cout << str << endl;
}
