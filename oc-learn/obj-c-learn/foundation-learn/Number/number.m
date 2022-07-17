#import <Foundation/Foundation.h>
/* Number makes primative data type object*/
int main(int argc, char *argv[]){
    @autoreleasepool{
        // integer/long/char/float/double create and init and NumberWith*
        NSNumber *intNum = [NSNumber numberWithInteger: 100], *longNum = [NSNumber numberWithLong: 100l], *charNum = [NSNumber numberWithChar: 'X'], *floatNum = [NSNumber numberWithFloat: 100.0], *doubleNum = [NSNumber numberWithDouble: 123e+15];
        int inum = [intNum integerValue];
        long lnum = [longNum longValue];
        char ch = [charNum charValue];
        float fnum = [floatNum floatValue];
        double dnum = [doubleNum doubleValue];

        // comparison
        if ([intNum isEqualToNumber: floatNum] == YES) 
            NSLog (@"Numbers are equal");
        else
            NSLog (@"Numbers are not equal");
        if ([intNum compare: doubleNum] == NSOrderedAscending) 
            NSLog (@"First number is less than second");

        // arithmetic operations to NSDecimalNumber
        NSDecimalNumber *da = [NSDecimalNumber decimalNumberWithString: @"100.0"], *db = [NSDecimalNumber decimalNumberWithString: @"10.0"];
        da = [da decimalNumberBySubtracting: db];
        NSLog(@"%@",da);
        
        // primitives can be converted to obejects with @() expression
        NSLog(@"%@", [@(1) class]);
    }
    return 0;
}
