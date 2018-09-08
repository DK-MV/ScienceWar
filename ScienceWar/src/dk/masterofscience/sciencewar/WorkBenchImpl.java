package dk.masterofscience.sciencewar;

import java.util.ArrayList;
import java.util.List;

public class WorkBenchImpl implements WorkBench {
    List<Element> elements = new ArrayList<>();

    public WorkBenchImpl() {
	elements.add(new ElementImpl());
	elements.add(new ElementImpl());
    }

    @Override
    public void executeAction() {
	// TODO Auto-generated method stub

    }

    @Override
    public List<ChemicalCompound> getReservedCompounds() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void addReservedCompounds() {
	// TODO Auto-generated method stub

    }

    @Override
    public void removeReservedCompounds() {
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
