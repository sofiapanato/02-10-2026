public class pares {
    public static boolean par(int n){
        if(n==0)
            return true;
        else{
            if(n==1)
                return false;
            else{
                return par(n-2);
            }
        }
    }

    public static void main(String[] args) {
        boolean res;
        res=par(5);
        System.out.println("Es Par? " +res);
    }
    }
