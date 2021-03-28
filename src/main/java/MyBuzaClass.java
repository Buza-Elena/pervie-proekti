public class MyBuzaClass {
    public static void main(String[] args) {
        // напечатать на экране тектс
       System.out.println("Priwet!");
       byte byteValue = 15; // 1 байт(256) от-128 до 127
        short shortVelue =10000; // 2б 2^16(-2^15; 2^15-1)
        int intValue =2000_000_000; // 4b 2^32
        long longValue = 1000_000_000_000_000L; //8b 2^64->10^19

        float floutValue =0.5f;//4b 8знаков
        double dobleValue = 0.5d;//8b 16 знаков
        System.out.println(1/3f);
        System.out.println(1/3.);

        boolean booleanValue =true; //flash

        char charValue = '\'';

        String hello = "Priwet";
        String world = " world";

        System.out.println(hello+world);


            }
}
