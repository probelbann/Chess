package Chess.common;

/**
 * Created by Администратор on 23.03.2015.
 */
public class Fields {

    public static final int SIZE_BOARD = 8;
    private static String[][] board = new String[SIZE_BOARD][SIZE_BOARD];

    static {
        for (int i = 0; i < SIZE_BOARD; i++) {
            for (int j = 0; j < SIZE_BOARD; j++) {
                board[i][j] = "\u2588";
            }
            System.out.println();
        }
        //чёрные
        board[0][0] = "\u265C";
        board[0][1] = "\u265E";
        board[0][2] = "\u265D";
        board[0][3] = "\u265B";
        board[0][4] = "\u265A";
        board[0][5] = "\u265D";
        board[0][6] = "\u265E";
        board[0][7] = "\u265C";

        board[1][0] = "\u265F";
        board[1][1] = "\u265F";
        board[1][2] = "\u265F";
        board[1][3] = "\u265F";
        board[1][4] = "\u265F";
        board[1][5] = "\u265F";
        board[1][6] = "\u265F";
        board[1][7] = "\u265F";

        //белые
        board[6][0] = "\u2659";
        board[6][1] = "\u2659";
        board[6][2] = "\u2659";
        board[6][3] = "\u2659";
        board[6][4] = "\u2659";
        board[6][5] = "\u2659";
        board[6][6] = "\u2659";
        board[6][7] = "\u2659";

        board[7][0] = "\u2656";
        board[7][1] = "\u2658";
        board[7][2] = "\u2657";
        board[7][3] = "\u2655";
        board[7][4] = "\u2654";
        board[7][5] = "\u2657";
        board[7][6] = "\u2658";
        board[7][7] = "\u2656";

    }

    public void setPosition(String figure, int letter, int digit) {
        board[letter][digit] = figure;
    }

    public void removePosition(int letter, int digit) {
        board[letter][digit] = " ";
    }

    public void showBoard() {
        int numberL = 8;
        int numberR = 8;
        System.out.println(" "+"\u0104"+" \u0181 "+"\u0106"+"\u0110"+" \u0204"+" \u0191"+
                "\u01E4"+" \u021E");
        for (int i = 0; i < SIZE_BOARD; i++) {
            System.out.print(numberL--);
            for (int j = 0; j < SIZE_BOARD; j++) {
                System.out.print(board[i][j]);
            }
            System.out.print(numberR--);
            System.out.println();
        }
        System.out.println(" "+"\u0104"+" \u0181 "+"\u0106"+"\u0110"+" \u0204"+" \u0191"+
                "\u01E4"+" \u021E");
    }

}
