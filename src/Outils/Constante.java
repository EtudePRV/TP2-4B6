package Outils;

public interface Constante {
	String CONNECTIONSTRING = "jdbc:sqlite:DB/bibliothequemusic_vellone.db";
	String SELECT_USER = "SELECT * FROM users Where name = ";
	String SELECT_ARTISTE = "SELECT id,nom,membre,photo FROM artistes Where id = ";
	String SELECT_ARTISTES = "SELECT id,nom,membre FROM artistes Where nom Like ";
	String ADD_ARTISTE = "INSERT INTO artistes (nom,membre,photo) VALUES ";
	String UPDATE_ARTISTE = "UPDATE artistes Set ";
	String DELETE_ARTISTE= "DELETE FROM artistes WHERE ID = ";
}
