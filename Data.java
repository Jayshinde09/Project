// import java.util.*;

// //The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified (if you want to add or remove elements to/from an array, you have to create a new one). While elements can be added and removed from an ArrayList whenever you want.
// //Linked List
// public class Data
// {
//  public static void main(String[] args)
//  {
//   ArrayList<String> cars = new ArrayList<String>();
//   cars.add("HONDA RS");
//   cars.add("HUNTER 350");
//   cars.add("Triump speed 400T");
//   cars.add("TVS ronin");

//   cars.add(2,"CB300");
//   System.out.println(cars.get(3));
//   cars.set(0,"Mazda");
//   System.out.println(cars);
//   System.out.println(cars.remove(0));
//   System.out.println(cars.size());
//   Collections.sort(cars);
//   for(String i :cars)
//   {
//     System.out.println(i);
//   }

//  }
// }


// How the ArrayList works
// The ArrayList class has a regular array inside it. When an element is added, it is placed into the array. If the array is not big enough, a new, larger array is created to replace the old one and the old one is removed.

// How the LinkedList works
// The LinkedList stores its elements in "containers." The list has a link to the first container and each container has a link to the next container in the list. To add an element to the list, the element is placed into a new container and that container is linked to one of the other containers in the list.
import java.util.*;

//LinkedList

public class Data{
    public static void main(String[] args)
    {
        LinkedList<String> cars = new LinkedList<String>();
        // cars.add("Hunter 350");
        // cars.add("Honda RS");
        // cars.add("BMW ");
        // cars.add("Triump speed 400T");
        // // System.out.println(cars);
        // cars.addFirst("BMW");
        // cars.set(2,"Audi");
        // cars.addLast("Mercedes");
        // System.out.println(cars);
        // System.out.println(cars.getFirst());
        // System.out.println(cars.getLast());
        //  System.out.println(cars.size());

        LinkedList<Integer> a =  new LinkedList<Integer>();
        a.add(1);
        a.add(7);
        a.add(9);
        a.add(4);
        Collections.sort(a);
        for(int i:a){
            System.out.println(i);
        }
        
        
    }
}