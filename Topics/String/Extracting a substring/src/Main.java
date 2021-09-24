import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        int idx1 = scanner.nextInt();
        int idx2 = scanner.nextInt();

        if (idx1 >= 0 && idx2 >= 0 && idx1 < word.length() && idx2 < word.length()) {
            System.out.println(word.substring(idx1, idx2 + 1));
        }
    }
}