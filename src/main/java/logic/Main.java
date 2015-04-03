/*
Copyright 2012-2015 Stefano Cappa

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

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
