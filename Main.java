package kettle100rubles;

public class Main {
    public static void main(String[] args) {

        int totalMoney = 100;

        Kettle kettle = new Kettle();
        Bull bull = new Bull();
        Cow cow = new Cow();
        Calf calf = new Calf();

        int maxBulls = bull.defineMaxNumber(bull.price);
        int maxCows = cow.defineMaxNumber(cow.price);
        int maxCalves = calf.defineMaxNumber(calf.price);

        for (int i = 0; i < maxBulls; i++) {
            for (int j = 0; j < maxCows; j++) {
                for (int k = 0; k < maxCalves; k++) {
                    if (i + j + k == kettle.maxKettleNumber && calf.price * k + cow.price * j + bull.price * i == totalMoney) {
                        System.out.println("Bulls: " + i);
                        System.out.println("Cows: " + j);
                        System.out.println("Calves: " + k);
                        break;
                    }
                }
            }
        }
    }
}
