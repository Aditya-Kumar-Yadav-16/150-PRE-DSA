//Determining Even/Odd Numbers
// Difficulty: Easy
// Topics: Basic Programming
// Description: Write a program to check whether a number is even or odd.

import java.util.*;
public class QuestionOne{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int num =sc.nextInt();
        if(num%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}

