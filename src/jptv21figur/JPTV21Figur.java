package jptv21figur;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class JPTV21Figur {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("=====StringEdit=====");
        int repeat = 1;
        OUTER:
        do{
            System.out.println("Функции приложения: ");
            System.out.println("0. Выход из программы");
            System.out.println("1. Закрашенный прямоугольник");
            System.out.println("2. Пустой прямоугольник");
            System.out.println("3. Закрашенный треугольник");
            System.out.println("4. Пустой треугольник");
            System.out.print("Ваш выбор: ");
            int numberFunction = scanner.nextInt();
            scanner.nextLine();
            switch (numberFunction){
                case 0:
                    System.out.println("");
                    System.out.println("До свидания");
                    break OUTER;
                case 1:
                    for(int i=0; i<5; i++){ 
                        for(int j=0; j<8; j++){
                            System.out.print("* ");
                                }
                        System.out.println();
                    }break;
                case 2:
                    System.out.print("Введите длинну: ");
                    int lenght = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Введите ширину: ");
                    int weight = scanner.nextInt();
                    scanner.nextLine();
                    for(int j=1; j<=lenght; j++){  
                        for(int i=1; i<=weight; i++){
                            if(j ==1 || j==lenght || i==1 || i==weight){
                                System.out.print("* ");
                            }
                            else{
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                    }
                
                case 3:
                System.out.print("Введите длинну: ");
                int lenghttr = scanner.nextInt();
                scanner.nextLine();
                for (int i = lenghttr; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.printf("* ");
                    }
                    System.out.println();
                    }
                    break;
                case 4:
                    System.out.print("Введите длинну: ");
                    int lenghttrp = scanner.nextInt();
                    scanner.nextLine();
                    for (int i = lenghttrp; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            if(i == lenghttrp || j == 1 || j == i ){
                                System.out.printf("* ");
                            }else {
                                System.out.printf("  ");
                            }
             
                            }
                        System.out.println();
                        }
                    
                    break;
                default:
                    break;
            }
            if(repeat == 0) break;            
            
        }while(true);
        
    }
    
}
