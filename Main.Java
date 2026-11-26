// public class Main{

//     int x = 20;
//     int y= 35;
//     int z ;
//     int modelYear ;
//     String modelName;
//     public void show()
//     {
//         System.out.println("How is your life going !");
//     }

//     public void speed(int maxSpeed)
//     {
//         System.out.println("Max speed is" +maxSpeed);
//     }

//     public Main(String name , int n)
//     {
//         z=90;
//        modelYear = n;
//        modelName = name;
//     }

//     private String name;

//     public String getName()
//     {
//         return name;
//     }

//     public void setName(String newName)
//     {
//         this.name = newName;
//     }
//     public static void main(String[] args)
//     {
//         System.out.println("Jay is in barclays");
//         Main s = new Main("Car" , 20);
//         System.out.println(s.modelName+s.modelYear);
//         String fname = "Jaywardhan";
//         String lname = "Shinde";
//         System.out.println(s.x);
//         System.out.println(s.z);
//         System.out.println(s.y);
//         s.show();
//         s.speed(200);
//         s.setName("Sonya");
//         System.out.println(s.getName());
//     }
// }

// class Car{
//     protected String name= "Scorpio N";
//     public void show()
//     {
//         System.out.println("Scorpio N in the door guys");
//     }
    
// } 

// class Sound extends Car
// {
//     public int price= 2700000 ;
//     public void sound()
//     {
//         System.out.println("SOUND HORN");
//     }
// }

// class Main extends Sound
// {
//     public static void main(String[] args)
//     {
//         Main c = new Main();
//         c.show();
//         c.sound();
//         System.out.println(c.price);
//         System.out.println(c.name);
        
//     }
// }

// class Animal
// {
//     public void animalSound()
//     {
//         System.out.println("The animal makes a sound");
//     }
// }
 
//Polymorphism
// class Dog extends Animal
// {
//     public void animalSound()
//     {
//         System.out.println("The dog barks");
//     }
// }

// class Cat extends Animal
// {
//     public void animalSound()
//     {
//         System.out.println("The cat meows");
//     }
// }

// public class Main{
//     public static void main(String[] args)
//     {
//         Animal c = new Animal();
//         c.animalSound();
//     }
// }


//super key word
// class Animal
// {
//     public void animalSound()
//     {
//         System.out.println("The animal makes a sound");
//     }
// }

// class Dog extends Animal
// {
//     public void animalSound()
//     {   
//         super.animalSound();
//         System.out.println("The dog barks");
//     }
// }

// public class Main
// {
//     public static void main(String[] args)
//     {
//         Dog c = new Dog();
//         c.animalSound();
//     }
// }

//class under class
// class Show{
//     int x = 20;
//     class Hello
//     {
//         int y = 10;
//     }
// }

// class Main
// {
//     public static void main(String[] args)
//     {
//         Show sc = new Show();
//         Show.Hello kc  =  sc.new Hello();
//         System.out.println(kc.y + sc.x);

//     }
// }


//Abstarction
// abstract class Animal
// {
//     public abstract void  AnimalSound();
//     public void sleep()
//     {
//         System.out.println("Animal is slepping");
//     }

// }

// class Hello extends Animal
// {
//     public void AnimalSound()
//     {
//         System.out.println("Animal is barking");
//     }
// }

// class Main{
//     public static void main(String[] args)
//     {
//         Hello sc = new Hello();
//         sc.AnimalSound();
//         sc.sleep();
//     }
// }

//interface 

interface Animal
{
    public void AnimalSound();
    public void CarSOund();

}

class Hello implements Animal
{
    public void AnimalSound()
    {
        System.out.println("Jay is going to rule this world");
    }

    public void CarSOund()
    {
        System.out.println("Jay will Eventually rule");
    }
}

class Main
{
    public static void main(String[] args)
    {
        Hello sc = new Hello();
        sc.AnimalSound();
        sc.CarSOund();
    }
}