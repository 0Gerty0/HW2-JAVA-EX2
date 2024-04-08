public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price); // должно получиться 500
        System.out.println(miles);
    }
}
   /* public static void main(String[] args) {

        int balance = 1000;// Объявляете переменные для входных данных и
        int bonus = 0;// параметров программы: начального счёта, суммы пополнения и тп
        int payment = 1230;
        if (payment > 1000) {

            bonus = payment / 100;
        }
        balance = balance + bonus;
        System.out.println(bonus);
        System.out.println(balance);
        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }*/
