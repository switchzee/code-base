#import <Foundation/Foundation.h>
#define INTOBJ(v) [NSNumber numberWithInteger: (v)]
/* Set is a collection of unique objects*/
int main(int argc, char *argv[]){
    @autoreleasepool{
        /* NSSet is immutable */
        // 1. creation
        NSSet *set = [NSSet set]; // create an empty set
        [NSSet setWithObjects: INTOBJ(1), nil];

        // 2. comparison
        if ([set isEqualToSet: set] == YES){
            NSLog(@"set == set");
        }

        // 3. search
        if ([set containsObject: INTOBJ(1)] == YES){
            NSLog(@"set contains obj1");
        }

        /* NSMutableSet is mutable*/
        NSMutableSet *mset = [NSMutableSet setWithObjects: INTOBJ(1), INTOBJ(2), nil];
        // 1. adding & removing
        [mset addObject: INTOBJ(4)];
        [mset removeObject: INTOBJ(10)];


        // 2. intersection & union & minus
        [mset intersectSet: mset];
        [mset unionSet: mset];
        [mset minusSet: mset];
    }
    return 0;
}