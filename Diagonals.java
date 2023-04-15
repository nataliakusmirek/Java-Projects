public static int diagonalOp(int[][] matA, int[][] matB)
{
    double product = 0.0;
    int sum = 0;
    for(int rowA = 0; rowA < matA.length(); rowA++)
    {
        for(int colA = rowA; colA < rowA + 1; colA++)
        {
           
            for(int rowB = 0; rowB < matB.length(); rowB++)
            {
              for(int colB = rowB; colB < rowB + 1; colB++) 
              {
                  product = matA[rowA][colA] * matB[rowB][colB];
                  sum += product;
              } 
            }
        }
    }

}
