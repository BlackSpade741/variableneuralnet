/**
 * Created by Reece Martin on 2017-08-08.
 */
public class Neuron {
     private Weight[] parents;
     private Weight[] children;
     private int totalParents;
     private int totalChildren;
     private int curParents;
     private int curChildren;
     private char type = 'n';
   
   public Neuron (){
      parents = null;
      children = null;
   }
   
   public Neuron (int num){
      parents = new Weight[num];
      children = new Weight[num];
      totalParents = num;
      toalChildren = num;
      curParents = 0;
      curChildren = 0;
   }
   
   public Neuron (Weight[] p, Weight[] c){
      parents = p;
      children = c;
      totalParents = p.length;
      
   }
   
   public Weight[] getParents (){
       return parents;
   }
   
   public Weights[] getChildren (){
       return children;
   }
   
   public void addParent (Weight newParent){
       if(totalParents > curParents){
           parents[curParents - 1] = newParent;
           curParents += 1; 
       }
   }
   
   public void addChild (Weight newChild){
       if(totalChildren > curChildren){
           children[curChildren - 1] = newChildren;
           curChildren += 1; 
       }
   }
}