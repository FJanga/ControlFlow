public class ForLoops {
    public ForLoops(){

    }

    public static void printAssociatesNames(String[] associatesArray){

        //here we have our basic for loop

        for(int i = 0; i< names.length ;i++){
            System.out.println(names[i]);
        }
    }


    public static int printTotalAssociatesNamesCount(String[] associates){
        int counter = 0;

        //here we have enhanced ForLoop

        for(String singleAssociate: associatesArray){
            // here we are adding the length or count
            //of EACH string in the string Array
            //to our counter
            counter += singleAssociate.length();
        }






        return 0;
    }


}
