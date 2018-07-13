-- create database --

# CREATE DATABASE monitor DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

-- create table --

USE monitor;

CREATE TABLE monitor_session (
  `session_id`  BIGINT(20) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `app_key`     VARCHAR(64),
  `device_id`   VARCHAR(64),
  `timestamp`   TIMESTAMP,
  `sdk_version` VARCHAR(16)
);
CREATE INDEX session_id
  ON monitor_session (timestamp, device_id, sdk_version, app_key);

CREATE TABLE begin_session (
  `session_id`  BIGINT(20) PRIMARY KEY NOT NULL,
  `device`      VARCHAR(20),
  `os_version`  VARCHAR(20),
  `locale`      VARCHAR(20),
  `density`     VARCHAR(15),
  `app_version` VARCHAR(15),
  `resolution`  VARCHAR(15),
  `os`          VARCHAR(10)
);

CREATE TABLE duration_session (
  `session_id`       BIGINT(20) PRIMARY KEY NOT NULL,
  `session_duration` VARCHAR(20)
);

CREATE TABLE end_session (
  `session_id`       BIGINT(20) PRIMARY KEY NOT NULL,
  `session_duration` VARCHAR(20)
);


CREATE TABLE dur_session (
  `session_id`       BIGINT(20) PRIMARY KEY NOT NULL,
  `session_duration` VARCHAR(20)
);

CREATE TABLE c_session (
  `session_id` BIGINT(20) PRIMARY KEY NOT NULL,
  `p`          VARCHAR(10) COMMENT '系统 Android 或者 iOS',
  `uid`        VARCHAR(128) COMMENT '用户id',
  `ca`         VARCHAR(16) COMMENT '运营商',
  `av`         VARCHAR(16) COMMENT 'app 版本',
  `de`         VARCHAR(16) COMMENT '设备版本',
  `aav`        VARCHAR(16) COMMENT 'api 版本',
  `city`       VARCHAR(20) COMMENT '城市 上海 杭州',
  `sav`        VARCHAR(16) COMMENT 'sdk api 版本'

);

CREATE TABLE event (
  `event_id`   BIGINT(20) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `session_id` BIGINT(20)             NOT NULL
  COMMENT '多个 event 对应 一个 session',
  `sum`        BIGINT(20),
  `count`      BIGINT(20),
  `key`        VARCHAR(16) COMMENT '事件名称',
  `timestamp`  TIMESTAMP,
  `dur`        BIGINT(20) COMMENT '持续事件'
);

CREATE TABLE http_link_event (
  `even_id`      BIGINT(20) PRIMARY KEY NOT NULL,
  `hdt`          VARCHAR(128) COMMENT '网络解析时间段',
  `mt`           VARCHAR(20) COMMENT 'CONTENT-TYPE',
  `cl`           VARCHAR(20) COMMENT 'CONTENT-LENGTH',
  `hc`           VARCHAR(20) COMMENT 'httpcode',
  `nt`           VARCHAR(20) COMMENT 'network type 4G wifi',
  `ru`           VARCHAR(512) COMMENT 'url',
  `da`           MEDIUMTEXT COMMENT '数据结果 有可能是错误内容',
  `dns`          BIGINT(20) COMMENT 'DNS 耗时',
  `tcp`          BIGINT(20) COMMENT 'TCP 耗时',
  `ssl`          BIGINT(20) COMMENT 'SSL cost',
  `first_packet` BIGINT(20) COMMENT '首包',
  `response`     BIGINT(20) COMMENT '响应时间'
);

CREATE TABLE cly_view_event (
  `even_id` BIGINT(20) PRIMARY KEY NOT NULL,
  `visit`   INT COMMENT '暂时没用',
  `name`    VARCHAR(128) COMMENT '页面名称',
  `start`   INT COMMENT '是否起点',
  `segment` VARCHAR(20) COMMENT 'ios android'
);

