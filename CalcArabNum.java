class CalcArabNum {  // Класс выполняющий арифметическую операцию
    static int CalcArNum(int a, int b, char operation) throws NumberFormatException {
        int result; // Переменая результат вычисления
        switch (operation) { // Цикл проверяет значение переменной и выполняет необходимую операцию
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            default: // Если введенная переменная не соотвестует требованиям программы
                result = Integer.parseInt(null);
                throw new NumberFormatException ("Ошибка выполнения операции, неверно указан знак операции");

        }
        return result; // Вовращаем результат вычисления
    }
}
