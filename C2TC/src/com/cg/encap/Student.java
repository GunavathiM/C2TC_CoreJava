package com.cg.encap;

public class Student {
private int id;
private String name;
private String dep;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDep() {
	return dep;
}
public void setDep(String dep) {
	this.dep = dep;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", dep=" + dep + "]";
}

	
}
 
