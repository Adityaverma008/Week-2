//animal is a super class
class Animals{
   String name;
   int age;
   void makeSound_animals(){
    System.out.println("All animals can make sounds");
   }
}


//dog is a base class which inherit animals
class Dog extends Animals{
    void makeSound_dog(){                                 //special attribute of class dog
        System.out.println("Dog sound is called barking");
    }
}

//cat is a base class which inherit animals
class Cat extends Animals{
    void makeSound_cat(){                                //special attribute of class cat
        System.out.println("Cat sound is called meaw");
    }
}

//bird is a base class which inherit animals
class Bird extends Animals{
    void makeSound_bird(){                              //special attribute of class bird
        System.out.println("Birds has the property called chirp");
    }
}


// creating main class which is used to create objects for every class 
public class pets{
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Bird bird = new Bird();

        dog.makeSound_animals();
        cat.makeSound_animals();
        bird.makeSound_animals();
        
    }
}