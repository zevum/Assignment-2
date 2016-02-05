/**
 * Created by zuum on 2/4/2016.
 */
public class BeerSong {

    static String beer_bottle = " bottles of beer ";
    static String wall = "on the wall, ";
    static String take_One = "take one down, pass it around, ";
    static int bottle_Count = 99;


    public static String Ninety_Nine_Bottles_of_Beer()
    {
        if (bottle_Count >= 2) {
            System.out.print(bottle_Count + beer_bottle + wall);
            System.out.println(bottle_Count + beer_bottle);
        }
        else if(bottle_Count == 1) {
            System.out.print(bottle_Count + " bottle of beer " + wall);
            System.out.println(bottle_Count + " bottle of beer ");
        }

            System.out.print(take_One);
            bottle_Count = bottle_Count - 1;


        if (bottle_Count >= 1)
        {
            System.out.println(bottle_Count + beer_bottle + wall);
            Ninety_Nine_Bottles_of_Beer();
        }
        else
        {
            System.out.print("no more " + beer_bottle + wall.replace(',', '.'));
        }
        return "";

    }

    public static void main(String[] args) {
        System.out.print(Ninety_Nine_Bottles_of_Beer());
    }

}
