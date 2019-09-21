import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arabian_Roman_Calculator_v1 {
    public static void main(String[] args) throws IOException{
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Для получения результата введите через пробел арифметичскую задачу арабскими или римскими цыфрами");
            System.out.println("Число должно быть больше 0 и меньше 10");
            System.out.println("Оба числа должны быть или арабскими или римскими");
            System.out.println("Пример: 1 + 3, или IV + I");
            String values = reader.readLine();    //считываем переменные в виде строки
            String result = Operation.Result(values);   //Производим расчет с помощью класса Operation
            System.out.println(result);   // Вывод результата на экран
        }
        catch (IndexOutOfBoundsException | NumberFormatException e) {  //Отлавливаем проброшенные исключения
            System.out.println("Ошибка ввода данных");
        }
    }
}
