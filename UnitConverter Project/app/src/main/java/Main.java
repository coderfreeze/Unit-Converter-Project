import unitconverter.project.UnitConverter;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String repeat;

        System.out.println("Welcome to Unit Converter Application");

    do {
        System.out.println("Please type the number you want to convert from:");
        System.out.println("1. Feet");
        System.out.println("2. Meters");
        System.out.println("3. Inches");
        System.out.println("4. Centimeters");

        int fromUnit = scan.nextInt();

        System.out.println("Type the number you want to convert to: ");
        System.out.println("1. Feet");
        System.out.println("2. Meters");
        System.out.println("3. Inches");
        System.out.println("4. Centimeters");

        int toUnit = scan.nextInt();

        System.out.println("Enter the value that you want converted: ");

        double number = scan.nextDouble();

        UnitConverter convert = new UnitConverter(fromUnit, toUnit, number);

        if (convert.getFromUnit() == "Feet" && number == 1.0){
            System.out.println(number + " Foot is " + convert.methodDecider() + " " + convert.getToUnit());
        } else if (convert.getFromUnit() == "Meters" && number == 1.0) {
            System.out.println(number + " Meter is " + convert.methodDecider() + " " + convert.getToUnit());
        } else if (convert.getFromUnit() == "Inches" && number == 1.0){
            System.out.println(number + " Inch is " + convert.methodDecider() + " " + convert.getToUnit());
        } else if (convert.getFromUnit() == "Centimeters" && number == 1.0){
            System.out.println(number + " Centimeter is " + convert.methodDecider() + " " + convert.getToUnit());
        } else {
            System.out.printf("%.2f %s is %.2f %s\n", number, convert.getFromUnit(), convert.methodDecider(), convert.getToUnit());
        }
        
        System.out.println("Would you like to convert another value? yes or no");
        scan.nextLine();
        repeat = scan.nextLine();

        if (repeat.equals("no")){
            System.out.println("Thank you for using my unit converter application!");
        }

        } while (repeat.equals("yes"));

        scan.close();

    }
}
