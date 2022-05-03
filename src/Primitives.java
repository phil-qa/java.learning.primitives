import java.text.MessageFormat;
public class Primitives {
    public static void main (String[] args){
        //Primitives - Int Float Long Byte Double Short boolean char
        /*


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
