//DAY 1
import java.util.Scanner;// this scanner class useful in chapter 2  to take input from user 
/*this statement used to import particular satement in the program --. */
import java.util.*;/** to import entire class use this  */
public class AAA {

    public static void main(String[] args) { // main method allows you to enter in the program
/**
 * 
 * chapter 1
 * 
 */
        System.out.println("welcome to java programming world");
        /*println automatically moves your cursor to next line
         * here you don't have to use escape statement
         */
        System.out.println("my first program");
        System.out.print("this is print statement");
        //this way we can write coments
/*this how we can write comment */
//  ; is terminator statement 
/**  Since Java is case sensitive, area, Area, and AREA are all different identifiers */
/** this special type of comment called the javadoc comment  */

/**
 * 
 chapter 2
 * 
 */
/*Java provides simple data 
types for representing integers, real numbers, characters, and Boolean types.
known as primitive data types or fundamental types.*/
// for floating point -- we use double
double radius;
double area;
radius = 20;
/* Named constant -- permanentaely assigned value cant be change like --PI */
final double PI = 3.14;
area = radius*radius*PI;
System.out.println(" the  area of the circle "+ area);

// to take input from the user we use scanner class 
Scanner a = new Scanner(System.in);
double num = a.nextInt();


/** DAY 2 */
//to get answer in decimal use this 
System.out.println(5/9); /**this directly give zero */
System.out.println(5.0/9);/**this satement give you answer in decimal */
System.out.println(System.currentTimeMillis());// Obtain the total milliseconds since midnight, Jan 1, 1970

/**
 * 
 * chapter 3
 * 
 */

 //conditional statement
 System.out.println("Enter an integer: ");
 int number = a.nextInt();

 if (number % 5 == 0)
   System.out.println("HiFive");

 if (number % 2 == 0)
   System.out.println("HiEven");

// multi line conditional satement 
/*we put braces  */
if (radius >= 0) {
    area = radius * radius * PI;
    System.out.println("The area for the circle of radius " +
    radius + " is " + area);
   }
else {
    System.out.println("Negative input");
   }
// if , elseif , else
int status = a.nextInt();
   if (status == 0) {
    // Compute tax for single filers
   }
   else if (status == 1) {
    // Compute tax for double
   }
   else if (status == 2) {
    // Compute tax for double
   }
   else if (status == 3) {
    // Compute tax for head of household
   }
   else {
    // Display wrong status
   }

/// switch operator 
int year = a.nextInt();
    
switch (year % 12) {
  case 0: System.out.println("monkey"); break;
  case 1: System.out.println("rooster"); break;
  case 2: System.out.println("dog"); break;
  case 3: System.out.println("pig"); break;
  case 4: System.out.println("rat"); break;
  case 5: System.out.println("ox"); break;
  case 6: System.out.println("tiger"); break;
  case 7: System.out.println("rabbit"); break;
  case 8: System.out.println("dragon"); break;
  case 9: System.out.println("snake"); break;
  case 10: System.out.println("horse"); break;
  case 11: System.out.println("sheep"); break;

    }
    /// How to use random function
double t = (double)(Math.random());
// here double datatype is used as if we use int then we will get answer as 0 for decimal 
System.out.println(t);
/**
 * 
 * Chapter 4
 * 
 */
// Math Function
System.out.println(Math.min(12, 14));
System.out.println(Math.sqrt(25));
System.out.println(Math.log(2));
System.out.println(Math.exp(2));
//A character data type represents a single character.
char letter = 'A';
char numChar = '4';
/**this tell the unicode value of the particular character */
System.out.println('\u0061' );
int i = (int)'A'; // The Unicode of character A is assigned to i
System.out.println(i); // i is 65

/** Escape statement  */
System.out.println("He said \"Java is fun\" and here i am");//to quotes
System.out.println("\\ is a tab character");//to write backslash
/* New line */
System.out.println("India is my country \n is a tab character");

/// Chracter function 
/** only for char -- char takes only one value  */
System.out.println(Character.isDigit('a'));
System.out.println( Character.isLetter('a'));
System.out.println(Character.isLowerCase('a'));
System.out.println(Character.isUpperCase('a'));
System.out.println(Character.toLowerCase('T'));
System.out.println(Character.toUpperCase('t'));

/// String  library function
String v = " india is my country ";
System.out.println(v.length());
System.out.println(v.toUpperCase());
System.out.println(v.toLowerCase());
System.out.println(v.charAt(5));
String s1 = "Welcome to Java";
String s2 = "Welcome to Java";
String s3 = "Welcome to C++";
System.out.println(s1.equals(s2)); // true
System.out.println(s1.equals(s3)); // false
System.out.println(v.compareToIgnoreCase(s3));// where it does matters AA = aa
System.out.println(v.startsWith(s1));
System.out.println(v.substring(2,9));

//** fun part of coding check this code out  */
System.out.println("1" + 1);// here answer is 11
System.out.println('1' + 1);// answer will 49+1 = 50 
System.out.println("1" + 1 + 1);// 111
System.out.println("A" + 1);// answer is A1
System.out.println('A' + 1);// answer is 65 + 1 = 66


/**
 * 
 * Chapter 5
 * 
 */


//looping statement 
/* WHILE LOOP */
int count = 0;
while (count < 6) {
System.out.println("Welcome to Java!");
count++;
}

// DAY 3

/*A do-while loop is the same as a while loop except that
 it executes the loop body 
first then checks the loop continuation condition */
int coun = 0;
do {
 System.out.println("Welcome to Java!");
 coun++;
} while (coun < 10);

//*A for loop has a concise syntax for writing loops */
for (int k = 0; k < 10; k++) {
  System.out.println("Welcome to Java!");
 }
/*
 * 
 * Chapter 6 
 * 
 */
// DAY 4/DAY 5
/*Overloading methods enable you to define the methods
 with the same name as long as 
their parameter lists are different */
/** Return the max between two int values */
public static int max(int num1, int num2) {
  if (num1 > num2)
    return num1;
  else
    return num2;
}

/** Find the max between two double values */
public static double max(double num1, double num2) {
  if (num1 > num2)
    return num1;
  else
    return num2;
}

/** Return the max among three double values */
public static double max(double num1, double num2, double num3) {
  return max(max(num1, num2), num3);

}
// here max methos is define multiple Methods -- overloading 
/*. A variable defined inside a method is referred to as a local variable */

}

