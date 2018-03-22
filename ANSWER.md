# TDD

### 如何下载
+ 答案详情请点击上方 作业答案下载，来下载 `answer.zip` 压缩包文件 

### 如何启动
+ 解压 `answer.zip`，用 IntelliJ IDE 打开
+ 运行测试
    
    根目录下执行`./gradlew clean test`


### 重点讲解
+ 仔细阅读题目的README.md,来确定都有哪些条件以及优先级
```
1 当包含3，return 'Fizz'
2 当是3 * 5 * 7的倍数，return 'FizzBuzzWhizz'
  当是3 * 5的倍数，return 'FizzBuzz'
  当是3 * 7的倍数，return 'FizzWhizz'
  当是5 * 7的倍数，return 'BuzzWhizz'
  当是3的倍数，return 'Fizz'
  当是5的倍数，return 'Buzz'
  当是7的倍数，return 'Whiz'
3 当不符合以上规则，return input
```
+ 针对第一优先级
```
if (num.contains("3")) {
  return "Fizz";
}
```
+ 针对第二优先级，最简单的7个if-else就可以实现，为了代码更好的隔离和可复用，我们应对基本条件进行判断，也就是对3，5，7判断，每种情况单独抽一个函数，他们的倍数是可以通过它们的结果相加得出来
  + 如果它是3的倍数，就返回"Fizz"，否则为空
  + 如果它是5的倍数，就返回"Buzz"，否则为空
  + 如果它是7的倍数，就返回"Whizz"，否则为空
```
public String threeMultiple(int i) {
   return i % 3 == 0 ? "Fizz" : "";
}
public String fiveMultiple(int i) {
   return i % 5 == 0 ? "Buzz" : "";
}
public String sevenMultiple(int i) {
   return i % 7 == 0 ? "Whizz" : "";
}
```
+ 针对第三优先级,不符合的情况应返回原数字，我们应该有一个for循环来判断是否符合情况，sayNumber()里面应该判断是否符合情况，也就是将以上条件按优先级来判断
```
for (int i = 1; i <= count; i++) {
    String result = sayNumber(i);
    results.add(result);
}
``` 