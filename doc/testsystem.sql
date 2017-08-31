/*
Navicat MySQL Data Transfer

Source Server         : Local instance MySQL57
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : testsystem

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-07-30 15:23:34
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `adminname` varchar(255) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`adminname`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('admin', 'admin');

-- ----------------------------
-- Table structure for issuer
-- ----------------------------
DROP TABLE IF EXISTS `issuer`;
CREATE TABLE `issuer` (
  `issuerID` int(10) NOT NULL AUTO_INCREMENT,
  `issuername` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`issuerID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of issuer
-- ----------------------------
INSERT INTO `issuer` VALUES ('1', '1234', '1234');
INSERT INTO `issuer` VALUES ('2', 'issuer', 'issuer');

-- ----------------------------
-- Table structure for paperclass
-- ----------------------------
DROP TABLE IF EXISTS `paperclass`;
CREATE TABLE `paperclass` (
  `classID` int(10) NOT NULL AUTO_INCREMENT,
  `classname` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`classID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of paperclass
-- ----------------------------
INSERT INTO `paperclass` VALUES ('1', '计算机');
INSERT INTO `paperclass` VALUES ('2', '数学');
INSERT INTO `paperclass` VALUES ('3', '英语');
INSERT INTO `paperclass` VALUES ('4', '健康');

-- ----------------------------
-- Table structure for records
-- ----------------------------
DROP TABLE IF EXISTS `records`;
CREATE TABLE `records` (
  `recordsID` int(10) NOT NULL AUTO_INCREMENT,
  `userID` int(10) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `paperID` int(10) DEFAULT NULL,
  `papername` varchar(255) DEFAULT NULL,
  `grade` float(8,2) DEFAULT NULL,
  `analyze` varchar(1000) DEFAULT NULL,
  `testtime` datetime DEFAULT NULL,
  PRIMARY KEY (`recordsID`)
) ENGINE=InnoDB AUTO_INCREMENT=66 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of records
-- ----------------------------
INSERT INTO `records` VALUES ('63', '9', 'zhang', '11', '大学计算机选修课期末考试', '45.00', '撒花~~您的身体很棒，请继续保持良好的生活习惯，疾病将会离你远远滴！', '2017-07-30 14:57:54');
INSERT INTO `records` VALUES ('64', '9', 'zhang', '11', '大学计算机选修课期末考试', '30.00', '切莫大意！您的身体可能有轻度健康问题，一个良好的生活习惯可以让您恢复健康的状态。\r\n健康小贴士：\r\n1. 晨起一杯水、一顿营养丰富的早餐\r\n2. 膳食合理，营养搭配，多食蔬果，不宜过饱。\r\n3. 每日30分钟的有氧运动和享受阳光的机会\r\n4. 保持良好心情，乐观面对生活，多和身边的人聊天\r\n5. 相信并保证每夜能有充足的睡眠', '2017-07-30 14:58:49');
INSERT INTO `records` VALUES ('65', '9', 'zhang', '11', '大学计算机选修课期末考试', '15.00', '黄灯预警信号启动！您已经处于中度亚健康，生活和饮食习惯急需改正！\r\n健康小贴士：\r\n1. 晨起一杯水、一顿营养丰富的早餐\r\n2. 膳食合理，营养搭配，多食蔬果，不宜过饱。\r\n3. 每日30分钟的有氧运动和享受阳光的机会\r\n4. 保持良好心情，乐观面对生活，多和身边的人聊天\r\n5. 相信并保证每夜能有充足的睡眠', '2017-07-30 14:59:24');

-- ----------------------------
-- Table structure for testpaper
-- ----------------------------
DROP TABLE IF EXISTS `testpaper`;
CREATE TABLE `testpaper` (
  `paperID` int(10) NOT NULL AUTO_INCREMENT,
  `papername` varchar(255) DEFAULT NULL,
  `issuerID` int(10) DEFAULT NULL,
  `classID` int(10) DEFAULT NULL,
  `classname` varchar(255) DEFAULT NULL,
  `testsnum` int(10) DEFAULT NULL,
  `totalscore` float(8,2) DEFAULT NULL,
  `analyzeA` varchar(1000) DEFAULT NULL,
  `analyzeB` varchar(1000) DEFAULT NULL,
  `analyzeC` varchar(1000) DEFAULT NULL,
  `paperrank` int(10) DEFAULT NULL,
  `sign` int(10) DEFAULT NULL,
  PRIMARY KEY (`paperID`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of testpaper
-- ----------------------------
INSERT INTO `testpaper` VALUES ('11', '大学计算机选修课期末考试', '1', null, '1', '15', '45.00', '撒花~~您的身体很棒，请继续保持良好的生活习惯，疾病将会离你远远滴！', '切莫大意！您的身体可能有轻度健康问题，一个良好的生活习惯可以让您恢复健康的状态。\r\n健康小贴士：\r\n1. 晨起一杯水、一顿营养丰富的早餐\r\n2. 膳食合理，营养搭配，多食蔬果，不宜过饱。\r\n3. 每日30分钟的有氧运动和享受阳光的机会\r\n4. 保持良好心情，乐观面对生活，多和身边的人聊天\r\n5. 相信并保证每夜能有充足的睡眠', '黄灯预警信号启动！您已经处于中度亚健康，生活和饮食习惯急需改正！\r\n健康小贴士：\r\n1. 晨起一杯水、一顿营养丰富的早餐\r\n2. 膳食合理，营养搭配，多食蔬果，不宜过饱。\r\n3. 每日30分钟的有氧运动和享受阳光的机会\r\n4. 保持良好心情，乐观面对生活，多和身边的人聊天\r\n5. 相信并保证每夜能有充足的睡眠', '0', '1');
INSERT INTO `testpaper` VALUES ('12', '亚健康指数测试', '2', null, '1', '10', '100.00', '', '', '', '1', '1');
INSERT INTO `testpaper` VALUES ('13', '亚健康指数测试1', '2', null, '4', '10', '100.00', '', '', '', '1', '1');
INSERT INTO `testpaper` VALUES ('14', '初一年级第二学期期末考试', '1', null, '2', '10', '100.00', '', '', '', '2', '1');
INSERT INTO `testpaper` VALUES ('15', '2017年高考数学选择题', '2', null, '2', '10', '100.00', '', '', '', '2', '1');
INSERT INTO `testpaper` VALUES ('16', '小学英语测试题', '1', null, '3', '10', '100.00', '', '', '', '2', '1');
INSERT INTO `testpaper` VALUES ('17', '1351351', '1', null, '4', '10', '100.00', '', '', '', '2', '1');
INSERT INTO `testpaper` VALUES ('18', '12', '1', null, '4', null, null, '', '', '', '2', '1');
INSERT INTO `testpaper` VALUES ('19', '54456456', '1', null, '4', '10', '100.00', '', '', '', '2', '1');
INSERT INTO `testpaper` VALUES ('20', '456456', '1', null, '4', '10', '100.00', 'A', 'B', 'C', '2', '1');

-- ----------------------------
-- Table structure for tests
-- ----------------------------
DROP TABLE IF EXISTS `tests`;
CREATE TABLE `tests` (
  `testsID` int(10) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL,
  `papername` varchar(255) DEFAULT NULL,
  `paperID` int(10) DEFAULT NULL,
  `optionA` varchar(255) DEFAULT NULL,
  `optionB` varchar(255) DEFAULT NULL,
  `optionC` varchar(255) DEFAULT NULL,
  `optionD` varchar(255) DEFAULT NULL,
  `scoreA` float(8,2) DEFAULT NULL,
  `scoreB` float(8,2) DEFAULT NULL,
  `scoreC` float(8,2) DEFAULT NULL,
  `scoreD` float(8,2) DEFAULT NULL,
  `signt` int(10) DEFAULT NULL,
  PRIMARY KEY (`testsID`)
) ENGINE=InnoDB AUTO_INCREMENT=60 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tests
-- ----------------------------
INSERT INTO `tests` VALUES ('45', '你是不是早上不想起床，即使起床，也觉得浑身疲倦，整天打哈欠？', '大学计算机选修课期末考试', '11', '没有', '有时有', '一直都是', '', '3.00', '2.00', '1.00', null, '1');
INSERT INTO `tests` VALUES ('46', '有没有觉得食欲差，什么也不想吃。但见到辛辣刺激或油炸食品就来劲？', '大学计算机选修课期末考试', '11', '没有', '有时有', '一直都是', '', '3.00', '2.00', '1.00', null, '1');
INSERT INTO `tests` VALUES ('47', '有没有觉得肩颈部容易酸痛，或者手脚经常发凉，又或者经常腹胀、腹泻、便秘？', '大学计算机选修课期末考试', '11', '没有', '有时有', '一直都是', '', '3.00', '2.00', '1.00', null, '1');
INSERT INTO `tests` VALUES ('48', '有没有觉得什么都不尽人意。脾气变得很坏，容易烦躁不安？', '大学计算机选修课期末考试', '11', '没有', '有时有', '一直都是', '', '3.00', '2.00', '1.00', null, '1');
INSERT INTO `tests` VALUES ('49', '天气变化，各种“流”侵袭，你是否总是首当其冲？', '大学计算机选修课期末考试', '11', '没有', '有时有', '一直都是', '', '3.00', '2.00', '1.00', null, '1');
INSERT INTO `tests` VALUES ('50', '近期有没有不明原因的体重下降？', '大学计算机选修课期末考试', '11', '没有', '有时有', '一直都是', '', '3.00', '2.00', '1.00', null, '1');
INSERT INTO `tests` VALUES ('51', '总是想用茶或者咖啡来提神，喝5杯还不过瘾。', '大学计算机选修课期末考试', '11', '没有', '有时有', '一直都是', '', '3.00', '2.00', '1.00', null, '1');
INSERT INTO `tests` VALUES ('52', '是不是经常不吃早餐或者吃饭时间不固定？', '大学计算机选修课期末考试', '11', '没有', '有时有', '一直都是', '', '3.00', '2.00', '1.00', null, '1');
INSERT INTO `tests` VALUES ('53', '即使在剧烈运动后，也很少出汗。', '大学计算机选修课期末考试', '11', '没有', '有时有', '一直都是', '', '3.00', '2.00', '1.00', null, '1');
INSERT INTO `tests` VALUES ('54', '注意力难以集中或者健忘，越是眼前的事越容易忘掉。', '大学计算机选修课期末考试', '11', '没有', '有时有', '一直都是', '', '3.00', '2.00', '1.00', null, '1');
INSERT INTO `tests` VALUES ('55', '是否经常情绪上感到有些抑郁，喜欢发呆，不喜欢融入群体？', '大学计算机选修课期末考试', '11', '没有', '有时有', '一直都是', '', '3.00', '2.00', '1.00', null, '1');
INSERT INTO `tests` VALUES ('56', '懒得爬楼，或者爬楼容易绊脚或者踩空', '大学计算机选修课期末考试', '11', '没有', '有时有', '一直都是', '', '3.00', '2.00', '1.00', null, '1');
INSERT INTO `tests` VALUES ('57', '会不会有心悸，胸闷，厌烦的感觉？说话声音细而短，少气懒言。', '大学计算机选修课期末考试', '11', '没有', '有时有', '一直都是', '', '3.00', '2.00', '1.00', null, '1');
INSERT INTO `tests` VALUES ('58', '回到家总喜欢躺在沙发上，并把腿太高才能感到舒服些。', '大学计算机选修课期末考试', '11', '没有', '有时有', '一直都是', '', '3.00', '2.00', '1.00', null, '1');
INSERT INTO `tests` VALUES ('59', '总是失眠，不易入睡或者容易惊醒，或者总是处于梦中，睡眠质量很差。', '大学计算机选修课期末考试', '11', '没有', '有时有', '一直都是', '', '3.00', '2.00', '1.00', null, '1');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userID` int(10) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `regtime` datetime DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `userrank` int(10) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  `upstate` int(10) DEFAULT NULL,
  PRIMARY KEY (`userID`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'root', 'root', '2017-07-27 08:27:24', '11111111111', '2', '男', '0');
INSERT INTO `user` VALUES ('9', 'zhang', '1234', '2017-07-30 14:57:02', '12345678910', '2', '男', '0');
