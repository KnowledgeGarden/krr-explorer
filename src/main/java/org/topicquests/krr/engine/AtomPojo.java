/**
 * Copyright 2019, TopicQuests Foundation
 * 
 * Adapted from and references work (c) Linas Vepstas
 * 
 *  This source code is available under the terms of the Affero General Public License v3.
 *  Please see LICENSE.txt for full license terms, including the availability of proprietary exceptions.
 */
package org.topicquests.krr.engine;

import java.util.ArrayList;
import java.util.Set;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


import org.topicquests.krr.engine.api.IAtom;
import org.topicquests.krr.engine.api.IAtomSpace;
import org.topicquests.krr.engine.api.ITruthValue;
import org.topicquests.krr.engine.api.IValue;

import net.minidev.json.JSONObject;

/**
 * @author jackpark
 *
 */
public abstract class AtomPojo extends ValuePojo implements IAtom {
	protected IAtomSpace database;
	
	/**
	 * 
	 */
	public AtomPojo() {
		//clear flags
		this.setFlagField("00");
	}

	/**
	 * @param map
	 */
	public AtomPojo(Map<String, ?> map) {
		super(map);
	}


	/* (non-Javadoc)
	 * @see org.topicquests.krr.engine.api.IAtom#setId(java.lang.String)
	 */
	@Override
	public void setId(String id) {
		put(IAtom.ID_FIELD, id);
	}

	/* (non-Javadoc)
	 * @see org.topicquests.krr.engine.api.IAtom#getId()
	 */
	@Override
	public String getId() {
		return getAsString(IAtom.ID_FIELD);
	}

	/* (non-Javadoc)
	 * @see org.topicquests.krr.engine.api.IAtom#setLabel(java.lang.String)
	 */
	@Override
	public void setLabel(String label) {
		put(IAtom.LABEL_FIELD, label);
	}

	/* (non-Javadoc)
	 * @see org.topicquests.krr.engine.api.IAtom#getLabel()
	 */
	@Override
	public String getLabel() {
		return getAsString(IAtom.LABEL_FIELD);
	}

	@Override
	public String getIdToString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAtomSpace(IAtomSpace space) {
		database = space;
	}

	@Override
	public void keepIncomingSet() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dropIncomingSet() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertAtom(IAtom atom) {
		List<IAtom> l = getIncomingSet();
		if (l == null) l = new ArrayList<IAtom>();
		if (!l.contains(atom)) {
			l.add(atom);
			setIncomingSet(l);
		}
	}

	@Override
	public void removeAtom(IAtom atom) {
		List<IAtom> l = getIncomingSet();
		if (l != null) {
			l.remove(atom);
			setIncomingSet(l);
		}
	}

	@Override
	public void swapAtom(IAtom oldAtom, IAtom newAtom) {
		List<IAtom> l = getIncomingSet();
		if (l != null) {
			l.remove(oldAtom);
			l.add(newAtom);
			setIncomingSet(l);
		}
	}

	@Override
	public int getIncomingSetSize() {
		List<IAtom> l = getIncomingSet();
		if (l != null)
			return l.size();
		return 0;
	}

	@Override
	public List<IAtom> getIncomingSet() {
		return (List<IAtom>)get(INCOMING_SET_FIELD);
	}

	@Override
	public List<IAtom> getIncomingSetByType(int atomType) {
		List<IAtom>result = new ArrayList<IAtom>();
		List<IAtom> l = getIncomingSet();
		if (l != null && !l.isEmpty()) {
			Iterator<IAtom>itr = l.iterator();
			IAtom a;
			while (itr.hasNext()) {
				a = itr.next();
				if (a.getType() == atomType)
					result.add(a);
			}
		}
		return result;
	}
	
	@Override
	public void setIncomingSet(List<IAtom> is) {
		put(INCOMING_SET_FIELD, is);
	}

	@Override
	public void setTruthValue(ITruthValue tv) {
		put(TRUTH_VALUE_FIELD, tv);
	}

	@Override
	public ITruthValue getTruthValue() {
		return (ITruthValue)get(TRUTH_VALUE_FIELD);
	}

	@Override
	public void setValue(String key, IValue newValue) {
		put(key, newValue);
	}

	@Override
	public IValue getValue(String key) {
		return (IValue)get(key);
	}

	@Override
	public Set<String> getKeys() {
		return this.keySet();
	}

	@Override
	public void copyValues(List<IValue> other) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String valuesToString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isMarkedForRemoval() {
		return getFlagField().charAt(REMOVE_FLAG) == '1';
	}

	@Override
	public void unsetRemovalFlag() {
		char [] x = getFlagField().toCharArray();
		x[REMOVE_FLAG] = '0';
		setFlagField(new String(x));
	}

	@Override
	public void markForRemoval() {
		char [] x = getFlagField().toCharArray();
		x[REMOVE_FLAG] = '1';
		setFlagField(new String(x));
	}

	@Override
	public boolean isChecked() {
		return getFlagField().charAt(CHECKED_FLAG) == '1';
	}

	@Override
	public void unsetChecked() {
		char [] x = getFlagField().toCharArray();
		x[CHECKED_FLAG] = '0';
		setFlagField(new String(x));
	}

	@Override
	public void setChecked() {
		char [] x = getFlagField().toCharArray();
		x[CHECKED_FLAG] = '1';
		setFlagField(new String(x));
	}
	
	@Override
	public abstract long computeContentHash();

	
	private String getFlagField() {
		return getAsString(IAtom.FLAG_FIELD);
	}
	
	private void setFlagField(String f) {
		put(IAtom.FLAG_FIELD, f);
	}
	

}
