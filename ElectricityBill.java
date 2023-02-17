public class ElectricityBill {
    public static double calculateBill(int units) {
        double bill = 0.0;

        // calculating electricity bill based on given units
        if(units >= 1 && units <= 25) {
            bill = units * 1.25;
        } else if(units >= 26 && units <= 50) {
            bill = units * 1.45;
        } else if(units >= 51 && units <= 75) {
            bill = units * 1.65;
        } else if(units >= 76 && units <= 95) {
            bill = units * 1.95;
        } else {
            bill = units * 2.00;
        }

        // returning bill
        return bill;
    }
}