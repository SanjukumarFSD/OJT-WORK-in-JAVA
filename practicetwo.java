// Java Syntax

// Q.1 :- Insert the missing part of the code below to output "Hello World"?

// public class practicetwo {
//   public static void main(String[] args) {
//     System.out.println("Hello World");
//   }
// }

// Q.2 :- Comments in Java are written with special characters. Insert the missing parts?

// public class practicetwo {
//   public static void main(String[] args) {
//    /* System.out.println("Hello World"); */
//    // System.out.println("Hello World");
//   }
// }

// Java Variables

// Q.1 :- Create a variable named carName and assign the value Volvo to it?

// public class practicetwo {
//   public static void main(String[] args) {
//     String carName = "Volvo";
//    System.out.println(carName);
//   }
// }

// Q.2 :- Create a variable named maxSpeed and assign the value 120 to it?

// public class practicetwo {
//   public static void main(String[] args) {
//     int maxSpeed = 120;
//    System.out.println(maxSpeed);
//   }
// }

// Q.3 :- Display the sum of 5 + 10, using two variables: x and y.

// public class practicetwo {
//   public static void main(String[] args) {
//     int x = 5;
//     int y = 10;
//    System.out.println(x+y);
//   }
// }

// Q.4 :- Create a variable called z, assign x + y to it, and display the result.

// public class practicetwo {
//   public static void main(String[] args) {
//     int x = 5;
//     int y = 10;
//     int z = x + y;
//    System.out.println(z);
//   }
// }

// Q.5 :- Fill in the missing parts to create three variables of the same type, using a comma-separated list?

//  public class practicetwo {
//   public static void main(String[] args) {
//     int x = 5, y = 6, z = 50;
//    System.out.println(x+y+z);
//   }
// }

// Java Data Types

// Q.1 :- Add the correct data type for the following variables:

//  public class practicetwo {
//   public static void main(String[] args) {
 
//  int myNum = 9;
//  float myFloatNum = 8.99f;
//  char myLetter = 'A';
//  boolean myBool = false;
//  String myText = "Hello World";

// System.out.println(myNum);
// System.out.println(myFloatNum);
// System.out.println(myLetter);
// System.out.println(myBool);
// System.out.println(myText);

//   }
// }

// Q.2 :- byte, short, int, long, float, double, boolean and char are called ?
// This is all primitive data types.

// Q.3 :- Type casting - convert the following double type (myDouble) to an int type?

// public class practicetwo {
//   public static void main(String[] args) {
//     double myDouble = 99.0;
//     int myInt = (int) myDouble;

//     System.out.println(myDouble);
//     System.out.println(myInt);
//   }
// }

// Java Operators

// Q.1 :- Multiply 10 with 5, and print the result.

// public class practicetwo {
//   public static void main(String[] args) {
//     System.out.println(10 * 5);
//   }
// }

// Q.2 :- Divide 10 with 5, and print the result.

// public class practicetwo {
//   public static void main(String[] args) {
//     System.out.println(10 / 5);
//   }
// }

// Q.3 :- Use the correct operator to increase the value of the variable x by 1.

// public class practicetwo {
//   public static void main(String[] args) {
//     int x = 10;
//     ++x;
//     System.out.println(x);
//   }
// }

// Q.4 :- Use the addition assignment operator to add the value 5 to the variable x.

// public class practicetwo {
//   public static void main(String[] args) {
//     int x = 10;
//     x += 5;
//     System.out.println(x);
//   }
// }

// Java Strings 

// Q.1 :- Fill in the missing part to create a greeting variable of type String and assign it the value Hello.

// public class practicetwo {
//   public static void main(String[] args) {
//     String greeting = "Hello";
//     System.out.println(greeting);
//   }
// }

// Q.2 :- Divide 10 with 5, and print the result.

// public class practicetwo {
//   public static void main(String[] args) {
//     System.out.println(10 / 5);
//   }
// }















// import java.util.Scanner;

// public class practicetwo {
//   public static void main(String[] args) {
//     Scanner scanner = new Scanner(System.in);
    
//     System.out.print("Enter a number between 1 and 20: ");
//         int PC = scanner.nextInt();
//     switch (PC) {
//       case 1:
//         System.out.println("Gulshan Ray");
//         break;
//       case 2:
//         System.out.println("Shivam Shukla");
//         break;
//       case 3:
//         System.out.println("No Allowted");
//         break;
//       case 4:
//         System.out.println("Sanju Kumar");
//         break;
//       case 5:
//         System.out.println("Mukesh Nirmal");
//         break;
//       case 6:
//         System.out.println("No Allowted");
//         break;
//       case 7:
//         System.out.println("Bhagwaan Singh");
//         break;
//       case 8:
//         System.out.println("Raja Kumar");
//         break;
//       case 9:
//         System.out.println("Manisha Saini");
//         break;
//       case 10:
//         System.out.println("Pravesh Grewal");
//         break;
//       case 11:
//         System.out.println("No Allowted");
//         break;
//       case 12:
//         System.out.println("Sanjay Sonkariya");
//         break;
//       case 13:
//         System.out.println("Prabash Kumar");
//         break;
//       case 14:
//         System.out.println("Aman Kumar");
//         break;
//       case 15:
//         System.out.println("No Allowted");
//         break;
//       case 16:
//         System.out.println("No Allowted");
//         break;
//       case 17:
//         System.out.println("Kunjesh Yadav");
//         break;
//       case 18:
//         System.out.println("Kavita Gurjar");
//         break;
//       case 19:
//         System.out.println("Seema Saini");
//         break;
//       case 20:
//         System.out.println("Ramakant Prajapati");
//         break;
//       default:
//             System.out.println("Invalid input. Please enter a number between 1 and 20.");
//     }
//     scanner.close();
//   }
// }

// public class practicetwo{
//     public static void main(String args[]){
//         int dice = 5;
//         while (dice <= 6){
//             if(dice < 6){
//                 System.out.println("No Yatzy");
//             }else{
//                 System.out.println("Yatzy");
//             }
//             dice = dice + 1;
//         }
//     }
// }

