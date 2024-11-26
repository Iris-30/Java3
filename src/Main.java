public class Main {
    public static void main(String[] args) {

        int initialBalance = 1300;
        int addend = 1100;
        int bonus = 0;

        if (addend > 1000) {
            bonus = addend / 100;
        }

        int finalBonus = initialBalance + addend + bonus;

        System.out.println("Ваш баланс: " + finalBonus);
        System.out.print("Ваш бонус: " + bonus);
    }
}
