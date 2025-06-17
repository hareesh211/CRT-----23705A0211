class SolveQueen{
    public static void main(String args[]){
int[][]board={
    {0,0,0,0,0,0,0,0},
    {0,0,0,0,0,0,0,0},
    {0,0,0,0,0,0,0,0},
    {0,0,0,0,0,0,0,0},
    {0,0,0,0,0,0,0,0},
    {0,0,0,0,0,0,0,0},
    {0,0,0,0,0,0,0,0},
    {0,0,0,0,0,0,0,0},
};
solveQueen(board,0);
    }
    public static void solveQueen(int[][]board,int row){
        if(row==board.length){
            printBoard(board);
        }
    }
}