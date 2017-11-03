package net.chenlin.dp.druid;

/**
 * 增加多数据源
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2017年9月3日 下午8:03:05
 */
public enum DataSourceContext {
	
    DEFAULT("default");

    private String name;

    DataSourceContext(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
