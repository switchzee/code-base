#import "copying.h"
@protocol ExCopy <Copying>
-(void) copyWithMessage: (NSString*)msg;
@end