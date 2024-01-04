package mnozenie_macierzy;

public class NewClass
{
    public static void main(String[] args)
    {
        int n = 10, i, j;
        int a[][] = new int[n][n];
        int b[][] = new int[n][n];
        int c[][] = new int[n][n];

        System.out.println("\nmacierz A ");
        for (i = 0; i < a.length; i++)
        {
            for (j = 0; j < a.length; j++)
            {
                a[i][j] = 1;
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nmacierz B ");
        for (i = 0; i < b.length; i++)
        {
            for (j = 0; j < b.length; j++)
            {
                b[i][j] = 2;
                System.out.print(b[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nmacierz C = A * B ");
        for (i = 0; i < c.length; i++)
        {
            for (j = 0; j < c.length; j++)
            {
                c[i][j] = a[i][j] * b[i][j];
                System.out.print(c[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
