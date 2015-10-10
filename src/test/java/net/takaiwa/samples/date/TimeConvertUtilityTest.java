package net.takaiwa.samples.date;

import static org.junit.Assert.assertNotNull;

import java.util.Calendar;

import org.junit.Test;

public class TimeConvertUtilityTest {

    @Test
    public void test() throws Exception {
        // テストデータ
        Calendar cal = Calendar.getInstance();

        // テスト
        String strTime = TimeConvertUtility.timeToStr(cal);
        // 検証
        assertNotNull(strTime);
    }
}
