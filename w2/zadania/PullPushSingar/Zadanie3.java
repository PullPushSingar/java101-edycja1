package w1.zadania.PullPushSingar;

import java.io.*;

public class Zadanie3 {
    public static void main(String[] args) throws IOException {
        Reader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("Please Write first trangle side : ");
        String firstSideString = bufferedReader.readLine();
        System.out.println("Please Write first second side : ");
        String secondSideString = bufferedReader.readLine();
        System.out.println("Please Write first third side : ");
        String thirdSideString = bufferedReader.readLine();


        int firstSide = Integer.parseInt(firstSideString);
        int secondSide = Integer.parseInt(secondSideString);
        int thirdSide = Integer.parseInt(thirdSideString);

        if(!canBuildTriangle(firstSide,secondSide,thirdSide)){
            System.out.println("A triangle cannot be constructed.");
            System.exit(2137);
        }
        if(isEquilateral(firstSide,secondSide,thirdSide)){
            System.out.println("triangle is equilateral.");
        } else if (isIsosceles(firstSide,secondSide,thirdSide)) {
            System.out.println("triangle is isosceles.");
            
        } else {
            System.out.println("The triangle is scalene.");
        }


    }
    public static boolean canBuildTriangle(int a , int b , int c){
        return  (a < c + b) &&  (c < a + b) && (b < c + a);
    }
    public static boolean isEquilateral(int a , int b , int c){
        return  a == b && b == c && c == a;
    }
    public static boolean isIsosceles(int a , int b , int c){
        return  (a == b && a != c) || (a == c && a != b ) || (b == c && b != a);
    }
}
