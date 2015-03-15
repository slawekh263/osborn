package org.j45;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import javax.jws.WebService;

@WebService(endpointInterface="org.j45.ConferenceManager", serviceName="ConferenceManager")
public class ConferenceManagerImpl implements ConferenceManager {
	
	List<ConferenceBean> conferences = new LinkedList<ConferenceBean>();
	Integer conferenceID = 0;

	public List<String> getConferenceNames() {
		String confName;
		List<String> conferenceNames = new LinkedList<String>();
		Iterator<ConferenceBean> it = conferences.iterator();
		while(it.hasNext()) {
			confName = it.next().getName();
			conferenceNames.add(confName);
		}
		return conferenceNames;
	}

	public ConferenceBean getConference(String id) {
		ConferenceBean cbean;
		Iterator<ConferenceBean> it = conferences.iterator();
		while(it.hasNext()) {
			cbean = it.next();
			if(cbean.getId().equals(id)) {
				return cbean;
			}
		}
		return null;
	}
	
	public void addConference(String name) {
		String id = "conf_" + (++this.conferenceID);
		ConferenceBean cb = new ConferenceBean(id, name);
		this.conferences.add(cb);
	}

}
