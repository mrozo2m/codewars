package tasks;

public class XO {
    public static boolean getXO (String str) {
        int countX =0;
        int countO =0;
        int lenght = str.length();
        String strUpperCase = str.toUpperCase();
        for( int i=0;i<lenght;i++){
            if (strUpperCase.charAt(i)=='X'){
                countX++;
            } else if (strUpperCase.charAt(i)=='O'){
                countO++;
            }
        }
        if (countO==countX){
            return true;
        } else return false;
    }
}