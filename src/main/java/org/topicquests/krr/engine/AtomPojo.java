/**
 * Copyright 2019, TopicQuests Foundation
 * 
 * Adapted from and references work (c) Linas Vepstas
 * 
 *  This source code is available under the terms of the Affero General Public License v3.
 *  Please see LICENSE.txt for full license terms, including the availability of proprietary exceptions.
 */
package org.topicquests.krr.engine;

import java.util.Collection;
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
		// TODO Auto-generated method stub
		
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeAtom(String atomId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void swapAtom(IAtom oldAtom, IAtom newAtom) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getIncomingSetSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Collection<IAtom> getIncomingSet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<IAtom> getIncomingSetByType(String atomType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setTruthValue(ITruthValue tv) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ITruthValue getTruthValue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setValue(String key, IValue newValue) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IValue getValue(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<String> getKeys() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void copyValues(Collection<IValue> other) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String valuesToString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isMarkedForRemoval() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void unsetRemovalFlag() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void markForRemoval() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isChecked() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void unsetChecked() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setChecked() {
		// TODO Auto-generated method stub
		
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
