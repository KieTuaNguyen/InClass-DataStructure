//Recursion programming
public class Main {
    // Write a method starString that accepts an integer parameter n and returns a
    // string of stars (asterisks) 2n long (i.e., 2 to the nth power).
    public static String starString(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        } else if (n == 0) {
            return "*";
        } else {
            return starString(n - 1) + starString(n - 1);
        }
    }

    // Write a method writeNums that accepts an integer parameter n and prints the
    // first n integers starting with 1 in sequential order, separated by commas.
    public static void writeNums(int n) {
        if (n < 1) {
            throw new IllegalArgumentException();
        } else if (n == 1) {
            System.out.print("1");
        } else {
            writeNums(n - 1);
            System.out.print(", " + n);
        }
    }

    // Write a method writeSequence that accepts an integer n as a parameter and
    // prints a symmetric sequence of n numbers with descending integers ending in 1
    // followed by ascending integers beginning with 1
    public static void writeSequence(int x) {
        if (x < 1)
            throw new IllegalArgumentException("x must be greater than 1");
        else if (x == 1) {
            System.out.print("1 ");
        } else {
            System.out.print((x + 1) / 2 + " ");
            if (x != 2) {
                writeSequence(x - 2);
            }
            System.out.print((x + 1) / 2 + " ");
        }
    }

    // Write a method writeSquares that accepts an integer parameter n and prints
    // the first n squares separated by commas, with the odd squares in descending
    // order followed by the even squares in ascending order.
    public static void writeSquares(int n) {
        if (n < 1) {
            throw new IllegalArgumentException();
        } else if (n == 1) {
            System.out.print("1");
        } else {
            if (n % 2 == 0) {
                writeSquares(n - 1);
                System.out.print(", " + n * n);
            } else {
                System.out.print(n * n + ", ");
                writeSquares(n - 1);
            }
        }
    }

    // Write a method writeChars that accepts an integer parameter n and that prints
    // out n characters as follows. The middle character of the output should always
    // be an asterisk ("*"). If you are asked to write out an even number of
    // characters, then there will be two asterisks in the middle ("**"). Before the
    // asterisk(s) you should write out less-than characters ("<"). After the
    // asterisk(s) you should write out greater-than characters (">").
    public static void writeChars(int n) {
        if (n < 1) {
            throw new IllegalArgumentException();
        } else if (n == 1) {
            System.out.print("*");
        } else if (n == 2) {
            System.out.print("**");
        } else {
            System.out.print("<");
            writeChars(n - 2);
            System.out.print(">");
        }
    }

    // Write a method multiplyEvens that returns the product of the first n even
    // integers.
    public static int multiplyEvens(int n) {
        if (n < 1) {
            throw new IllegalArgumentException();
        } else if (n == 1) {
            return 2;
        } else {
            return 2 * n * multiplyEvens(n - 1);
        }
    }

    // Write a method sumTo that accepts an integer parameter n and returns the sum
    // of the first n reciprocals. In other words:
    // The method should return 0.0 if passed the value 0 and should throw an
    // IllegalArgumentException if passed a value less than 0.
    public double sumTo(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        } else if (n == 0) {
            return 0.0;
        } else {
            return 1.0 / n + sumTo(n - 1);
        }
    }

    // Write a recursive method digitMatch that accepts two non-negative integers as
    // parameters and that returns the number of digits that match between them. Two
    // digits match if they are equal and have the same position relative to the end
    // of the number (i.e. starting with the ones digit). In other words, the method
    // should compare the last digits of each number, the second-to-last digits of
    // each number, the third-to-last digits of each number, and so forth, counting
    // how many pairs match.
    public static int digitMatch(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException();
        } else if (a < 10 || b < 10) {
            if (a % 10 == b % 10) {
                return 1;
            } else {
                return 0;
            }
        } else {
            if (a % 10 == b % 10) {
                return 1 + digitMatch(a / 10, b / 10);
            } else {
                return digitMatch(a / 10, b / 10);
            }
        }
    }

    // Write a recursive method repeat that accepts a string s and an integer n as
    // parameters and that returns a String consisting of n copies of s.
    // ie repeat("hi ho! ", 5)
    public static String repeat(String s, int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        } else if (n == 0) {
            return "";
        } else {
            return s + repeat(s, n - 1);
        }
    }

    // Write a recursive method isReverse that accepts two strings as a parameter
    // and returns true if the two strings contain the same sequence of characters
    // as each other but in the opposite order (ignoring capitalization), and false
    // otherwise. Since the method is case-insensitive, you would also get a true
    // result from a call of isReverse("Hello", "oLLEh"). The empty string, as well
    // as any one-letter string, is considered to be its own reverse. The string
    // could contain characters other than letters, such as numbers, spaces, or
    // other punctuation; you should treat these like any other character. The key
    // aspect is that the first string has the same sequence of characters as the
    // second string, but in the opposite order, ignoring case.
    public static boolean isReverse(String s1, String s2) {
        if (s1.length() == 0 && s2.length() == 0) {
            return true;
        } else if (s1.length() == 1 && s2.length() == 1) {
            return s1.equalsIgnoreCase(s2);
        } else if (s1.length() == 0 || s2.length() == 0) {
            return false;
        } else {
            if (s1.substring(0, 1).equalsIgnoreCase(s2.substring(s2.length() - 1))) {
                return isReverse(s1.substring(1), s2.substring(0, s2.length() - 1));
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {

    }
}