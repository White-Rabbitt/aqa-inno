import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Dates {

    public static void main(String[] args) {

        // Создайте список, в котором хранится 3 даты: 1 марта 2023 года, 2 сентября 2024 года, 6 апреля 2020 года

        ArrayList<Date> dateList = new ArrayList<>();
        dateList.add(new Date(2023, 3, 01));
        dateList.add(new Date(2024, 9, 2));
        dateList.add(new Date(2020, 4, 6));
        System.out.println(dateList);
        System.out.println();


        // Получите текущую дату и выведите: год, месяц, день, часы, минуты и секунды

        // С использованием класса Date
        Date now = new Date();
        System.out.println("Текущий год: " + (1900 + now.getYear()));
        System.out.println("Текущий месяц: " + (1 + now.getMonth()));
        System.out.println("Текущий день: " + now.getDate());
        System.out.println("Текущий час: " + now.getHours());
        System.out.println("Текущая минута: " + now.getMinutes());
        System.out.println("Текущая секунда: " + now.getSeconds());
        System.out.println();

        // С использованием класса GregorianCalendar
        Calendar calendar = new GregorianCalendar();
        System.out.println("Год: " + calendar.get(Calendar.YEAR));
        System.out.println("Месяц: " + (1 + calendar.get(Calendar.MONTH)));
        System.out.println("День: " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("Часы: " + calendar.get(Calendar.HOUR));
        System.out.println("Минуты: " + calendar.get(Calendar.MINUTE));
        System.out.println("Секунды: " + calendar.get(Calendar.SECOND));
    }
}
