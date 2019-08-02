package com.tngp.lcd;

public class LcdNumber {

    public String lcd(int number) {
        String leftTop = " ";
        String midTop = " ";
        String rightTop = " ";
        String leftMid = " ";
        String midMid = " ";
        String rightMid = " ";
        String leftBottom = " ";
        String midBottom = " ";
        String rightBottom = " ";
        int digit = number%10;
        String lcd = new String();
        String result;

//        while (number > 0) {
            if (digit == 0) {
                midTop = "_";
                leftMid = "|";
                leftBottom = "|";
                rightMid = "|";
                rightBottom = "|";
                midBottom = "_";
            }
            if (digit == 1) {
                midMid = "|";
                midBottom = "|";
            }
            if (digit == 2) {
                midTop = "_";
                midMid = "_";
                midBottom = "_";
                rightMid = "|";
                leftBottom = "|";
            }

            if (digit == 3) {
                midTop = "_";
                midMid = "_";
                midBottom = "_";
                rightMid = "|";
                rightBottom = "|";
            }
//            number = number-digit;
//            number = number/10;
            result = leftTop + midTop + rightTop + "\n"
                    + leftMid + midMid + rightMid + "\n"
                    + leftBottom + midBottom + rightBottom;
            lcd += "\n" + result;
//        }

        return lcd;
    }
}
