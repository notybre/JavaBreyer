package com.company;
import java.util.Scanner;

class Zadanie1 {
    public static int randomVal(){
        return (int) (Math.random()*6);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        if (s%2==0){ //1 задание
            System.out.println("чет");
        }
        else{
            System.out.println("нечет");
        }
        if (0<=s && s<=10){ //2 задание
            System.out.println("положительное число от 0 до 10 включительно");
        }
        else{
            System.out.println("отрицательное число меньше 0 или положительное число больше 10");
        }
        if (s==1){ //3 задание
            System.out.println("ponedelnik");
        }
        if (s==2){
            System.out.println("vtornik");
        }
        if (s==3){
            System.out.println("sreda");
        }
        if (s==4){
            System.out.println("chetverg");
        }
        if (s==5){
            System.out.println("pyatnitsa");
        }
        if (s==6 || s==7){
            System.out.println("VIHODNOY!!!");
        }
        switch (s) { //4 задание
            case 1:
                System.out.println("ponedelnik 2");
                break;
            case 2:
                System.out.println("vtornik 2");
                break;
            case 3:
                System.out.println("sreda 2");
                break;
            case 4:
                System.out.println("chetverg 2");
                break;
            case 5:
                System.out.println("pyatnitsa 2");
                break;
            case 6:
                System.out.println("VIHODNOY!!! 2");
                break;
            case 7:
                System.out.println("VIHODNOY!!! 2");
                break;
            default:
                break;
        }
        int a=0; //5 задание
        while (a<=10){
            System.out.println("Task"+a);
            a++;
        }
        for (int i = 0; i < 100; i++) { //6 задание
            if (i%5==0){
                System.out.println(i);
            }
        }
        //7 задание
        String empty_string="";
        for (char ch = 'h'; ch < 'h' + 5; ch++) {
            empty_string=empty_string+ch;
        }

        System.out.println(empty_string);

        //8-9 задание

        //10 задание
        int randint = randomVal();
        int faktorial = 1;
        for (int i = 1; i < randint+1; i++) {
            faktorial=faktorial*i;
        }
        System.out.println("randint: "+randint+" faktorial: "+faktorial);

        //dop zadanie (простые числа до 100)
        for (int i = 1; i < 100; i++) {
            int denum_count=0;
            for (int j = 1; j < 100; j++) {
                if (i%j==0){
                    denum_count++;
                }
            }
            if (denum_count==2){
                System.out.println("простое "+i);
            }
        }
    }
}