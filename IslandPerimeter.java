public class IslandPerimeter {
    public static void main(String[] args) {
         int [] [] grid = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
       int perimter = findIslandPerimeter(grid);
        System.out.println("perimter of island " + perimter);
    }

    private static int findIslandPerimeter(int[][] grid) {
        int perimeter=0;
        int row = grid.length;
        int cols = grid[0].length;
        for(int i =0;i<row;i++)
        {
            for(int j =0;j<cols;j++)
            {
                if(grid[i][j] == 1) {
                    if (i > 0 && grid[i - 1][j] == 0 || i == 0)//top
                    {
                        perimeter += 1;
                    }
                    if (i < row - 1 && grid[i + 1][j] == 0 || i == row - 1)//down
                    {
                        perimeter += 1;
                    }
                    if (j > 0 && grid[i][j - 1] == 0 || j == 0)//left
                    {
                        perimeter += 1;
                    }
                    if (j < cols - 1 && grid[i][j + 1] == 0 || j == cols - 1)//right
                    {
                        perimeter += 1;
                    }
                }
            }
        }
        return perimeter;
    }
}
