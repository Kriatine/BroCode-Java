public class BreaksAndContinues {
    public static void main(String[] args){

        // break = break out of a loop (STOP)
        // continue = skip current iteration of a loop (SKIP)

        for(int i = 0; i < 10; i++ ){

            if(i == 4){
                continue;
            }
            else if(i == 8){
                break;
            }
            else{

            }

            System.out.print(i + " ");


        }
    }
}
