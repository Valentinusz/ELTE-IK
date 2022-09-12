/*
 * javalib könyvtár
 * Csomag: extra
 * Console.java
 *
 * Angster Erzsébet: OO tervezés és programozás, Java 1. kötet
 * 2002.09.01.
 *
 * Beolvasás a konzolról:
 *
 * String readLine()
 * String readLine(String str)
 * char readChar()
 * char readChar(String str)
 * int readInt()
 * int readInt(String str)
 * int readLong()
 * int readLong(String str)
 * double readDouble()
 * double readDouble(String str)
 * void pressEnter()
 */

package Queue.console;
import java.io.*;

public class Console {
  // Az osztályból nem lehet példányt létrehozni:
  private Console() {
  }

  /* Pufferezõ karakterfolyam, melynek forráshelye a konzol.
   * A readLine metódus használja.
   */
  private static BufferedReader be =
     new BufferedReader(new InputStreamReader(System.in));

  // ---------------------------------------------------------
  // String beolvasása sor végéig:
  public static String readLine() {
    String beString = "";
    try {
      beString = be.readLine();
    }
    catch (IOException e) {
    }
    return beString;
  }

  // ---------------------------------------------------------
  // String beolvasása sor végéig, elõtte prompt:
  public static String readLine(String str) {
    System.out.print(str);
    return readLine();
  }

  // ---------------------------------------------------------
  // Karakter beolvasása:
  public static char readChar() {
    while(true) {
      try {
        return readLine().charAt(0);
      }
      catch(IndexOutOfBoundsException e) {
        System.out.println("Nem karakter! Ujra!");
      }
    }
  }

  // ---------------------------------------------------------
  // Karakter beolvasása, elõtte prompt:
  public static char readChar(String str) {
    System.out.print(str);
    return readChar();
  }

  // ---------------------------------------------------------
  // Egész (int) beolvasása:
  public static int readInt() {
    while(true) {
      try {
        return Integer.parseInt(readLine().trim());
      }
      catch(NumberFormatException e) {
        System.out.println("Nem egesz! Ujra!");
      }
    }
  }

  // ---------------------------------------------------------
  // Egész (int) beolvasása, elõtte prompt:
  public static int readInt(String str) {
    while(true) {
      System.out.print(str);
      try {
        return Integer.parseInt(readLine().trim());
      }
      catch(NumberFormatException e) {
        System.out.println("Nem egesz! Ujra!");
      }
    }
  }

  // ---------------------------------------------------------
  // Egész (long) beolvasása:
  public static long readLong() {
    while(true) {
      try {
        return Long.parseLong(readLine().trim());
      }
      catch(NumberFormatException e) {
        System.out.println("Nem egesz! Ujra!");
      }
    }
  }

  // ---------------------------------------------------------
  // Egész (long) beolvasása, elõtte prompt:
  public static long readLong(String str) {
    while(true) {
      System.out.print(str);
      try {
        return Long.parseLong(readLine().trim());
      }
      catch(NumberFormatException e) {
        System.out.println("Nem egesz! Ujra!");
      }
    }
  }

  // ---------------------------------------------------------
  // Valós (double) beolvasása:
  public static double readDouble() {
    while(true) {
      try {
        return Double.parseDouble(readLine().trim());
      }
      catch(NumberFormatException e) {
        System.out.println("Nem valos! Ujra!");
      }
    }
  }

  // ---------------------------------------------------------
  // Valós (double) beolvasása, elõtte prompt:
  public static double readDouble(String str) {
    while(true) {
      System.out.print(str);
      try {
        return Double.parseDouble(readLine().trim());
      }
      catch(NumberFormatException e) {
        System.out.println("Nem valos! Ujra!");
      }
    }
  }

  // ---------------------------------------------------------
  // Várás az ENTER lenyomására:
  public static void pressEnter() {
    System.out.print("<ENTER>");
    readLine();
  }
}
