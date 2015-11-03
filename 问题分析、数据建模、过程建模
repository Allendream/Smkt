##问题分析
* 现有的超市管理系统大多都是人工的系统，以下是现有的处理流程和问题：
* 用户登录：无需用户登录，几乎没有安全性可言。
* 商品管理：不能详细地对商品信息进行管理。
* 进货管理：采取人工操作，工作繁重且不能精确匹配需求。
* 库存管理：人工管理，工作繁重且容易出错。
* 销售管理：不能对总的销售情况进行统计。
*   在超市里面，销售人员数量很少，顾客无法询问到商品的优缺点，不能就商品的价格和质量进行对比，这样就降低了顾客的购买欲。还有，很多顾客对超市货物摆放的位置不了解，常常会因为要去找某个商品而耽误大量时间，给顾客购物造成了很大的不便。还有一些大超市，在购物高峰期，经常出现收费台收费速度跟不上，造成顾客缴费时拥挤不堪，排很长的队伍。超市应有会员服务，对会员的管理也是一个复杂的问题。
工作负荷大，所有的工作都需要人工进行，对于进货和库存管理甚至需要人工进行统计，工作繁重，且效率低下，容易出错。
财务，账目管理混乱，透明度低，费用开支中，需要大量的纸质文档对信息进行记录，需要支付大量的费用，非常浪费资源。
超市需要处理大量的库存信息，还要时刻更新产品的销售信息，不断添加商品信息，而对不同的信息，如果不用合理的数据库系统来保存，就无法全面了解超市的经营状况。
信息系统尽管功能强大，技术先进，但由于受到自身体系结构，设计思路以及运行机制等限制，也隐含许多不安全因素。常见因素有：数据的输入，输出，存取与备份，源程序以及应用软件，数据库，操作系统等漏洞或缺陷，硬件，通信部分的漏洞，企业内部人员的因素，病毒，“黑客”等因素。

##3.4.1 数据建模
数据建模是一种为数据库定义业务需求的技术，因为数据模型最终需要实现
数据库，因此数据建模也可以称为数据库建模。而数据建模相较于过程建模方式具有一定的优越性，其有助于分析员在建模中比过程建模确定更全面的业务词汇，并且构造的速度要更快，一个完整的数据模型可以比过程建模更加节省时间空间，在现有系统和新开发系统的数据模型之间的相似性远比过程模型之间的相似性高。
数据建模具体步骤包括：
1、构造上下文数据模型开始确立项目范围；
2、绘制一个基于键的数据模型；
3、构造一个具有完整属性的数据模式；
4、通过规定一个成为规范化的过程分析数据模型的适应性和灵活性；
以下就是在数据建模中的第一个重要任务获取实体并且列出每个实体的具体
属性名称与其数据类型。


*  经理表：
* 字段名    数据类型	备注
* Id	Int	主键 不允许为空
* 姓名	Varchar	不允许为空
* 密码	Varchar	不允许为空
* 权限	Varchar	不允许为空
* 联系电话	Varchar	允许为空
* 身份证号	Varchar	允许为空
* 入职日期	datetime	允许为空

* 营业员表：
* 字段名	数据类型	备注
* Id	Int	主键 不允许为空
* 姓名	Varchar	不允许为空
* 密码	Varchar	不允许为空
* 权限	Varchar	不允许为空
* 联系电话	Varchar	允许为空
* 身份证号	Varchar	允许为空
* 入职日期	datetime	允许为空

* 会员表：
* 字段名	数据类型	备注
* Id	Int	主键 不允许为空
* 姓名	Varchar	不允许为空
* 有效时间	datetime	不允许为空
* 折扣等级	Varchar	不允许为空
* 联系电话	Varchar	允许为空

* 库存管理员表：
* 字段名	数据类型	备注
* Id	Int	主键 不允许为空
* 姓名	Varchar	不允许为空
* 密码	varchar	不允许为空
* 权限	Varchar	不允许为空
* 联系电话	Varchar	允许为空
* 身份证号	Varchar	允许为空
* 入职日期	datetime	允许为空

* 销售记录表：
* 字段名	数据类型	备注
* Id	Int	主键 不允许为空
* 销售时间	Datetime	不允许为空
* 销售量	Int	不允许为空
* 销售额	Int	不允许为空
* productID	Int	外键 不允许为空

* 商品库存表：
* 字段名	数据类型	备注
* Id	Int	主键 不允许为空
* 库存量	Int	不允许为空
* productID	Int	外键 不允许为空

* 商品表：
* 字段名	数据类型	备注
* productID	Int	主键 不允许为空
* 商品名称	Varchar	不允许为空
* 价格	Int	不允许为空
* 商品描述	Varchar	允许为空
* 添加日期	Datetime	不允许为空

* 进货记录表：
* 字段名	数据类型	备注
* Id	Int	主键 不允许为空
* productID	Int	不允许为空
* 进货时间	Datetime 	不允许为空
* 到货时间	Datetime	允许为空
* 进货量	Int	不允许为空

在确定了数据库的具体实体、实体的属性以及其数据类型后，下一步将要做的就是构造数据模型。构造数据模型主要分为三个主要步骤，包括了上下文数据模型、基于键的数据模型、具有完整属性的数据模型。
 ![数据建模](http://a2.qpic.cn/psb?/V129rnm70qBYBy/wcHLuo6xCh2S*5t8mazS7tFv4w*WRFc1dKIMzdFiP64!/b/dIoBAAAAAAAA&bo=UgIZAgAAAAADAG4!&rf=viewer_4)
##3.4.2过程建模
功能分解图：![gnfj](http://a3.qpic.cn/psb?/V129rnm70qBYBy/Wt.Ud*CBAHBQ38ydEh4r0GVMIXw4FPSPgd1R4FlZc*E!/b/dHYBAAAAAAAA&bo=ewRuAQAAAAADBzI!&rf=viewer_4)
 

过程建模图：![gcjm](http://a3.qpic.cn/psb?/V129rnm70qBYBy/81nwzel9a*7*DKLGXr2OkQrR3AZPas1U8GwMq8aResM!/b/dHMBAAAAAAAA&bo=UAKDAgAAAAADAPY!&rf=viewer_4)

 

![kcgly](http://a1.qpic.cn/psb?/V129rnm70qBYBy/VEoAidVW6p1QjcHASeM*R*.047gKf7hWz0FBhKJ1Dvw!/b/dHQBAAAAAAAA&bo=iQOFAQAAAAADACs!&rf=viewer_4) 
库存管理员：
1、	处理商品添加事件
2、	处理商品信息修改事件
3、	处理商品删除事件
4、	处理进货计划添加事件
5、	处理库存信息更新事件
![yyy](http://a1.qpic.cn/psb?/V129rnm70qBYBy/vTNuww6.AWghv8JRoUSR3vyxDoKbUOpLRDT6*fa6qkA!/b/dHQBAAAAAAAA&bo=CAMeAQAAAAADADE!&rf=viewer_4) 
营业员：
1、	处理销售记录添加事件
2、	处理会员添加事件
3、	处理会员信息修改事件
4、	处理会员删除事件
![jl](http://a2.qpic.cn/psb?/V129rnm70qBYBy/MI2QhiCgHVRnawpjinYG6YJlTjmVTdUeVD3ikBgdapM!/b/dHUBAAAAAAAA&bo=8QPVAQAAAAADAAM!&rf=viewer_4) 
经理：
1、	处理经理基本信息修改事件
2、	处理员工添加事件
3、	处理员工信息修改事件
4、	处理员工删除事件
5、	处理员工权限修改事件
6、	商品信息查询
7、	库存信息查询
8、	销售记录查询
