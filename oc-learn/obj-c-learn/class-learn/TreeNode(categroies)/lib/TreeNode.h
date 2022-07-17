#import "Node.h"
// TreeNode = Node + TreeOps
/* category adds some new methods to original class. */
// it can also use to declare private methods.
@interface Node(TreeOps)
-(instancetype) search: (id) val;
-(void) insertL: (Node *)newNode;
-(void) insertR: (Node *)newNode;
@end
/*NOTE:
1. category cannot add instance variables
2. can override but not recommand
3. Any methods that you declare in a category will be available to all instances of the original class, as well as any subclasses of the original class. At runtime, there’s no difference between a method added by a category and one that is implemented by the original class.*/