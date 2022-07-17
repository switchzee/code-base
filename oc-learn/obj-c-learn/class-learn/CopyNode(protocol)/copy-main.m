#import "lib/CopyNode.h"
int main(int argc, const char *argv[]){
    @autoreleasepool{
        CopyNode* copyNode = [CopyNode new];
        [copyNode copyWithMessage: @"hello copy"];

        /*@protocol(<name>) produces a protcol object*/
        // 1. check confromance.
        //conformsToProtocol check whether an object confroms to a protocol
        if([copyNode conformsToProtocol: @protocol (Copying)] == YES){
            NSLog(@"implemented copying protocol.");
        }
        // use <> check conformance in compile time. 
        // i.e id<Copying> error since id does not implement Copying protocol.
        CopyNode<Copying>* node = [CopyNode new];   
    }
    return 0;
}