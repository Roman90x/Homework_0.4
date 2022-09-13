public class Main {
    public static void main(String[] args) {
        System.out.println("Условный оператор. ЧАсть 1");
        System.out.println("Задание 1");
        int age = 24;
        if (age >= 18) {
            System.out.println("Поздравляем Вас с совершеннолетием!");
        }
        if (age < 18) {
            System.out.println("Возраст совершеннолетия еще не наступил, нужно подождать");
        }

        System.out.println("Задание 2");
        if (age >= 7 && age < 18) {
            System.out.println("Ребенок ходит в школу.");
        }
        if (age >= 18 && age < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет.");
        }
        if (age >= 24) {
            System.out.println("Человек уже окончил университет и ему пора искать первую работу.");
        }

        System.out.println("Задание 3");
        int capacity = 102;
        int seatsCount = 60;
        int otherCount = capacity - seatsCount;
        int seatsUsed = 24;
        int otherUsed = 20;
        if (seatsUsed < seatsCount) {
            System.out.println("Есть еще " + (seatsCount - seatsUsed) + " сидячих мест.");
        }
        if (otherUsed < otherCount) {
            System.out.println("Есть еще " + (otherCount - otherUsed) + " стоячих мест.");
        }
        if (seatsUsed == seatsCount) {
            System.out.println("Сидячих мест нет!");
        }
        if (otherUsed == otherCount) {
            System.out.println("Стоячих мест нет!");
        }

        System.out.println("Домашнее задание 2");
        System.out.println("Задание 1");
        int years = 17;
        if (years >= 18) {
            System.out.println("Поздравляем Вас с совершеннолетием!");
        } else {
            System.out.println("Возраст совершеннолетия еще не наступил, нужно подождать");
        }
        System.out.println("Задание 2");
        if (years >= 7 && years < 18) {
            System.out.println("Ребенок ходит в школу.");
        } else if (years >= 18 && years < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет.");
        } else if (years >= 24) {
            System.out.println("Человек уже окончил университет и ему пора искать первую работу.");
        }
        System.out.println("Задание 3");
        int inTotal = 102;
        int sit = 60;
        int standUp = inTotal - sit;
        int sitUsed = 62;
        int upUsed = 50;
        if (sitUsed < sit) {
            System.out.println("Есть еще " + (sit - sitUsed) + " сидячих мест.");
        } else {
            System.out.println("Сидячих мест нет!");
        }
        if (upUsed < standUp) {
            System.out.println("Есть еще " + (standUp - upUsed) + " стоячих мест.");
        } else {
            System.out.println("Стоячих мест нет!");
        }

        System.out.println("Домашнее задание 3");
        int yearsOld = 13;
        if (yearsOld >= 2 && yearsOld <= 6) {
            System.out.println("Если возраст человека равен " + yearsOld + " то, ему нужно ходить в детский сад");
        } else if (yearsOld >= 6 && yearsOld <= 18) {
            System.out.println("Если возраст человека равен " + yearsOld + " то, ему нужно ходить в школу");
        } else if (yearsOld >= 18 && yearsOld <= 24) {
            System.out.println("Если возраст человека равен " + yearsOld + " то, ему нужно ходить в университет");
        } else if (yearsOld > 24) {
            System.out.println("Если возраст человека равен " + yearsOld + " то, ему нужно ходить на работу");
        }
        System.out.println("Задание 2");
        if (yearsOld < 5) {
            System.out.println("Ребенок не может кататься на аттракционе");
        } else if (yearsOld < 14) {
            System.out.println("Ребенок может кататься на аттракционе только в сопровождении взрослого");
        } else {
            System.out.println("Ребенок может кататься на аттракционе");
        }

        System.out.println("Задание 3");
        int one = 100;
        int two = 100;
        int three = 100;
        if (one >two) {
            if (one >= three) {
                System.out.println("Максимальное число - " + one);
            } else {
                System.out.println("Максимальное число - " + three);
            }
        } else if (two > one) {
            if (two >= three) {
                System.out.println("Максимальное число - " + two);
            } else {
                System.out.println("Максимальное число - " + three);
            }
        } else {
            if (one > three) {
                System.out.println("Максимальное число - " + one);
            } else if (three > one) {
                System.out.println("Максимальное число - " + three);
            } else {
                System.out.println("Все три числа равны");
            }
        }
    }
}