class Solution {
    public String[] createGrid(int m, int n) {
     char [][] arr=new char[m][n];
     for(int i=0;i<m;i++){
         Arrays.fill(arr[i],'#');
     }
        int row=0;
        int col=0;
        arr[0][0]='.';
        while(col+1<n){
            col++;
            arr[row][col]='.';
            if(row+1<m){
                row++;
                arr[row][col]='.';
            }
        }
        while(row+1<m){
            row++;
            arr[row][col]='.';
        }
        String a[]=new String[m];
        for(int i=0;i<m;i++){
            a[i]=new String(arr[i]);
        }
        return a;
    }
}