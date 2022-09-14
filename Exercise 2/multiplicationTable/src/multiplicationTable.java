/* ======================================================
FILENAME    :multiplicationTable.java
DESCRIPTION :Create a program that displays a 20x20
            multiplication table.
AUTHOR      :Zach Riane I. Machacon
CREATED     :September 14, 2022
======================================================= */

public class multiplicationTable {
    public static void main(String[] args) {

        for(int i = 0; i <= 20; i++){
            if(i == 0){
                System.out.print("\t");
                for(int k = 1; k <= 20; k++){
                    System.out.print(k + "\t");
                }
            } else{
                System.out.print(i + "\t");
                for(int j = 1; j <= 20; j++){
                    System.out.print(i*j + "\t");
                }
            }
            System.out.print("\n");
        }
    }
}