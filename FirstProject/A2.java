public class A2 {
    public static void Reverse() {
        Utils.ClearLog();
        Utils.Log("Input 3 strings to reverse.");
        var str1 = Utils.GetInput();
        var str2 = Utils.GetInput();
        var str3 = Utils.GetInput();
        Utils.Log(str3);
        Utils.Log(str2);
        Utils.Log(str1);
    }

    public static void StateInfo() {
        Utils.ClearLog();
        Utils.Log("Input either Ontario, BC, or Quebec.");
        var state = Utils.GetInput();

        // I know what switch/case is but it sucks and this is better :)
        if (state.equals("Ontario"))
            Utils.Log("Ottawa is the capital of Ontario.");
        if (state.equals("BC"))
            Utils.Log("Victoria is the capital of BC.");
        if (state.equals("Quebec"))
            Utils.Log("Quebec City is the capital of Quebec.");
    }

    public static void Power() {
        Utils.ClearLog();
        Utils.Log("Input a number.");
        var num = Utils.GetInputDouble();
        Utils.Log("Input a power to put to the number.");
        var pow = Utils.GetInputInt();
        Utils.Log(Math.pow(num, pow));
    }

    static void SetAverage() {
        Utils.ClearLog();
        Utils.Log("Type out your set as a list, e.g. 1, 2, 3, 4");
        Utils.Log("Numbers can be decimal.");
        var set = Utils.GetSetFromString(Utils.GetInput());

        double average = 0;
        for (double num : set)
            average += num;
        average /= set.length;

        Utils.Log("The average of the set is " + average + ".");
    }

    static void SetStandardDeviation(boolean limitNumbers) {
        Utils.ClearLog();
        Utils.Log("Type out your set as a list, e.g. 1, 2, 3, 4");
        Utils.Log("Numbers can be decimal.", !limitNumbers);
        if (limitNumbers) Utils.Log(" Must be between 33 and 255.");
        var set = Utils.GetSetFromString(Utils.GetInput());

        double average = 0;
        for (double num : set) {
            if ((num < 33 || num > 255) && limitNumbers) {
                Utils.Log("Number must be between 33 and 255.");
                return;
            }
            average += num;
        }
        average /= set.length;

        double sum = 0;
        for (double num : set)
            sum += Math.pow(num - average, 2);
        double std = Math.sqrt(sum / set.length);

        Utils.Log("The standard deviation of the set is " + std + ".");
    }

    static void GetGrade() {
        Utils.ClearLog();
        Utils.Log("Input a percentage between 0% and 100% to get a grade.");
        var input = Utils.GetInput();
        var percent = Integer.parseInt(input.replace("%", ""));
        var grade = "";

        if (percent >= 86)
            grade = "A";
        else if (percent >= 73)
            grade = "B";
        else if (percent >= 67)
            grade = "C+";
        else if (percent >= 60)
            grade = "C";
        else if (percent >= 50)
            grade = "C-";
        else
            grade = "F";

        Utils.Log("Your grade is " + grade + ".");
    }

    static void GetAscii() {
        Utils.ClearLog();
        Utils.Log("Input a number to get the corresponding ASCII character.");
        var num = Utils.GetInputDouble();
        var intNum = (int)num;
        var ascii = (char)intNum;
        Utils.Log("The DEC value " + intNum + " corresponds to " + ascii + ".");
    }
}
