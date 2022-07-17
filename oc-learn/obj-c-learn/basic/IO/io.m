/*basic of objective c*/
#import <Foundation/Foundation.h>
@interface Fraction: NSObject
-(NSString *)description;
@end
@implementation Fraction
-(NSString *)description{
    return @"Fraction";
}
@end
int main(int argc, char *argv[]){
    /* 1. I/O string format specifiers */
    // specifier of c + 
    // %@ for Objective-C object as string
    // %p for void pointer address in hexadecimal
    // %g/G, %a/A, %f/F, %e/E for double
    NSDate *date = [[NSDate alloc]init]; // current date
    NSLog(@"current date is %@, this object pointer is at %p.", date, date);

    // @"%@" prints any object's description method
    Fraction *fraction = [Fraction new];
    NSLog(@"%@", fraction);
}