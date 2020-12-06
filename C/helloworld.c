#include <stdio.h>

void sayHello(int num);

int main(char *argc, char[] *argv){
  sayHello(argv[1]);
}

void sayHello(int num){
  for(int i = 0; i < num; i++){
    printf("Hello world!");
   }
}
