public class main {
    public static void main(String[] args){
        int []arr = new int[]{1,4,32,5,67,76,5,6};

        for(int i = 0; i<arr.length;i++){
            int cnt= 0;
            for(int j=0; j<arr.length - 1;j++){
                if(arr[j]>arr[j+1]){
                    int bf = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=bf;
                    cnt++;
                }
            }
            if(cnt==0)break;
        }
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
