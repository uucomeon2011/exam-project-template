/*
Navicat MySQL Data Transfer

Source Server         : 192.168.166.17
Source Server Version : 50514
Source Host           : 192.168.166.17:3306
Source Database       : supply_chain_audit

Target Server Type    : MYSQL
Target Server Version : 50514
File Encoding         : 65001

Date: 2019-05-07 14:55:46
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for country
-- ----------------------------
DROP TABLE IF EXISTS `country`;
CREATE TABLE `country` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(255) DEFAULT NULL COMMENT '名称',
  `code` varchar(255) DEFAULT NULL COMMENT '代码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10018 DEFAULT CHARSET=utf8 COMMENT='国家信息';
