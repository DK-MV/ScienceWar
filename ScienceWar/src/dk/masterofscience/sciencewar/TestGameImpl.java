package dk.masterofscience.sciencewar;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class TestGameImpl {
    Game game;


    @Before
    void initialize() {
	game = new GameImpl();
    }

    @Test
    void FirstPhaseIsDiscovery() {
	game = new GameImpl();
	assertEquals(Phase.Discovery, game.getCurrentPhase());
    }

    @Test
    void allPlayersHave1TokenInitially() {
	game = new GameImpl();
	for (final WorkBench workBench : game.getAllWorkBenches()) {
	    assertEquals(workBench.getMaxReservedCompounds(), 1);
	}
    }

    @Test
    void inDiscoveryPhaseEachPlayerRecieve2Elements() {
	game = new GameImpl();
	assertEquals(Phase.Discovery, game.getCurrentPhase());
	for (final WorkBench workBench : game.getAllWorkBenches()) {
	    assertEquals(2, workBench.getElementsInStorage().size());
	}
	game.executeGamePhase();
	for (final WorkBench workBench : game.getAllWorkBenches()) {
	    assertEquals(4, workBench.getElementsInStorage().size());
	}
    }

    @Test
    void afterDiscoveryPhaseItIsStudyPhase() {
	game = new GameImpl();
	assertEquals(Phase.Discovery, game.getCurrentPhase());
	game.executeGamePhase();
	assertEquals(Phase.Study, game.getCurrentPhase());
    }



}
