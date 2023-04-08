package unitconverter.project;

public class UnitConverter {
    private int fromUnit;
    private int toUnit;
    private double num;

    public UnitConverter(int fromUnit, int toUnit, double num){
        this.fromUnit = fromUnit;
        this.toUnit = toUnit;
        this.num = num;
    }

    // Get your FROM unit
    public String getFromUnit(){
        if (fromUnit == 1){
            return "Feet";
        } else if (fromUnit == 2){
            return "Meters";
        } else if (fromUnit == 3){
            return "Inches";
        } else if (fromUnit == 4){
            return "Centimeters";
        }
        return "Wrong Unit";
    }

    // Get your TO unit
    public String getToUnit(){
        if (toUnit == 1){
            return "Feet";
        } else if (toUnit == 2){
            return "Meters";
        } else if (toUnit == 3){
            return "Inches";
        } else if (toUnit == 4){
            return "Centimeters";
        }
        return "Wrong Unit";
    }


    // Decide which conversion to use
    public double methodDecider(){
        if (fromUnit == 1 && toUnit == 1){
            return num;
        } else if (fromUnit == 1 && toUnit == 2){
            return num * 0.3048;
        } else if (fromUnit == 1 && toUnit == 3){
            return num * 12;
        } else if (fromUnit == 1 && toUnit == 4){
            return num * 30.48;
        } else if (fromUnit == 2 && toUnit == 1){
            return num * 3.281;
        } else if (fromUnit == 2 && toUnit == 2){
            return num;
        } else if (fromUnit == 2 && toUnit == 3){
            return num * 39.37;
        } else if (fromUnit == 2 && toUnit == 4){
            return num * 100;
        } else if (fromUnit == 3 && toUnit == 1){
            return num / 12;
        } else if (fromUnit == 3 && toUnit == 2){
            return num / 39.37;
        } else if (fromUnit == 3 && toUnit == 3){
            return num;
        } else if (fromUnit == 3 && toUnit == 4){
            return num * 2.54;
        } else if (fromUnit == 4 && toUnit == 1){
            return num / 30.48;
        } else if (fromUnit == 4 && toUnit == 2){
            return num / 100;
        } else if (fromUnit == 4 && toUnit == 3){
            return num / 2.54;
        } else if (fromUnit == 4 && toUnit == 4){
            return num;
        }
        return num;
    }


}
