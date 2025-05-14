public class Calculator {
 public static int add(int a, int b) {
  return a + b;
 }

 public static int subtract(int a, int b) {
  return a - b;
 }

 public static int multiply(int a, int b) {
  return a * b;
 }

 public static int divide(int a, int b) {
  return a / b;
 }

 public static int modulus(int a, int b) {
  return a % b;
 }

 public static int power(int a, int b) {
  return (int) Math.pow(a, b);
 }

 public static int square(int a) {
  return a * a;
 }

 public static int cube(int a) {
  return a * a * a;
 }

 public static void main(String[] args) {
  System.out.println("Hello, World!");
  System.out.println(add(1, 2));
  System.out.println(subtract(1, 2));
  System.out.println(multiply(1, 2));
  System.out.println(divide(1, 2));
  System.out.println(modulus(1, 2));
  System.out.println(power(1, 2));
  System.out.println(square(1));
  System.out.println(cube(1));
 }
}
