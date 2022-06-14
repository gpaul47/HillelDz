import java.util.ArrayList;
public class Main { //Dz31
    public static boolean showStr() {
        ArrayList<String> strList = new ArrayList<>();
        strList.add("=)");
        strList.add(";)");
        strList.add(":)");
        strList.add("=(");

        boolean str1 = strList.contains("=)");

        if (str1 == true){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(showStr());
    }
}

// ДЗ 31.
//Написать метод, который принимает на вход ArrayList strList, и переменную String str,
// и используя цикл for each, выполняет поиск значения переданной строки (str), в массиве (strList).
// Если соответствующее значений найдено, то метод возвращает True, в противном случае, False.
//
// Ответом на задание, прислать скриншот с кодом, ссылку на репозиторий GitHub, с соответствующими *.java файлами.
// Для данного задания, должна быть создана от-дельная ветка с именем: ‘java28’.