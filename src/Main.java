public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        int ageBorder = 18;
        int age = 15;
        System.out.printf("Если возраст человека равен %s, то ", age);
        if (age >= ageBorder) {
            System.out.print("он совершеннолетний");
        } else {
            System.out.print("он не достиг совершеннолетия, нужно немного подождать");
        }
        // Задача 2
        System.out.println("\n\nЗадача 2");
        int tempLimit = 5;
        int temperature = 6;
        System.out.printf("На улице %s градусов, ", temperature);
        if (temperature <= tempLimit) {
            System.out.print("нужно надеть шапку");
        } else {
            System.out.print("можно идти без шапки");
        }
        // Задача 3
        System.out.println("\n\nЗадача 3");
        int speedlimit = 60;
        int speed = 61;
        System.out.printf("Если скорость %s, то ", speed);
        if (speed <= speedlimit) {
            System.out.print("можно ездить спокойно");
        } else {
            System.out.print("придется заплатить штраф");
        }
        // Задача 4
        System.out.println("\n\nЗадача 4");
        int humanAge = 25;
        int preschoolMinAge = 2;
        int preschoolMaxAge = 6;
        int schoolMinAge = 7;
        int schoolMaxAge = 17;
        int universityMinAge = 18;
        int universityMaxAge = 24;
        boolean preschoolApproved = humanAge >= preschoolMinAge && humanAge <= preschoolMaxAge;
        boolean schoolApproved = humanAge >= schoolMinAge && humanAge <= schoolMaxAge;
        boolean universityApproved = humanAge >= universityMinAge && humanAge <= universityMaxAge;
        boolean workApproved = humanAge > universityMaxAge;
        boolean inputTest = preschoolApproved || schoolApproved || universityApproved || workApproved;
        System.out.printf("Если возраст человека равен %s, то ему нужно ходить ", humanAge);
        if (preschoolApproved) {
            System.out.print("в детский сад.");
        }
        if (schoolApproved) {
            System.out.print("в школу.");
        }
        if (universityApproved) {
            System.out.print("в университет.");
        }
        if (workApproved) {
            System.out.print("на работу.");
        }
        if (!inputTest) {
            System.out.print("в ясли");
        }
        //Задача 5
        System.out.println("\n\nЗадача 5");
        int childAge = 25;
        int ageForbidden = 5;
        int ageWithParents = 14;
        boolean attractForbidden = childAge < ageForbidden;
        boolean attractWithParents = (childAge >= ageForbidden) && (childAge < ageWithParents);
        boolean attractFree = childAge >= ageWithParents;
        System.out.printf("Если возраст ребенка равен %s, то ему ", childAge);
        if (attractForbidden) {
            System.out.print("нельзя кататься на аттракционе.");
        }
        if (attractWithParents) {
            System.out.print("можно кататься на аттракционе в сопровождении взрослого.");
        }
        if (attractFree) {
            System.out.print("можно кататься на аттракционе без сопровождения взрослого");
        }
        //Задача 6
        System.out.println("\n\nЗадача 6");
        int vagonCapacityTot = 102;
        int vagonCapacitySitting = 60;
        int sittingNumber = 103;
        if (sittingNumber <= vagonCapacitySitting) {
            System.out.printf("Место №%s сидячее", sittingNumber);
        } else if (sittingNumber > vagonCapacitySitting && sittingNumber <= vagonCapacityTot) {
            System.out.printf("Место №%s стоячее", sittingNumber);
        } else {
            System.out.printf("Мест нет, вагон забит");
        }
        //Задача 7
        System.out.println("\n\nЗадача 7");
        int one = 23;
        int two = 36;
        int three = 22;
        boolean oneGreat = (one >= two) && (one >= three);
        boolean twoGreat = (two >= one) && (two >= three);
        if (oneGreat) {
            System.out.printf("Число %s наибольшее", one);
        } else if (twoGreat) {
            System.out.printf("Число %s наибольшее", two);
        } else {
            System.out.printf("Число %s наибольшее", three);
        }

    }
}