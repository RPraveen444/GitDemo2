public class checkPrimeNum {
    public static void main(String[] args) {
        int num = 29;
        int i;
        for(i = 2; i<num ; i++){
            if(num%i == 0) {
                System.out.println(" Not Prime number");
                break;
            }
        }
        if(i==num){
            System.out.println("Prime number");
        }
    }
}
