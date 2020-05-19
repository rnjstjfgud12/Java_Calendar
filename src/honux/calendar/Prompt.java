package honux.calendar;

import java.util.Scanner;

public class Prompt {
	
	private final static String PROMPT="cal> "; // 변경이 없을 경우 대문자로 보통 작성함
	
	public void runPrompt() {
		Scanner scanner = new Scanner(System.in);
		String PROMPT="cal> ";
		Calendar cal = new Calendar();
		
		int month = 1;
		
		while(month != -1) {
			System.out.println("달을 입력하세요.");
			System.out.print(PROMPT);
			month = scanner.nextInt();
			cal.printSampleCalendar(2020, month);
			if(month == -1) {
				break;
			} else if(month > 12) {
				System.out.println("없는 달입니다. 달을 다시 입력하세요");
				continue;
			}
			System.out.printf("%d월은 %d일까지 있습니다.", month, cal.getMaxDaysOfMonth(month));
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
