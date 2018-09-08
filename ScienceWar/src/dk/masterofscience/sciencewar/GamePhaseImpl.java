package dk.masterofscience.sciencewar;

public class GamePhaseImpl implements GamePhase {
    Phase phase;

    public GamePhaseImpl(final Phase phase) {
	this.phase = phase;
    }

    @Override
    public void execute(final Game game) {
	for (final WorkBench workBench : game.getAllWorkBenches()) {
	    workBench.addElementToStorage(new ElementImpl());
	    workBench.addElementToStorage(new ElementImpl());
	}
    }

    @Override
    public boolean PhaseOver() {
	// TODO Auto-generated method stub
	return false;
    }

    @Override
    public Phase getPhaseType() {
	return phase;
    }

}
