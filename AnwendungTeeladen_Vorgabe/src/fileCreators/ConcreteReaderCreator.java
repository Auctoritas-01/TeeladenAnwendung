package fileCreators;

import java.io.IOException;

public class ConcreteReaderCreator extends ReaderCreator{

	@Override
	public ReaderProduct factoryMethod(String typ) throws IOException {
			if(typ.equalsIgnoreCase("csv"))
				return new ConcreteCsvReaderProduct();
			else
				return new ConcreteTxtReaderProduct();
	}
}
