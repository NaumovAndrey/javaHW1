package homeWork1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Класс взаимодействия с пользователем
 */
public class View {
    /**
     * метод вывода стартового меню
     */
    public void menu() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Создать содрудника");
        map.put(2, "Удалить содрудника");
        map.put(3, "Содрудники");
        map.put(4, "Выход");

        int num = printMenu(map);
        System.out.println(map.get(num));

        if (num == 1){
            Relationship.addStaff();
        } else if (num == 2) {
            Relationship.delStaff();
        } else if (num == 3) {
            Relationship.searchStaff();
        } else if (num == 4) {
            System.exit(0);
        }
        else {
            System.out.println("Некорректный ввод!\nВыберите из списка:");
            menu();
        }

    }

    public static Integer printMenu(Map<Integer, String> map) {
        for (Map.Entry<Integer, String> pair : map.entrySet()) {
            System.out.println(pair.getKey() + ": " + pair.getValue());
        }
        System.out.print("Ожидание ввода... ");
        return new Scanner(System.in).nextInt();
    }
}
