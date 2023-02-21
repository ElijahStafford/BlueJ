public class A4 {
    public static void Run() {
        Utils.ClearLog();

        var myString = "The quick brown fox jumps over the lazy dog";

        var randIndex = (int)Math.round(Utils.Random(0, myString.length() - 1)); 
        var randString = myString.substring(0, randIndex);
        randString += myString.substring(randIndex + 1, myString.length());

        // .compareTo return the difference of lengths from one string to another
        // .equals is a boolean which tells whether 2 strings have the same characters

        Utils.Log("Original: " + myString +
        "\nString length: " + myString.length() +
        "\nUppercase: " + myString.toUpperCase() +
        "\nReplace e with %: " + myString.replaceAll("e", "%") +
        "\nRemove spaces: " + myString.replaceAll(" ", "") +
        "\nIndex of i: " + myString.indexOf("i") +
        "\nIndex of # (none): " + myString.indexOf("#") +
        "\nFirst 3 characters: " + myString.substring(0, 3) +
        "\nThird to 11th: " + myString.substring(2, 11) + 
        "\nRandom character removed: " + randString);
    }
}