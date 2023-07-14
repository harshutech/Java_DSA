// Write a Java method to compute the average of three numbers..


public class problem1{
    public static int average(int a, int b, int c) {
        int average = (a + b + c) / 3;
        return average;
    }

    public static void main(String args[]) {
        int avg = average(5, 5, 5);
        System.out.print(avg);
    }
}
