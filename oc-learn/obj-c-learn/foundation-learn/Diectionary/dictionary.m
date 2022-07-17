#import <Foundation/Foundation.h>
/* dictionary is a collection of key-value object pairs. 
keys must be unique object, but not nil.*/
int main(int argc, char *argv[]){
    @autoreleasepool{
        // 1. creation
        NSDictionary *dic = @{
            @"a": [NSNumber numberWithInteger: 10],
            [NSNumber numberWithInteger: 10]: @"b"
        }; // using dictionary literal
        NSLog(@"%@", dic);
        
        // 2. enumerating & accessing
        for (id key in dic){
            NSLog(@"%@", dic[key]);
        }

    }
    return 0;
}
