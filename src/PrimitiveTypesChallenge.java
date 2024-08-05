public class PrimitiveTypesChallenge {
    public static void main(String[] args) {
        byte myByte = 30;
        short myShort = 9;
        int myInt = 200;
        long myLong = 80000 - 5 * (myInt  + myByte + myShort);

        System.out.println(myLong);
    }
}
