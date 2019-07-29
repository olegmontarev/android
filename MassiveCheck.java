package Lesson_6;

import java.lang.*;

public class MassiveCheck {


    public MassiveCheck(){};

    public boolean chekingArray(int[] array){
        boolean a = false;
        for (int i : array) {
            if (i == 1 || i == 4) {a = true;}
        }
        System.out.println(a);
        return a;
    }


    }

