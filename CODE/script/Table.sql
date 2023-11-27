-- 动物分类表
CREATE TABLE Kingdom (
    id SERIAL PRIMARY KEY COMMENT '主键',
    name VARCHAR(255) NOT NULL COMMENT '界的名称',
    description TEXT COMMENT '界的描述',
    level INT NOT NULL DEFAULT 1 COMMENT '层级，表示所处级别',
    path VARCHAR(255) NOT NULL DEFAULT '/' COMMENT '完整路径，表示类别在层级结构中的位置'
) COMMENT '动物分类 - 界';

CREATE TABLE Phylum (
    id SERIAL PRIMARY KEY COMMENT '主键',
    name VARCHAR(255) NOT NULL COMMENT '门的名称',
    description TEXT COMMENT '门的描述',
    kingdom_id INT REFERENCES Kingdom(id) COMMENT '所属界的ID',
    level INT NOT NULL DEFAULT 2 COMMENT '层级，表示所处级别',
    path VARCHAR(255) NOT NULL DEFAULT '/' COMMENT '完整路径，表示类别在层级结构中的位置'
) COMMENT '动物分类 - 门';

CREATE TABLE Subphylum (
    id SERIAL PRIMARY KEY COMMENT '主键',
    name VARCHAR(255) NOT NULL COMMENT '亚门的名称',
    description TEXT COMMENT '亚门的描述',
    phylum_id INT REFERENCES Phylum(id) COMMENT '所属门的ID',
    level INT NOT NULL DEFAULT 3 COMMENT '层级，表示所处级别',
    path VARCHAR(255) NOT NULL DEFAULT '/' COMMENT '完整路径，表示类别在层级结构中的位置'
) COMMENT '动物分类 - 亚门';

CREATE TABLE Class (
    id SERIAL PRIMARY KEY COMMENT '主键',
    name VARCHAR(255) NOT NULL COMMENT '纲的名称',
    description TEXT COMMENT '纲的描述',
    subphylum_id INT REFERENCES Subphylum(id) COMMENT '所属亚门的ID',
    level INT NOT NULL DEFAULT 4 COMMENT '层级，表示所处级别',
    path VARCHAR(255) NOT NULL DEFAULT '/' COMMENT '完整路径，表示类别在层级结构中的位置'
) COMMENT '动物分类 - 纲';

CREATE TABLE Order (
    id SERIAL PRIMARY KEY COMMENT '主键',
    name VARCHAR(255) NOT NULL COMMENT '目的名称',
    description TEXT COMMENT '目的描述',
    class_id INT REFERENCES Class(id) COMMENT '所属纲的ID',
    level INT NOT NULL DEFAULT 5 COMMENT '层级，表示所处级别',
    path VARCHAR(255) NOT NULL DEFAULT '/' COMMENT '完整路径，表示类别在层级结构中的位置'
) COMMENT '动物分类 - 目';

CREATE TABLE Family (
    id SERIAL PRIMARY KEY COMMENT '主键',
    name VARCHAR(255) NOT NULL COMMENT '科的名称',
    description TEXT COMMENT '科的描述',
    order_id INT REFERENCES Order(id) COMMENT '所属目的ID',
    level INT NOT NULL DEFAULT 6 COMMENT '层级，表示所处级别',
    path VARCHAR(255) NOT NULL DEFAULT '/' COMMENT '完整路径，表示类别在层级结构中的位置'
) COMMENT '动物分类 - 科';

CREATE TABLE Genus (
    id SERIAL PRIMARY KEY COMMENT '主键',
    name VARCHAR(255) NOT NULL COMMENT '属的名称',
    description TEXT COMMENT '属的描述',
    family_id INT REFERENCES Family(id) COMMENT '所属科的ID',
    level INT NOT NULL DEFAULT 7 COMMENT '层级，表示所处级别',
    path VARCHAR(255) NOT NULL DEFAULT '/' COMMENT '完整路径，表示类别在层级结构中的位置'
) COMMENT '动物分类 - 属';

CREATE TABLE Species (
    id SERIAL PRIMARY KEY COMMENT '主键',
    name VARCHAR(255) NOT NULL COMMENT '种的名称',
    description TEXT COMMENT '种的描述',
    genus_id INT REFERENCES Genus(id) COMMENT '所属属的ID',
    level INT NOT NULL DEFAULT 8 COMMENT '层级，表示所处级别',
    path VARCHAR(255) NOT NULL DEFAULT '/' COMMENT '完整路径，表示类别在层级结构中的位置'
) COMMENT '动物分类 - 种';
