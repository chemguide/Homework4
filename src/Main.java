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

    }
}