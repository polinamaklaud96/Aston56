public class Task5 {

    public static void main(String[] args) {
        System.out.println(checkSum(5, 10));
        System.out.println(checkSum(3, 4));
    }

    public static boolean checkSum(int a, int b) {
        int sum = a + b;

        return sum >= 10 && sum <= 20;
    }
}
