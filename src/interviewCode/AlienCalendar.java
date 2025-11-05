package interviewCode;

public class AlienCalendar {

	static final String[] WEEKDAYS = { "Za", "Xo", "Cu", "Vo", "Bi", "Ne", "Ma", "LU", "ki" };

	static final String[] MONTHS = { "Ra", "Ta", "Ut", "Ip", "Ok", "Py", "Ar", "Sy", "Du", "Fi", "Gr" };

	static final int[] DAYS_IN_MONTH = { 36, 39, 26, 29, 31, 29, 33, 34, 35, 27, 43 };

	public static void main(String[] args) {

		PrintNMonths(2618, 9, 4);
	}

	public static int FirstMonthStartson() {

		return 1; // Xo

	}

	public static void PrintNMonths(int startYear, int startMonth, int numberOfMonths) {

		int currentYear = startYear;
		int currentMonth = startMonth - 1;
		int dayOfWeek = FirstMonthStartson() - 1;

		for (int i = 0; i < numberOfMonths; i++) {

			String monthName = MONTHS[currentMonth];

			int days = getDaysInMonth(currentMonth, currentYear);

			printMonthHeader(monthName, currentYear);

			printWeekdays();

			dayOfWeek = printDates(days, dayOfWeek, currentMonth == 8 && isLeapYear(currentYear));

			currentMonth++;

			if (currentMonth >= 11) {

				currentMonth = 0;

				currentYear++;

			}

		}

	}

	private static int getDaysInMonth(int monthIndex, int year) {

		if (monthIndex == 8 && isLeapYear(year)) {

			return 34; // Du in Leap year

		}

		return DAYS_IN_MONTH[monthIndex];

	}

	private static boolean isLeapYear(int year) {

		return year % 11 == 0;

	}

	private static void printMonthHeader(String month, int year) {

		System.out.println(month + " " + year);

		System.out.println("+-----+");

	}

	private static void printWeekdays() {

		for (String day : WEEKDAYS) {

			System.out.print(" " + day + "\\");

		}
		System.out.println();

	}

	private static int printDates(int totalDays, int startDay, boolean isLeapDu) {

		int day = 1;

		int dayOfWeek = startDay;

		// Print initial spacing
		for (int i = 0; i < dayOfWeek; i++) {

			System.out.print(" \\");
		}

		while (day <= totalDays) {

			if (day == totalDays && isLeapDu) {

				System.out.printf(" +%2d\\", day);

			} else {

				System.out.printf(" %2d\\", day);

			}

			day++;

			dayOfWeek++;

			if (dayOfWeek == 9) {

				System.out.println();

				if (dayOfWeek == 9) {

					System.out.println();

					dayOfWeek = 0;

				}

			}

			if (dayOfWeek != 0) {

				System.out.println();

			}

		}
		return dayOfWeek;
	}
}
