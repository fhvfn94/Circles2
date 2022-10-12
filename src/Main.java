public class Main {
    public static void main(String[] args) {
        //task1();
        //task2();
        //task3();
        //taskTwo1();
    }
    public static void task1(){
        int result = 0;
        int salary = 15000;
        int i = 0;
        while (result <= 2459000){
            result = result + result / 100;
            result = result + salary;
            i++;
            System.out.println("месяц " + i + " сумма накоплений равна " + result + "рублей");
        }
    }
    public static void task2(){
        int i = 1;
        while (i <= 10){
            System.out.print(i);
            i++;
        }
        for (int j = 10; j > 0; j--) {
            System.out.print(j);
        }
    }
    public static void task3() {
        int y = 12000000;
        int born = y / 1000 * 17;
        int died = y / 1000 * 8;
        for (int i = 0; i <= 10; i++) {
            y += born - died;
            System.out.println("Год " +  i + " численность населения составляет " + y);
        }
    }

    public static void taskTwo1() {
        int salary = 15000;
        int r = 0;
        int i = 0;
        while (r <= 12000000){
            r = r + r / 100 * 7;
            r += salary;
            System.out.println("месяц " + i + " денег " + r);
            i++;
        }


    }
}
