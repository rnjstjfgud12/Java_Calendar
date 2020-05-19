package honux.calendar;
import java.util.Scanner;

public class Calendar {
	
	private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}
	
	public void printSampleCalendar(int year, int month) {
		System.out.printf("     <<%4d년%3d월>>     \n", year, month);
		System.out.println(" 일    월   화   수  목   금   토");
		System.out.println("--------------------");
		
		int maxDay = getMaxDaysOfMonth(month);
		
		for(int i = 1; i <= maxDay; i++) {
			System.out.printf("%3d", i);
			if (i % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println();
//		System.out.println(" 1  2  3  4  5  6  7");
//		System.out.println(" 8  9 10 11 12 13 14");
//		System.out.println("15 16 17 18 19 20 21");
//		System.out.println("22 23 24 25 26 27 28");
	}
	public static void main(String[] args) {
		//입력받은 달의 최대 일 수 출력하기	
//		Scanner scanner = new Scanner(System.in);
//		Calendar cal = new Calendar();
//		
//		System.out.println("반복 횟수를 입력하세요");
//		int repeat = scanner.nextInt();
//		
//		for (int i = 0; i < repeat; i++) {
//			System.out.println("월을 입력하세요");
//			int month = scanner.nextInt();
//			System.out.printf("%d월은 %d일까지 있습니다.", month, cal.getMaxDaysOfMonth(month));
//		}
//		scanner.close();
		
		// 종료 조건을 이용해 반복하기
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
}
