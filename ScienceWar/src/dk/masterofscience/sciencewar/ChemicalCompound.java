package dk.masterofscience.sciencewar;

/*
 * Represents each chemical compound the players can build.
 * Am responsible for:
 * 1) telling the game when the compound has been finished.
 * 2) telling the game what you receive for finishing it.
 */
public interface ChemicalCompound {
	public boolean isBuildDone();

	public int finnishPoints();

	public String finnishBenchIncrease();

	public Equipment finnishEquipment();

}
