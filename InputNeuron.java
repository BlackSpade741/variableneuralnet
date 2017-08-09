public class InputNeuron{
    private double input;
     private char type = 'i';
     private Weight[] children;
     private int totalParents;
     private int totalChildren;
     private int curParents;
     private int curChildren;

     
     public InputNeuron (){
         children = null;
         input = 0;
     }
     
     public InputNeuron (double in, Weight[] c){
         input = in;
         children = c;
     }
     
     public InputNeuron (double in, int num){
         input = in; 
         children = new Children[num]
     }
     
     
}