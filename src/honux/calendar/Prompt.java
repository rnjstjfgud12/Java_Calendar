package honux.calendar;

import java.util.Scanner;

public class Prompt {
	
	public int parseDay(String week) {
		if (week.equals("일")) {
			return 0;
		} else if(week.equals("월")) {
			return 1;
		} else if(week.equals("화")) {
			return 2;
		} else if(week.equals("수")) {
			return 3;
		} else if(week.equals("목")) {
			return 4;
		} else if(week.equals("금")) {
			return 5;
		} else if(week.equals("토")) {
			return 6;
		} else {
			return 0;
		}
	}
	
	// private final static String PROMPT="cal> "; // 변경이 없을 경우 대문자로 보통 작성함
	
	public void runPrompt() {
		Scanner scanner = new Scanner(System.in);
		// String PROMPT="cal> ";
		Calendar cal = new Calendar();
		
		int month = 1;
		int year = 2020;
		int weekday = 0;
		
		while(month != -1) {
			System.out.println("년도를 입력하세요.(exit : -1)");
			System.out.print("YEAR> ");
			year = scanner.nextInt();
			if(year == -1) {
				break;
			}
			
			System.out.println("달을 입력하세요.");
			System.out.print("MONTH> ");
			month = scanner.nextInt();
			System.out.println("첫 번째 요일을 입력하세요(일, 월, 화, 수, 목, 금, 토).");
			String str_weekday = scanner.next();
			weekday = parseDay(str_weekday);
			
			if(month > 12 || month < 1) {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			
			cal.printSampleCalendar(year, month, weekday);
		}
		System.out.println("Finish");
		scanner.close();
	}
	
	public static void main(String[] args) {
		// 셀 실행
		Prompt p = new Prompt();
		p.runPrompt();
		
	}
}
