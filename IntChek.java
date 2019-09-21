// Проверка строки на принадлежность к арабским цифрам

class IntChek {
    static boolean isNumeric(String str)
    {
        try
        {
            int a = Integer.parseInt(str);
        }
        catch(NumberFormatException e)
        {
            return true;
        }
        return false;
    }
}
