import java.util.Scanner;

public class testFile {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Lahjan suuruus?");
        int enteredAmountOfGift = lukija.nextInt();
        if (enteredAmountOfGift >= 5000 && enteredAmountOfGift < 25000) {
            double taxAmountToBepaid = (100 + ((enteredAmountOfGift - 5000) * 0.08));
            System.out.println(taxAmountToBepaid);
        } else if (enteredAmountOfGift >= 25000 && enteredAmountOfGift < 55000) {
            double taxAmountToBepaid = (1700 + ((enteredAmountOfGift - 25000) * 0.10));

            System.out.println(taxAmountToBepaid);
        } else if (enteredAmountOfGift >= 55000 && enteredAmountOfGift < 200000) {
            double taxAmountToBepaid = (4700 + ((enteredAmountOfGift - 55000) * 0.12));

            System.out.println(taxAmountToBepaid);
        } else if (enteredAmountOfGift >= 200000 && enteredAmountOfGift < 1000000) {
            double taxAmountToBepaid = (22100 + ((enteredAmountOfGift - 200000) * 0.15));

            System.out.println(taxAmountToBepaid);
        } else if (enteredAmountOfGift >= 1000000) {
            double taxAmountToBepaid = (142100 + ((enteredAmountOfGift - 1000000) * 0.17));

            System.out.println(taxAmountToBepaid);
        } else if (enteredAmountOfGift < 5000) {
            System.out.println("Ei veroa!");
        }

    }
}

public static String secondMain(){

    
}