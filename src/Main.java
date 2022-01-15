public class Main {
    public static void main(String[] args) {
        // вход
        int amount = 500;

        // логика
        int BonusMiles;
        if (amount>20) {
            BonusMiles = amount / 20;
        } else {
            BonusMiles = 0;
        }

        System.out.println("Ваш бонус за покупку составил: " + BonusMiles + " мили (ей)");
        }
    }
