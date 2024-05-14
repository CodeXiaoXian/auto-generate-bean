package com.yufei.kernel;

/**
 * @author shijianlong
 * @date 2024/5/13
 */
public class BaseYuFeiMapperImpl<T> implements YuFeiMapper<T> {

    @Override
    public String getSql(T table) {
        return "select * from " + table.getClass().getName();
    }

    @Override
    public String getById(T table) {
        return "xxxxxxxxxxxxxxxxxxxxxxxxx";
    }
}
