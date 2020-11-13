package Week1;

public class SumAndAverage {
	public static void main(String[] args) {
		int sum = 0;
		int i;
		for (i = 1; i <= 100; i++) {
			sum = sum + i;

		}
		System.out.println(sum);
		float sum1 = sum;
		float average = sum1 / 100;
		System.out.println(average);

	}

}
