import java.util.ArrayList;
        //Класс переводящий строку с аргументами в переменные

class Operation {

    private static ArrayList<String> ValuesList(String input) {
        ArrayList<String> values = new ArrayList<>();
        // Переменные для работы со строкой
        int stringBegin = 0;
        int stringEnd;
        // Цикл добавления переменных в список
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                stringEnd = i;
                values.add(input.substring(stringBegin, stringEnd));
                stringBegin = stringEnd + 1;
            } else if (i == input.length() - 1) {
                values.add(input.substring(stringBegin));
            }
        }
        // Возвращаем созданный список
        return values;
    }

    static String Result(String input) {
        ArrayList<String> values = ValuesList(input);
        if (values.size() == 0) System.out.println("Введена пустая строка"); // Проверка на пустую строку

        // Проверка арабские или римские

        try {

            int a = Integer.parseInt(values.get(0));
            int b = Integer.parseInt(values.get(2));
            char operation = values.get(1).charAt(0);

            if ((a > 0 && a <= 10) && (b > 0 && b <= 10)) {
                return String.valueOf(CalcArabNum.CalcArNum(a, b, operation)); // Выполнение арифметической операции с арабскими цифрами
            }
            else return "Введенные числа должны быть больше 0 и меньше 10";

        } catch (NumberFormatException e) {  // Выполнение операции с римкими цифрами
            String a = values.get(0);
            String b = values.get(2);
            char operation = values.get(1).charAt(0);

            if (IntChek.isNumeric(a) && IntChek.isNumeric(b)) { // Обе переменные не арабские цифры

                // Переводим римкие цифры в арабские

                int a1 = RomanToArab.convert(a);
                int b1 = RomanToArab.convert(b);
                int result = CalcArabNum.CalcArNum(a1, b1, operation);

                // Переводим числовое значение обратно в римские цифры

                return ArabToRoman.RomanNumerals(result);

                // Переменные не прошли проверку на принадлежность к одному типу
            } else return "Неверно заданы входные параметры, оба числа должны быть арабскими или римскими";
        }
    }
}
