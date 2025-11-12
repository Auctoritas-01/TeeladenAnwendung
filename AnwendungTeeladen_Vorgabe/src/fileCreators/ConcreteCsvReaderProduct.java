package fileCreators;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ConcreteCsvReaderProduct extends ReaderProduct {
	
	BufferedReader br;
	
	public ConcreteCsvReaderProduct() throws FileNotFoundException {
		super();
		this.br = new BufferedReader(new FileReader("Teesorte.csv"));
	}

	@Override
	public String[] leseAusDatei() throws IOException {
		String[] zeile = this.br.readLine().split(";");
		return zeile;
	}

	@Override
	public void schliesseDatei() throws IOException {
		br.close();	
	}		
}
