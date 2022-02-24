public class Bharfi {
    public static void main(String[] args) {
        String[][] letter = new String[7][4];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == 0 || i == 3 || i == 6) {
                    letter[i][j] = " * ";

                } else if (j == 0 || j == 3) {
                    letter[i][j] = " * ";
                } else
                    letter[i][j] = "   ";
            }
        }
        for (String[] row : letter) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

}
