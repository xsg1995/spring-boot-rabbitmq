package com.xsg.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期工具类
 */
public class DateUtils {

    private static SimpleDateFormat YYYYMMDDHHMMSSFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

    /**
     * 获取当前的时间戳，精确到时分秒
     * @return
     */
    public static String getDateTime() {
        return YYYYMMDDHHMMSSFormat.format(new Date());
    }
}