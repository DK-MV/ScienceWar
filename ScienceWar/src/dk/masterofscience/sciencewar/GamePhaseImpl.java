package dk.masterofscience.sciencewar;

public class GamePhaseImpl implements GamePhase {
    Phase phase;

    public GamePhaseImpl(final Phase phase) {
	this.phase = phase;
    }

    @Override
    public void execute() {
	// TODO Auto-generated method stub

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
