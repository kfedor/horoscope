
import java.util.Random;//импортируем из пакета java.util класс Random

/**
 * В главном методе объявляем строковую переменную со значением аргумента,
 * далее сравниваем полученный запрос и аргументом, и в зависимости от
 * запроса выводим результат соответствующего метода.
 *
 * После основного метода идут методы со знаками зодиака, в которых:
 * -создаем объект типа "Random",
 * -создаем массив и кладем в него 2 варианта гороскопа,
 * -возвращаем результат метода со случайным значением объекта Random с методом nextInt.
 *
 * Для получения гороскопа, название знака зодиака необходимо вводить на русском языке.
 * Регистр не имеет значения.
 */

public class Horoscope {

    public static void main(String[] args) {

        String name = args[0];//объявляем переменную типа String с именем name и присваиваем ей значение аргумента

        if ("Овен".equalsIgnoreCase(name)){ //если Овен = аргумент(без учета регистра)
            System.out.println(aries());//выводим на экран результат метода aries
        } else if ("Телец".equalsIgnoreCase(name)){
            System.out.println(taurus());
        } else if ("Близнецы".equalsIgnoreCase(name)){
            System.out.println(gemini());
        } else if ("Рак".equalsIgnoreCase(name)){
            System.out.println(cancer());
        } else if ("Лев".equalsIgnoreCase(name)){
            System.out.println(leo());
        } else if ("Дева".equalsIgnoreCase(name)){
            System.out.println(virgo());
        } else if ("Весы".equalsIgnoreCase(name)){
            System.out.println(libra());
        } else if ("Скорпион".equalsIgnoreCase(name)){
            System.out.println(scorpio());
        } else if ("Стрелец".equalsIgnoreCase(name)){
            System.out.println(sagittarius());
        } else if ("Козерог".equalsIgnoreCase(name)){
            System.out.println(capricorn());
        } else if ("Водолей".equalsIgnoreCase(name)){
            System.out.println(aquarius());
        } else if ("Рыбы".equalsIgnoreCase(name)) {
            System.out.println(pisces());
        } else {
            System.out.println("Введен некорректный запрос");
        }
    }
    public static String aries(){
        Random randomAries = new Random();//создаем объект типа Random с именем randomAries
        String[] aries = new String[2];//создаем массив для добавления 2 вариантов гороскопов
        aries[0] = "Овен вариант 1";
        aries[1] = "Овен вариант 2";
        return aries[randomAries.nextInt(2)];
    }
    public static String taurus(){
        Random randomTaurus = new Random();
        String[] taurus;
        taurus = new String[2];
        taurus[0] = "Телец вариант 1";
        taurus[1] = "Телец вариант 2";
        return taurus[randomTaurus.nextInt(2)];
    }
    public static String gemini(){
        Random randomGemini = new Random();
        String[] gemini;
        gemini = new String[2];
        gemini[0] = "Близнецы вариант 1";
        gemini[1] = "Близнецы вариант 2";
        return gemini[randomGemini.nextInt(2)];
    }
    public static String cancer(){
        Random randomCancer = new Random();
        String[] cancer;
        cancer = new String[2];
        cancer[0] = "Рак вариант 1";
        cancer[1] = "Рак вариант 2";
        return cancer[randomCancer.nextInt(2)];
    }
    public static String leo(){
        Random randomLeo = new Random();
        String[] leo;
        leo = new String[2];
        leo[0] = "Лев вариант 1";
        leo[1] = "Лев вариант 2";
        return leo[randomLeo.nextInt(2)];
    }
    public static String virgo(){
        Random randomVirgo = new Random();
        String[] virgo;
        virgo = new String[2];
        virgo[0] = "Дева вариант 1";
        virgo[1] = "Дева вариант 2";
        return virgo[randomVirgo.nextInt(2)];
    }
    public static String libra(){
        Random randomLibra = new Random();
        String[] libra;
        libra = new String[2];
        libra[0] = "Весы вариант 1";
        libra[1] = "Весы вариант 2";
        return libra[randomLibra.nextInt(2)];
    }
    public static String scorpio(){
        Random randomScorpio = new Random();
        String[] scorpio;
        scorpio = new String[2];
        scorpio[0] = "Скорпион вариант 1";
        scorpio[1] = "Скорпион вариант 2";
        return scorpio[randomScorpio.nextInt(2)];
    }
    public static String sagittarius(){
        Random randomSagittarius = new Random();
        String[] sagittarius;
        sagittarius = new String[2];
        sagittarius[0] = "Стрелец вариант 1";
        sagittarius[1] = "Стрелец вариант 2";
        return sagittarius[randomSagittarius.nextInt(2)];
    }
    public static String capricorn(){
        Random randomCapricorn = new Random();
        String[] capricorn;
        capricorn = new String[2];
        capricorn[0] = "Козерог вариант 1";
        capricorn[1] = "Козерог вариант 2";
        return capricorn[randomCapricorn.nextInt(2)];
    }
    public static String aquarius(){
        Random randomAquarius = new Random();
        String[] aquarius;
        aquarius = new String[2];
        aquarius[0] = "Водолей вариант 1";
        aquarius[1] = "Водолей вариант 2";
        return aquarius[randomAquarius.nextInt(2)];
    }
    public static String pisces(){
        Random randomPisces = new Random();
        int index;
        String[] pisces;
        pisces = new String[2];
        pisces[0] = "Рыбы вариант 1";
        pisces[1] = "Рыбы вариант 2";
        index = randomPisces.nextInt(2);
        return pisces[index];
    }

}