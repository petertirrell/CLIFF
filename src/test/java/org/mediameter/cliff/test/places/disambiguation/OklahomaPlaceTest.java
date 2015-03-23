package org.mediameter.cliff.test.places.disambiguation;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.mediameter.cliff.ParseManager;
import org.mediameter.cliff.test.util.TestPlaces;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bericotech.clavin.resolver.ResolvedLocation;

public class OklahomaPlaceTest {
    
    private static final Logger logger = LoggerFactory.getLogger(OklahomaPlaceTest.class);

    @Test
    public void testOklahoma() throws Exception {
        List<ResolvedLocation> results = ParseManager.extractAndResolve("Oklahoma say Common Core tests are too costly.").getResolvedLocations();
        assertEquals("Found "+results.size()+" places, should have been 1!",1,results.size());
        assertEquals(TestPlaces.STATE_OKLAHOMA, results.get(0).geoname.geonameID);
    }

}
