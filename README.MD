##### 2019-02-18 在注册权限处，添加用户名的校验；用户名已经存在，不能注册同名新用户


##### 目前分页的地方有个问题
当不输入查询条件进行查询，分页完全ok；
But 输入多重条件进行查询，则查询的结果是查询条件的第一页；若此时在其他页面上，返回到第一页，查询不正确

##### 测试用例展示页面难点：涉及的列数比较多，同一个页面一个任务的所有测试用例，将看不清楚
测试用例，本身写在excel中也是很长的，看测试人员自身，
有人涉及的字段短，且字段个数少；
有人涉及的字段长，且字段个数多；



#### 20190308 开始增加自动化测试用例的生成，几张base表结构已经初步设计好
考虑到以后的延展性，获取需要加上自动生成用例标记 和手工新增用例标记

自动生成的用例，只能是异常测试用例，原因是数据的随机性
那自动生成的用例，如若被修改了，就是手工测试用例
每次一个接口，都是新增自动生成用例，必然需要删除之钱的自动用例【不含手工】

批量新增的功能，用thymeleaf在页面上怎么获取值
批量修改的功能

接口中的签名，根据若干个字段和key生成签名，要怎么去做
因为有的接口，有的接口中有，每天的签名key，有的项目有的接口是变化的
要考虑一个比较好的方式，来实现

=====
#### 20190316 修复了一些小bug，比如bug那边tracking，通过判断新输入的内容，内容大于1个字符，则新增tracking否则不增加
#### 20190321 修复了一些小bug，比如case页面是否通过，case等级，以前要用数字1.2.3，现在用高中低下拉框表示


#### 20190530 修复了一些小bug，比如case页面新增删除或更新之后，跳转到当前所有的测试用例的页面，不在跳转到测试任务首页
#### 20190530 发送模板引擎里面，添加了bcc
#### 20190530 发送模板引擎里面，添加了一个新字段bugnum
#### 20190530 发送模板引擎里面，待添加每个页面的logo,这样更加炫丽一点【待完成】
#### 20190530 注册页面，需要添加多一点的js验证，比如用户名的长度，用户名的字符类型，昵称的类型等


#### A面。。❤
