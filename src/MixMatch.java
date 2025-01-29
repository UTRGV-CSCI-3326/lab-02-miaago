public class MixMatch
{
    public static void main (String[] args)
    {
        String word = "hello";

        System.out.println("Stores an array of characters, a simple non-primative data type. EX: " + String.valueOf(word));

        char letter = 'a';

        System.out.println("Stores a single letter, or ASCII value. EX: " + String.valueOf(letter));

        short smallNum = 32766;

        System.out.println("Stores whole numbers from -32,768 to 32,767. EX: " + String.valueOf(smallNum));
        
        int num = 2147483646;

        System.out.println("Stores whole numbers from -2,147,483,648 to 2,147,483,647. EX: " + String.valueOf(num));

        long longNum = 9223372036854775806l;

        System.out.println("Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807. EX: " + String.valueOf(longNum));

        float decimal = 1.2345678f;

        System.out.println("Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits. EX: " + String.valueOf(decimal));

        double longDecimal = 1.234567898765432;

        System.out.println("Stores fractional numbers. Sufficient for storing 15 to 16 decimal digits. EX: " + String.valueOf(longDecimal));

        boolean bool = true;

        System.out.println("Stores true or false values (0/1). EX: " + String.valueOf(bool) + " and " + String.valueOf(!bool));


    }
}