public class Exemplo {
    private static void sayHelloManyTime(int time) {
        for (int i = 0; i < time; i++) {
            sayHello();
        }
    }
    private static void sayHello() {
        System.out.println("Ola Mundo!");
    }

    public static void main(String[] args) {
        sayHelloManyTime(5);
    }
}
