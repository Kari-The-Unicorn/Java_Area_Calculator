public class Utils {
    public static Integer ConvertToInt0_5(String s) throws Exception {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            //  System.out.println("The input data is incorrect. Please write correct operation number.(0-5)");
            throw new Exception("The input data is incorrect. Please write correct operation number.(0-5)");
        }
    }

    public static Integer ConvertToInt0_3(String s) throws Exception {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            //  System.out.println("The input data is incorrect. Please write correct operation number.(0-3)");
            throw new Exception("The input data is incorrect. Please write correct operation number.i(0-3)");
        }
    }
}
