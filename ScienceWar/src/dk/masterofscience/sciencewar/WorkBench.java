package dk.masterofscience.sciencewar;

import java.util.List;

/*
 * Represent the players workbench and am responsible for:
 * 1) executing the actions chosen by the player
 * 2) keeping track of which compounds the player has reserved
 * 3) keep track of anything else related to the player.
 *
 *
 */

public interface WorkBench {
    void executeAction(Game game);

    List<ChemicalCompound> getReservedCompounds();

    int getMaxReservedCompounds();

    List<Element> getElementsInStorage();

    void addElementToStorage(Element element);

}
