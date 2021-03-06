package cn.itcyt.java;

public class SparseArray {
    public static void main(String[] args) {
        int chessArr1[][] = new int[11][11];//build for 11row,11col
        //1 = black;2 = white
        chessArr1[1][1] = 1;
        chessArr1[3][3] = 2;
        chessArr1[2][5] = 2;
        chessArr1[5][5] = 1;
        //ChessArray
        for (int[] row : chessArr1){
            for (int data : row) {
                System.out.print(data+"\t");
            }
            System.out.println();
        }
        //conversion for sparsearray
        int sum = 0;
        for (int i = 0; i < chessArr1.length ; i++) {
            for (int j = 0; j < chessArr1.length ; j++) {
                if (chessArr1[i][j] != 0){
                    sum++;//traverse chessArray count witch sun
                }
            }
        }
        System.out.println();
        System.out.println("row\tcol\tsum");
        //build sparseArray
        int sparseArr[][] =new int[sum+1][3];
        //take SparseArray to value for row-1
        sparseArr[0][0] = 11;
        sparseArr[0][1] = 11;
        sparseArr[0][2] = sum;
        //traverse chessArray count value not null take in sparseArray
        int count = 0;
        for (int i = 0; i < chessArr1.length ; i++) {
            for (int j = 0; j < chessArr1.length ; j++) {
                if (chessArr1[i][j] != 0) {
                    count++;
                    sparseArr[count][0] = i;
                    sparseArr[count][1] = j;
                    sparseArr[count][2] = chessArr1[i][j];
                }

            }
            
        }
        //output sparsseArray
        System.out.println();
        for (int i = 0; i < sparseArr.length ; i++) {
            System.out.println(sparseArr[i][0]+"\t"+sparseArr[i][1]+"\t"+sparseArr[i][2]+"\t\n");

        }
        //conversion for chessArray
        int[][] chessArr2 =new int[sparseArr[0][0]][sparseArr[0][1]];

        for (int i = 1; i < sparseArr.length ; i++) {
            chessArr2[sparseArr[i][0]][sparseArr[i][1]] = sparseArr[i][2];
        }

        for (int[] row : chessArr2){
           for (int data : row) {
               System.out.print(data+"\t");
           }
           System.out.println();
        }
    }

}


