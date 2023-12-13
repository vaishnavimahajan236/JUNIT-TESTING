import static org.junit.Assert.assertEqual;

import org.junit.Test;

import java.beans.Transient;
import java.lang.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello,World");

} 
public static int addition(int a,int b){
    return a + b;
}
public static int substraction(int a,int b){
    return a - b;
}
public static int  multiplication(int a,int b){
    return a * b;
}

    public static int division(int a,int b) {
        return a / b;

    }
    public static double square(double a){
        return Math.sqrt(a);
    }

    public static double sin(int a){
        return Math.sin(Math.toRadians(a));

    }
    public static double cos(int a){
        return Math.cos(Math.toDegrees(a));

    }

      @Test
      public void testAdd(){
        assertEquals(message:"Addition", expected:100, addition(a:20, b:30));
      }

      @Test
       public void testSub(){
        assertEquals(message:"substraction", expected:100, substraction(a:20, b:30));
       }
       @Test
       public void testMulti(){
        assertEquals(message: "multiplication" , expected:100, multiplication(a:20, b:30));

       }
       @Test
       public void testDiv(){
        assertEquals(message: " division" , expected:100, multiplication(a:20, b:30));
+9
       }