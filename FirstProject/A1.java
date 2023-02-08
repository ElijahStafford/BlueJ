public class A1 {
    public static void Run() {
        Utils.Log('\u000C', false);

        Introduction();
    }

    static void Introduction() {
        Utils.Log("What is your name?");
        var name = Utils.GetInput();
        Utils.Log("Hello, " + name + "! Do you want to: ");
        Utils.Log("- Add 2 Numbers - \"add\"");
        Utils.Log("- Print something x times - \"print\"");
        Utils.Log("- Give stats about a set of numbers - \"set\"");
        Utils.Log("- Player a number game - \"game\"");
        var activity = Utils.GetInput();

        if (activity.equals("add"))
            AddNumbers();
        else if (activity.equals("print"))
            Print();
        else if (activity.equals("set"))
            SetStats();
        else if (activity.equals("game"))
            NumberGame();
    }

    static void AddNumbers() {
        Utils.Log("Okay, give me 2 numbers.");
        var num1 = Utils.GetInputInt();
        var num2 = Utils.GetInputInt();
        Utils.Log("The sum of these numbers is " + (num1 + num2) + "!");
    }

    static void Print() {
        Utils.Log("Say something to print.");
        var printStr = Utils.GetInput();
        Utils.Log("How many times do you want to print \"" + printStr + "\"?");
        var amount = Utils.GetInputInt();
        for (int i = 0; i < amount; i++)
            Utils.Log(printStr);
    }

    static void SetStats() {
        Utils.Log("Type out your set as a list, e.g. 1, 2, 3, 4");
        var list = Utils.GetInput();
        list = list.replace(" ", "");
        var set = list.split(",");
        var max = 0;
        double average = 0;

        for (int i = 0; i < set.length; i++) {
            var num = Integer.parseInt(set[i]);
            if (num > max)
                max = num;
            average += num;
        }

        average /= set.length;

        Utils.Log("The average of the set is " + average + " and the max is " + max);
    }

    static void NumberGame() {
        var target = Math.round(Math.random() * 99) + 1;
        var guesses = 10;
        Utils.Log("A number has been picked between 1 and 100.");

        while (guesses > 0) {
            Utils.Log("You have " + guesses + " guess" + (guesses == 1 ? "" : "es") + " to guess the number.");
            guesses--;
            var guess = Utils.GetInputInt();
            var difference = Math.abs(guess - target);
            var status = "";
            if (difference <= 5) status = " (HOT!!)";
            if (difference <= 2) status = " (BOILING!!!)";
            
            if (guess == target) {
                Utils.Log("You win!! The number was " + target + ".");
                return;
            }
            else if (guess > target) Utils.Log("Lower." + status);
            else Utils.Log("Higher." + status);
        }

        Utils.Log("You ran out of guesses :(");
    }
}