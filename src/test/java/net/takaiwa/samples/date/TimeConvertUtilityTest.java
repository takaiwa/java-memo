package net.takaiwa.samples.date;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

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
        assertThat(strTime, is(notNullValue()));
    }
}
