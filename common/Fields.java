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
                board[i][j] = "  ";
            }

            System.out.println();
        }
        //чёрные
        //                 пример поля
             /*A   B   C   D   E   F   H   G
            8 BR  BK  BB  BQ  B   BB  BK  BR 8
            7 BP  BP  BP  BP  BP  BP  BP  BP 7
            6                                6
            5                                5
            4                                4
            3                                3
            2 WP  WP  WP  WP  WP  WP  WP  WP 2
            1 WR  WK  WB  WQ  W   WB  WK  WR 1
               A   B   C   D   E   F   H   G*/
        board[0][0] = "BR";
        board[0][1] = "BK";
        board[0][2] = "BB";
        board[0][3] = "BQ";
        board[0][4] = "B ";
        board[0][5] = "BB";
        board[0][6] = "BK";
        board[0][7] = "BR";

        board[1][0] = "BP";
        board[1][1] = "BP";
        board[1][2] = "BP";
        board[1][3] = "BP";
        board[1][4] = "BP";
        board[1][5] = "BP";
        board[1][6] = "BP";
        board[1][7] = "BP";

        //белые
        board[6][0] = "WP";
        board[6][1] = "WP";
        board[6][2] = "WP";
        board[6][3] = "WP";
        board[6][4] = "WP";
        board[6][5] = "WP";
        board[6][6] = "WP";
        board[6][7] = "WP";

        board[7][0] = "WR";
        board[7][1] = "WK";
        board[7][2] = "WB";
        board[7][3] = "WQ";
        board[7][4] = "W ";
        board[7][5] = "WB";
        board[7][6] = "WK";
        board[7][7] = "WR";

    }

    public void setPosition(int from1, int from2, int where1, int where2) {
        String nameFigure = board[from1][from2];
        board[from1][from2] = "  ";
        board[where1][where2] = nameFigure;
    }

    public void removePosition(int letter, int digit) {
        board[letter][digit] = " ";
    }

    public void showBoard() {
        int numberL = 8;
        int numberR = 8;
        System.out.println("    A" + "   B" + "   C" + "   D" + "   E" + "   F" + "   G" + "   H");
        for (int i = 0; i < SIZE_BOARD; i++) {
            System.out.print(numberL-- + "  ");
            for (int j = 0; j < SIZE_BOARD; j++) {
                System.out.print(board[i][j] + "  ");
            }
            System.out.print(numberR--);
            System.out.println();
        }
        System.out.println("    A" + "   B" + "   C" + "   D" + "   E" + "   F" + "   G" + "   H");

    }

}
