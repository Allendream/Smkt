-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        10.0.17-MariaDB - mariadb.org binary distribution
-- 服务器操作系统:                      Win32
-- HeidiSQL 版本:                  9.1.0.4867
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- 导出 smkt 的数据库结构
CREATE DATABASE IF NOT EXISTS `smkt` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_bin */;
USE `smkt`;


-- 导出  表 smkt.casher 结构
CREATE TABLE IF NOT EXISTS `casher` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) CHARACTER SET utf8 NOT NULL,
  `email` varchar(50) CHARACTER SET utf8 NOT NULL,
  `phone` varchar(50) CHARACTER SET utf8 NOT NULL,
  `password` varchar(50) CHARACTER SET utf8 NOT NULL,
  `authority` varchar(50) CHARACTER SET utf8 NOT NULL,
  `socialID` varchar(50) CHARACTER SET utf8 NOT NULL,
  `onjobtime` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- 正在导出表  smkt.casher 的数据：~3 rows (大约)
DELETE FROM `casher`;
/*!40000 ALTER TABLE `casher` DISABLE KEYS */;
INSERT INTO `casher` (`id`, `name`, `email`, `phone`, `password`, `authority`, `socialID`, `onjobtime`) VALUES
	(3, 'jack ', '34179558064@qq.com     ', '1346747256    ', '3', '销售员', '5238569369356 ', '2015-12-26 18:32:18'),
	(5, '2', '132989513@qq.com', '123456', '3', '销售员', '734476819845109375', '2015-12-26 23:18:30'),
	(6, '小张', '32784319685@126.com', '12423513465', '3', '销售员', '3628953695480854', '2015-12-26 23:42:54'),
	(7, 'fhifh', '325682875@126.com', '3257829694', '123456', '销售员', '34685298375456', '2015-12-27 08:30:49');
/*!40000 ALTER TABLE `casher` ENABLE KEYS */;


-- 导出  表 smkt.goods 结构
CREATE TABLE IF NOT EXISTS `goods` (
  `productID` varchar(50) CHARACTER SET utf8 NOT NULL,
  `productname` varchar(50) CHARACTER SET utf8 NOT NULL,
  `price` int(11) NOT NULL,
  `infor` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`productID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- 正在导出表  smkt.goods 的数据：~7 rows (大约)
DELETE FROM `goods`;
/*!40000 ALTER TABLE `goods` DISABLE KEYS */;
INSERT INTO `goods` (`productID`, `productname`, `price`, `infor`) VALUES
	('1', '红枣', 3, ' 新疆大红枣'),
	('2', '牛奶', 4, ' 纯牛奶，进口'),
	('3', '矿泉水', 1, ' 农户山泉有点甜'),
	('4', '面条', 5, ' 手擀面，有劲道'),
	('5', '蛋糕', 6, ' 盼盼fash小面包，哦哦哦，好吃'),
	('6', '食盐', 3, ' 家加碘食盐，更健康'),
	('7', '红酒', 100, ' 多年正藏，味道好');
/*!40000 ALTER TABLE `goods` ENABLE KEYS */;


-- 导出  表 smkt.importrecord 结构
CREATE TABLE IF NOT EXISTS `importrecord` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `productID` int(11) NOT NULL,
  `importtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `arrivetime` datetime DEFAULT NULL,
  `amount` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- 正在导出表  smkt.importrecord 的数据：~0 rows (大约)
DELETE FROM `importrecord`;
/*!40000 ALTER TABLE `importrecord` DISABLE KEYS */;
/*!40000 ALTER TABLE `importrecord` ENABLE KEYS */;


-- 导出  表 smkt.manager 结构
CREATE TABLE IF NOT EXISTS `manager` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) COLLATE utf8_bin NOT NULL,
  `email` varchar(50) COLLATE utf8_bin NOT NULL,
  `phone` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `password` varchar(50) COLLATE utf8_bin NOT NULL,
  `authority` varchar(50) COLLATE utf8_bin NOT NULL DEFAULT '0',
  `socialID` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `onjobtime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- 正在导出表  smkt.manager 的数据：~1 rows (大约)
DELETE FROM `manager`;
/*!40000 ALTER TABLE `manager` DISABLE KEYS */;
INSERT INTO `manager` (`id`, `name`, `email`, `phone`, `password`, `authority`, `socialID`, `onjobtime`) VALUES
	(1, 'smkt', '961871997@qq.com', '3', '1', '1', '3', '2315-12-25 17:44:30');
/*!40000 ALTER TABLE `manager` ENABLE KEYS */;


-- 导出  表 smkt.member 结构
CREATE TABLE IF NOT EXISTS `member` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `mname` varchar(50) CHARACTER SET utf8 NOT NULL,
  `phone` varchar(50) CHARACTER SET utf8 NOT NULL,
  `email` varchar(50) CHARACTER SET utf8 NOT NULL,
  `adress` varchar(50) CHARACTER SET utf8 NOT NULL,
  `discountlevel` double NOT NULL,
  `validtime` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- 正在导出表  smkt.member 的数据：~2 rows (大约)
DELETE FROM `member`;
/*!40000 ALTER TABLE `member` DISABLE KEYS */;
INSERT INTO `member` (`id`, `mname`, `phone`, `email`, `adress`, `discountlevel`, `validtime`) VALUES
	(20, '李月  ', '123456  ', '864592093@qq.com  ', '竹1B208233 ', 0.9, '2015-12-25 22:09:31'),
	(27, '大锤', '14223156', '3257971340@qq.com', '花果山', 0.9, '2015-12-26 23:23:48'),
	(29, '小花 ', '123 ', '456756513@126.cm ', '中国矿业大学 ', 0.9, '2015-12-27 00:26:52');
/*!40000 ALTER TABLE `member` ENABLE KEYS */;


-- 导出  表 smkt.news 结构
CREATE TABLE IF NOT EXISTS `news` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `subject` varchar(50) CHARACTER SET utf8 NOT NULL DEFAULT '0',
  `name` varchar(50) CHARACTER SET utf8 NOT NULL DEFAULT '0',
  `time` datetime DEFAULT CURRENT_TIMESTAMP,
  `message` varchar(500) CHARACTER SET utf8 NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- 正在导出表  smkt.news 的数据：~2 rows (大约)
DELETE FROM `news`;
/*!40000 ALTER TABLE `news` DISABLE KEYS */;
INSERT INTO `news` (`id`, `subject`, `name`, `time`, `message`) VALUES
	(8, '警告，警告', '经理', '2015-12-26 23:41:03', '我们明天第一个答辩哦'),
	(9, '今天答辩', '经理', '2015-12-27 08:27:31', '今天我们是第一组答辩的');
/*!40000 ALTER TABLE `news` ENABLE KEYS */;


-- 导出  表 smkt.sales 结构
CREATE TABLE IF NOT EXISTS `sales` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `productID` varchar(50) CHARACTER SET utf8 NOT NULL,
  `name` varchar(50) CHARACTER SET utf8 NOT NULL,
  `price` int(11) NOT NULL,
  `quantity` int(11) NOT NULL,
  `money` int(11) NOT NULL,
  `state` varchar(50) CHARACTER SET utf8 NOT NULL,
  `time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=78 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- 正在导出表  smkt.sales 的数据：~19 rows (大约)
DELETE FROM `sales`;
/*!40000 ALTER TABLE `sales` DISABLE KEYS */;
INSERT INTO `sales` (`id`, `productID`, `name`, `price`, `quantity`, `money`, `state`, `time`) VALUES
	(44, '3', '面条', 3, 5, 15, '完成', '2015-12-24 08:11:37'),
	(52, '1', '蛋糕', 3, 10, 30, '完成', '2015-12-24 08:36:25'),
	(56, '2', '矿泉水', 2, 1, 2, '完成', '2015-12-24 09:31:27'),
	(57, '2', '矿泉水', 1, 1, 1, '完成', '2015-12-25 13:02:14'),
	(58, '1', '蛋糕', 1, 10, 10, '完成', '2015-12-25 22:13:15'),
	(59, '2', '矿泉水', 3, 1, 3, '完成', '2015-12-25 22:13:34'),
	(63, '2', '矿泉水', 1, 1, 1, '完成', '2015-12-25 22:29:05'),
	(64, '1', '蛋糕', 1, 10, 10, '完成', '2015-12-25 22:29:11'),
	(65, '1', '蛋糕', 1, 10, 10, '完成', '2015-12-26 10:14:21'),
	(66, '4', '食言', 1, 3, 3, '完成', '2015-12-26 21:37:16'),
	(67, '1', '红枣', 3, 3, 9, '完成', '2015-12-26 23:25:41'),
	(69, '2', '牛奶', 3, 4, 12, '完成', '2015-12-26 23:27:17'),
	(70, '1', '红枣', 1, 3, 3, '完成', '2015-12-26 23:28:10'),
	(71, '2', '牛奶', 1, 4, 4, '完成', '2015-12-27 00:28:47'),
	(72, '3', '矿泉水', 11, 1, 11, '完成', '2015-12-27 00:28:58'),
	(74, '1', '红枣', 1, 3, 3, '完成', '2015-12-27 00:29:42'),
	(75, '2', '牛奶', 10, 4, 40, '完成', '2015-12-27 00:29:52'),
	(76, '4', '面条', 10, 5, 50, '完成', '2015-12-27 00:30:06'),
	(77, '2', '牛奶', 10, 4, 40, '完成', '2015-12-27 09:03:11');
/*!40000 ALTER TABLE `sales` ENABLE KEYS */;


-- 导出  表 smkt.shelf 结构
CREATE TABLE IF NOT EXISTS `shelf` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `updatetime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `amount` int(11) NOT NULL DEFAULT '0',
  `productID` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- 正在导出表  smkt.shelf 的数据：~0 rows (大约)
DELETE FROM `shelf`;
/*!40000 ALTER TABLE `shelf` DISABLE KEYS */;
/*!40000 ALTER TABLE `shelf` ENABLE KEYS */;


-- 导出  表 smkt.staff 结构
CREATE TABLE IF NOT EXISTS `staff` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) CHARACTER SET utf8 NOT NULL,
  `email` varchar(50) CHARACTER SET utf8 NOT NULL,
  `phone` varchar(50) CHARACTER SET utf8 NOT NULL,
  `password` varchar(50) CHARACTER SET utf8 NOT NULL,
  `authority` varchar(50) CHARACTER SET utf8 NOT NULL,
  `socialID` varchar(50) CHARACTER SET utf8 NOT NULL,
  `onjobtime` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- 正在导出表  smkt.staff 的数据：~4 rows (大约)
DELETE FROM `staff`;
/*!40000 ALTER TABLE `staff` DISABLE KEYS */;
INSERT INTO `staff` (`id`, `name`, `email`, `phone`, `password`, `authority`, `socialID`, `onjobtime`) VALUES
	(8, '周杰伦   ', '36578785478@126.com   ', '1234567 ', '2', '库存管理员', '23454136562437867   ', '2015-12-26 15:18:16'),
	(17, 'allen', '961871997@qq.com  ', '123456 ', '2', '库存管理员', '4444444  ', '2015-12-26 23:06:25'),
	(19, '华仔', '961871932@qq.com', '12542536756', '2', '库存管理员', '4513564656732153', '2015-12-26 23:41:55'),
	(21, 'dgfbj', '43q673862@126.c0m', '32785482', '123456', '库存管理员', '32578568923', '2015-12-27 08:28:49');
/*!40000 ALTER TABLE `staff` ENABLE KEYS */;


-- 导出  表 smkt.storage 结构
CREATE TABLE IF NOT EXISTS `storage` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `productID` varchar(50) CHARACTER SET utf8 NOT NULL,
  `name` varchar(50) CHARACTER SET utf8 NOT NULL,
  `amount` int(11) NOT NULL DEFAULT '0',
  `updatetime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- 正在导出表  smkt.storage 的数据：~6 rows (大约)
DELETE FROM `storage`;
/*!40000 ALTER TABLE `storage` DISABLE KEYS */;
INSERT INTO `storage` (`id`, `productID`, `name`, `amount`, `updatetime`) VALUES
	(5, '3', '矿泉水', 786, '2015-12-23 15:37:25'),
	(10, '4', '面条', 800, '2015-12-24 08:38:14'),
	(12, '5', '蛋糕', 800, '2015-12-26 13:05:05'),
	(13, '6', '食盐', 800, '2015-12-26 20:31:09'),
	(14, '1', '牛奶', 797, '2015-12-26 22:45:41'),
	(15, '2', '红枣', 779, '2015-12-26 22:49:34'),
	(20, '7', '红酒', 20, '2015-12-27 00:14:01');
/*!40000 ALTER TABLE `storage` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
