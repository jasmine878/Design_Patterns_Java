package DecoratorDemo;

public class MeatDecorator extends SandwichDecorator{
    public MeatDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    public String make() {
        return super.make() + addMeat();
    }

    private String addMeat() {
        return " + turkey";
    }
}
