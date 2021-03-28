package Mycalender;

import java.util.Scanner;

public class Calender {
	// 함수로 보기 좋게 빼놓은 형식(메소드 형식)
	private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public int GetMaxDaysOfMonth(int month) { 
		return MAX_DAYS[month -1];
	}
	public void printSampleCalendar() {
		System.out.println("일 월 화 수 목 금 토");
		System.out.println("-------------------");
		System.out.print("1  2  3  4  5  6  7\n");
		System.out.print("8  9  10 11 12 13 14\n");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
		
	}
	public static void main(String[] args) {
	
		//숫자를 입력받아 해당하는 달의 최대 일수를 출겨하는 프로그램
		System.out.println("---------------------------\n");
		
		Scanner sc = new Scanner(System.in);
		Calender cal = new Calender();
		System.out.println("알고 싶은 월을 입력하세요");
		int month = sc.nextInt();
		
//		int[] maxDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
//		System.out.printf("%d월은 %d일까지 있습니다.\n", month, maxDays[month-1]);
		System.out.printf("%d월은 %d일까지 있습니다.\n", month, cal.GetMaxDaysOfMonth(month));
		
		cal.printSampleCalendar();
		sc.close();
//		if(num%2==0) {
//			System.out.printf("%d월의 최대 일수는 %d일입니다.", num, 30 );
//		}else {
//			System.out.printf("%d월의 최대 일수는 %d입니다.", num, 28);
//		}
	}
}

