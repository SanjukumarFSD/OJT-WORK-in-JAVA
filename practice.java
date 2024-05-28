// public class practice{
//     public static void main(String args[]){
//         int a, b, c;
//         a = b = c =  50;
//         System.out.println(a+b+c);
//     }
// }

// Arithmetic Operations 
// public class practice{
// public static void main(String args[]){

// int a  = 10;
// a++;

// System.out.println(a);
// System.out.println(++a);
// System.out.println(a);

// }
// }

// public class practice{
// public static void main(String args[]){

// int a  = 10;

// System.out.println(a+=1);
// System.out.println(a-=1);
// System.out.println(a*=2);
// System.out.println(a/=2);
// }
// }


// Comparison Operators
// public class practice{
// public static void main(String args[]){

// int a  = 10, b = 5;
// if(a > b){
//     System.out.println("a bada hai");
// }else{
//     System.out.println("b bada hai");
// }
// }
// }

// public class practice{
// public static void main(String args[]){

// int a  = 10, b = 5;
// if(a == b){
//     System.out.println("barabar hai");
// }else{
//     System.out.println("barabar nhi hai");
// }
// }
// }

// public class practice{
// public static void main(String args[]){

// int a  = 10, b = 5;

// System.out.println(a!=b);
// }
// }

// Logical Operators 

// public class practice{
// public static void main(String args[]){

// int age = 14;

// if(age>18 && age<25){
//     System.out.println("you are eligible for job");
// }else { System.out.println("you are child");}

// }
// }



// Conditions & Loops

// public class practice{
// public static void main(String args[]){

// int x = 18;
// if(x>=18){
//     System.out.println("you can vote");
// }else{
//     System.out.println("you cann't vote");
// }
// }
// }

// public class practice{
// public static void main(String args[]){

// int marks = 33;

// if(marks>= 75 && marks<=100){
//     System.out.println("dis");
//     }else if(marks >= 60 && marks <= 75){
//         System.out.println("First Class");
//     }else if(marks >= 50 && marks < 60){
//         System.out.println("Second Class");
//     }else if(marks >= 40 && marks < 50){
//         System.out.println("Third Class");
//     }else if(marks > 0 && marks < 40){
//         System.out.println("Fail");
//     }else{
//         System.out.println("Invalid Marks");
//     }
// }
// }


// public class practice{
// public static void main(String args[]){

// int age  = 18;

// String outp = (age >= 18 ) ? "Youth" : "Child";
// System.out.println(outp);
// }
// }


// public class practice{
// public static void main(String args[]){
// int phone = 9;
// switch (phone) {
//   case 1:
//     System.out.println("vivo");
//     break;
//   case 2:
//     System.out.println("infinix");
//     break;
//   case 3:
//     System.out.println("samsung");
//     break;
//   case 4:
//     System.out.println("realme");
//     break;
//   case 5:
//     System.out.println("one plus");
//     break;
//   case 6:
//     System.out.println("iphone");
//     break;
//   case 7:
//     System.out.println("oppo");
//     break;
//     default : 
//         System.out.println("data nhi hai");
// }
// }
// }


// public class practice{
//     public static void main(String args[]){
//         for(int a = 1; a <=5; a++){
//         System.out.println(a);
//         }
//     }
// }


// public class practice{
//     public static void main(String args[]){
//         int x = 1;
//         while (x <= 10){
//             System.out.println("value of x : " + x);
//             x++;
//             System.out.print("\n");
//         }
//     }
// }

// Break 

// public class practice{
// public static void main(String args[]){
// int x =1;
// do{
// System.out.print("value of x : "+ x );
//  x++;
// System.out.print("\n");
// }while( x <=10);
// }
// }

// Continue

// public class practice {
//   public static void main(String[] args) {
//     for (int i = 0; i < 10; i++) {
//       if (i == 4) {
//         continue;
//       }
//       System.out.println(i);
//     }  
//   }
// }

// Break and Continue in While Loop

// public class practice{
//   public static void main(String args[]){
//     int i = 0;
// while (i < 10) {
//   System.out.println(i);
//   i++;
//   if (i == 5) {
//     // break;
//     continue;
//   }
// }
//   }
// }

// public class practice{
//   public static void main(String args[]){
//     String [] cars = {"suzuki", "tata","hundai","toyota","honda"};
//     cars[1] = "bata";
//         for(int i = 0; i < cars.length; i++) {
//         System.out.println(cars[i]);
//     }
//   }
// }

// public class practice{
// public static void main(String args[]){
// String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
// for (String i : cars) {
//   System.out.println(i);
// }
// }
// }

// Average of sum 

// public class practice{
// public static void main(String args[]){

// int nstistudents [] = {15,17,25,23,45,33,52,20,37,27,39,49};
// int avg, sum = 0;
// int length = nstistudents.length;

// for(int nsti : nstistudents){
//   sum += nsti;
// }

// avg  = sum / length;
// System.out.println("The average of nsti each students " + avg);
// }
// }

// LowestValue in array 

// public class practice{
//   public static void main(String args[]){
    
//     int values[] = {1,2,3,4,5,6,7,8,9};
//     int lowestvalue = values[0];
//     for(int value : values){
//       if(lowestvalue > value){
//         lowestvalue = value;
//       }
//     }
// System.out.println("This is lowest value in array : " + lowestvalue);
  
//   }
// }

// Java Multi-Dimensional Arrays

// Multidimensional Arrays

// public class practice{
//   public static void main(String args[]){

//     char [][] value = { {'A','B','C','D'}, {'E','F','G','H'}, {'I','J','K','L'} };
//     value [0][0] = 'T';
//     for(char [] line : value){
//     for (char i : line){
//       System.out.println(i);
//     }
   
//    }
//   }
// }

// Java Methods

// public class practice{
//   static void sanju(){  // sanju is a method 

//   }
// }

//   First Java Program: Basic Syntax

// public class practice{
// /* This is my first java program. 
//  * This will print 'Hello World' as the output
//  */
//  public static void main(String[]args){
// System.out.println("Hello World");// prints Hello World
// }
// }


//    Java Enums:- For example, if we consider an application for a fresh juice shop,

//  class FreshJuice {
//     enum FreshJuiceSize{SMALL, MEDIUM, LARGE}
//     FreshJuiceSize size;
// }
//  public class practice {
//     public static void main(String []args){
//         FreshJuice juice = new FreshJuice();
//         juice.size = FreshJuice.FreshJuiceSize.LARGE;
//         System.out.println("Size: " + juice.size);
//     }
// }
