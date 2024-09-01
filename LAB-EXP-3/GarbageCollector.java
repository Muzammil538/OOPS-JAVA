
class MyClass {
    String name;

    // Constructor
    MyClass(String name) {
        this.name = name;
        System.out.println("Object created: " + name);
    }
}

class GarbageCollector {
    public static void main(String[] args) {
        // Create objects
        MyClass obj1 = new MyClass("Object 1");
        MyClass obj2 = new MyClass("Object 2");

        // Make objects eligible for garbage collection
        obj1 = null; 
        obj2 = null; 

        // Explicitly invoke garbage collector
        System.gc(); 

        // Sleep to allow time for garbage collection
        try {
            Thread.sleep(1000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

