package dk.masterofscience.sciencewar;

/*
 * Responsible for:
 * 1) executes actions within the given game phases.
 * 2) tell the world if the phase is over or not.
 *
 */
public interface GamePhase {

    public void execute(Game game);

    public boolean PhaseOver();

    public Phase getPhaseType();
}
