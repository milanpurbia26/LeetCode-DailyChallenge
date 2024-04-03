
public class wordSearch {
    public static void main(String[] args) {
        char[][] board = {
                {'A', 'B', 'C', 'E'}
                ,{'S', 'F', 'C', 'S'},
                {'A','D','E','E'}
        };

        String word = "ABCCE";
        System.out.println(exist(board,  word));
    }

    private static boolean exist(char[][] board, String word) {
        int row = board.length;
        int column = board[0].length;
        for (int i =0;i<row;i++)
        {
            for (int j =0;j<column;j++)
            {
                if(board[i][j] == word.charAt(0))
                {
                    if(search(i,j,row,column,board,word,0))
                    return true;
                }
            }
        }
        return false;

    }

    private static boolean search(int i, int j, int row, int column, char[][] board, String word, int k) {

        if(k == word.length())
            return true;
        if(i <0 || j<0 || i==row || j ==column || board[i][j] != word.charAt(k))
            return false;
        //left,right,top,bottom call... till now we already found starting or char or word
        char ch = board[i][j];
        board[i][j] = '#';
        boolean a1  =  search(i+1,j,row,column,board,word,k+1);
        boolean a2  =  search(i,j+1,row,column,board,word,k+1);
        boolean a3  =  search(i-1,j,row,column,board,word,k+1);
        boolean a4  =  search(i,j-1,row,column,board,word,k+1);
        board[i][j]=ch;
        return a1 || a2 || a3 || a4;
    }
}
