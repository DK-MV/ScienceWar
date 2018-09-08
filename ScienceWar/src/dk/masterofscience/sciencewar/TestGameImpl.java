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
    void allPlayersHave2TokensInitially() {
	game = new GameImpl();
	for (final WorkBench workBench : game.getAllWorkBenches()) {
	    assertEquals(workBench.getMaxReservedCompounds(), 1);
	}
    }

    @Test
    void inDiscoveryPhaseEachPlayerRecieve2Elements() {
	// TODO
    }

    @Test
    void afterDiscoveryPhaseItIsStudyPhase() {
	game = new GameImpl();
	assertEquals(Phase.Discovery, game.getCurrentPhase());
	game.executeGamePhase();
	assertEquals(Phase.Study, game.getCurrentPhase());
    }

}
