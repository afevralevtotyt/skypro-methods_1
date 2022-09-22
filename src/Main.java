import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int year = 2020;
        int productionYear = 2021;
        int os = 0;
        System.out.println("Задача 1");
        determineYear(year);
        System.out.println("Задача 2");
        int currentYear = LocalDate.now().getYear();
        checkOsYear(0, currentYear, productionYear);
        System.out.println("Задача 3");
        int distance = 19;
        System.out.println("Потребуется дней: " +countDeliveryDays(distance));
        System.out.println("Задача 4");
        int [] arr = {3, 2, 1, 6, 5};
        hardtask4(arr);
        System.out.println("Задача 5");
        String str = "abcdefghijk";
        hardTask5(str);
        System.out.println("Задача 6");
        System.out.println(averageSum(generateRandomArray()));


    }




    //task1
    private static void determineYear(int year) {
        if (year%4==0&&year%100!=0||year%400==0){
            System.out.println(year+ " - год является високосным ");

        }else {
        System.out.println(year+ " - год  не является високосным ");
    }}

    //task2
    static void checkOsYear(int os, int currentYear,int productionYear) {
        if (os==0){
            if (productionYear < currentYear) {
                System.out.println("Установите lite весрию для iOs");

            } else {
                System.out.println("Установите весрию для iOs");
            }} else if (os==1){

            if (productionYear < currentYear) {
                System.out.println("Установите lite весрию для Andoroid");

            } else {
                System.out.println("Установите весрию для Android");}


    }


    }
    //task3
    private static int countDeliveryDays(int distance) {
        int days = 1;
        int i= 20;
       while (i<=distance){
           days+=1;
           i+=40;
        } return days;
        }
//Task4
    private static void hardtask4(int[] arr) {
        int tmp = 0;
        for (int i = 0; i <arr.length/2; i++) {
            tmp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = tmp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
//task5
private static void hardTask5(String str) {
        String strNew = String.valueOf(str);
    for (int i = 0; i < str.length()-1; i++) {
        if (str.charAt(i) == str.charAt(i + 1)) {
            System.out.println("Первый дублирующийся символ " + str.charAt(i));
            strNew = strNew.replace(str.charAt(i), ' ');
            break;
        }}
    if (str.equals(strNew)){
        System.out.println("Дублей  нет");
    }}
    //Task6
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static double averageSum (int arr []) {
        int sum = 0;
        for (int i : arr) {
            sum+=i;
        }
        double average = sum*1.0/arr.length;
        return average;
    }



    }
