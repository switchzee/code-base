#import <Foundation/Foundation.h>
int main(int argc, char *argv[]){
    // Block is lambda function for c
    // Note that Block is NSObject
    // definition: <return type> (^<block name>) (<argument type>,...) = ^(<arguments>) {...}
    // call: <block name> ()
    // just like function
    int(^gcd)(int,int) = ^(int u, int v){
        int tmp;
        while(v){
            tmp = u%v;
            u=v;
            v=tmp;
        }
        return u;
    };
    printf("%d\n", gcd(3,5));
}
