package ooplab4;

public class TestNetedLoop {
    public static void main(String[] args) {

        for (int i=1;i<=8;i++){
            //statement
            for (int j=1;j<=8;j++){
                //statement
                if (i==8 ||j==i||j==1){
                    System.out.print("*");
                }else System.out.print(" ");
            }//j
            System.out.println();
        }//i


    }//main
}//class