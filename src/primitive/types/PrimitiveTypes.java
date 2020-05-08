package primitive.types;

public class PrimitiveTypes {

    public static void main(String[] args) {

        char myChar = 'D';
        char myUniCodeChar = '\u0044';
        System.out.println("myVhar: " + myChar + ", myUniCodeChar: " + myUniCodeChar);


        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer min value : " + myMinIntValue
                + ", max value: " + myMaxIntValue);
        System.out.println("Busted max value: " + (myMaxIntValue + 1));

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte min val: " + myMinByteValue
                + ", max val: " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short min val: "
                + myMinShortValue + ", max val: " + myMaxShortValue);

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long min val: "
                + myMinLongValue + ", max val: " + myMaxLongValue);

        int myNewIntValue =  (myMinIntValue / 2);
        byte myNewByteValue =  (byte) (myMinByteValue / 2);
        short myNewShortValue =  (short) (myMinShortValue / 2);
        
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float min val: " + myMinFloatValue + ", max val: " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double min val: " + myMinDoubleValue + ", max val: " + myMaxDoubleValue);
        float myFloatVal = 5.25f;
        double myDoubleVal = 5.25d;


    }
}
