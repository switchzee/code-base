#import <Foundation/Foundation.h>
#define INTOBJ(v) [NSNumber numberWithInteger: (v)]
/* NSFileManager(Thread safe) manages files and directories*/
int main(int argc, char *argv[]){
    @autoreleasepool{
        // 1. creation
        NSFileManager* fm = [NSFileManager defaultManager];

        // 2. existence
        if ([fm fileExistsAtPath: @"testfile"] == NO) {
            NSLog(@"File doesn't exist");
            return 1;
        }

        // 3. copy file
        if([fm copyItemAtPath: @"testfile" toPath: @"copyfile" error: NULL] == NO){ //copy file
            NSLog(@"File copy");
            return 2;
        }

        // 4. comparison
        if ([fm contentsEqualAtPath: @"copyfile" andPath: @"testfile"] == NO){
            NSLog(@"Files are not equal");
            return 3;
        }

        // 5. movement(rename)
        if ([fm moveItemAtPath: @"copyfile" toPath: @"copyfile2" error: NULL] == NO){
            NSLog(@"File rename Failed");
        }

        // 6. size as an attribute
        NSDictionary *attr;
        if ((attr = [fm attributesOfItemAtPath: @"copyfile2" error: NULL]) == nil){
            NSLog(@"couldn't get file attributes");
            return 5;
        }

        NSLog(@"file size %llu bytes", [[attr objectForKey: NSFileSize] unsignedLongLongValue]);

        // 7. read/create & write/delete
        NSData *fileData = [fm contentsAtPath: @"testfile"];
        if (fileData == nil){ //read
            NSLog(@"file read failed");
            return 1;
        }
        NSLog(@"%@", fileData);

        if ([fm createFileAtPath: @"newfile" contents: fileData attributes: nil] == NO){ //create and write
            NSLog(@"couldn't create the copy");
            return 2;
        }
    }
    return 0;
}