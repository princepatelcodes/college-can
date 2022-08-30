interface Nameable {
    void setName(String name);
    String getName();
}

class Name  implements Nameable {
    String name;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}

public class Implementor{
    public static void main(String[] args) {
        Name st1 = new Name();
        st1.setName("Hamlin");
        System.out.println("The set name was " + st1.getName());
    }
}
