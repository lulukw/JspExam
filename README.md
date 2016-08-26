# JspExam


driver=com.mysql.jdbc.Driver
dburl=jdbc\:mysql\://localhost\:3306/sakila
user=root
password=123456


 mvn compile         //编译工程命令
 mvn clean           //清除之前的编译内容
mvn exec:java -Dexec.mainClass="com.hand.App" -Dexec.args="arg0 arg1 arg2" //在dos界面运行工程，".App"中的内容根据main方法的位置而定
