package org.j45.osborn.wagec.server;

public enum IncomeTaxSystem {
	GENERAL("General"),
	LINEAR("Linear");
	
	private final String taxSystem;
	
	private IncomeTaxSystem(final String _taxSystem) {
		this.taxSystem = _taxSystem;
	}
	
	@Override
	public String toString() {
		return this.taxSystem;
	}
}
