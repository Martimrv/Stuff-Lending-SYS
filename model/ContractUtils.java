package model;

/**
 * Class which has some methods useful for the Member class.
 * Member class should focus on member-related functions.
 * On this class we calculate days and total cost.
 */
public class ContractUtils {

    /**
     * Method which calculates number of days.
     */
    public static int calculateDays(int startDate, int endDate){
        if (endDate < startDate){
            throw new IllegalArgumentException("End day cannot be before start date");
        }
        return endDate - startDate + 1;
    }

    /**
     * Calculates total costa, based on number of days.
     */
    public static int calculateTotalCost(int days, int costPerDay) {
        return days * costPerDay;
    }
}

