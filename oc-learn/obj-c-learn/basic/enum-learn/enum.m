#import <Foundation/Foundation.h>
// enum can only be assigned no,yes
typedef enum {no,yes} boolean;
int main(int argc, char *argv[]){
    @autoreleasepool{
        boolean judge = no;
        switch(judge){
            case no: break;
            case yes: break;
        }
    }
    return 0;
}
