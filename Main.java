import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        double distance; //объявление переменной для расстояния
        final double EarthRadius = 6371; //радиус Земли в километрах
        final double PI = 3.14159265; //число пи
        double lat1, lat2; //переменные для широты
        double lon1, lon2; //переменные для долготы

        while(true){
            System.out.print("Введите значение первой координаты по долготе: ");
            lon1 = scan.nextDouble(); //начальная точка (долгота)
            if (lon1 < -180 || lon1 > 180) { //проверка, входит ли число в данный диапазон
                System.out.println("Нужно вводить число в диапазоне -180 и 180 градусов!\n");
            }
            else {
                break; //выход из цикла, если введено число из нужного диапазона
            }
        }

        while(true){
            System.out.print("Введите значение первой координаты по широте: ");
            lat1 = scan.nextDouble(); //начальная точка (широта)
            if (lat1 < -90 || lat1 > 90) { //проверка, входит ли число в данный диапазон
                System.out.println("Нужно вводить число в диапазоне -90 и 90 градусов!\n");
            }
            else {
                break; //выход из цикла, если введено число из нужного диапазона
            }
        }

        while(true){
            System.out.print("Введите значение второй координаты по долготе: ");
            lon2 = scan.nextDouble(); //конечная точка (долгота)
            if (lon2 < -180 || lon2 > 180) { //проверка, входит ли число в данный диапазон
                System.out.println("Нужно вводить число в диапазоне -180 и 180 градусов!\n");
            }
            else {
                break; //выход из цикла, если введено число из нужного диапазона
            }
        }

        while(true){
            System.out.print("Введите значение второй координаты по широте: ");
            lat2 = scan.nextDouble(); //конечная точка (широта)
            if (lat2 < -90 || lat2 > 90) { //проверка, входит ли число в данный диапазон
                System.out.println("Нужно вводить число в диапазоне -90 и 90 градусов!\n");
            }
            else {
                break; //выход из цикла, если введено число из нужного диапазона
            }
        }

        double arez = Math.sin(lat1 * (PI / 180)) * Math.sin(lat2 *
                (PI / 180)) + Math.cos(lat1 * (PI / 180)) * Math.cos(lat2 * (PI / 180)) *
                Math.cos((lon1 - lon2) * (PI / 180));
        double rez = Math.acos(arez);
        distance = EarthRadius * rez;

        System.out.println("Расстояние: " + distance + "км."); //вывод результата
    }
}
