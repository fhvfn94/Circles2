public class Main {
    public static void main(String[] args) {
        task1();
    }
    public static void task1(){
        int result = 0;
        int salary = 15000;
        int i = 0;
        int pais = 0;
        while (result <= 2459000){
            pais = result / 100;
            result = result + salary + pais;
            i++;
            System.out.println("месяц " + i + " сумма накоплений равна " + result + "рублей");
        }
    }
}