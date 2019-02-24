package com.naga.greedy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

//http://stevehanov.ca/blog/index.php?id=132
//check the above link for problem statement


public class ChooseColor {


    public static void main(String[] args) {

        ChooseColor ch = new ChooseColor();

        ButtonColour red = new ButtonColour();
        red.setColour("red");
        ButtonColour blue = new ButtonColour();
        blue.setColour("blue");
        ButtonColour orange = new ButtonColour();
        orange.setColour("orange");



        for(int i =0; i < 10000; i++){
            ButtonColour mybutton = ch.getBestColour(red, blue, orange);
            ch.getGreedyCount(mybutton);

        }

        System.out.println(red.toString());
        System.out.println(blue.toString());
        System.out.println(orange.toString());
        System.out.println("========================");

        //ch.hey();

    }


    public void getGreedyCount(ButtonColour A){
        double i = Math.random() *100;

        if(i <= 11){
            A.setVisits(A.getVisits() + 1);
            A.setClicks(A.getClicks() + 1);
            A.setPercentage((float)A.getClicks()/A.getVisits());
        }else{
            A.setVisits(A.getVisits() + 1);
            A.setPercentage((float)A.getClicks()/A.getVisits());
        }
    }




    public ButtonColour getBestColour(ButtonColour A, ButtonColour B, ButtonColour C){

        List<ButtonColour> colorList = new ArrayList<ButtonColour>();
        colorList.add(A);
        colorList.add(B);
        colorList.add(C);

        float x = A.getPercentage();
        float y = B.getPercentage();
        float z = C.getPercentage();

        ButtonColour bestColor = null;

        if (x >= y && x >= z)
            bestColor =  A;
        else if (y > x && y >= z)
            bestColor = B;
        else
            bestColor = C;

        return getrandomColor(bestColor, colorList);
    }


    public ButtonColour getrandomColor(ButtonColour best, List<ButtonColour> colorList){
        double i = Math.random() * 100;
        System.out.println(i);
        if(i>11){
            return best;
        }else {
            return colorList.get((int)(Math.random() * colorList.size()));
        }
    }

}
