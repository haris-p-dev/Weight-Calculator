import java.util.Scanner ;

public class Main {

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        String init ;

        System.out.printf("Welcome to the weight converter\n");
        System.out.printf("Press 'K' if you want to convert kilos to lb or 'L' for vice versa: ");
        init = reader.next();

        char firstLetter= init.toUpperCase().charAt(0);

        if (firstLetter == 'K') {
            double kilos ;
            System.out.printf("Enter the ammount of KILOS you want to convert: " );
            kilos = reader.nextDouble();
            double lbs = kilos * 2.20462 ;

        }

        else if(firstLetter == 'L'){
            //0.453592
            System.out.println("");
        }


    }

}