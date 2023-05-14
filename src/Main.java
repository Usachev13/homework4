public class Main {
    public static void main(String[] args) {
        /* task1 */
        int age = 15;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
        /* task2 */
        int temperature = 7;
        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
        /* task3 */
        int speed = 70;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
        int yearsOld = 12;
        if (yearsOld < 2) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то ему пора спать");
        }
        if (yearsOld < 6 && yearsOld > 2) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то ему нужно ходить в детский сад");
        }
        if (yearsOld <= 18 && yearsOld >= 7) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то ему нужно ходить в школу");
        }
        if (yearsOld > 24) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то ему пора ходить на работу");
        }
        if (yearsOld > 60) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то ему можно отдохнуть");

        }
    }
}