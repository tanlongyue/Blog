/*
SQLyog 企业版 - MySQL GUI v8.14 
MySQL - 5.7.31 : Database - personblog
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`personblog` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `personblog`;

/*Table structure for table `blog` */

DROP TABLE IF EXISTS `blog`;

CREATE TABLE `blog` (
   `blogId` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
   `title` varchar(100) NOT NULL COMMENT '标题',
   `content` varchar(1000) NOT NULL COMMENT '内容',
   `firstPicture` varchar(100) NOT NULL COMMENT '首图地址',
   `tab` varchar(100) DEFAULT NULL COMMENT '标签，原创等',
   `views` int(11) NOT NULL DEFAULT '0' COMMENT '浏览次数',
   `commentCount` int(11) NOT NULL DEFAULT '0' COMMENT '评论次数',
   `appreCiation` char(1) NOT NULL DEFAULT '0' COMMENT '开启赞赏默认为0，（0为打开，1为关闭）',
   `shareStatement` char(1) NOT NULL DEFAULT '0' COMMENT '开启版权声明默认为0，（0为打开，1为关闭）',
   `commentBled` char(1) NOT NULL DEFAULT '0' COMMENT '是否开启评论默认为0，（0为打开，1为关闭）',
   `published` char(1) NOT NULL DEFAULT '0' COMMENT '是否发布默认为0，（0为发布，1为不发布）',
   `recommend` char(1) NOT NULL DEFAULT '1' COMMENT '是否成为最新推荐默认为1，（0为打开，1为关闭）',
   `createTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
   `updateTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
   `description` varchar(1000) NOT NULL COMMENT '博客描述',
   `typeId` int(11) NOT NULL COMMENT '分类id',
   `userId` int(11) NOT NULL COMMENT '用户id',
   PRIMARY KEY (`blogId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `blog` */

/*Table structure for table `blog_type` */

DROP TABLE IF EXISTS `blog_type`;

CREATE TABLE `blog_type` (
   `typeId` int(11) NOT NULL AUTO_INCREMENT COMMENT '博客分类主键',
   `typeName` varchar(100) NOT NULL COMMENT '博客分类名',
   `remark` varchar(500) NOT NULL COMMENT '备注',
   PRIMARY KEY (`typeId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='博客分类表';

/*Data for the table `blog_type` */

/*Table structure for table `permission` */

DROP TABLE IF EXISTS `permission`;

CREATE TABLE `permission` (
   `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增Id',
   `permission_Name` varchar(11) NOT NULL COMMENT '权限名称',
   `permission_URL` varchar(11) NOT NULL COMMENT '接口路径',
   PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `permission` */

insert  into `permission`(`id`,`permission_Name`,`permission_URL`) values (1,'修改','/admin'),(2,'用户','/auth');

/*Table structure for table `role` */

DROP TABLE IF EXISTS `role`;

CREATE TABLE `role` (
   `role_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '角色Id',
   `role_name` varchar(30) NOT NULL COMMENT '角色名称',
   `role_description` varchar(64) DEFAULT NULL COMMENT '描述',
   PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `role` */

insert  into `role`(`role_id`,`role_name`,`role_description`) values (1,'admin','超级管理员'),(2,'master','普通用户');

/*Table structure for table `role_permission` */

DROP TABLE IF EXISTS `role_permission`;

CREATE TABLE `role_permission` (
   `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增Id',
   `role_id` int(11) NOT NULL COMMENT '角色关联Id',
   `permission_id` int(11) NOT NULL COMMENT '权限Id',
   PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

/*Data for the table `role_permission` */

insert  into `role_permission`(`id`,`role_id`,`permission_id`) values (1,1,1),(2,1,2),(14,2,2);

/*Table structure for table `user_info` */

DROP TABLE IF EXISTS `user_info`;

CREATE TABLE `user_info` (
   `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增Id',
   `user_Nick_name` varchar(40) DEFAULT NULL COMMENT '用户昵称',
   `user_login_Name` varchar(30) NOT NULL COMMENT '用户登陆用户名',
   `user_Password` varchar(30) NOT NULL COMMENT '用户密码',
   `salt` varchar(100) DEFAULT NULL COMMENT '加密（盐）',
   `user_Phone` char(11) DEFAULT NULL COMMENT '用户电话号码',
   `user_email` varchar(30) DEFAULT NULL COMMENT '用户邮箱',
   `user_sex` char(1) DEFAULT NULL COMMENT '男，女',
   `user_Head_Portrait` varchar(9000) DEFAULT NULL COMMENT '用户头像',
   `user_role_id` varchar(100) DEFAULT NULL COMMENT '用户角色',
   `createBy` bigint(20) DEFAULT NULL COMMENT '创建者Id(Id)',
   `createDate` datetime DEFAULT NULL COMMENT '创建时间',
   `modifyBy` bigint(20) DEFAULT NULL COMMENT '更新者Id(Id)',
   `modifyDate` datetime DEFAULT NULL COMMENT '更新时间',
   `spareOne` varchar(100) DEFAULT 'C' COMMENT '当前用户是否被禁用（F：禁用 C:正常）',
   `spareTwo` varchar(200) DEFAULT NULL COMMENT '备用字段2',
   `spareThree` varchar(500) DEFAULT NULL COMMENT '备用字段3',
   `spareFour` varchar(1000) DEFAULT NULL COMMENT '备用字段4',
   PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `user_info` */

insert  into `user_info`(`id`,`user_Nick_name`,`user_login_Name`,`user_Password`,`salt`,`user_Phone`,`user_email`,`user_sex`,`user_Head_Portrait`,`user_role_id`,`createBy`,`createDate`,`modifyBy`,`modifyDate`,`spareOne`,`spareTwo`,`spareThree`,`spareFour`) values (1,'admin','admin','admin123',NULL,NULL,'2398524975@qq.com','0','http://192.168.146.128:8080/pictures/3.jpg',NULL,NULL,NULL,NULL,NULL,'C',NULL,NULL,NULL),(5,'干净','干净','tly123456',NULL,NULL,'2398524975@qq.com','1','https://www.zfsphp.com/uploads/images//avatar/202010/1603348401.jpg',NULL,NULL,NULL,NULL,NULL,'C',NULL,NULL,NULL);

/*Table structure for table `user_role` */

DROP TABLE IF EXISTS `user_role`;

CREATE TABLE `user_role` (
   `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增Id',
   `user_id` int(11) NOT NULL COMMENT '用户Id',
   `role_id` int(11) NOT NULL COMMENT '角色关联Id',
   PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `user_role` */

insert  into `user_role`(`id`,`user_id`,`role_id`) values (1,1,1),(2,5,2);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
