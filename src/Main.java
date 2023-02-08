import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Animal animal;

        Scanner scan=new Scanner(System.in);


        System.out.println("What type of animal do you want: ");
        System.out.println("(a)-Dog");
        System.out.println("(b)-Cat");

        String c=scan.next();
        if (c.equals("a")) {
            animal = new Dog();
            animal.speak();
        }
        else if (c.equals("b")) {
            animal = new Cat();
            animal.speak();
        }
        else{
            animal = new Animal();

            System.out.println("That choice is invalid: ");
            animal.speak();

        }

    }
}
