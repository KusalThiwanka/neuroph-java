package research;
import java.io.Serializable;
import org.neuroph.core.NeuralNetwork; 
import java.util.Vector;
/** * This example shows how to load and use neural network created and saved with easyNeurons */
public class Research implements Serializable  {
	private static final long serialVersionUID = 5L;
	// private static final long serialVersionUID = 6529685098267757690L;
    public static void main(String[] args) {
        // load neural network 
        NeuralNetwork neuralNetwork = NeuralNetwork.load("C:/Users/melan/Documents/research/src/research/mySamplePerceptron.nnet");
        // set network input
        // set network input
        neuralNetwork.setInput(1, 1); 
// calculate network
neuralNetwork.calculate();
// get network output 
double[] networkOutput = neuralNetwork.getOutput();
        
        // set network input
//        neuralNetwork.setInput(networkInput);
        // calculate network
//        neuralNetwork.calculate();
//        // get network output
//        Vector <Double> networkOutput = neuralNetwork.getOutput(); 
    }
}
