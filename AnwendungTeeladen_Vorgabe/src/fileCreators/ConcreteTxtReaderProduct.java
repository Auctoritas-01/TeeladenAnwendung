package fileCreators;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ConcreteTxtReaderProduct extends ReaderProduct{

	BufferedReader br;

	public ConcreteTxtReaderProduct() throws FileNotFoundException {
		super();
		this.br = new BufferedReader(new FileReader("Teesorte.txt"));
	}

	@Override
	public String[] leseAusDatei() throws IOException {
		String[] input = new String[5];
		String zeile = br.readLine();
		for (int i = 0; i < input.length; i++) {
			input[i] = zeile;
			zeile = br.readLine();
		}
		return input;
	}

	@Override
	public void schliesseDatei() throws IOException {
		br.close();	
	}	
}

