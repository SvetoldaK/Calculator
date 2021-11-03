
public class Application {
    /*В качестве примера:
    Первое значение(num1) = 68
    Второе значение(num2) = 8
    Код операции(int) = 1 (+)
     */
    public static void main(String[] args) {
        double num1 = 68; //Введите первое значение
        double num2 = 8; //Введите второе значение
        int i = 1; //Введите код операции(int): 1(+), 2(-), 3(*), 4(/), 5(^), 6(%)
        if (i > 6) {
            System.out.println("Неверный код операции");
        }
        else if (i == 0){
            System.out.println("Неверный код операции");
        }
        else if (i < -1) {
            System.out.println("Неверный код операции");
        }

        //Методы
        p(num1, num2, i); //p - сложение
        m(num1, num2, i); //m - вычитание
        u(num1, num2, i); //u - умножение
        d(num1, num2, i); //d - деление
        s(num1, num2, i); //s - возведение num1 в степень значения num2
        o(num1, num2, i); //o - остаток при делении
    }
    public static void p(double num1, double num2, int i) {
        if (i == 1) {
            System.out.println("Результат сложения " + (num1 + num2)); //сумма
        }
    }
    public static void m(double num1, double num2, int i){
        if (i == 2) {
            System.out.println("Результат вычитания " + (num1 - num2)); //вычитание
        }
    }
    public static void u(double num1, double num2, int i) {
        if (i == 3) {
            System.out.println("Результат умножения " + (num1 * num2)); //умножение
        }
    }
    public static void d(double num1, double num2, int i) {
        if (i == 4) {
            if (num2 == 0) {
                System.out.println("На 0 делить нельзя");
            }
            else System.out.println("Результат деления " + (num1 / num2)); //деление
        }
    }
    public static void s(double num1, double num2, int i) {
        if (i == 5) {
            System.out.println("Результат возведения в степень " + (Math.pow(num1, num2))); //степень
        }
    }
    public static void o(double num1, double num2, int i) {
        if (i == 6) {
            System.out.println("Результат остатка при делении " + (num1 % num2)); //остаток
        }
    }
}
