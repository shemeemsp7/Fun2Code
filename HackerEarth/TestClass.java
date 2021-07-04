import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int noOfTestcases = Integer.parseInt(s.next());
        for (int i=0; i< noOfTestcases; i++ ) {
            String rowAndColumn = s.nextLine();
            System.out.println("Row and column : " + rowAndColumn);
            String[] arr= rowAndColumn.split(" ");
            int row = Integer.parseInt(arr[0]);
            int column = Integer.parseInt(arr[1]);
            procesRowAndColumn(s, row, column);
            

        }     
    }

    static void procesRowAndColumn(Scanner s,int row, int column){
        
        for(int i=0; i< row; i++){
            int maxcount=0;
            char[] rowarray = s.nextLine().toCharArray();
            for(int j=1; j<column; j++ ){
                if(rowarray[j-1]=='#' && rowarray[j] == '#'){
                    maxcount++;
                }
            }

        }
    }
}