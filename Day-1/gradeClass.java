import java.util.Arrays;

public class gradeClass {
    public static void main(String[] args) {
        int mark = 30;
        if(mark >= 90){
            System.out.println("A Grade");
        }else if(mark>80 && mark<89){
            System.out.println("B Grade");
        }else if(mark>70 && mark<79){
            System.out.println("C Grade");
        }else if(mark>60 && mark<69){
            System.out.println("D Grade");
        }else if(mark>50 && mark<59){
            System.out.println("E Grade");
        }else{
            System.out.println("F Grade");
        }

    }

}
