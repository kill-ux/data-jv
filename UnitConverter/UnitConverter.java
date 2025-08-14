public class UnitConverter {
    public static String convert(String[] args) {
        try {
            if (args.length != 3)
                return "ERROR";
            double num = Double.parseDouble(args[2]);
            double res;
            if (args[0] == "celsius" && args[1] == "fahrenheit") {
                res = num * 9 / 5 + 32;
            } else if (args[0] == "fahrenheit" && args[1] == "celsius") {
                res = (num - 32) * 5 / 9;
            } else if (args[0] == "kilometers" && args[1] == "miles") {
                res = num * 0.621371;
            } else if (args[0] == "miles" && args[1] == "kilometers") {
                res = num * 1.60934;
                // } else if (args[0] == "pounds" && args[1] == "kilograms") {
                // res = num * 0.45359237;
            } else {
                return "ERROR";
            }
            return String.format("%.2f", res);
        } catch (Exception e) {
            return "ERROR";
        }
    }
}