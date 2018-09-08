package dk.masterofscience.sciencewar;

import java.util.ArrayList;
import java.util.List;

public class GameImpl implements Game {
    List<WorkBench> workbenches = new ArrayList<WorkBench>();
    List<GamePhase> gamePhases = new ArrayList<GamePhase>();
    int currentGamePhaseNumber;

    public GameImpl() {
	// initialize game
	// make 2 players
	workbenches.add(new WorkBenchImpl());
	workbenches.add(new WorkBenchImpl());
	// add the game phases
	gamePhases.add(new GamePhaseImpl(Phase.Discovery));
	gamePhases.add(new GamePhaseImpl(Phase.Study));
	currentGamePhaseNumber = 0;

    }

    @Override
    public List<GamePhase> getGamePhases() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public Phase getCurrentPhase() {
	return gamePhases.get(currentGamePhaseNumber).getPhaseType();
    }

    @Override
    public List<WorkBench> getAllWorkBenches() {

	return workbenches;
    }

    @Override
    public WorkBench getStartingPlayer() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void executeGamePhase() {
	gamePhases.get(currentGamePhaseNumber).execute(this);
	currentGamePhaseNumber++;
	if (currentGamePhaseNumber >= gamePhases.size()) {
	    currentGamePhaseNumber = 0;
	}

    }


}
