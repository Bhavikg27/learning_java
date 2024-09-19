package learning_java;

import javax.swing.*;
import java.awt.*;

class Solution2 {

    private final JTextField[][] textFields = new JTextField[9][9];

    public Solution2(JFrame frame) {
        frame.setLayout(new GridLayout(3, 3,0,0));

        JPanel[][] panels = new JPanel[3][3];

        for (int blockRow = 0; blockRow < 3; blockRow++) {
            for (int blockCol = 0; blockCol < 3; blockCol++) {
                panels[blockRow][blockCol] = new JPanel();
                panels[blockRow][blockCol].setLayout(new GridLayout(3, 3,0,0));
                frame.add(panels[blockRow][blockCol]);
            }
        }

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                textFields[row][col] = new JTextField();
                textFields[row][col].setHorizontalAlignment(JTextField.CENTER);
                textFields[row][col].setFont(new Font("Arial", Font.BOLD, 20));
                textFields[row][col].setBackground(new Color(255, 255, 255));

                textFields[row][col].setMargin(new Insets(0, 0, 0, 0));
                textFields[row][col].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(138, 43, 226)));

                int top = (row % 3 == 0) ? 3 : 1;
                int left = (col % 3 == 0) ? 3 : 1;
                int bottom = (row == 8) ? 3 : 1;
                int right = (col == 8) ? 3 : 1;

                textFields[row][col].setBorder(BorderFactory.createMatteBorder(top, left, bottom, right, new Color(0, 0, 0)));  // Border color

                panels[row / 3][col / 3].add(textFields[row][col]);
            }
        }
    }

    public void updateBoard(char[][] board) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col] != '.') {
                    textFields[row][col].setText(String.valueOf(board[row][col]));
                } else {
                    textFields[row][col].setText("");
                }
            }
        }
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public boolean SolveSudoku(char[][] board, int row, int col) {
        if (row == 9) {
            return true;
        }

        int newRow = row;
        int newCol = col + 1;
        if (col == 8) {
            newRow = row + 1;
            newCol = 0;
        }

        if (board[row][col] != '.') {
            return SolveSudoku(board, newRow, newCol);
        } else {
            for (int i = 1; i <= 9; i++) {
                if (isSafe(board, row, col, i)) {
                    board[row][col] = (char) (i + '0');

                    updateBoard(board);

                    if (SolveSudoku(board, newRow, newCol)) {
                        return true;
                    }
                    board[row][col] = '.';

                    updateBoard(board);
                }
            }
        }
        return false;
    }

    public boolean isSafe(char[][] board, int row, int col, int number) {
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == (char) (number + '0') || board[row][i] == (char) (number + '0')) {
                return false;
            }
        }
        for (int i = 0; i < 9; i++) {
            if (board[(row / 3) * 3 + i / 3][(col / 3) * 3 + i % 3] == (char) (number + '0')) {
                return false;
            }
        }
        return true;
    }
}

public class SudokuSolver {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Sudoku Solver");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Solution2 solution = new Solution2(frame);
        frame.setVisible(true);

        char[][] board = {
                {'5', '3', '.',   '.', '7', '.',   '.', '.', '.'},
                {'6', '.', '.',   '1', '9', '5',   '.', '.', '.'},
                {'.', '9', '8',   '.', '.', '.',   '.', '6', '.'},

                {'8', '.', '.',   '.', '6', '.',   '.', '.', '3'},
                {'4', '.', '.',   '8', '.', '3',   '.', '.', '1'},
                {'7', '.', '.',   '.', '2', '.',   '.', '.', '6'},

                {'.', '6', '.',   '.', '.', '.',   '2', '8', '.'},
                {'.', '.', '.',   '4', '1', '9',   '.', '.', '5'},
                {'.', '.', '.',   '.', '8', '.',   '.', '7', '9'}
        };

        solution.SolveSudoku(board,0,0);
    }
}
