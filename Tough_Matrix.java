public static int[][] expandMatrix(int[][] matA)
{
    int[][] newMat = new int[matA.length() * 2][matA[0].length() * 2];
    int groups = newMat.length() / 2;
    int count = newMat.length() / groups;
    int position = 0;
    for(int row = 0; row < newMat.length(); row++)
    {
        for(int col = 0; col < newMat[0].length(); col++)
        {
            if (position < count && position != 0)
            {
                newMat[row][col] = matA[row][col-1];
            }
            else if (position < count && position == 0)
            {
                newMat[row][col] = matA[row][col];
            }
            else 
            {
                position = 0;
                newMat[row][col] = matA[row][col];
            }
            position++;
            System.out.print(newMat[row][col]);
        }
    System.out.println(" ");
    }
}
