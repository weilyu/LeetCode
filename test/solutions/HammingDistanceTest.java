package solutions;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by edwinlyu on 17/01/2017.
 */
public class HammingDistanceTest {

    @Test
    public void hammingDistance() throws Exception {
        HammingDistance hd = new HammingDistance();
        assertEquals(2, hd.hammingDistance(1, 4));
    }

}