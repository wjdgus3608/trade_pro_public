#!bin/bash
url="ec2-13-125-15-165"
scp -i "/Users/jung-mac/Downloads/jung2.pem" docker-compose.yml ec2-user@${url}.ap-northeast-2.compute.amazonaws.com:~/workspace/fake;

scp -i "/Users/jung-mac/Downloads/jung2.pem" logdb.jar ec2-user@${url}.ap-northeast-2.compute.amazonaws.com:~/workspace/fake;

scp -i "/Users/jung-mac/Downloads/jung2.pem" webapp.jar ec2-user@${url}.ap-northeast-2.compute.amazonaws.com:~/workspace/fake;

scp -i "/Users/jung-mac/Downloads/jung2.pem" boxlogapp.jar ec2-user@${url}.ap-northeast-2.compute.amazonaws.com:~/workspace/fake;
