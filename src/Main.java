public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int count = 100;
        int bonus = 1;
        int transfer = 999;
        if (transfer > 1000) {
            System.out.println((transfer / count * bonus) + transfer + balance);
        } else {
        System.out.println(transfer + balance);
        }
    }
}
