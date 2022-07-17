#import <Foundation/Foundation.h>
extern int gNodeDef; // declares a defined global variable as an external variable sothat it can be accessed changed by any other meth- ods or functions.
/* 1. @interface defines a class*/ 
// interface object can not be statically allocated(means allocated in compile time)
@interface Node : NSObject{
    // instance variable
    @private // Methods defined in the class can directly access, but subclasses cannot.
    int privateInteger;

    @protected // default, Methods defined in the class and any subclasses can directly access
    double protectedDouble;

    @public //Methods defined in the class and any other classes or modules can directly access 
    int publicInteger;
}

/* 2. @property will make compiler automatically generated getter and setter. Ergo it configures how an object can be exposed. */
// instance.property = value is equivalent to [instance setProperty: value]
@property(readonly) NSString *name;
// id is a pointer to any oc object.
@property id data;
@property id next, left, right;

/*4. Method Declarations*/
// (<return type>) <function name>: (<parameter type>)<val name>
        //   <second parameter name>: (<parameter type>)<val name>
        //   ...;
// + means class method; - means instance method
+(void) print;
-(void) showInfo;
// methods(messages) with parameters
-(void) insert: (id)o;
-(void) setPrivateInteger: (int) pi
        andProtectedDouble: (double) pd;
// argument names are optional 
-(void) set: (int)pi :(double)pd;

/*5. constructor*/
// instancetype means instance of the class or a subclass of that class they are called on, which enables overwrite
-(instancetype)initWithData: (id)data;

@end
