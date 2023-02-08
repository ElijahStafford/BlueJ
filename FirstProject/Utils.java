import java.util.Scanner;

public class Utils {
    static Scanner s = new Scanner(System.in);

    static void ClearLog() {
        System.out.print('\u000C');
    }

    static String GetInput() {
        return s.nextLine();
    }

    static Integer GetInputInt() {
        return s.nextInt();
    }

    static double GetInputDouble() {
        return s.nextDouble();
    }

    static double[] GetSetFromString(String input) {
        input = input.replace(" ", "");
        var set = input.split(",");
        double[] result = new double[set.length];

        for (int i = 0; i < set.length; i++)
            try {
                result[i] = Double.parseDouble(set[i]);
            } catch (NumberFormatException e) {
                Utils.Log("NumberFormatException occurred, defaulting to 0.");
                result[i] = 0;
            }

        return result;
    }

    // Log overloads
    static void Log(char message, boolean newLine) {
        if (newLine)
            System.out.println(message);
        else
            System.out.print(message);
    }

    static void Log(char message) {
        System.out.println(message);
    }

    static void Log(String message, boolean newLine) {
        if (newLine)
            System.out.println(message);
        else
            System.out.print(message);
    }

    static void Log(String message) {
        System.out.println(message);
    }

    static void Log(float message, boolean newLine) {
        if (newLine)
            System.out.println(message);
        else
            System.out.print(message);
    }

    static void Log(float message) {
        System.out.println(message);
    }

    static void Log(double message, boolean newLine) {
        if (newLine)
            System.out.println(message);
        else
            System.out.print(message);
    }

    static void Log(double message) {
        System.out.println(message);
    }
}
