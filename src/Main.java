public class Main {
    public static void main(String[] args) {

        byte one = 8;
        System.out.println("Значение переменной one с типом byte равно " + one);
        short two = -17000;
        System.out.println("Значение переменной two с типом short равно " + two);
        int three = 2000000000;
        System.out.println("Значение переменной three с типом int равно " + three);
        long four = 365L;
        System.out.println("Значение переменной four с типом long равно " + four);
        float five = 2.5f;
        System.out.println("Значение переменной five с типом float равно " + five);
        double six = 3.5678432190;
        System.out.println("Значение переменной six с типом double равно " + six);

        float first = 27.12f;
        System.out.println(first);
        long second = 987678965549L;
        System.out.println(second);
        double third = 2.786;
        System.out.println(third);
        short fourth = 569;
        System.out.println(fourth);
        short fifth = -159;
        System.out.println(fifth);
        int sixth = 27897;
        System.out.println(sixth);
        byte seventh = 67;
        System.out.println(seventh);

        byte Ludmila = 23;
        byte Anna = 27;
        byte Katia = 30;
        byte allStudents = (byte) (Ludmila + Anna + Katia);
        short paper = 480;
        int studentPaper = paper / allStudents;
        System.out.println("На каждого ученика рассчитано " + studentPaper + " листов бумаги");

        byte productionPereTwoMinute = 16;
        int ProductionPereMinute = productionPereTwoMinute / 2;
        int firstStep = ProductionPereMinute * 20;
        System.out.println("За 20 минут машина произвела " + firstStep + " бутылок");
        int secondStep = firstStep * 3 * 24;
        System.out.println("За сутки машина произвела " + secondStep + " бутылок");
        int thirdStep = secondStep * 3;
        System.out.println("За 3 дня машина произвела " + thirdStep + " бутылок");
        int mounth = thirdStep * 10;
        System.out.println("За месяц машина произвела " + mounth + " бутылок");

        int allJar = 120;
        int whiteJarPerRoom = 2;
        int brownJarPerRoom = 4;
        int allJarPerRoom = whiteJarPerRoom + brownJarPerRoom;
        int allRoom = allJar / allJarPerRoom;
        int allWhiteJar = allRoom * whiteJarPerRoom;
        int allBrownJar = allRoom * brownJarPerRoom;
        System.out.println("В школе, где " + allRoom + " классов, нужно " + allWhiteJar + " банок белой краски и " + allBrownJar + " банок коричневой краски ");

        byte bananas = 5;
        byte oneBananaWeight = 80;
        double milk = 200;
        byte oneMilkWeight = 105;
        double oneMilkBottle = 100;
        byte icecream = 2;
        byte oneIcecreameWeight = 100;
        byte eggs = 4;
        byte oneEggWeight = 70;
        double allWeight = (bananas * oneBananaWeight) + (icecream * oneIcecreameWeight) + (eggs * oneEggWeight) + ((milk / oneMilkBottle) * oneMilkWeight);
        System.out.println("Вес в граммах " + allWeight);
        double kgWeight = allWeight / 1000;
        System.out.println("Вес в килограммах " + kgWeight);

        byte weight = 7;
        double firstWeight = 250;
        double secondWeight = 500;
        double kgFirstWeight;
        kgFirstWeight = firstWeight / 1000;
        double kgSecondWeight;
        kgSecondWeight = secondWeight / 1000;
        double firstDay;
        firstDay = weight / kgFirstWeight;
        System.out.println("Дней понадобится если терять 250 грамм в день " + firstDay);
        double secondDay = weight / kgSecondWeight;
        System.out.println("Дней понадобится если терять 500 грамм в день " + secondDay);
        double amounth = (firstDay + secondDay) / 2;
        System.out.println("Дней понадобится в среднем " + amounth);

        int Masha = 67760;
        double MashaProcent = Masha * 0.1;
        int MashaYear = Masha * 12;
        double MashaNew = Masha + MashaProcent;
        double MashaNewYear = MashaNew * 12;
        double year1 = MashaNewYear - MashaYear;
        System.out.println("Маша теперь получает " + MashaNew + " рублей. Годовой доход вырос на " + year1 + " рублей");
        int Denis = 83690;
        double DenisProcent = Denis * 0.1;
        int DenisYear = Denis * 12;
        double DenisNew = Denis + DenisProcent;
        double DenisNewYear = DenisNew * 12;
        double year2 = DenisNewYear - DenisYear;
        System.out.println("Маша теперь получает " + DenisNew + " рублей. Годовой доход вырос на " + year2 + " рублей");
        int Cristina = 76230;
        double CristinaProcent = Cristina * 0.1;
        int CristinaYear = Cristina * 12;
        double CristinaNew = Cristina + CristinaProcent;
        double CristinaNewYear = CristinaNew * 12;
        double year3 = CristinaNewYear - CristinaYear;
        System.out.println("Маша теперь получает " + CristinaNew + " рублей. Годовой доход вырос на " + year3 + " рублей");


    }

}