package javaapplication38;

import java.util.Date;

public class Cat {
    
    //This is where we should define all of our Instance Variables
    int age; // 0 to 23 or so
    String color;
    String mood; //Happy, Sad, Angry, Apathetic
    String name;
    float weight;
    int fullness; //On a scale from 1 to 10, 0 implying death
    int energy; //On a scale from 1 to 10, 0 implying death

    //For future reference, we'll only ever have one main, which is where our
    // programs start. Always (kinda). Even with multiple classes in a project,
    // we'll still only have one main method that kicks everything off.
    public static void main(String[] args) {
        
        //Hello, old friend.
        System.out.println("Hello world!");
        
        //This is a Local Variable (local to main, in this case).
        //Until now, this is all we've ever really worked with.
        int x = 2;
        
        //We make a NEW instance of a Cat, called cat.
        Cat cat = new Cat();
        
        //We set up all the stats of the cat, so it has...State.
        //We do that by adjusting the chosen cat's Instance Variables.
        //You can tell they're instance variables because we have to use the .
        //From the cat variable we created in order to access them.
        cat.weight = 0.5f;
        cat.fullness = 5;
        cat.energy = 2;
        cat.mood = "Angry";
        cat.name = "Mittens";
        cat.color = "Black";
        
        //So this wouldn't work, because we don't have just a detached age.
        //age = 3;
        
        //We create a second instance of a Cat, which has no state until we
        // set it up. So, we can see that each INSTANCE has its own, very
        // different, states.
        Cat cat2 = new Cat();
        
        //Make the cat do a lot of stuff.
        cat.sleep();
        cat.eat();
        cat.meow();
        cat.sleep();
        cat.play();
        cat.purr();
        cat.excreet();
        cat.excreet();
        cat.excreet();
        cat.beTorturedByHumans();
        cat.sleep();
        
        System.out.println(cat); //Exploting the toString of the Cat class
        
        
        printStats(cat); //Call a static method that can print out a cat.
        System.out.println("");
        
        cat.printStats(); //Ask the cat to print its stats (instance method)
        System.out.println("");
        
        printStats(cat2); //Print out stats of cat2, and see that it's empty-ish
        
        //cat and cat2 are local variables (that happen to be instances of a Cat
        // Object), so they'll cease to exist as soon as main ends.
        // x is also a local variable, that will cease to exist
        
//        for(;;) {} //Allows the cats to live forever, via an infinite loop ;-)
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
//    @Override
//    public String toString() {
//        return this.name; //To change body of generated methods, choose Tools | Templates.
//    }
    
    
}
