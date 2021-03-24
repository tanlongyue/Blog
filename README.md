#Spring Boot-User-Login-register

##1、环境准备

    1： 执行db目录下 MySql脚本
    2： JDK 1.8版本 
    3： Maven库 2.1.6版本

##2、基础配置类

  一、com.yiyue.personalblog.shiro(包名)
  
    1： ShiroConfig
    作用：进行拦截用户请求,配置Session的缓存管理器
    2:  CustomRolesOrAuthorizationFilter
    作用：对用户登陆角色进行判断并查看是否有权限访问相应的接口.
    3:  CustomSessionManager
    作用：用户进行会话时Session获取地.
    
  二、com.yiyue.personalblog.swagger(包名)
    
    1:SwaggerConfig
    作用：用于调试Controller中API接口.
  
  三、com.yiyue.personalblog.config(包名)
    
    1:CorsConfig
    作用：对于前后端分离的项目时，如若遇上ajax请求等,浏览器会模拟请求访问一次,第二次访问
    则是真实的访问所以这里前后端分离的情况下会造成跨域问题.

  四、com.yiyue.personalblog.redis(包名)
   
    1:RedisUtil
    作用：对Redis进行操作
    如下：
        1、(String)字符串类型：
                它是一个二进制安全的字符串，意味着它不仅能够存储字符串、还能存储图片、视频等多种类型, 最大长度支持512M。对每种数据类型，
                Redis都提供了丰富的操作命令，
        如：
            GET/MGET
            SET/SETEX/MSET/MSETNX
            INCR/DECR
            GETSET
            DEL
            
            
       2、(Hash)哈希类型：
               该类型是由field和关联的value组成的map。其中，field和value都是字符串类型的。
        
        Hash的操作命令如下：
        HGET/HMGET/HGETALL
        HSET/HMSET/HSETNX
        HEXISTS/HLEN
        HKEYS/HDEL
        HVALS
        
        
       3、(List)列表类型：
            该类型是一个插入顺序排序的字符串元素集合, 基于双链表实现。
            
        List的操作命令如下：
            LPUSH/LPUSHX/LPOP/RPUSH/RPUSHX/RPOP/LINSERT/LSET
            LINDEX/LRANGE
            LLEN/LTRIM
            
            
        4、(Set)集合类型
            Set类型是一种无顺序集合, 它和List类型最大的区别是：集合中的元素没有顺序, 且元素是唯一的。
        
        Set类型的底层是通过哈希表实现的，其操作命令为：
            SADD/SPOP/SMOVE/SCARD
            SINTER/SDIFF/SDIFFSTORE/SUNION
            
       5、(Zset)顺序集合类型
              ZSet是一种有序集合类型，每个元素都会关联一个double类型的分数权值，通过这个权值来为集合中的成员进行从小到大的排序。与Set类型一样，其底层也是通过哈希表实现的。
       
       ZSet命令：
           ZADD/ZPOP/ZMOVE/ZCARD/ZCOUNT
           ZINTER/ZDIFF/ZDIFFSTORE/ZUNION
 
 
 ##3、基础常量类 
 
   一、com.yiyue.personalblog.constants(包名)
   
        1:Constants
          声明了常量列如：100,400,500等返回错误或正确信息，并有报错常量。
 
##4、控制层
    
   一、com.yiyue.personalblog.controller.user(包名)
        
        1、LoginOutController
             顾名思义：退出登录控制层,实现用户退出登录的过程.
             
        2、QueryInfoController
             查询用户信息或修改用户信息时调用,该类RequestMapping为：(authc)代表用户必须登录后才可以访问。
        
        3、UserController
             该类控制所有的User表数据、如查询当前用户是否已经注册、用户注册、判断用户是否登陆、用户是否有权限等功能。
  
##5、实体层 

   一、com.yiyue.personalblog.entity.*(包名)
        
        实体类本文档不进行说明。
        
##5、数据持久化接口层 

  一、com.yiyue.personalblog.mapper.*(包名)
       
       数据持久化接口层 本文档不进行说明。
       
##6、工具层 

  一、com.yiyue.personalblog.utils.common(包名)
       
       1:GetHeaders
            顾名思义：获取Header里面的值,并返回Map类型.
            
##7、资源层 

  一、resources
    
    标准生成Mysql的sql语句,不再说明
    
##8、数据库备份层 
  一、resources-db
        
    普通备份数据,可提供执行。
     
    
##9、数据库备份层 
  一、application.xml
        
    整体项目配置类、可配置端口、Redis、数据库连接、PageHerple、Sevlet、Nginx等一系列配置。

    
##10、日志层
  一、log4j2-spring.xml
    
    功能与log4j类似，只是提高了log4j的运行效率并丰富了日志类型,是Log4j的升级版。

