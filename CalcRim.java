package Calculator;

import java.util.ArrayList;
import java.util.List;

public class CalcRim {


    public ArrayList<String> calcRim() {
        ArrayList<String> rimList = new ArrayList<>();

        rimList.add(0,"");
        rimList.add(1,"I");
        rimList.add(2,"II");
        rimList.add(3,"III");
        rimList.add(4,"IV");
        rimList.add(5,"V");
        rimList.add(6,"VI");
        rimList.add(7,"VII");
        rimList.add(8,"VIII");
        rimList.add(9,"IX");
        rimList.add(10,"X");
        rimList.add(11, "XI");
        rimList.add(12, "XII");
        rimList.add(13, "XIII");
        rimList.add(14, "XIV");
        rimList.add(15, "XV");
        rimList.add(16, "XVI");
        rimList.add(17, "XVII");
        rimList.add(18, "XVIII");
        rimList.add(19, "XIX");
        rimList.add(20, "XX");
        rimList.add(21, "L");
        rimList.add(22, "C");

        return rimList;
    }

    public String rimConvert(int o) {

        ArrayList<String> rim = calcRim();
        String num = "Nevernyi vvod";
        int x = o;
        List<Integer> y = new ArrayList<>();
        while(o != 0){
            y.add(o % 10);
            o = o / 10;
        }

        if(x > 0 & x < 21){
            num = rim.get(x);
            return num;
        }
        else if(x >= 21 & x < 30){
            num = rim.get(19) + rim.get(y.get(0));
            return num;
        }
        else if(x >= 30 & x < 40){
            num = rim.get(20) + rim.get(10) + rim.get(y.get(0));
            return num;
        }
        else if(x >= 40 & x < 50){
            num = rim.get(10) + rim.get(21) + rim.get(y.get(0));
            return num;
        }
        else if(x >= 50 & x < 60){
            num = rim.get(21) + rim.get(y.get(0));
            return num;
        }
        else if(x >= 60 & x < 70){
            num = rim.get(21) + rim.get(10) + rim.get(y.get(0));
            return num;
        }
        else if(x >= 70 & x < 80){
            num = rim.get(21) + rim.get(20) + rim.get(y.get(0));
            return num;
        }
        else if(x >= 80 & x < 90){
            num = rim.get(21) + rim.get(20) + rim.get(10) + rim.get(y.get(0));
            return num;
        }
        else if(x >= 90 & x < 100){
            num = rim.get(10) + rim.get(22) + rim.get(y.get(0));
            return num;
        }
        else if(x == 100){
            num = rim.get(22) + rim.get(22);
            return num;
        }
        return num;
    }

}

