//
//  GenericNode.h
//  oc-learn
//
//  Created by ByteDance on 2022/7/15.
//

#import <Foundation/Foundation.h>
/** Lightweight generics which replace all 'id' in class with input pointer at runtime.
    Generics restrict type parameter of a class take, provide more information to both the developer and compiler.*/

// self defined generics: replacement only usable in .h file
NS_ASSUME_NONNULL_BEGIN
// restrict generics format: <[type name]: [base oc class pointer]>
// this makes all pointer to subclass of base class is accepted
@interface GenericNode<ObjectType: NSNumber*> : NSObject
@property(strong) id numberData; // id will be replaced by input pointer at runtime.
- (void)storeData:(id)data;
- (void)showData;
@end

NS_ASSUME_NONNULL_END
