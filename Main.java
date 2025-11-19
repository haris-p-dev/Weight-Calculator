import java.util.Scanner ;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String init;
        char firstLetter ;

        System.out.print("Welcome to the weight converter. \n");

        do {
            System.out.print("Press 'K' to convert kilos to lbs. \n");
            System.out.print("Or press 'L' to convert lbs to kilos. \n");
            init = reader.next();
            firstLetter = init.toUpperCase().charAt(0);

            if(firstLetter!='K' && firstLetter!='L'){
                System.out.println("Invalid option. Try again.");
            }
        }
        while (firstLetter!='K' && firstLetter!='L');

         if (firstLetter == 'K') {
            double kilos;
            System.out.print("Enter the amount of kilos you would like to convert: ");
            kilos = reader.nextDouble();
            double lbs = kilos * 2.20462;
            System.out.printf(" %.2f kilos is %.2f lbs.", kilos, lbs);
        } else {
            double lbs;
            System.out.print("Enter the amount of lbs you would like to convert: ");
            lbs = reader.nextDouble();
            double kilos = lbs * 0.453592;
            System.out.printf(" %.2f lbs is %.2f kilos.", lbs, kilos);

        }
    }
}