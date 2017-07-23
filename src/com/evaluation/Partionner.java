package com.evaluation;

import java.util.ArrayList;
import java.util.List;

public class Partionner {
	
	public List<List<Object>> partionnerList(List<Object> liste, int taille) throws Exception {
		List<List<Object>> listeResultat = new ArrayList<>();
		List<Object> listeTemp = new ArrayList<>();
		if (liste == null) {
			throw new Exception("Il faut passer une liste sa taille differente à zéro");
		}
		int j = 0;
		for (int i = 0; i < liste.size(); i++) {
			
			if (i == 0) {
				listeTemp.add(liste.get(i));
			} else if (i % taille != 0) {
				listeTemp.add(liste.get(i));
			} else {
				listeResultat.add(j, listeTemp);j++;
				listeTemp = new ArrayList<>();
				listeTemp.add(liste.get(i));
			}
		}
		if (listeTemp.size() > 0) {
			listeResultat.add(listeTemp);

		}
		return listeResultat;

	}
}
