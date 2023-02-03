class Result {
    

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        int diag1 = 0;
        int diag2 = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size(); j++) {
                if (i == j) {
                    diag1 += arr.get(i).get(j);
                }
                if (i == (arr.size() - 1 - j)) {
                    diag2 += arr.get(i).get(j);
                }
             
            }
        }
        return Math.abs(diag1 - diag2);

    }

}
