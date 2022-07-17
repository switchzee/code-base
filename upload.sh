#!/bin/sh

#  Script.sh
#  Calculator
#
#  Created by ByteDance on 2022/7/15.
#  
echo '===welcome to upload script==='
echo 'I have these remotes:'
git remote -v
read -p 'which remote do you want to upload?' uploadRemotes
read -p 'which branch do you want to upload?' uploadBranch
read -p 'which comment do you want to commit?' uploadCommit
echo 'uploading...'
git add .
git commit -m '"'$uploadCommit'"'
git push $uploadRemotes master:$uploadBranch