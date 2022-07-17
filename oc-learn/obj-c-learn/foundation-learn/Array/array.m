#import <Foundation/Foundation.h>
/* Array is ordered collection of objects, objects in an array are not necessarily of one particular type, */
int main(int argc, char *argv[]){
    /* NSArray is immutable */
    // 1. creation
    NSArray *constantArr = [NSArray arrayWithObjects: @"Jan", @"Feb", nil];// To mark the end of the list,nil must be specified as the last value in the list—it isn’t actually stored inside the array.
    constantArr = @[@"Jan", @"Feb"]; // literal

    // 2. indexing: note that count is a property
    for (int i=0;i<constantArr.count;i++)
        NSLog(@"%@",constantArr[i]);


    /* NSMutableArray is mutable*/
    // 1. creation
    NSMutableArray *mArr = [NSMutableArray array]; // create an empty array.

    // 2. insertion
    for (int i=0;i<9;i++){
        [mArr addObject: [NSNumber numberWithInteger: i]];
    }
    [mArr insertObject: [NSNumber numberWithInteger: 1] atIndex: 1];
    
    // 3. removal
    [mArr removeObjectAtIndex: 1];
    [mArr removeLastObject];


}
