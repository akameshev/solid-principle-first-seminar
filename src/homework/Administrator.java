package homework;

public class Administrator implements Account{
    private final String name;

    public Administrator(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
