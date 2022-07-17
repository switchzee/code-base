/*IntNode will treat the data of Node as an integer.*/
#import "Node.h"

/* inheritance */ 
// subclass will inherits all the variables and methods of parents. 
@interface IntNode : Node
// overwritten
+(void)print;
-(void)showInfo;
-(instancetype)initWithData;
// new method
-(int)getData;
@end

