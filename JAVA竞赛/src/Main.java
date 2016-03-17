import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int r = in.nextInt();
		double mianji = 0;
		double pi = Math.PI;
		if (1 <= r && r <= 10000) {
			double dr = r;
			mianji = pi * dr * dr;
		}
		System.out.println(String.format("%.7f", mianji));
	}
}
