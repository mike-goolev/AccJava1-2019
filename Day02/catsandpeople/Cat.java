package catsandpeople;

public class Cat {
    
    //This is where we should define all of our Instance Variables
    //If I make them private, that's proper ENCAPSULATION, which means I will
    // need getters and setters to access values I need.
    private int age; // 0 to 23 or so
    private String color;
    private String mood; //Happy, Sad, Angry, Apathetic
    private String name;
    private float weight;
    private int fullness; //On a scale from 1 to 10, 0 implying death
    private int energy; //On a scale from 1 to 10, 0 implying death
    private Person owner;
    
    public Cat() {
        this.age = 0;
        this.weight = 0.5f;
        this.fullness = 5;
        this.energy = 2;
        this.mood = "Angry";
        this.name = "Mittens";
        this.color = "Black";
    }
    
    public Cat(String name) {
        this();
        this.name = name;
    }

    public Cat(String color, int ignoreMe) {
        this();
        this.color = color;
    }
    
    public Cat(String name, String color) {
        this(name);
        this.color = color;
    }
    
    public Cat(String mood, String name, float weight, int fullness, int energy) {
        this();
        this.mood = mood;
        this.name = name;
        this.weight = weight;
        this.fullness = fullness;
        this.energy = energy;
    }

    public Cat(String name, float weight) {
        this();
        this.name = name;
        this.weight = weight;
    }

    //This is a static method, which does NOT require an instance
    //Instead, it needs to be given a cat to print out.
    public static void printStats(Cat cat) {
        System.out.println(cat.name + "'s stats:");
        System.out.println("Age: " + cat.age);
        System.out.println("Color: " + cat.color);
        System.out.println("Mood: " + cat.mood);
        System.out.println("Weight: " + cat.weight);
        System.out.println("Fullness: " + cat.fullness);
        System.out.println("Energy: " + cat.energy);
    }
    
    //This is an instance method, which prints out stuff about THIS cat.
    public void printStats() {
        System.out.println(this.name + "'s stats:");
        System.out.println("Age: " + this.age);
        System.out.println("Color: " + this.color);
        System.out.println("Mood: " + this.mood);
        System.out.println("Weight: " + this.weight);
        System.out.println("Fullness: " + this.fullness);
        System.out.println("Energy: " + this.energy);
    }
    
    public void sleep() {
        this.energy++;
        this.fullness--;
        this.mood = "Apathetic";
        System.out.println("Zzzzzz");
    }
    
    public void meow() {
        System.out.println("Meow!");
    }
    
    public void eat() {
        this.fullness++;
        this.mood = "Happy";
        this.purr();
    }
    
    public void play() {
        this.energy--;
        this.fullness--;
        this.mood = "Happy";
        System.out.println("Scamper scamper");
    }
    
    public void purr() {
        System.out.println("Purrrrrrrrrr...");
    }
    
    public void excreet() {
        System.out.println("Poot!");
    }
    
    public void beTorturedByHumans() {
        this.mood = "Angry";
    }

    //Overriding the toString allows us to give meaningful information about
    //the object when it is printed out. Otherwise, you just end up with a
    //memory address, which isn't terribly helpful.
    @Override
    public String toString() {
        return "toString says I'm " + this.name;
    }
    
    //Non-standard setter for Owner, because I have to set the owner's pet too
    // and then I have to add the if logic to avoid an infinite cycle.
    public void setOwner(Person owner) {
        this.owner = owner;
        if (this.owner.getPet() != this) {
            this.owner.setPet(this);
        }
    }
    
    //** STANDARD GETTERS AND SETTERS BEYOND THIS POINT **
    
        public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getFullness() {
        return this.fullness;
    }

    public Person getOwner() {
        return owner;
    }    
}
