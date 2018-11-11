package com.fengwenyi.javalib;

import com.fengwenyi.javalib.constant.DateTimeFormat;
import com.fengwenyi.javalib.util.DateTime;
import com.fengwenyi.javalib.util.DateTimeUtil;
import org.junit.Test;

import java.text.ParseException;
import java.util.Date;

/**
 * DateTimeUtil 测试
 * @author Wenyi Feng
 * @since 2018-11-11
 */
public class DateTimeUtilTest {

    @Test
    public void testTemp() {
        //DateTime.getDateFormat(DateTime.dateFormatMap.);
        //DateTimeUtil.
    }

    @Test
    public void testGetYear() {
        Integer value = DateTimeUtil.getYear(new Date());
        System.out.println(value);
    }

    @Test
    public void testGetMonth() {
        Integer value = DateTimeUtil.getMonth(new Date());
        System.out.println(value);
    }

    @Test
    public void testGetDay() {
        Integer value = DateTimeUtil.getDay(new Date());
        System.out.println(value);
    }

    @Test
    public void testGetDayOfWeek() {
//        Integer value = DateTimeUtil.getDayOfWeek(new Date());
        Integer value = null;
        try { // 7
            value = DateTimeUtil.getDayOfWeek(DateTimeUtil.stringToDate("2018-11-10 00:00:00", DateTimeFormat.yyyy_MM_dd_HH_mm_ss));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(value);
    }

    // 测试季度
    @Test
    public void testGetQuarter() {

    }

    public static void main(String[] args) {
//		System.out.println(new Date());
//		String strDate = "2014-08-08";
//		Date date = parseDate(strDate);
//		System.out.println(strDate + " 今天是哪一年？" + getYear(new Date()));
//		System.out.println(strDate + " 今天是哪个月？" + getMonth(date));
//		System.out.println(strDate + " 今天是几号？" + getDay(date));
//		System.out.println(strDate + " 今天是周几？" + getWeekDay(date));
//		System.out.println(strDate + " 是一年的第几周？" + getWeekOfYear(date));
//		System.out.println(strDate + " 所在周起始结束日期？"+ getWeekBeginAndEndDate(date, "yyyy年MM月dd日"));
//		System.out.println(strDate + " 所在周周一是？"+ dateToString(getMondayOfWeek(date)));
//		System.out.println(strDate + " 所在周周日是？"+ dateToString(getSundayOfWeek(date)));
//
//		System.out.println(strDate + " 当月第一天日期？"+ dateToString(getFirstDateOfMonth(date)));
//		System.out.println(strDate + " 当月最后一天日期？"+ dateToString(getLastDateOfMonth(date)));
//		System.out.println(strDate + " 当月天数？" + getDayOfMonth(date));
//		System.out.println(strDate + " 当月已过多少天？" + getPassDayOfMonth(date));
//		System.out.println(strDate + " 当月剩余多少天？" + getRemainDayOfMonth(date));
//
//		System.out.println(strDate + " 所在季度第一天日期？"+ dateToString(getFirstDateOfSeason(date)));
//		System.out.println(strDate + " 所在季度最后一天日期？"+ dateToString(getLastDateOfSeason(date)));
//		System.out.println(strDate + " 所在季度天数？" + getDayOfSeason(date));
//		System.out.println(strDate + " 所在季度已过多少天？" + getPassDayOfSeason(date));
//		System.out.println(strDate + " 所在季度剩余多少天？" + getRemainDayOfSeason(date));
//		System.out.println(strDate + " 是第几季度？" + getQuarter(date));
//		System.out.println(strDate + " 所在季度月份？"
//				+ dateToString(getSeasonDate(date)[0], "yyyy年MM月") + "/"
//				+ dateToString(getSeasonDate(date)[1], "yyyy年MM月") + "/"
//				+ dateToString(getSeasonDate(date)[2], "yyyy年MM月"));
//		System.out.println(strDate + " 所在季度月份？"+ getSeasonDate(date));
//		System.out.println(strDate + " 所在季度第一个月？"+dateToString(getSeasonDate(date)[0], "yyyy-MM"));
//	}
    }
}
