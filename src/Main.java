public class Main {
    public static void main(String[] args)
    {
        Pet blank = new Pet("grey", "Greyson", 10);
        Bunny jeff = new Bunny("white", "Jeff", 4, 4, 5, 2.1);
        Snake mochi = new Snake("blue", "Mochi", 8, 10, true, "cobra");
        //Polymorphic object instantiation
        Pet coco = new Bunny("grey", "Coco", 6, 3, 16, 3);
        Pet tommy = new Snake("pink", "Tommy", 3, 27, false, "none");
        System.out.println(mochi.feed());
        System.out.println(tommy.feed());

        System.out.println(jeff.lbsToKg());
        //System.out.println(coco.lbsToKg());

        //Pet[] myPets = {jeff, coco, mochi, tommy, blank};//this is an example of polymorphism
/*
        for(int i = 0; i < myPets.length; i++ )
        {
            System.out.println(myPets[i].toString() + "\n");
        }


        int i = 0;
        while (i < myPets.length)
        {
            System.out.println(myPets[i].toString() + "\n");
            i++;
        }

        for(Pet p : myPets)
        {
            System.out.println(p.toString() + "\n");
        }
*/


        //        System.out.println( "Jeff: " + jeff.feed());
//        System.out.println("Mochi: " + mochi.feed());
        //feed exists in both parent and child.  The computer will determine which one to use
        //when we run it.  This is late binding
//        System.out.println("Jeff's weight in kgs: " + jeff.lbsToKg());
       // System.out.println("Mochi's weight in kgs: " + mochi.lbsToKg());
        //an early binding error - no method exists in either parent or child class.

        //System.out.println(blank.toString());
//        System.out.println(jeff.toString());
//        System.out.println(mochi.toString());
    }
}