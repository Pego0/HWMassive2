public class Main {
    public static void main(String[] args) {
        ///Классная работа
        int[] weights = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
        int[] weightsCopy = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
        int januaryWeight = weights[0];
        System.out.println(januaryWeight);
        System.out.println(weights[0]);
        System.out.println(weights[4]);
        int january = 0;
        System.out.println(weights[january]);
        for (int j : weights) {
            System.out.println(j);
        }
        boolean arraysAreEqual = true;
        arraysAreEqual = weights.length == weightsCopy.length;
        if (arraysAreEqual) {
            for (int i = 0; i < weights.length; i++) {
                if (weights[i] != weightsCopy[i]) {
                    arraysAreEqual = false;
                }
            }
        }
        if (weights == weightsCopy) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are different");
        }
        int maxWeight = -1;
        for (int weight : weights) {
            if (weight > maxWeight) {
                maxWeight = weight;
            }
        }
        System.out.println(maxWeight);
        for (int i = 0; i < weights.length - 1 && weights[i + 1] != 0; i++) {
            System.out.println(weights[i + 1] - weights[i]);
        }
        ///ДЗ

        ///Первая задача
        int[] arr = generateRandomArray();
        int totalMonth = 0;
        for (int i = 0; i < arr.length; i++) {
            totalMonth = totalMonth + arr[i];
        }
        System.out.println("Total payments: " + totalMonth);

        ///Вторая задача
        int minimalPayments = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] < minimalPayments) {
                minimalPayments = arr[i];
            }
        }
        int maxPayments = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] > maxPayments) {
                maxPayments = arr[i];
            }
        }
        System.out.println("Minimal payment a day is: " + minimalPayments);
        System.out.println("Maximum payment a day is: " + maxPayments);

        ///Третья задача
        double averagePayments = 0F;
        averagePayments = totalMonth / arr.length;
        System.out.println("Average payments in month is: " + averagePayments);

        ///Четвертая задача
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char fullName = 0;
        for (int i = reverseFullName.length; i <= reverseFullName.length && i > 0; i--) {
            fullName = reverseFullName[i - 1];
            System.out.print(fullName);
        }
        ///
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
            }
        return arr;
    }
}
