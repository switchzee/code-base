#import "CopyNode.h"

@implementation CopyNode
-(id) copy{
    NSLog(@"copying");
    return nil;
}
-(id) copyWithMessage: (NSString*) msg{
    NSLog(@"%@",msg);
    [self copy];
    return nil;
}
@end
