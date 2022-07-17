/*protocol*/
// A protocol is a list of methods which will be implemented by classes.
@protocol Copying
-(id) copy;
@optional // this method's implemetation is not necessary.
-(void) show;
@end