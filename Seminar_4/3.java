class Solution {

    static final int EMPTY = Integer.MAX_VALUE;
        static final int[][] DIRECTIONS = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    
    
        public int[][] updateMatrix(int[][] mat) {
            Queue<int[]> q = new LinkedList<>();
    
            for (int row = 0; row < mat.length; row++) {
                for (int col = 0; col < mat[0].length; col++) {
                    if (mat[row][col] == 0) {
                        q.add(new int[]{row, col});
                    } else {
                        mat[row][col] = EMPTY;
                    }
                }
            }
    
            while (!q.isEmpty()) {
                int[] curPoint = q.poll();
                int curRow = curPoint[0];
                int curCol = curPoint[1];
                for (int[] direction : DIRECTIONS) {
                    int newRow = curRow + direction[0];
                    int newCol = curCol + direction[1];
                    if (newRow >= 0 && newCol >= 0
                            && newRow < mat.length && newCol < mat[0].length
                            && mat[newRow][newCol] == EMPTY) {
                        mat[newRow][newCol] = mat[curRow][curCol] + 1;
                        q.add(new int[]{newRow, newCol});
                    }
                }
            }
            return mat;
        }
    
    }