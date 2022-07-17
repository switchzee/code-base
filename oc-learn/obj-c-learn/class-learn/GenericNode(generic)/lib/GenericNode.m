//
//  GenericNode.m
//  oc-learn
//
//  Created by ByteDance on 2022/7/15.
//

#import "GenericNode.h"

@implementation GenericNode
- (void)storeData:(id)data {
    _numberData = [data copy];
}
- (void)showData{
    NSLog(@"%@", _numberData);
}
@end
