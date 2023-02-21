import java.text.DecimalFormat;
public class Bunny extends Pet
{
    //instance variables
    int numLegs;
    int weight; //lbs
    double tailLength; //cm
    //constructor
    public Bunny(String color, String name, int age, int numLegs, int weight, double tailLength)
    {
        super(color, name, age);
        this.numLegs = numLegs;
        this.weight = weight;
        this.tailLength = tailLength;
    }
    //brain methods
    public double lbsToKg()
    {
        DecimalFormat fmt = new DecimalFormat("0.##");
        double kilograms = weight * 0.45359237;
        return Double.parseDouble(fmt.format(kilograms));
    }

    //getters & setters

    //toString - Override, with a super reference
    public String toString()
    {
        String output = super.toString() +
                "\nNumber of bunny legs: " + numLegs +
                "\nWeight in pounds: " + weight +
                "\nLength of tail in cm: " + tailLength;
        return output;
    }
}
