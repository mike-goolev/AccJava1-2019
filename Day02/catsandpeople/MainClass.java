package catsandpeople;

//We created this just because we didn't feel like having MAIN in Person or Cat
//which helps keep us from accidentally accessing private methods or variables
//within main (which would be bad form).
public class MainClass {

    //For future reference, we'll only ever have one main, which is where our
    // programs start. Always (kinda). Even with multiple classes in a project,
    // we'll still only have one main method that kicks everything off.
    public static void main(String[] args) {
        
        //This is a Local Variable (local to main, in this case).
        //Until now, this is all we've ever really worked with.
        int x = 2;
        
        //Creating a bunch of cats, using different constructors
        Cat cat = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat("Boxxy");
        Cat cat4 = new Cat("Goose", "Brown");
        
        //Calling an instance method on my instance of Cat called cat.
        cat.setColor("White");
        
        //You can chain things together, too. Calling toLowerCase on cat's name
        //...but be wary of the great and powerful NULL, which will crash you.
        String lowerName = cat2.getName().toLowerCase();
        

        //Calling a bunch of instance methods for my first cat which will affect
        //state indirectly.
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
        
        //Now I can print stuff out via...all the methods I created.
        //This one will use the cat's toString method
        System.out.println(cat);
        
        //This is the static method of Cat for printing out a cat instance
        Cat.printStats(cat);
        
        System.out.println("");
        
        //This is an instance method that prints out THIS Cat's stats.
        cat.printStats();
        
        System.out.println("");
        System.out.println(cat.getName());
        
        //Now I can create people, too!
        Person myPerson = new Person();
        
        //And myPerson now has a cat!
        myPerson.setPet(cat);
        
        //Since I don't know for sure that a person has a cat...null check!
        if (myPerson.getPet() != null) {
            System.out.println("Person's pet: " + myPerson.getPet().getName());
        } else {
            System.out.println(myPerson.getName() + " aint got no pet!");
        }
    }   
}
