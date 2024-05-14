package com.yufei.kernel;

/**
 * @author shijianlong
 * @date 2024/5/13
 */
public interface YuFeiMapper<T> {

    String getSql(T table);

    String getById(T table);
}
