package pack;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DateTime {
	public static void main(String[] args) {
		DateTime Test = new DateTime();
		Test.TestLocalDateTime();
		
	}
public void TestLocalDateTime()
{
	LocalDate date1 = LocalDate.of(2018, Month.FEBRUARY, 10);
	System.out.println("Date 1 :"+date1);
	LocalDate sixtyfifth2017 = LocalDate.ofYearDay(2017, 65);
	System.out.println("Date 2 :"+ sixtyfifth2017);
	LocalTime fromSecondDay = LocalTime.ofSecondOfDay(12345);
	System.out.println("Seconds : "+fromSecondDay);
	LocalDateTime d1= LocalDateTime.of(2014,2,20,12,00);
	System.out.println("DateObject Time : "+d1);
	LocalDate d2 = LocalDate.now();
	LocalDate d3 = LocalDate.parse("2017-02-05");
	System.out.println(d2.isBefore(d2));
}
}
