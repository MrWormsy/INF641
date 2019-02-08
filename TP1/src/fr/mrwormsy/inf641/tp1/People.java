package fr.mrwormsy.inf641.tp1;

import java.util.ArrayList;

public class People {

	private String name;
	private String description;
	private ArrayList<Spell> spells;
	
	public People(String name, String description) {
		this.name = name;
		this.description = description;
		this.setSpells(new ArrayList<Spell>());
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ArrayList<Spell> getSpells() {
		return spells;
	}

	public void setSpells(ArrayList<Spell> spells) {
		this.spells = spells;
	}
	
	public void addSpell(Spell spell) {
		this.spells.add(spell);
	}

	@Override
	public String toString() {
		return "";
	}
	
}
