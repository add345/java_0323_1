package task3;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name;
        int now = LocalTime.now().getHour();
        int[] times = {5, 12, 18, 23};
        String[] greeting = {"Доброй ночи", "Доброе утро", "Добрый день", "Добрый вечер"};
        int res = 0;

        for (int i = times.length - 1; i >= 0; i--) {
            System.out.println(now + " " + times[i]);
            if (now < times[i]) {
                System.out.println(i);
                res = i;
            }
        }

        System.out.print("Введите имя: ");
        name = s.nextLine();
        System.out.print(greeting[res] + ", " + name + '!');
    }

}
