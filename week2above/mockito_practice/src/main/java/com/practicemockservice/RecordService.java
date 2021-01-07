package com.practicemockservice;

import com.practicemockdb.dao.DatabaseDAO;
import com.practicemocknetwork.dao.NetworkDAO;

public class RecordService {
	
	DatabaseDAO database;
	NetworkDAO network;
	
	public DatabaseDAO getDatabase() {
		return database;
	}
	public void setDatabase(DatabaseDAO database) {
		this.database = database;
	}
	public NetworkDAO getNetwork() {
		return network;
	}
	public void setNetwork(NetworkDAO network) {
		this.network = network;
	}
	
	public boolean save(String fileName) {
		database.save(fileName);
		System.out.println("Saved in db Main class");
		
		network.save(fileName);
		System.out.println("Saved in network main class");
		
		return true;
	}
	

}
