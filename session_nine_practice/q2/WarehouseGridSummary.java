
public class WarehouseGridSummary {

    static int[] warehouseSummary(int[][] grid) {
        int total = 0;
        int max = Integer.MIN_VALUE;
        int maxRow = 0, maxCol = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                total += grid[i][j];

                if (grid[i][j] > max) {
                    max = grid[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        return new int[]{total, maxRow, maxCol};
    }

    public static void main(String[] args) {
        int[][] grid = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        int[] result = warehouseSummary(grid);

        System.out.println("Total items: " + result[0]);
        System.out.println("Maximum coordinate: (" + result[1] + ", " + result[2] + ")");
    }
}
