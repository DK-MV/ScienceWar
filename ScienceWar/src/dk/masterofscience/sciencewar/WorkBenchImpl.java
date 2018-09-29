package dk.masterofscience.sciencewar;

import java.util.ArrayList;
import java.util.List;

public class WorkBenchImpl implements WorkBench {
    List<Element> elements = new ArrayList<>();
    List<ChemicalCompound> compounds = new ArrayList<>();

    public WorkBenchImpl() {
	elements.add(Utils.randomEnum(Element.class));
	elements.add(Utils.randomEnum(Element.class));
    }

    @Override
    public void executeAction(final Game game) {
	if (game.getCurrentGamePhase().getPhaseType() == Phase.Study) {
	    addReservedCompounds();
	}

    }

    @Override
    public List<ChemicalCompound> getReservedCompounds() {
	return compounds;
    }

    private void addReservedCompounds() {
	compounds.add(new ChemicalCompoundImpl());

    }

    private void removeReservedCompounds() {
	// TODO Auto-generated method stub

    }

    @Override
    public int getMaxReservedCompounds() {
	// TODO Auto-generated method stub
	return 1;
    }

    @Override
    public List<Element> getElementsInStorage() {
	// TODO Auto-generated method stub
	return elements;
    }

    @Override
    public void addElementToStorage(final Element element) {
	elements.add(element);

    }

}
