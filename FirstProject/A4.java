public class A4 {
    public static void Run() {
        Utils.ClearLog();

        var myString = "The quick brown fox jumps over the lazy dog";

        var randIndex = (int)Math.round(Utils.Random(0, myString.length() - 1)); 
        var randString = myString.substring(0, randIndex);
        randString += myString.substring(randIndex + 1);

        // .compareTo() returns the difference of lengths from one string to another
        // .equals() is a boolean which tells whether 2 strings have the same characters

        Utils.Log("Original: " + myString +
        "\nString length: " + myString.length() +
        "\nUppercase: " + myString.toUpperCase() +
        "\nReplace e with %: " + myString.replaceAll("e", "%") +
        "\nRemove spaces: " + myString.replaceAll(" ", "") +
        "\nIndex of i: " + myString.indexOf("i") +
        "\nIndex of # (none): " + myString.indexOf("#") +
        "\nFirst 3 characters: " + myString.substring(0, 3) +
        "\nThird to 10th: " + myString.substring(2, 10) + 
        "\nRandom character removed: " + randString);

        var customString = "abcdefghijklmnopqrstuv";
        var charArr = customString.toCharArray();

        Utils.Log("\nOriginal: " + customString +
        "\nString length: " + customString.length() + 
        "\nLess than: \"abcdefghijklmnop\" = " + "abcdefghijklmnop".compareTo(customString) +
        "\nGreater than: \"abcdefghijklmnopqrstuvqrstuv\" = " + "abcdefghijklmnopqrstuvqrstuv".compareTo(customString) +
        "\nEqual to: \"ABCDEFGHIJKLMNOPQRSTUV\" = " + customString.compareTo("ABCDEFGHIJKLMNOPQRSTUV") +
        "\nLetters 4 and 17: " + charArr[3] + ", " + charArr[16]);
        
        Utils.Log("Characters in order:");
        for (var i = 0; i < charArr.length; i++) {
            Utils.Log(charArr[i]);
        }
        
        Utils.Log("Characters backward:");
        for (var i = charArr.length - 1; i >= 0; i--) {
            Utils.Log(charArr[i]);
        }
        
        Utils.Log("Every second character:");
        for (var i = 0; i < charArr.length; i += 2) {
            Utils.Log(charArr[i]);
        }
    }
}
