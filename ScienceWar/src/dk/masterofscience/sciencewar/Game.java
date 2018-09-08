package dk.masterofscience.sciencewar;

import java.util.List;

/**
 * @author Mikkel Vestergaard
 *         <H2>Responsibilities:</H2>
 *         1) keep track of possible game Phases and which one is the current
 *         one.
 *         2) keep track of all WorkBenches and the players they represents.
 *         3) who is in turn and starting player
 *
 */
public interface Game {
	public List<GamePhase> getGamePhases();

    public Phase getCurrentPhase();

    public List<WorkBench> getAllWorkBenches();

    public WorkBench getStartingPlayer();

    public void executeGamePhase();

}
