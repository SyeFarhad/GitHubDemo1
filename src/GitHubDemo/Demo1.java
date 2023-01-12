package GitHubDemo;

public class Demo1 {


		public static void main(String[] args) {

			boolean r1 = monkeyTrouble(true, false); // false
			boolean r2 = monkeyTrouble(true, true); // true
			boolean r3 = monkeyTrouble(false, false); // true

			System.out.println(r1);
			System.out.println(r2);
			System.out.println(r3);

		}

		public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
			boolean result = false;

			if ((aSmile == true && bSmile == true) || (aSmile == false && bSmile == false)) {
				result = true;

			}
			return result;

		}

	}



