#import "Node.h"
int gNodeDef = 0; // can be referenced from anywhere in that module if declared as extern.
static int gNodeCnt = 0; // makes it accessible to any method defined in the implementation section, yet it does not make it accessible from outside the file.

@interface Node()
-(void)privatePrint;
@end

/*@implemetation defines a class*/
@implementation Node
+(void)print{
    NSLog(@"[Node]: class method");
}
-(void)privatePrint{
    NSLog(@"private print");
}
-(void) setPrivateInteger: (int)pi
        andProtectedDouble: (double)pd{
            privateInteger = pi;
            protectedDouble = pd;
        }
-(void) set: (int)pi :(double)pd{
    privateInteger = pi;
    protectedDouble = pd;
}
-(int)privateInteger{
    return privateInteger;
}
// self causes your class' "setter" for this variable to be called.
// self.privateInteger = 10; is equivalent to [self setPrivateInteger: 10];
-(void)showInfo{
    NSLog(@"[Node]: {name %@, data %p, next %p, right %p, left %p}", self.name,self.data,self.next,
          self.left,self.right);
}

// self represents the receiver of current message or the instance which calls current method
-(void)insert:(Node *)o{
    o.next = self.next;
    self.next = o;
}

- (instancetype)initWithData:(id)data{
    // initialized only once
    gNodeCnt++;
    NSLog(@"initialize Node %d times.", gNodeCnt);
    self=[super init];
    if (self){
        self.data = data;
    }
    return self;
}
@end
