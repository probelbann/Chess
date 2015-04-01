package Chess.common;

/**
 * Created by Администратор on 23.03.2015.
 */
public class Fields {

    public static final int SIZE_BOARD = 8;
    public static final int AMOUNT_FiGURES = 16;
    private static String[][] board = new String[SIZE_BOARD][SIZE_BOARD];
    private static String[] whiteFigureList = new String[AMOUNT_FiGURES];
    private static String[] blackFigureList = new String[AMOUNT_FiGURES];

    static {
        for (int i = 0; i < SIZE_BOARD; i++) {
            for (int j = 0; j < SIZE_BOARD; j++) {
                board[i][j] = "  ";
            }

            System.out.println();
        }

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

    public void initWhiteFigureList() {
        whiteFigureList[0] = "WP";
        whiteFigureList[1] = "WP";
        whiteFigureList[2] = "WP";
        whiteFigureList[3] = "WP";
        whiteFigureList[4] = "WP";
        whiteFigureList[5] = "WP";
        whiteFigureList[6] = "WP";
        whiteFigureList[7] = "WP";

        whiteFigureList[8] = "WR";
        whiteFigureList[9] = "WK";
        whiteFigureList[10] = "WB";
        whiteFigureList[11] = "WQ";
        whiteFigureList[12] = "W ";
        whiteFigureList[13] = "WB";
        whiteFigureList[14] = "WK";
        whiteFigureList[15] = "WR";
    }

    public void initBlackFigureList() {
        blackFigureList[0] = "BR";
        blackFigureList[1] = "BK";
        blackFigureList[2] = "BB";
        blackFigureList[3] = "BQ";
        blackFigureList[4] = "B ";
        blackFigureList[5] = "BB";
        blackFigureList[6] = "BK";
        blackFigureList[7] = "BR";

        blackFigureList[8] = "BP";
        blackFigureList[9] = "BP";
        blackFigureList[10] = "BP";
        blackFigureList[11] = "BP";
        blackFigureList[12] = "BP";
        blackFigureList[13] = "BP";
        blackFigureList[14] = "BP";
        blackFigureList[15] = "BP";
    }

    public void killFigureFromList(boolean white, String figure) {
        if (white) {
            addNullFigureToList(whiteFigureList, figure);
        } else addNullFigureToList(blackFigureList, figure);
    }

    private void addNullFigureToList(String[] listOfFigures, String figure) {
        for (int i = 0; i < listOfFigures.length; i++) {
            if (listOfFigures[i].equals(figure)) {
                listOfFigures[i] = null;
            }
        }
    }

    public void setPosition(int from1, int from2, int where1, int where2) {
        String nameFigure = board[from1][from2];
        board[from1][from2] = "  ";
        board[where1][where2] = nameFigure;
    }

    public String getPosition(int pos1, int pos2) {
        String figure = board[pos1][pos2];
        return figure;
    }

    public void showBoard() {
        int numberL = 8;
        int numberR = 8;
        System.out.println("\n    A" + "   B" + "   C" + "   D" + "   E" + "   F" + "   G" + "   H");
        for (int i = 0; i < SIZE_BOARD; i++) {
            System.out.print(numberL-- + "  ");
            for (int j = 0; j < SIZE_BOARD; j++) {
                System.out.print(board[i][j] + "  ");
            }
            System.out.print(numberR--);
            System.out.println();
        }
        System.out.println("    A" + "   B" + "   C" + "   D" + "   E" + "   F" + "   G" + "   H\n");
    }

    public void showFiguresLists() {
        System.out.println("\nWhite figures left: ");
        for (int i = 0; i < whiteFigureList.length; i++) {
            System.out.print(whiteFigureList[i] + " ");
        }

        System.out.println("\nBlack figures left: ");
        for (int i = 0; i < blackFigureList.length; i++) {
            System.out.print(blackFigureList[i] + " ");
        }
        System.out.println();
    }

    public boolean findWinner() {
        boolean winner = false;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if ((!board[i][j].contains("W ")) || (!board[i][j].contains("B "))) {
                    winner = true;
                }
            }
        }
        return winner;
    }

}
