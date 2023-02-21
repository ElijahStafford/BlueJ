public class A3 {
    public static void Run() {
        Utils.ClearLog();

        // Make classes
        var d1 = new Dog("Husky", "Rex", 3, "gray", false);
        var d2 = new Dog("Poodle", "Bobo", 5, "black", true);
        var d3 = new Dog("German Shepherd", "Lola", 11, "brown", false);

        // Set Bobo's breed to Chihuahua
        d2.SetBreed("Chihuahua"); // OR d2.breed = "Chihuahua";

        // Log Lola's breed
        Utils.Log(d3.GetBreed()); // OR Utils.Log(d3.breed);

        // Make Rex bark
        d1.Bark();

        // Log each dog's info
        Utils.Log(d1.GetInfo());
        Utils.Log(d2.GetInfo());
        Utils.Log(d3.GetInfo());
    }
}

class Dog {
    String breed;
    String name;
    int age;
    String furColor;
    boolean adopted;

    public Dog(String breed, String name, int age, String furColor, boolean adopted) {
        this.breed = breed;
        this.name = name;
        this.age = age;
        this.furColor = furColor;
        this.adopted = adopted;
    }

    public Dog() {
        // Values will remain null
    }

    public Dog(String breed, String name, String furColor) {
        this.breed = breed;
        this.name = name;
        this.furColor = furColor;
    }

    public void SetBreed(String breed) {
        this.breed = breed;
    }

    public String GetBreed() {
        return breed;
    }

    public void Bark() {
        Utils.Log("Woof");
    }

    public String GetInfo() {
        return
        "-----{ " + (this.name != null ? this.name : "Unknown Name") + " }-----\n" +
        "Breed: " + 
        (this.breed != null ? this.breed : "Unknown") + ".\n" + 
        "Name: " + 
        (this.name != null ? this.name : "Unknown") + ".\n" +
        "Age: " + // I'm assuming an age 0 dog is null
        (this.age != 0 ? this.age : "Unknown") + ".\n" + 
        "Fur Color: " + 
        (this.furColor != null ? this.furColor : "Unknown") + ".\n" + 
        "Adopted: " + 
        this.adopted + ".";
    }
}