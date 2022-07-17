#import "TreeNode.h"

@implementation Node(TreeOps)
-(instancetype) search: (id) val{
    NSLog(@"search node");
    return nil;
}
-(void) insertL:(Node *)newNode{
    NSLog(@"insert left");
}
-(void) insertR:(Node *)newNode{
    NSLog(@"insert right");
}
@end