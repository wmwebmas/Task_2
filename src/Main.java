public class Main {
    public static void main(String[] args) {
        int clientScoreStart = 100;
        int firstTransaction = 100;
        int secondTransaction = 1100;

        int bonus;

        if (secondTransaction > 1000) {
            bonus = secondTransaction / 100;
        }
        else {
            bonus = 0;
        }
        int clientScore = clientScoreStart + secondTransaction + bonus;

        System.out.println("Бонус равен " + bonus + " рублей, итоговая сумма на счету " + clientScore + " рублей");

    }
}
