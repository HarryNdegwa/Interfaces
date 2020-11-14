interface MyInterface {
    public void helloo();

    public String printName(String name);
}

public class Interface implements MyInterface {

    private static final String name = "Mike";

    @Override
    public void helloo() {
        System.out.println("Helloo");
    }

    @Override
    public String printName(String name) {
        return name;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to interfaces");

        Interface i = new Interface();

        System.out.println(i.printName(name));

    }
}