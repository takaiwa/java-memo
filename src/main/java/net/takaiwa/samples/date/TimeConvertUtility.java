package net.takaiwa.samples.date;

import java.util.Calendar;

/**
 * 日付データを文字列に変換するUtility集
 * @author takaiwa.net
 *
 */
public class TimeConvertUtility {

    public static String timeToStr(long unixtime) {
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(unixtime);

        return String.format("%04d/%02d/%02d %2d:%02d",
                cal.get(Calendar.YEAR),
                cal.get(Calendar.MONTH) + 1,
                cal.get(Calendar.DATE),
                cal.get(Calendar.HOUR_OF_DAY),
                cal.get(Calendar.MINUTE));
    }

    public static String timeToStr(Calendar cal) {
        return String.format("%04d/%02d/%02d %2d:%02d",
                cal.get(Calendar.YEAR),
                cal.get(Calendar.MONTH) + 1,
                cal.get(Calendar.DATE),
                cal.get(Calendar.HOUR_OF_DAY),
                cal.get(Calendar.MINUTE));
    }
}
