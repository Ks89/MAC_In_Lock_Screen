package logic;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		//creo la riga di comando inserendo alla fine il parametro che indica i
		String [] rigaComando = {"/System/Library/CoreServices/Menu Extras/User.menu/Contents/Resources/CGSession","-suspend"};
		try {
			Runtime.getRuntime().exec(rigaComando);
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Impossibile eseguire l'operazione");
			e.printStackTrace();
		}
	}
}
