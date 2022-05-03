import java.text.MessageFormat;
public class Primitives {
    public static void main (String[] args){
        //Primitives - Int Float Long Byte Double Short boolean char
        /*
        byte: The byte data type is an 8-bit signed two's complement integer.
         It has a minimum value of -128 and a maximum value of 127 (inclusive).
         The byte data type can be useful for saving memory in large arrays, where the memory savings actually matters. They can also be used in place of int where their limits help to clarify your code; the fact that a variable's range is limited can serve as a form of documentation.
            review the primitive max and mins and observe the behaviour for breaking them

        short: The short data type is a 16-bit signed two's complement integer.
            It has a minimum value of -32,768 and a maximum value of 32,767 (inclusive).
            As with byte, the same guidelines apply: you can use a short to save memory in large arrays,
            in situations where the memory savings actually matters.

         */
        byte minByte = Byte.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;

        short minShort = Short.MIN_VALUE;
        short maxShort = Short.MAX_VALUE;


        int minInt = Integer.MIN_VALUE;
        int maxInt = Integer.MAX_VALUE;

        long maxLong = Long.MAX_VALUE;
        long minLong = Long.MIN_VALUE;

        float maxFloat = Float.MAX_VALUE;
        float minFloat = Float.MIN_VALUE;

        double minDouble = Double.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;

        char minChar = Character.MIN_VALUE;
        char maxChar = Character.MAX_VALUE;

        String message = MessageFormat.format("Byte Min {0}, Byte Max {1}\nshort min{2}, short Max {3}\n" +
                "Integer min {4}, Integer max {5}\nLong Min {6}, Long Max {7}\nFloat Min {9}, Float Max {9}\n" +
                "Double Min {10} Double Max {11}\n Char Min {12} Char Max {13}",minByte,maxByte,minShort,maxShort,
                minInt,maxInt,minLong,maxLong,minFloat,maxFloat,minDouble,maxDouble,minChar,maxChar);

        System.out.println(message);


    }

}
