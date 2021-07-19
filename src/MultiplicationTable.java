public class MultiplicationTable {
    public static void main(String[] args) {

        for (int fm = 1; fm <=10; fm++) {
            for (int sm = 1; sm <= 10; sm++) {
                int multiplication = fm * sm;
                System.out.printf("%d * %d = %d%n", fm, sm, multiplication);
            }
        }
    }
}