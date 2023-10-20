public class BOperators {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        // Bitwise unary NOT (~)
        int bitwiseNotResult = ~a;
        System.out.println("Bitwise unary NOT (~): " + bitwiseNotResult);

        // Bitwise AND (&)
        int bitwiseAndResult = a & b;
        System.out.println("Bitwise AND (&): " + bitwiseAndResult);

        // Bitwise OR (|)
        int bitwiseOrResult = a | b;
        System.out.println("Bitwise OR (|): " + bitwiseOrResult);

        // Bitwise exclusive OR (^)
        int bitwiseXorResult = a ^ b;
        System.out.println("Bitwise exclusive OR (^): " + bitwiseXorResult);

        // Shift right (>>)
        int shiftRightResult = a >> 1;
        System.out.println("Shift right (>>): " + shiftRightResult);

        // Shift right zero fill (>>>)
        int shiftRightZeroFillResult = a >>> 1;
        System.out.println("Shift right zero fill (>>>): " + shiftRightZeroFillResult);

        // Shift left (<<)
        int shiftLeftResult = a << 1;
        System.out.println("Shift left (<<): " + shiftLeftResult);

        // Bitwise AND assignment (&=)
        a &= b;
        System.out.println("Bitwise AND assignment (&=): " + a);

        // Bitwise OR assignment (|=)
        a |= b;
        System.out.println("Bitwise OR assignment (|=): " + a);

        // Bitwise exclusive OR assignment (^=)
        a ^= b;
        System.out.println("Bitwise exclusive OR assignment (^=): " + a);

        // Shift right assignment (>>=)
        a >>= 1;
        System.out.println("Shift right assignment (>>=): " + a);

        // Shift right zero fill assignment (>>>=)
        a >>>= 1;
        System.out.println("Shift right zero fill assignment (>>>=): " + a);

        // Shift left assignment (<<=)
        a <<= 1;
        System.out.println("Shift left assignment (<<=): " + a);
    }
}
