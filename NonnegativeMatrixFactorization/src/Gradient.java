import org.ejml.data.Matrix64F;

import java.util.Vector;

/**
 * Created by Skip on 1/28/2015.
 */
public class Gradient {

    /**
     * We represent GradW as a row vector and GradH as a column vector, conceptually
     */

    private Vector<Integer> gradW;
    private Vector<Integer> gradH;

    //now this junk gets intialized to null, however an m x n Matrix A has n entries in gradW and m entries in gradH

    /**
     * I am programming very serious business here today. lol
     */
    public Gradient(){
        gradW = null;
        gradH = null;
    }

    public Gradient(Matrix64F M, String typeOfMatrix, int alpha, int beta){
        for(int i = 1; i < M.getNumCols(); i++){
            for(int j = 1; j < M.getNumRows(); j++ ){

                gradW.set()
            }
        }

    }

    public Gradient(Gradient g){
        this.gradW = g.getGradientW();
        this.gradH = g.getGradientH();

    }http://www.amazon.com/Corsair-Vengeance-2400MHz-Desktop-CMY16GX3M2A2400C11R/dp/B00EUPV2RQ/ref=sr_1_1?s=electronics&ie=UTF8&qid=1423262573&sr=1-1&keywords=Vengeance+pro
    public Vector<Integer> getGradientW(){
        return this.gradW;
    }

    public Vector<Integer> getGradientH(){
        return this.gradH;
    }
}
