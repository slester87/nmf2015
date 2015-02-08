import org.ejml.data.D1Matrix64F;
import org.ejml.data.DenseMatrix64F;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Skip on 1/23/2015.
 */
public class Main {
    List<Double> a = new ArrayList<Double>();
    List<Double> b = new ArrayList<Double>();

    public static void main(String args[]){
        System.out.println("Hello, John");
        DenseMatrix64F m = new DenseMatrix64F();

    }
    //helpers

//    function [X,grad,iter] = nnlsm(A,B,init,solver)
//    switch solver
//    case 'bp'
//            [X,grad,iter] = nnlsm_blockpivot(A,B,0,init);
//    case 'as'
//            [X,grad,iter] = nnlsm_activeset(A,B,1,0,init);
//    end
//            end

    //    %-------------------------------------------------------------------------------
//    function retVal = getInitCriterion(stopRule,A,W,H,type,alpha,beta,gradW,gradH)
//            % STOPPING_RULE : 1 - Normalized proj. gradient
//    %                 2 - Proj. gradient
//    %                 3 - Delta by H. Kim
//    %                 0 - None (want to stop by MAX_ITER or MAX_TIME)
//    if nargin~=9
//            [gradW,gradH] = getGradient(A,W,H,type,alpha,beta);
//    end
//    [m,k]=size(W);, [k,n]=size(H);, numAll=(m*k)+(k*n);
//    switch stopRule
//    case 1
//    retVal = norm([gradW; gradH'],'fro')/numAll;
//            case 2
//            retVal = norm([gradW; gradH'],'fro');
//            case 3
//            retVal = getStopCriterion(3,A,W,H,type,alpha,beta,gradW,gradH);
//    case 0
//    retVal = 1;
//    end
//            end

    /**
     *
     * @param stopRule
     * @param A
     * @param width
     * @param height
     * @param type
     * @return
     * % STOPPING_RULE : 1 - Normalized proj. gradient
    %                 2 - Proj. gradient
    %                 3 - Delta by H. Kim
    %                 0 - None (want to stop by MAX_ITER or MAX_TIME)
     */
    public int getInitCriterion(int stopRule, DenseMatrix64F A, int width, int height, String type, List<Double> alpha, List<Double> beta, ){

    }

    //    %-------------------------------------------------------------------------------
//    function retVal = getStopCriterion(stopRule,A,W,H,type,alpha,beta,gradW,gradH)
//            % STOPPING_RULE : 1 - Normalized proj. gradient
//    %                 2 - Proj. gradient
//    %                 3 - Delta by H. Kim
//    %                 0 - None (want to stop by MAX_ITER or MAX_TIME)
//    if nargin~=9
//            [gradW,gradH] = getGradient(A,W,H,type,alpha,beta);
//    end
//
//    switch stopRule
//    case 1
//    pGradW = gradW(gradW<0|W>0);
//    pGradH = gradH(gradH<0|H>0);
//    pGrad = [gradW(gradW<0|W>0); gradH(gradH<0|H>0)];
//    pGradNorm = norm(pGrad);
//    retVal = pGradNorm/length(pGrad);
//    case 2
//    pGradW = gradW(gradW<0|W>0);
//    pGradH = gradH(gradH<0|H>0);
//    pGrad = [gradW(gradW<0|W>0); gradH(gradH<0|H>0)];
//    retVal = norm(pGrad);
//    case 3
//    resmat=min(H,gradH); resvec=resmat(:);
//    resmat=min(W,gradW); resvec=[resvec; resmat(:)];
//    deltao=norm(resvec,1); %L1-norm
//            num_notconv=length(find(abs(resvec)>0));
//    retVal=deltao/num_notconv;
//    case 0
//    retVal = 1e100;
//    end
//            end


/**
 * I need to implement this one first.
 *  We want to think about GradW as a row vector, GradH is a column vector
 *  I guess we need an object for that huhe
 */
//    %-------------------------------------------------------------------------------
//    function [gradW,gradH] = getGradient(A,W,H,type,alpha,beta)
//    switch type
//    case 'plain'
//    gradW = W*(H*H') - A*H';
//    gradH = (W'*W)*H - W'*A;
//    case 'regularized'
//    gradW = W*(H*H') - A*H' + alpha*W;
//    gradH = (W'*W)*H - W'*A + beta*H;
//    case 'sparse'
//    k=size(W,2);
//    betaI = beta*ones(k,k);
//    gradW = W*(H*H') - A*H' + alpha*W;
//    gradH = (W'*W)*H - W'*A + betaI*H;
//    end
//            end





}
