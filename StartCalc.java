package Calculator;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class StartCalc {

    ArrayList<Integer> list = new ArrayList<>();
    public Object answer;
    Reshenie res = new Reshenie();
    CalcRim calcRim = new CalcRim();
    ArrayList<String> krim = calcRim.calcRim();


    public void startCalc() throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in)); // считываем с консоли
        String s = bufferedReader.readLine();  // помещаем в строку
        String[] character = s.split(" "); // преобразование строки в массив строк с исключением пробелов
        String sumbol = character[1];

        if(krim.contains(character[0])) {
            boolean b = krim.contains(character[0]);
            boolean c = krim.contains(character[2]);
            if(b == false || c == false){
                System.out.println("");
            }

            else {
                for (String reader : character) {

                    try {
                        int index = krim.indexOf(reader);

                        int get = index;
                        if (get > 10) {
                            System.out.println("Predel previshen");
                            break;
                        } else {
                            list.add(get);
                        }
                    } catch (NumberFormatException e) {  // пробрасываем исключения
                        continue;
                    }
                }
            }
            list.remove(1);

            int x = list.get(0); //присваеваем переменным числа из массива
            int y = list.get(1);

            int answer1 = res.resh(x, y, sumbol);
            String answer2 = calcRim.rimConvert(answer1);
            //answer = krim.get(answer1 - 1);
            System.out.println("Otvet " + answer2);
        }

        else {
            for (String reader : character) {  // преобразование строк в числа типа Integer
                try {
                    int q = Integer.parseInt(reader);
                    if(q > 10){
                        System.out.println("Predel previshen");
                        break;
                    }
                    else{
                        list.add(q);
                    }
                }
                catch (NumberFormatException e) {  // пробрасываем исключения
                    continue;
                }
            }

            int x = list.get(0); //присваеваем переменным числа из массива
            int y = list.get(1);

            answer = res.resh(x, y, sumbol);
            System.out.println("Otvet " + answer);
        }

    }
}



