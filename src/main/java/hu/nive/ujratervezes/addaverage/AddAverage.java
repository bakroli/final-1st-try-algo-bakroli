package hu.nive.ujratervezes.addaverage;

public class AddAverage {

    public int[] addAverage(int[] numbers, int n) {
        if (numbers == null || n < 1) {
            throw new IllegalArgumentException();
        }
        if (numbers.length == 0) {
            return new int[0];
        }
        int[] result = new int[numbers.length];
        int average = averageCalculator(numbers);
        for (int i = 0; i < numbers.length; i++) {
            if ((i + 1) % n == 0) {
                result[i] = numbers[i] * average;
            } else {
                result[i] = numbers[i];
            }
        }
        return result;
    }

    private int averageCalculator(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }

    public static void main(String[] args) {
    }
}
