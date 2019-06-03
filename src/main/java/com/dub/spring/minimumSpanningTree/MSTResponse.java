package com.dub.spring.minimumSpanningTree;


/** container object for AJAX response 
 * on initGraph request should return a component in a suitable form 
 **/
public class MSTResponse {
	private Status status;
	private Graph graph;
	private JSONSnapshot snapshot;
	

	public MSTResponse() {
		status = null;
		graph = null;
		snapshot = null;
	}
	
	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Graph getGraph() {
		return graph;
	}

	public void setGraph(MSTGraph graph) {
		this.graph = graph;
	}

	public JSONSnapshot getSnapshot() {
		return snapshot;
	}

	public void setSnapshot(JSONSnapshot snapshot) {
		this.snapshot = snapshot;
	}

	public void setGraph(Graph graph) {
		this.graph = graph;
	}




	public static enum Status {
		OK, ERROR, INIT
	}
}
