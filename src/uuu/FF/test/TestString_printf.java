package uuu.FF.test;

import java.time.LocalDate;

public class TestString_printf {

	// 常數，節省記憶體用
	public static final char MALE = 'M'; // 'G'
	public static final char FEMALE = 'F'; // 'M'

	public static void main(String[] args) {
		String dateString = "2000-01-15";
		if (dateString != null && dateString.length() > 0) {
			LocalDate date = LocalDate.parse(dateString);
			System.out.println(date);
		} else {
			System.err.println("生日字串不得為null或空字串：" + dateString);
		}

		char gender = 'A';
		if (gender == MALE || gender == FEMALE) {
			System.out.println("客戶性別為：" + gender);
		} else {
			System.err.printf("不正確的性別：%s，必須%s(男)，%s(女)\n", gender, MALE, FEMALE);
			// %s --> 填空字串 \n --> 換行
		}
	}

}
