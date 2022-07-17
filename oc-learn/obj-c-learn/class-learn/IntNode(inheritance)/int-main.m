#import <Foundation/Foundation.h>
#import "lib/IntNode.h"
void print(id obj){
    NSLog(@"%@", obj);
}
int main(int argc, char *argv[]){
    @autoreleasepool{
        NSNumber *integer = [NSNumber numberWithInt:10];
        // 1. inherit
        NSLog(@"------inheritance-----");
        [IntNode print]; // inherit all method
        IntNode *intNode = [[IntNode alloc] initWithData: integer];
        [intNode showInfo];
        //intNode->privateInteger = 1;subclass can not access private member.
        
        // 2. polymorphism: oc is dynamic binding not static, so an object pointed by it super class pointer is equivalent to by its class when calling methods
        NSLog(@"------polymorphism-----");
        Node* node = [[IntNode alloc]initWithData: integer];
        [node showInfo];
//        NSLog(@"new method getData:%d\n",
//        [node getData]); unqiue method of subclass cannot be called.
        id pointer = [[IntNode alloc]initWithData: integer];
        [pointer showInfo];

        // 3. dynamic types
        NSLog(@"----dynamic types-----");
        print([pointer class]);
        print([intNode class]);
        print([node class]);
        // Is the object an instance of class-object or a descendant?
        if([node isKindOfClass: [Node class]]){
            NSLog(@"true");
        }else {
            NSLog(@"false");
        }
        // Is the object an instance of class-object?
        if([node isMemberOfClass: [IntNode class]]){
            NSLog(@"true");
        }else {
            NSLog(@"false");
        }
    }
    return 0;
}
