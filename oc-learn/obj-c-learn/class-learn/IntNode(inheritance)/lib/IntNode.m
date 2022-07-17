//
//  IntNode.m
//  objective-c-learn
//
//  Created by ByteDance on 2022/7/3.
//

#import "IntNode.h"

@implementation IntNode
+(void)print{
    NSLog(@"[IntNode] class method");
}
-(int)getData{
    if([self.data isKindOfClass:[NSNumber class]] == YES)
        return [(NSNumber*)(self.data) intValue];
    return 0;
}
-(void)showInfo{
    NSLog(@"[intNode]: {name %@, data %d, next %p, right %p, left %p}", self.name,[self getData],self.next,
          self.left,self.right);
}
-(instancetype)initWithData{
    self = [super init];
    if (self){
        self.data = 0;
    }
    return self;
}
@end
