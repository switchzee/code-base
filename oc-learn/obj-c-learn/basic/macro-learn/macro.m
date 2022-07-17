#import <Foundation/Foundation.h>
/* write a definition to take one or more arguments. */
// performs only literal text subsitution
#define SQUARE(y) ((y)*(y))
#define MMAX(a,b) (((a)>(b))? (a):(b))
int main(int argc, const char **argv){
    int x = MMAX(10,9);
    printf("%d\n",x);
}