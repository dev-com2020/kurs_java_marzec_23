package pracownik;

public abstract class Person { // public abstract class Person extends Object
    public String description;
    private String name;

    public abstract String getDescription();
    public String getName(){
        return name;
    }
}
