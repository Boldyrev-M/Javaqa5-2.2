public class Main {
    public static void main(String[] args) {
        int account = 100;
        int addition = 1250;
        int bonus;
        bonus = addition > 1000 ? addition / 100 : 0;
        account = account + addition + bonus;
        //System.out.println("Account: " + account);
        System.out.println("Bonus: " + bonus);
    }
}
