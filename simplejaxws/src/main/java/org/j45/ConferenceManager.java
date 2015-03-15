package org.j45;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(endpointInterface="org.j45.ConferenceManager", serviceName="ConferenceManager")
public interface ConferenceManager {
	
	public List<String> getConferenceNames();

	public ConferenceBean getConference(@WebParam(name="confId") String confId);
	
	public void addConference(@WebParam(name="confName") String confName);

}
