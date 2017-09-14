
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem2 extends Robot
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void plantBeepers() {
        while(nextToWall()) {
           putBeeper();
           move();
          
            
       
        
    }
}
public void nextToWall() {
    turnLeft();
    if (frontIsClear()) {
        move();
        move();
        turnLeft();
    
   
}
else {
    turnLeft();
    turnLeft();
    turnLeft();
}
}
}






