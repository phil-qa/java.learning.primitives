public class PrimitivesChallenge {
    /*
    * Challenge is to create byte variable and set it to any valid byte number, Create a short and set it to any valid short
    * Create an int and set it ti any valid int. Create a long and make it equal to 10000 plus 10 times the sum of the byte value
    * plus the short plus the integer values.
    * */
    public static void main(String[] args) {
        byte myByte = 18;
        short myShort = 100;
        int myInt = 3000;
        long compound = 10000 + (10 * (myByte + myShort + myInt));
        System.out.println("The result = "+compound);
    }

}
