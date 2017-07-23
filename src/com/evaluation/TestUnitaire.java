package com.evaluation;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class TestUnitaire {
	@Test
    public void additionAvecDeuxNombres() throws Exception {
    	List<Object> liste = new ArrayList<>();
		liste.add(1);
		liste.add(2);
		liste.add(3);
		liste.add(4);
		liste.add(5);
		List<List<Object>> listeRes = new Partionner().partionnerList(liste, 3);
		List<Object> listeRes1 = new ArrayList<>();
		listeRes1.add(1);
		listeRes1.add(2);
		listeRes1.add(3);
		List<Object> listeRes2 = new ArrayList<>();
		
		listeRes2.add(4);
		listeRes2.add(5);
		List<List<Object>> listeResFinal = new ArrayList<>();
		listeResFinal.add(0, listeRes1);
		listeResFinal.add(1, listeRes2);
		//Test OK
        Assert.assertEquals(listeResFinal,listeRes);
    }
}
