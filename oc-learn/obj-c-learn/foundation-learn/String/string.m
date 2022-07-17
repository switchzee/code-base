#import <Foundation/Foundation.h>
/* NSString objects consist of unichar characters. 
A unichar character is a multibyte character according to the Unicode standard.*/

int main(int argc, char *argv[]){
    @autoreleasepool{
        /* NSString or @"..." is immutable string; */
        NSString *str = @"Programming is fun";
        NSString *constStr = @"Programming is fun";

        [str lowercaseString];
        [str uppercaseString];

        // 2. copy
        NSString *cs = [NSString stringWithString: str];

        // 3. appending
        str = [str stringByAppendingString: constStr];

        // 4. comparison
        if([str isEqualToString: str]){
            NSLog(@"str == str");
        }

        // 5. substring [)
        str = [str substringToIndex: 3];
        str = [str substringFromIndex: 5];
        str = [str substringWithRange: NSMakeRange(8,6)];

        NSComparisonResult compareResult;
        compareResult = [str compare: str];
        if (compareResult == NSOrderedSame){
            NSLog(@"same");
        } else if (compareResult == NSOrderedAscending){
            NSLog(@"ascending");
        } else if (compareResult == NSOrderedDescending){
            NSLog(@"descending");
        }

        /* NSMutableString is mutable string*/
        NSMutableString *mstr = [NSMutableString stringWithString: @"mutable string"];
        NSLog(@"%@", mstr);

        // 1. insert chars
        [mstr insertString: @"mutable" atIndex: [mstr length]];
        [mstr appendString: @"string"];

        // 2. delete chars
        [mstr deleteCharactersInRange: NSMakeRange(16,13)]; // NSMakeRange(loc, len)

        // 3. set string
        [mstr setString: @"set string"];

        // 4. search
        NSRange substrRange = [mstr rangeOfString: @"string"];

        // 5. replace
        [mstr replaceCharactersInRange: substrRange 
                            withString: @"replacement"];
    }
    return 0;
}
