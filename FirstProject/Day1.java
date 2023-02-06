import java.util.Scanner;

public class Day1
{
    static Scanner s;
    static String GetInput() { return s.nextLine(); }
    static Integer GetInputInt() { return Integer.parseInt(GetInput()); }
    static void Log(char message) { System.out.println(message); }
    static void Log(String message) { System.out.println(message); }

    static void Run() {
        Log('\u000C');
        s = new Scanner(System.in);
        
        Introduction();
    }

    static void Introduction() {
        Log("What is your name?");
        var name = GetInput();
        Log("Hello, " + name + "! Do you want to: ");
        Log("- Add 2 Numbers - \"add\"");
        Log("- Print something x times - \"print\"");
        Log("- Give stats about a set of numbers - \"set\"");
        Log("- Player a number game - \"game\"");
        var activity = GetInput();

        if (activity.equals("add")) AddNumbers();
        else if (activity.equals("print")) Print();
        else if (activity.equals("set")) SetStats();
        else if (activity.equals("game")) NumberGame();
    }

    static void AddNumbers() {
        Log("Okay, give me 2 numbers.");
        var num1 = GetInputInt();
        var num2 = GetInputInt();
        Log("The sum of these numbers is " + (num1 + num2) + "!");
    }

    static void Print() {
        Log("Say something to print.");
        var printStr = GetInput();
        Log("How many times do you want to print \"" + printStr + "\"?");
        var amount = GetInputInt();
        for (int i = 0; i < amount; i++) Log(printStr);
    }

    static void SetStats() {
        Log("Type out your set as a list, e.g. 1, 2, 3, 4");
        var list = GetInput();
        list = list.replace(" ", "");
        var set = list.split(",");
        var max = 0; 
        float average = 0;

        for (int i = 0; i < set.length; i++) {
            var num = Integer.parseInt(set[i]);
            if (num > max) max = num;
            average += max;
        }
        
        average /= set.length;

        Log("The average of the set is " + average + " and the max is " + max);
    }

    static void NumberGame() {
        var target = Math.round(Math.random() * 99) + 1;
        var guesses = 10;
        Log("A number has been picked between 1 and 100.");

        void guess(int num) {
            Log("You have " + guesses = " turns to guess it.");
            if ()
        } 
    }
}
