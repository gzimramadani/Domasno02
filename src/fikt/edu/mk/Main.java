package fikt.edu.mk;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        covek.student student1= new covek.student();
        covek covek1 = new covek();
        covek.student.ocenka ocenka1= new covek.student.ocenka();

        Scanner myObj = new Scanner(System.in);

	    System.out.println(covek1.toString());

	        student1.n = 0;
            System.out.println(student1.toString());
            ocenka1.Array[0] = Integer.parseInt(myObj.nextLine());

            while(true){
                if(ocenka1.Array[0]>10 || ocenka1.Array[0]<5) {
                    System.out.println("Pogreshna ocenka vnesi od 5-10");
                    ocenka1.Array[0] = Integer.parseInt(myObj.nextLine());
                }
                else{
                    break;
                }
        }



            student1.n = 1;
            System.out.println(student1.toString());
            ocenka1.Array[1] = Integer.parseInt(myObj.nextLine());

        while(true){
            if(ocenka1.Array[1]>10 || ocenka1.Array[1]<5) {
                System.out.println("Pogreshna ocenka vnesi od 5-10");
                ocenka1.Array[1] = Integer.parseInt(myObj.nextLine());
            }
            else{
                break;
            }
        }



            student1.n = 2;
            System.out.println(student1.toString());
            ocenka1.Array[2] = Integer.parseInt(myObj.nextLine());

        while(true){
            if(ocenka1.Array[2]>10 || ocenka1.Array[2]<5) {
                System.out.println("Pogreshna ocenka vnesi od 5-10");
                ocenka1.Array[2] = Integer.parseInt(myObj.nextLine());
            }
            else{
                break;
            }
        }

            student1.n = 3;
            System.out.println(student1.toString());
            ocenka1.Array[3] = Integer.parseInt(myObj.nextLine());

        while(true){
            if(ocenka1.Array[3]>10 || ocenka1.Array[3]<5) {
                System.out.println("Pogreshna ocenka vnesi od 5-10");
                ocenka1.Array[3] = Integer.parseInt(myObj.nextLine());
            }
            else{
                break;
            }
        }

            student1.n = 4;
            System.out.println(student1.toString());
            ocenka1.Array[4] = Integer.parseInt(myObj.nextLine());

            while(true){
                if(ocenka1.Array[4]>10 || ocenka1.Array[4]<5) {
                    System.out.println("Pogreshna ocenka vnesi od 5-10");
                    ocenka1.Array[0] = Integer.parseInt(myObj.nextLine());
                }
                else{
                    break;
                }
            }

        System.out.println(ocenka1.toString());
    }
}
