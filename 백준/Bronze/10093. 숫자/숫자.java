import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong();
        long b = scanner.nextLong();

        if (a > b) {
            long tmp = b;
            b = a;
            a = tmp;
        }

        StringBuilder sb = new StringBuilder();

        sb.append(Math.max(0, b - a - 1));

        if (a + 1 < b) {
            sb.append("\n");
            for (long i = a + 1; i < b; i++)
                sb.append(i).append(" ");
        }

        System.out.println(sb);
    }
}