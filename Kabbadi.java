package comparator;

public class Kabbadi {
int scor;
String teamname;
Kabbadi(String teamname,int scor){
	this.scor=scor;
	this.teamname=teamname;
	}

 public String toString() {
	return "the score of"+teamname+"is"+scor;
	}
 }
