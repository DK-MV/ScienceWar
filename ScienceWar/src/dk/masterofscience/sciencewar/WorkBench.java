package dk.masterofscience.sciencewar;

import java.util.List;

/*
 * Represent the players workbench and am responsible for:
 * 1) executing the actions chosen by the player
 * 2) keeping track of which compounds the player has reserved
 *
 *
 */

public interface WorkBench {
	public void executeAction();

	public List<ChemicalCompound> getReservedCompounds();

	public void addReservedCompounds();

	public void removeReservedCompounds();
}
