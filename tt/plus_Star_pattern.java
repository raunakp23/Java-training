public class plus_Star_pattern {
    public static void main(String[] args) {
        int size = 10;
         for(int i =1 ; i<= size; i++){
            for (int j = 1; j <= size; j++){
                if(i ==(size/2)+1 || j == (size/2)+1){
                    System.out.println("+");
                } 
                else {
                    System.out.print(" ");
                }
              System.out.print("+");   
            }
        }
    }
}
