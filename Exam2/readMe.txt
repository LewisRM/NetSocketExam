1) 确保文件 exam1.pdf 在工程目录下
2）运行 mvn clean compile exec:java -Dexec.mainClass="com.hand.App" -Dexec.args="arg0 arg1 arg2"
3）等待一会，工程目录下就会形成 1.pdf的输出文件
4） 用ctrl+C 来终止运行程序