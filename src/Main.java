public class Main {
    public static void main(String[] args) {
        //task1();
        //task2();
        //task3();
        //taskTwo1();
        //taskTwo2();
        //taskTwo3();
        //taskTwo4();
        //taskThree1();
        taskThree2();
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
    public static void taskTwo2() {
        int salary = 15000;
        int r = 0;
        int i = 0;
        while (r <= 12000000){
            r = r + r / 100 * 7;
            r += salary;
            if (i % 6 == 0){
                System.out.println("месяц " + i + " денег " + r);
            }
            i++;
        }

    }
    public static void taskTwo3() {
        int salary = 15000;
        int r = 0;
        int i = 0;
        int m = 12 * 9;
        while (i <= m){
            r = r + r / 100 * 7;
            r += salary;
            if (i % 6 == 0){
                System.out.println("месяц " + i + " денег " + r);
            }
            i++;
        }

    }
    public static void taskTwo4(){
        int f = 5;
        for (int i = f; i < 31; i += 7) {
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
        }
    }
    public static void taskThree1(){
        int now = 2022;
        int start = now - 200;
        int future = now + 100;
        for (int i = start; i < future; i++) {
            if (i % 79 == 0){
                System.out.println(i);
            }
        }
    }
    public static void taskThree2(){
        int r = 0;
        for (int i = 1; i <=10; i++) {
            r = 2 * i;
            System.out.println(r);
        }
    }
}
