-- 动物分类表
CREATE TABLE Animal_Classification_Kingdom (
    id SERIAL PRIMARY KEY COMMENT '主键',
    name VARCHAR(255) NOT NULL COMMENT '界的名称',
    description TEXT COMMENT '界的描述',
    level VARCHAR(255)  NOT NULL DEFAULT 'Kingdom' COMMENT '层级，表示所处级别',
    path VARCHAR(255) NOT NULL DEFAULT '/' COMMENT '完整路径，表示类别在层级结构中的位置'
) COMMENT '动物分类 - 界';

CREATE TABLE Animal_Classification_Phylum (
    id SERIAL PRIMARY KEY COMMENT '主键',
    name VARCHAR(255) NOT NULL COMMENT '门的名称',
    description TEXT COMMENT '门的描述',
    kingdom_id INT COMMENT '所属界的ID',
    level VARCHAR(255)  NOT NULL DEFAULT 'Phylum' COMMENT '层级，表示所处级别',
    path VARCHAR(255) NOT NULL DEFAULT '/' COMMENT '完整路径，表示类别在层级结构中的位置'
) COMMENT '动物分类 - 门';

CREATE TABLE Animal_Classification_Subphylum (
    id SERIAL PRIMARY KEY COMMENT '主键',
    name VARCHAR(255) NOT NULL COMMENT '亚门的名称',
    description TEXT COMMENT '亚门的描述',
    phylum_id INT COMMENT '所属门的ID',
    level  VARCHAR(255)  NOT NULL DEFAULT 'Subphylum' COMMENT '层级，表示所处级别',
    path VARCHAR(255) NOT NULL DEFAULT '/' COMMENT '完整路径，表示类别在层级结构中的位置'
) COMMENT '动物分类 - 亚门';

CREATE TABLE Animal_Classification_Class (
    id SERIAL PRIMARY KEY COMMENT '主键',
    name VARCHAR(255) NOT NULL COMMENT '纲的名称',
    description TEXT COMMENT '纲的描述',
    subphylum_id INT  COMMENT '所属亚门的ID',
    level VARCHAR(255)  NOT NULL DEFAULT 'Class' COMMENT '层级，表示所处级别',
    path VARCHAR(255) NOT NULL DEFAULT '/' COMMENT '完整路径，表示类别在层级结构中的位置'
) COMMENT '动物分类 - 纲';

CREATE TABLE Animal_Classification_Order (
    id SERIAL PRIMARY KEY COMMENT '主键',
    name VARCHAR(255) NOT NULL COMMENT '目的名称',
    description TEXT COMMENT '目的描述',
    class_id INT  COMMENT '所属纲的ID',
    level VARCHAR(255)  NOT NULL DEFAULT 'Order' COMMENT '层级，表示所处级别',
    path VARCHAR(255) NOT NULL DEFAULT '/' COMMENT '完整路径，表示类别在层级结构中的位置'
) COMMENT '动物分类 - 目';

CREATE TABLE Animal_Classification_Family (
    id SERIAL PRIMARY KEY COMMENT '主键',
    name VARCHAR(255) NOT NULL COMMENT '科的名称',
    description TEXT COMMENT '科的描述',
    order_id INT  COMMENT '所属目的ID',
    level VARCHAR(255)  NOT NULL DEFAULT 'Family' COMMENT '层级，表示所处级别',
    path VARCHAR(255) NOT NULL DEFAULT '/' COMMENT '完整路径，表示类别在层级结构中的位置'
) COMMENT '动物分类 - 科';

CREATE TABLE Animal_Classification_Genus (
    id SERIAL PRIMARY KEY COMMENT '主键',
    name VARCHAR(255) NOT NULL COMMENT '属的名称',
    description TEXT COMMENT '属的描述',
    family_id INT  COMMENT '所属科的ID',
    level VARCHAR(255)  NOT NULL DEFAULT 'Genus' COMMENT '层级，表示所处级别',
    path VARCHAR(255) NOT NULL DEFAULT '/' COMMENT '完整路径，表示类别在层级结构中的位置'
) COMMENT '动物分类 - 属';

CREATE TABLE Animal_Classification_Species (
    id SERIAL PRIMARY KEY COMMENT '主键',
    name VARCHAR(255) NOT NULL COMMENT '种的名称',
    description TEXT COMMENT '种的描述',
    genus_id INT  COMMENT '所属属的ID',
    level VARCHAR(255)  NOT NULL DEFAULT 'Species' COMMENT '层级，表示所处级别',
    path VARCHAR(255) NOT NULL DEFAULT '/' COMMENT '完整路径，表示类别在层级结构中的位置'
) COMMENT '动物分类 - 种';


CREATE TABLE Animal_Classification_Species_Entity (
    Species_id INT   COMMENT '种的ID',
    id INT PRIMARY KEY AUTO_INCREMENT COMMENT '信息实体的ID',
    entity_type VARCHAR(255) NOT NULL   COMMENT '信息实体的类型，比如动物的基本信息'  
) COMMENT '动物分类 - 种的信息实体'; 


CREATE TABLE Animal_Classification_Species_Attribute (
    id INT PRIMARY KEY AUTO_INCREMENT,
    entity_id INT NOT NULL COMMENT  '信息实体的ID' ，
    attribute_name VARCHAR(255) NOT NULL COMMENT '属性名称',
    data_type VARCHAR(50) NOT NULL COMMENT '属性的数据类型'
) COMMENT '动物分类 - 种的属性';


CREATE TABLE Animal_Classification_Species_Value (
    id INT PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
    entity_id INT NOT NULL COMMENT  '信息实体的ID' ，,
    attribute_id INT NOT NULL COMMENT '属性的ID',
    value TEXT COMMENT '属性的值'
) COMMENT '动物分类 - 种的属性值';


