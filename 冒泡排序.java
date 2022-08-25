package chapter1;

public class 冒泡排序 {
    public static void main(String[] args) {
        //chapter1.冒泡排序
        int[]arr1={2,5,3,1,4};
        int temp=0;
        for (int i=0;i< arr1.length-1;i++){
            for (int k=0;k< arr1.length-1-i;k++){
                //循环了一次之后最后一个不用再进行比较所以-1
                if (arr1[k]>arr1[k+1]){
                    temp=arr1[k];
                    arr1[k]=arr1[k+1];
                    arr1[k+1]=temp;
                }
            }
        }
        for (int j=0;j< arr1.length;j++){
            System.out.print(arr1[j]+" ");
        }
    }
}
