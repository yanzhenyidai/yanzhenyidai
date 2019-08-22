import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.IColumnType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 代码生成器演示
 * </p>
 */
public class MpGenerator {

    /**
     * <p>
     * MySQL 生成演示
     * </p>
     */
    public static void main(String[] args) {
        String moduleName = "auth";
        String tableNames = "user";
        System.out.println("模块名：" + moduleName);
        System.out.println("表  名：" + tableNames);

        AutoGenerator mpg = new AutoGenerator();
        // 选择 freemarker 引擎，默认 Veloctiy
        // mpg.setTemplateEngine(new FreemarkerTemplateEngine());

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        gc.setOutputDir("D:/yanzhenyidai");
        gc.setFileOverride(true);
        gc.setActiveRecord(false);// 不需要ActiveRecord特性的请改为false
        gc.setEnableCache(false);// XML 二级缓存
        gc.setBaseResultMap(true);// XML ResultMap
        gc.setBaseColumnList(true);// XML columList
        // gc.setKotlin(true) 是否生成 kotlin 代码
        gc.setAuthor("tanzhen.frank");

        // 自定义文件命名，注意 %s 会自动填充表实体属性！
        gc.setMapperName("%sMapper");
        gc.setXmlName("%sMapper");
        gc.setServiceName("%sFacade");
        gc.setServiceImplName("%sService");
        gc.setControllerName("%sController");
        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);
        dsc.setTypeConvert(new MySqlTypeConvert() {
            // 自定义数据库表字段类型转换【可选】
            @Override
            public IColumnType processTypeConvert(GlobalConfig globalConfig, String fieldType) {
                System.out.println("转换类型：" + fieldType);
                // 注意！！processTypeConvert 存在默认类型转换，如果不是你要的效果请自定义返回、非如下直接返回。
                return super.processTypeConvert(globalConfig, fieldType);
            }
        });
        dsc.setDriverName("com.mysql.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("Baidu@2019");
        dsc.setUrl("jdbc:mysql://yanzhenyidai.com:3306/yanzhenyidai?characterEncoding=utf8");
        mpg.setDataSource(dsc);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        // strategy.setCapitalMode(true);// 全局大写命名 ORACLE 注意
//        strategy.setTablePrefix(new String[]{});// 此处可以修改为您的表前缀
        strategy.setNaming(NamingStrategy.underline_to_camel);// 表名生成策略
        strategy.setInclude(tableNames.replace(" ", "").split(",")); // 需要生成的表
//         strategy.setExclude(new String[]{}); // 排除生成的表
//        strategy.setLogicDeleteFieldName("deleted");
//        strategy.setVersionFieldName("version");
        strategy.entityTableFieldAnnotationEnable(true);
        strategy.setEntityLombokModel(false);
        // 自定义实体父类
        strategy.setSuperEntityClass("com.yanzhenyidai.platform.common.mybatis.BaseDomain");
        // 自定义实体，公共字段
//        strategy.setSuperEntityColumns(new String[]{
//                "ID", "CREATED_BY", "CREATED_TIME", "LAST_MODIFY_BY", "LAST_MODIFY_TIME", "DELETED", "VERSION"
//        });
        // 自定义 mapper 父类
        strategy.setSuperMapperClass("com.baomidou.mybatisplus.core.mapper.BaseMapper");
        // 自定义 service 父类
        // strategy.setSuperServiceClass("com.baomidou.demo.TestService");
        // 自定义 service 实现类父类
        // strategy.setSuperServiceImplClass("com.baomidou.demo.TestServiceImpl");
        // 自定义 controller 父类
        // strategy.setSuperControllerClass("com.baomidou.demo.TestController");
        // 【实体】是否生成字段常量（默认 false）
        // public static final String ID = "test_id";
        // strategy.setEntityColumnConstant(true);
        // 【实体】是否为构建者模型（默认 false）
        // public User setName(String name) {this.name = name; return this;}
        // strategy.setEntityBuilderModel(true);
        mpg.setStrategy(strategy);

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("com.yanzhenyidai");
        pc.setModuleName(moduleName);
        pc.setEntity("domain");
        mpg.setPackageInfo(pc);

        // 注入自定义配置，可以在 VM 中使用 cfg.abc 【可无】
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                Map<String, Object> map = new HashMap<String, Object>();
                map.put("moduleName", moduleName);
                this.setMap(map);
            }
        };

        // 自定义 .jsp 生成
//        List<FileOutConfig> focList = new ArrayList<FileOutConfig>();
//        focList.add(new FileOutConfig("/templates/list.jsp.vm") {
//            @Override
//            public String outputFile(TableInfo tableInfo) {
//                String entityName = NamingStrategy.underlineToCamel(tableInfo.getName().split("_", 2)[1]);
//                cfg.getMap().put("entityName", entityName);
//                // 自定义输入文件名称
//                return gc.getOutputDir() + "/jsp/" + moduleName + "/" + entityName + "/list.jsp";
//            }
//        });
//        focList.add(new FileOutConfig("/templates/add.jsp.vm") {
//            @Override
//            public String outputFile(TableInfo tableInfo) {
//                String entityName = NamingStrategy.underlineToCamel(tableInfo.getName().split("_", 2)[1]);
//                cfg.getMap().put("entityName", entityName);
//                // 自定义输入文件名称
//                return gc.getOutputDir() + "/jsp/" + moduleName + "/" + entityName + "/add.jsp";
//            }
//        });
//        focList.add(new FileOutConfig("/templates/edit.jsp.vm") {
//            @Override
//            public String outputFile(TableInfo tableInfo) {
//                String entityName = NamingStrategy.underlineToCamel(tableInfo.getName().split("_", 2)[1]);
//                cfg.getMap().put("entityName", entityName);
//                // 自定义输入文件名称
//                return gc.getOutputDir() + "/jsp/" + moduleName + "/" + entityName + "/edit.jsp";
//            }
//        });
//        cfg.setFileOutConfigList(focList);
        mpg.setCfg(cfg);

//        // 调整 xml 生成目录演示
//        focList.add(new FileOutConfig("/templates/mapper.xml.vm") {
//            @Override
//            public String outputFile(TableInfo tableInfo) {
//                return gc.getOutputDir() + "/xml/" + tableInfo.getEntityName() + ".xml";
//            }
//        });
//        cfg.setFileOutConfigList(focList);
//        mpg.setCfg(cfg);

        // 关闭默认 xml 生成，调整生成 至 根目录
        TemplateConfig tc = new TemplateConfig();
//        tc.setXml(null);
        mpg.setTemplate(tc);

        // 自定义模板配置，可以 copy 源码 mybatis-plus/src/main/resources/templates 下面内容修改，
        // 放置自己项目的 src/main/resources/templates 目录下, 默认名称一下可以不配置，也可以自定义模板名称
        // TemplateConfig tc = new TemplateConfig();
        // tc.setController("...");
        // tc.setEntity("...");
        // tc.setMapper("...");
        // tc.setXml("...");
        // tc.setService("...");
        // tc.setServiceImpl("...");
        // 如上任何一个模块如果设置 空 OR Null 将不生成该模块。
        // mpg.setTemplate(tc);

        // 执行生成
        mpg.execute();
    }

}