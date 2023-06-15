package week5_hw_java;

import java.util.ArrayList;

public class Programme_4_ColoursarrayList {
    public static void main(String[] args) {
        ArrayList<String> colorList =   new       ArrayList<>();
        colorList.add("  RED  ");
        colorList.add("  BLUE ");
        colorList.add(" REEN ");
        colorList.add(" YELLOW ");
        colorList.add(" BLACK  ");
        colorList.add(" WHITE ");
        colorList.add(" ORANGE ");
        colorList.add(" PURPLE " );
        colorList.add(" CYAN ");

        for (String colourList : colorList) {
            System.out.print(colourList + ", ");
        }
    }
}
