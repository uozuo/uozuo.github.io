package chapter1;

public class demo13 {
    public static void main(String[] args) {
        //杨辉三角
        int[][] arr = new int[10][];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i + 1];
            for (int j = 0; j < arr[i].length; j++) {
                if (j == 0 || j == arr[i].length-1) {
                    arr[i][j]=1;//每一行第一个和最后一个元素为1
                } else {
                    arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
                }
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
//        for (int k=0;k< arr.length;k++){
//            for (int m=0;m<arr[k].length;m++){
//                System.out.print(arr[k][m]+" ");
//            }
//            System.out.println();
//        }
    }
}
