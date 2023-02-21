public class Pet
{
    //instance variables
    public String color;
    public String name;
    public int age; //in years

    //constructor
    public Pet (String color, String name, int age)
    {
        this.color = color;
        this.name = name;
        this.age = age;
    }


    //brain methods
    public String feed()
    {
        return "Feed Daily";
    }

    //getters & setters

    //toString
    public String toString()
    {
        String output = "Name: " + name +
                        "\nColor: " + color +
                        "\nAge (years): " + age;
        return output;
    }
}//end parent class Pet (superclass)
