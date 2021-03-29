package Mycalender;

import java.util.Scanner;

public class Prompt {
	// 변경 없는 사항에 대해 쓸때
	private final static String PROMPT = "cal> ";

	public void runPrompt() {

		Scanner sc = new Scanner(System.in);
		Calender cal = new Calender();

		int month = 1;
		while (true) {

			System.out.println("알고 싶은 월을 입력하세요");
			System.out.print(PROMPT);
			month = sc.nextInt();
			if (month == -1) {
				break;
			}
			if (month > 12) {
				continue;
			}
			cal.printCalendar(2017, month);

		}
		System.out.println("Goodbye~");
		sc.close();
	}

	public static void main(String[] args) {

		// 셀 실행
		Prompt p = new Prompt();
		p.runPrompt();

	}
}
