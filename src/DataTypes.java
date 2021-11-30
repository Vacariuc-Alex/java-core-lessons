public class DataTypes {
//  Primitive dataTypes
    byte    oneByte = 127;                      // 1 byte;  -128
    short   shortNumber = 32767;                // 2 bytes; -32768
    int     intNumber = 2147483647;             // 4 bytes; -2147483648
    long    longNumber = 9223372036854775807l;  // 8 bytes; -9223372036854775808
    float   floatValue = 922337203.33f;         // 4 bytes; set f when we want to cast to float
    double  doubleValue = 26734721.239684;      // 8 bytes; same as long, but accepts real values
    boolean aBoolean = true;                    // 1 byte; accepts only true and false
    char    symbol = 'X';                       // 1 byte; accepts only one char value from ASCII table

//  Temporary dataTypes
    int intNumberOne = 1;
    static int staticIntNumberTwo = 2;


    public static void main(String[] args) {
        System.out.println("Static call!");
        DataTypes dataTypes = new DataTypes();

        System.out.println("Calling non-static int using an object!");
        System.out.println(dataTypes.getIntValue());
        System.out.println(dataTypes.intNumberOne);

        System.out.println("Calling static int!");
        System.out.println(staticIntNumberTwo);
        System.out.println(getStaticIntValue());

        System.out.println("Analogical!");
        System.out.println(1);
        System.out.println(2);

        System.out.println("Non-static call!");
        dataTypes.nonStaticMethod();
    }

    public void nonStaticMethod(){
        System.out.println("Calling non-static int without using an object!");
        System.out.println(getIntValue());
        System.out.println(intNumberOne);

        System.out.println("Calling static int!");
        System.out.println(staticIntNumberTwo);
        System.out.println(getStaticIntValue());

        System.out.println("Analogical!");
        System.out.println(1);
        System.out.println(2);
    }

    int getIntValue(){
        DataTypes dataTypes = new DataTypes();
        return dataTypes.intNumberOne;
    }

    static int getStaticIntValue(){
        return staticIntNumberTwo;
    }
}
