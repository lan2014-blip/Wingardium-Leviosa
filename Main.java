// the collection is defined using java.util package
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        ArrayList<String> animals=new ArrayList<>();
        ArrayList<Integer> numbers=new ArrayList<Integer>();

        //add elements

        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cheetah");

        System.out.println("=====Printing current Array=====");
        System.out.println(animals);

        animals.clear();
        System.out.println("====Printing cleared array====");
        System.out.println("Empty array:" +animals);

        if(animals.isEmpty()){
            System.out.println("Array is empty");
        } else{
            System.out.println("Array is not empty");
        }

        animals.add("Dog");
        animals.add("Cat");
        animals.add("Chicken");
        System.out.println("The size of the array is:" +animals.size());
        System.out.println("Adding more element:" +animals.add("Donkey"));
        System.out.println(animals);

        numbers.add(35);
        numbers.add(48);
        numbers.add(37);

        //lambdas
        numbers.forEach( (x) -> {System.out.println(x);} );
        numbers.forEach(n -> { if (n == 67) System.out.println("Found 67");}); 
    }
}