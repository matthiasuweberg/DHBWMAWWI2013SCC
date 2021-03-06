package Kapitel9.BspTressSet;

public class Student implements Comparable<Student>{
	private int matrikelNr;
	private String vorname;
	private String nachname;
	
	public Student(int matrikelNr, String vorname, String nachname){
		this.matrikelNr = matrikelNr;
		this.vorname = vorname;
		this.nachname = nachname;
	}
	
	@Override
	public boolean equals(Object obj) {
	
		if(obj == this){
			return true;
		}
		
		if(obj == null){
			return false;
		}
		
		if(!(obj instanceof Student)){
			return false;
		}

		if(this.getMatrikelNr() != ((Student)obj).getMatrikelNr()){ 
			return false;
		}

		return true;
		
	}
	
	@Override
	public int hashCode() {
		return this.getMatrikelNr();
	}
	
	@Override
	public int compareTo(Student o) {
		int zwerg = this.getMatrikelNr() - o.getMatrikelNr();
		return zwerg;
	}

	public int getMatrikelNr() {
		return matrikelNr;
	}

	public void setMatrikelNr(int matrikelNr) {
		this.matrikelNr = matrikelNr;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	
	



}
