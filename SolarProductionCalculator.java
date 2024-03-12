import java.util.Scanner;

/**
 * Assignment 2.
 * a program that calculate a how much money solar cells generate per day based on the number of hours of 
 * sunshine.
 * 1.Create constant (final) and variables.
 * 2.Declare a scannar class to read inputs and use a delimiter to split the string.
 * 3.Take user inputs, validate months and time. 
 * 4.Check if the given times for sunrise and sunset are valid and calculate the number of hours of sunshine between them
 * 5.Calculate Electric production and its value in swedish kroner.
 * 6.Print Results.
 * @author Abenezer Anglo, abeang-2 
 */

class SolarProductionCalculator {
    public static void main(String[] args) {
        // declare variables

        int hour;
        int minute;
        int hourAtSunRise;
        int minuteAtSunRise;
        int hourAtSunSet;
        int minuteAtSunset;
        double el_Production;
        double elValue_Sek;
        double sunTime;

        // declare final variables
        final int MAX_ELECTRICITY_PRODUCTION_WATTS = 290;
        final int NUMBER_OF_SOLAR_PANEL = 26;
        final double SOLAR_RADIATION = 0.166; // in kWh/m^2/hour
        final double SURFACE_AREA = 44.2; // noOFSolarpanel*1*1*1.7, is expressed in m^2
        final double EFFIENCY = 0.2;
        final double El_PRICE_SEK = 0.9;

        // create scanner class
        Scanner userInput = new Scanner(System.in);
        // use a delimiter to split the string
        userInput.useDelimiter("[-:/\\s]+");

        // Instruction to the user
        System.out.print("Enter today's date [mm-dd] >");
        int month = userInput.nextInt();
        int date = userInput.nextInt();
        // validating month and dates
        if (month == 6) {
            if (date < 1 || date > 30) {
                System.out.println("Invalid date!Please enter a date in June");
                return;
            }
        } else if (month == 7) {
            if (date < 1 || date > 31) {
                System.out.println("Invalid date!Please enter a date in July");
                return;
            }
        } else {
            System.out.println("Invalid month! Please enter the month June or July");
            return;
        }

        // Instruction to the user
        System.out.print("Enter time of sunrise [hh: mm]> ");

        hourAtSunRise = userInput.nextInt();
        minuteAtSunRise = userInput.nextInt();

        System.out.print("Enter time of sunset [hh: mm]> ");

        hourAtSunSet = userInput.nextInt();
        minuteAtSunset = userInput.nextInt();

        // check if sunrise is before sunset

        if (hourAtSunSet <= hourAtSunRise) {
            System.out.println("Invalid time! Hours of Sunset is not at the same time as hours of Sunrise or before Sunrise");
            return;
        }

        // calculate the hours of sunshine
        double sunRise = hourAtSunRise + (minuteAtSunRise / 60.0); // convert minute to hour
        double sunSet = hourAtSunSet + (minuteAtSunset / 60.0); // convert minute to hour

        sunTime = sunSet - sunRise;

        // calculate production
        el_Production = SOLAR_RADIATION * EFFIENCY * SURFACE_AREA * sunTime;
        // calculate production value in sek
        elValue_Sek = el_Production * El_PRICE_SEK;
        // display results
        System.out.println("=========================================");
        System.out.printf("Sun hours:%.2f hours\n", sunTime);
        System.out.printf("The production on %d/%d is:%.2f kwh to a value of: %.2f SEK", date, month, el_Production,
            elValue_Sek);

    }
}