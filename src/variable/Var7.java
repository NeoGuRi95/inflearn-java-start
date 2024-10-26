package variable;

public class Var7 {
    public static void main(String[] args) {
        byte b = 127; // not use lol
        short s = 32767; // not use lol
        int i = 2147483647; // 4byte 2^32
        long l = 9223372036854775807L; // 8byte 2^64

        float f = 10.0f; // not use lol 소수점 이슈 4byte 2^32
        double d = 10.0; // 8byte 2^64
    }
}
