CREATE TABLE dept (
	deptno INT (11) PRIMARY KEY AUTO_INCREMENT,
	dname VARCHAR (4000),
	db_source VARCHAR (4000)
); 
INSERT INTO `dept` (`dname`, `db_source`) VALUES('开发部',DATABASE());
INSERT INTO `dept` (`dname`, `db_source`) VALUES('人事部',DATABASE());
INSERT INTO `dept` (`dname`, `db_source`) VALUES('财务部',DATABASE());
INSERT INTO `dept` (`dname`, `db_source`) VALUES('市场部',DATABASE());
INSERT INTO `dept` (`dname`, `db_source`) VALUES('运维部',DATABASE());
INSERT INTO `dept` (`dname`, `db_source`) VALUES('教学部',DATABASE());