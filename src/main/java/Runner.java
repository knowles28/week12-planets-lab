public class Runner {
    public static void main(String[] args) {

        Planet Mars = new Planet("Mars", 2350923);



        System.out.println(Mars.getName() + " is " + Mars.getSize());
        System.out.println(Mars.explode());

    }
}
