#import "Node.h"
#import "ExCopy.h"
// CopyNode = Node implement NSCopying protocol
@interface CopyNode: Node <ExCopy>
-(id)copy;
-(id)copyWithMessage: (NSString*) msg;
@end