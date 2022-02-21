package com.company;

import java.util.Scanner;

public class Main {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            int age = sc.nextInt();
            String blood = sc.nextLine();

            System.out.println("-------------------");
            System.out.println("Name : "+name);
            System.out.println("Age :" +age );
            System.out.println("Blood-Group : " +blood);


            System.out.println("-------------------");
            String group;
            if(age >= 20){
                group = "RED";
            }
            else if(age >= 15){
                group="BLUE";
            }
            else if(age >= 10){
                group = "YELLOW";
            }
            else{
                group="none";
            }
            System.out.println("Your group is: " + group);
            System.out.println("-------------------");

        }
    }

