public class Snake extends Pet
{
    //instance variables
    private int length; //in inches
    private boolean hasPattern;
    private String breed;
    //constructor
    public Snake (String color, String name, int age, int length, boolean hasPattern, String breed)
    {
        super(color, name, age);
        this.length  = length;
        this.hasPattern = hasPattern;
        this.breed = breed;
    }

    //brain method
    @Override
    public String feed()
    {
        return "Feed once a week";
    }

    //toString
    public String toString()
    {
        String output = super.toString() +
                "\nLength (inches): " + length +
                "\nHas a pattern: " + hasPattern +
                "\nBreed: " + breed;
        return output;
    }
}
