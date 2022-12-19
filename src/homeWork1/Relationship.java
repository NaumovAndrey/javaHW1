package homeWork1;

/**
 * Класс Взаимодействие. Реализация методов: добавление, удаление, вывод, поиск сотрудников
 */
public class Relationship {
    /**
     * доавление сотрудника
     */
    int index = 1;
    public static void addStaff() {
        System.out.println("Реализация создания сотрудника");
        Staff staff = new Staff();

    }

    /**
     * удаление сотрудника
     */
    public static void delStaff() {
        System.out.println("Реализация удаления сотрудника");
    }

    /**
     * вывод сотрудника(ов)
     */
    public static void searchStaff() {
        System.out.println("Реализация поиска сотрудника по имени, г/р, телефону, должности");
    }

    /**
     * метод пользовательского ввода
     */
    public String inputUser() {
        System.out.println("Реализация пользовательского метода");
        return null;
    }
}
