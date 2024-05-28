
// DATA TYPE :- DataType specify the different sizes of values that can be stored in the variable.
// It is two types :- (1) Premitive DataType (Pre-Defind)  (2) Non-Premitive DataType(User-Defind)

// PREMITIVE DATATYPE :- primitive data types such as byte, int, long, double, etc.
// Example of Premitive DataTypes:- 

public class Premitive {
  public static void main(String[] args) {
    int num = 2111111111;                    // integer is store whole numbers from -2147483648 to 2147483647
    byte bytes = 127;                       // byte is store whole numbers from -128 to 127
    short shorts = 32767;                  // short is store whole numbers from -32768 to 32767
    float floatnum = 5.99f;               // float is store fractional numbers and store 6 to 7 decimal digits
    char character = 'A';                //  char is store single character/letter like alphabet character and special character
    boolean bool = true;                // boolean is store true/false values.
    long longs =  99999999999999999L;   //  long is store whole numbers from -9223372036854775808 to 9223372036854775807 and to use 18 digits after L.
   double doubles = 19.99d;             // double can store fractional numbers that you should end the value with d.      
    System.out.println("This is interger = " + num);
    System.out.println("This is byte = " + bytes);
    System.out.println("This is short = " + shorts);
    System.out.println("This is float = " + floatnum);
    System.out.println("This is char = " + character);
    System.out.println("This is boolean = " + bool);
    System.out.println("This is long = " + longs);
    System.out.println("This is double = " + doubles);
  }
}
 