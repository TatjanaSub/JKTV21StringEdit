/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv21stringedit;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class JKTV21StringEdit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("-------- Stroki v Java ----------");
        System.out.println("Vvedite text");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        
        do{
            System.out.println("Funktsii programmq:");
            System.out.println("0. Vqhod iz programmq");
            System.out.println("1. Vqvesti kol-vo simvilov");
            System.out.println("2. Vqvesti kol-vo slov");
            System.out.println("3. Naiti slovo v stroke");
            System.out.println("4. Zamenit' ukazannoe slovo v stroke");
            System.out.println("Vqberite nomer funktsii: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            if(number == 0){
                break;
            }else if(number == 1){
                System.out.println("Vq vqbrali punkt " + number);
                int count = 0;
                char[] chars = {'a','b','c','d','i','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
                HashSet set = new HashSet();
                for (int i = 0; i < chars.length; i++){
                   set.add(chars[i]);
                }
                String strLowerCase = str.toLowerCase();
                for (int i = 0; i < strLowerCase.length(); i++){
                    if(set.contains(str.charAt(i))){
                        count++;
                    }
                }
                System.out.println("Kol-vo simvolov: " + count);
            }else if(number == 2){
                System.out.println("Vq vqbrali punkt " + number);
                String[] words = str.split(" ");
                System.out.println("Kol-vo slov: " + words.length);
            }else if(number == 3){
                System.out.println("Vq vqbrali punkt " + number);
                System.out.println("Kakoe slovo naiti: ");
                String subStr = scanner.nextLine();
                int index = str.indexOf(subStr);
                if(index < 0){
                    System.out.println("Takogo slova net v stroke");
                }else{
                    index++;
                    System.out.println("Ukazannoe slovo nahoditsja na " + index + " pozitsii");
                }
            }else if(number == 4){
                System.out.println("Vq vqbrali punkt " + number);
                System.out.println("Vvede slovo, kotoroe nado zamenit'");
                String strOld = scanner.nextLine();
                int index = str.indexOf(strOld);
                if(index < 0){
                    System.out.println("Takogo slova v stroke net");
                }else{
                    System.out.println("Vvedite slovo na kotoroe zamenjaem: ");
                    String strNew = scanner.nextLine();
                    System.out.println("Izmenennaja stroka:");
                    System.out.println(str.replace(strOld, strNew));
                }
            }
        }while(true);
    }
    
    
}
