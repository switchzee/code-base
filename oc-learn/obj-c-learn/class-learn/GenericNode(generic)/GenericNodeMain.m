//
//  GenericNodeMain.m
//  oc-learn
//
//  Created by ByteDance on 2022/7/15.
//

#import <Foundation/Foundation.h>
#import "GenericNode.h"

int main(int argc, char **argv){
    // FIXME: compiler error: NSString* is not a pointer of NSNumber.
    // GenericNode<NSString*> *errorNode = [GenericNode new];
    
    GenericNode<NSDecimalNumber*> *decimalNode = [GenericNode new];
    [decimalNode storeData:[NSDecimalNumber numberWithDouble:10]];
    [decimalNode showData];
}
