public class CalculatorApp {
    public static void main(String[] args) {
        if(args.length == 3){
            double value1 = Double.parseDouble(args[0]);
            double value2 = Double.parseDouble(args[2]);
            String operator = args[1];
            Double result = Double.NaN;
            switch(operator){
                case "+":
                    result = add(value1, value2);
                    break;
                case "-":
                    result = subtract(value1, value2);
                    break;
                case "x":
                    result = multiply(value1, value2);
                    break;
                case "/":
                    result = divide(value1, value2);
                    break;
                default:
                    System.out.println("Invalid operation!");
                    break;
            }
            if(Double.isNaN(result)){
                System.out.println("Calculation failed!");
            }
            else{
                System.out.printf("%f %s %f = %f", value1, operator, value2, result);
            }
        }
        else{
            System.out.println("Invalid number of arguments!");
        }
    }

    public static double add(double value1, double value2){
        return value1 + value2;
    }

    public static double subtract(double value1, double value2){
        return value1 - value2;
    }

    public static double multiply(double value1, double value2){
        return value1 * value2;
    }

    public static double divide(double value1, double value2){
        return value1 / value2;
    }
}
