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
        int yearsOld = 61;
        if (yearsOld < 2) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то ему пора спать");
        }
        if (yearsOld < 6 && yearsOld > 2) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то ему нужно ходить в детский сад");
        }
        if (yearsOld <= 18 && yearsOld >= 7) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то ему нужно ходить в школу");
        }
        if (yearsOld > 24 && yearsOld <= 60) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то ему пора ходить на работу");
        }
        if (yearsOld > 60) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то ему можно отдохнуть");

        }
        /* task5 */
        int years = 6;
        if (years < 5){
            System.out.println("Если возраст ребенка равен " + years + ", то он не может кататься на атракционе");
        }else if (years > 5 && years < 14){
            System.out.println("Если возраст ребенка равен " + years + ", то он может кататься на атракционе только в сопровождении взрослого");
        }else if (years > 14){
            System.out.println("Если возраст ребенка равен " + years + ", то он может кататься на атракционе без сопровождения взрослого");
        }
        /* task6 */
        int passenger = 75;
        int wagonCapacity = 102;
        int seatPlace = 60;
        if (wagonCapacity <= passenger){
            System.out.println("Если в вагоне " + passenger + " пассажиров, то вагон полностью забит");
        }else if (wagonCapacity - passenger > seatPlace){
            System.out.println("Если в вагоне " + passenger + " пассажиров, то в вагоне есть и сидячие и стоячие места");
        }else if (wagonCapacity - passenger <= seatPlace){
            System.out.println("Если в вагоне " + passenger + " пассажиров, то в вагоне есть только стоячие места");
        }
        /* task7 */
        int one = 2;
        int two = 5;
        int three = 7;
        if (one > two && one > three){
            System.out.println("самое большое число " + one);
        } else if (two > one && two > three) {
            System.out.println("самое большое число " + two);
        }else {
            System.out.println("самое большое число " + three);
        }
    }
}