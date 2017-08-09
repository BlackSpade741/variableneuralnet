/**
 * Created by Reece Martin on 2017-08-08.
 */
public class Neuron {
    Weight[] parents;
    Weight[] children;
    char type = 'n';
    
    public Neuron (){
        parents = null;
        children = null;
    }
    
    public Neuron (int num){
        parents = new Weight[num];
        children = new Weight[num];
    }
    
    public Neuron (Weight[] p, Weight[] c){
        parents = p;
        children = c;
    }
}