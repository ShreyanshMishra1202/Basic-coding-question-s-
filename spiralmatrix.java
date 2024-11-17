public class spiralmatrix {
    public static void psm(int m[][]){
        int srow=0,scol=0;
        int erow=m.length-1;
        int ecol=m[0].length-1;
        while(srow<=erow && scol<=ecol){
            //top
            for(int j=scol;j<=ecol;j++){
                System.out.print(m[srow][j]+" ");
            }
            //right
            for(int i=srow+1;i<=erow;i++){
                System.out.print(m[i][ecol]+" ");
            }
            //bottom
            for(int j=ecol-1;j>=scol;j--){
                if(srow==erow){
                    break;
                }
                System.out.print(m[erow][j]+" ");
            }
            //left
            for(int i=erow-1;i>=srow+1;i--){
                if(scol==ecol){
                    break;
                }
                System.out.print(m[i][scol]+" ");
            }
            srow++;scol++;erow--;ecol--;
        }
    }
    public static void main(String[] args) {
        // int m[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int m[][]={{1,2,3,4,5,6},{7,8,9,10,11,12},{13,14,15,16,17,18},{19,20,21,22,23,24},{25,26,27,28,29,30}};
        psm(m);
    }
}
