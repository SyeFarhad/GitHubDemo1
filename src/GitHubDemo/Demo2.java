package GitHubDemo;

public class Demo2 {
	
	public static void main(String[] args) {

		boolean r1 = SleepIn(false, false);
		boolean r2 = SleepIn(true, false);

		System.out.println(r1);
		System.out.println(r2);

	}

	public static boolean SleepIn(boolean isWeekday, boolean isVacation) {

		boolean result = true;

		if (! isWeekday  || isVacation ) {
			result = false;

		}

		return result;

	}
}



