class Animal {
  void eat() {
      System.out.println("Eating...");
  }
}

// Derived class
class Dog extends Animal {
  void bark() {
      System.out.println("Barking...");
  }
}

// Further derived class
class BabyDog extends Dog {
  void weep() {
      System.out.println("Weeping...");
  }
}

public class MultilevelInheritanceDemo {
  public static void main(String[] args) {
      BabyDog babyDog = new BabyDog();
      babyDog.weep();
      babyDog.bark();
      babyDog.eat();
  }
}