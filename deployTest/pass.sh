#!bin/bash
url="ec2-3-38-82-118"
scp -i "/Users/jung-mac/Downloads/jung2.pem" docker-compose.yml ec2-user@${url}.ap-northeast-2.compute.amazonaws.com:~/workspace/test;

scp -i "/Users/jung-mac/Downloads/jung2.pem" logdb.jar ec2-user@${url}.ap-northeast-2.compute.amazonaws.com:~/workspace/test;

scp -i "/Users/jung-mac/Downloads/jung2.pem" webapp.jar ec2-user@${url}.ap-northeast-2.compute.amazonaws.com:~/workspace/test;

scp -i "/Users/jung-mac/Downloads/jung2.pem" faketradeapp.jar ec2-user@${url}.ap-northeast-2.compute.amazonaws.com:~/workspace/test;
