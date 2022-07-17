#import <Foundation/Foundation.h>
#import "lib/Node.h"
int main(int argc, char *argv[]){
    @autoreleasepool {
        /*create an instance
         1. alloc memory
         2. calls init
         **/
        Node *node = [[Node alloc]initWithData: 0];
        // calls class method
        [Node print];
        // calls instance method
        node->publicInteger = 1.0;
        [node setPrivateInteger: 10 andProtectedDouble: 1.0];
        [node insert:[[Node alloc]initWithData:@"next"]];
        [node showInfo];
        [node.next showInfo];
        gNodeDef = 0;
        // release memory is not allowed when using ARC
        // [node.next release];

        // calls extension method is not allowed
        // [node privatePrint];

        NSObject* obj = [Node new];
        [obj isEqualTo: obj];
    }
}
