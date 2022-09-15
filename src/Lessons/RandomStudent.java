package Lessons;

import java.util.List;
import java.util.Random;

public class RandomStudent {
    public static void main(String[] args) {
        List<String> students = List.of(
                "Анастасія  Прокопчук",
                "Богдан  Желіба",
                "Ганна  Слісенко",
                "Юлія Кривонос",
                "Павло Грищенко",
                "Veronika Tarasova",
                "Юля Рисінська",
                "Артем Ларичев",
                "Віталій Швець",
                "Катерина Іванова",
                "Дмитро Чуйков",
//                "Тетяна Теслюк",
//                "Viktoriia Dziad",
                "Vladyslav Kocherhin",
                "Сергей Гончаренко",
                "Владислав Тупиков"
//                "Алла Тихевич"
        );

        System.out.println(students.get(new Random().nextInt(students.size())));
    }



}
