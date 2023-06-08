import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        double mass[] = {ranNum(), ranNum(), ranNum(), ranNum(), ranNum(), ranNum(), ranNum(), ranNum(), ranNum(), ranNum(), ranNum(), ranNum(), ranNum(), ranNum(), ranNum()};
        System.out.println(Arrays.toString(mass));
        double average = 0.0;
        int step = 0;
        boolean start = false;
        for (double aveMean : mass) {


            if (aveMean < 0 && !start) {
                average = 0;
                start = true;
            } else if (aveMean > 0 && start) {
                average += aveMean;
                step++;
            }
        }
        System.out.println("Сумма положительных цифр после первого отрицательного числа равна = "+average);
        System.out.println("Количество цифр после первого отрицательного числа равна = "+step);
        average = average / step;
        System.out.println("Среднее арифметическое = "+average);
    }
    public static double ranNum(){
        double ranYears =   (Math.random() * 40) - 20;
        double scale = Math.pow(10,2);
        return Math.ceil(ranYears * scale)/scale ;
    }
}


